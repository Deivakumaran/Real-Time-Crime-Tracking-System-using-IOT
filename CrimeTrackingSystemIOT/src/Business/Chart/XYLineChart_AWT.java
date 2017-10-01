/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Chart;

import Business.Enterprise.Enterprise;
import Business.Organization.CommissionerOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.AlarmWorkRequest;
import Business.WorkQueue.EnquiryReportRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.Color;
import java.awt.BasicStroke;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;

/**
 *
 * @author deivakumaran
 */
public class XYLineChart_AWT extends ApplicationFrame {

    private Enterprise enterprise;
    private CommissionerOrganization commissionerOrganization;
    String year = "";
    int count = 0;
    List<String> list = new ArrayList<String>();
    List<String> listYear = new ArrayList<String>();
    String typeArray[] = new String[10];
    XYSeries ki = null;
    int countTypeArray[] = new int[10];

    public XYLineChart_AWT(String applicationTitle, String chartTitle, Enterprise enterprise, CommissionerOrganization organization) {
        super(applicationTitle);
        this.enterprise = enterprise;
        this.commissionerOrganization = organization;
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                chartTitle,
                "Category",
                "Score",
                createDataset(),
                PlotOrientation.VERTICAL,
                true, true, true);

        ChartPanel chartPanel = new ChartPanel(xylineChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        final XYPlot plot = (XYPlot) xylineChart.getXYPlot();
        NumberAxis rangeAxis = (NumberAxis) plot.getDomainAxis();
        rangeAxis.setRange(2010, 2019);
        rangeAxis.setTickUnit(new NumberTickUnit(1));
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        renderer.setSeriesPaint(0, Color.RED);
        renderer.setSeriesPaint(1, Color.GREEN);
        renderer.setSeriesPaint(2, Color.YELLOW);
        renderer.setSeriesPaint(3, Color.black);
        renderer.setSeriesPaint(4, Color.cyan);
        renderer.setSeriesPaint(5, Color.ORANGE);
        renderer.setSeriesStroke(0, new BasicStroke(4.0f));
        renderer.setSeriesStroke(1, new BasicStroke(3.0f));
        renderer.setSeriesStroke(2, new BasicStroke(2.0f));
        renderer.setSeriesStroke(3, new BasicStroke(5.0f));
        renderer.setSeriesStroke(4, new BasicStroke(1.0f));
        renderer.setSeriesStroke(5, new BasicStroke(6.0f));
        plot.setRenderer(renderer);
        setContentPane(chartPanel);
    }

    public void main() {

        XYLineChart_AWT chart = new XYLineChart_AWT("Number of Crime Recorded in Massachusetts City Wise", "Year Wise", enterprise, commissionerOrganization);
        chart.pack();
        RefineryUtilities.centerFrameOnScreen(chart);
        chart.setVisible(true);
    }

    public XYDataset createDataset() {

        final XYSeriesCollection dataset = new XYSeriesCollection();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof CommissionerOrganization) {

                for (WorkRequest request : commissionerOrganization.getWorkQueue().getWorkRequestList()) {
                    if (WorkRequest.Type.Enquiry.getValue().equalsIgnoreCase(request.getName())) {
                        list.add(((EnquiryReportRequest) request).getCrimeType());
                    }
                }
            }
        }
        int index = 0;

        Set<String> unique = new HashSet<String>(list);
        for (String type : unique) {
            typeArray[index] = type;
            System.out.println(typeArray[index]);
            countTypeArray[index] = Collections.frequency(list, type);
            index++;
            count++;

            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof CommissionerOrganization) {

                    for (WorkRequest request : commissionerOrganization.getWorkQueue().getWorkRequestList()) {
                        if (WorkRequest.Type.Enquiry.getValue().equalsIgnoreCase(request.getName())) {
                            if (type.equalsIgnoreCase(((EnquiryReportRequest) request).getCrimeType())) {
                                listYear.add(String.valueOf(request.getYear()));
                            }
                        }
                    }

                    Set<String> unique1 = new HashSet<String>(listYear);
                    int counter = unique1.size();

                    for (String year : unique1) {
                        System.out.println(year + " = " + Collections.frequency(listYear, year));
                        ki = (new XYSeries(typeArray[index - 1]));
                        ki.add(Integer.parseInt(year), Collections.frequency(listYear, year));

                    }
                    listYear.clear();
                }
            }
            dataset.addSeries(ki);
        }
        return dataset;
    }
}
