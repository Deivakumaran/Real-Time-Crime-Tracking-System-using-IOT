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
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author deivakumaran
 */
public class PieChart_AWT extends ApplicationFrame {

    private Enterprise enterprise;

    private CommissionerOrganization commissionerOrganization;

    String city = "";
    int count = 0;
    List<String> list = new ArrayList<String>();
    String cityArray[] = new String[10];
    int countArray[] = new int[10];

    public PieChart_AWT(String title, Enterprise enterprise, CommissionerOrganization organization) {
        super(title);
        this.enterprise = enterprise;
        this.commissionerOrganization = organization;
        setContentPane(createDemoPanel());
    }

    private PieDataset createDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (int index = 0; index < count; index++) {
            dataset.setValue(cityArray[index], (countArray[index]));

        }
        return dataset;
    }

    private static JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Crime Record", // chart title 
                dataset, // data    
                true, // include legend   
                true,
                true);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSimpleLabels(true);
        return chart;
    }

    public JPanel createDemoPanel() {
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (organization instanceof CommissionerOrganization) {
                for (WorkRequest request : commissionerOrganization.getWorkQueue().getWorkRequestList()) {

                    list.add(((AlarmWorkRequest) request).getCity());

                }

                int index = 0;
                Set<String> unique = new HashSet<String>(list);
                for (String city : unique) {
                    System.out.println(city + ": " + Collections.frequency(list, city));
                    cityArray[index] = city;
                    countArray[index] = Collections.frequency(list, city);
                    index++;
                    count++;
                }

            }
        }
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }

    public void main(String[] args) {
        PieChart_AWT demo = new PieChart_AWT("Mobile Sales", enterprise, commissionerOrganization);
        demo.setSize(560, 367);
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
    }
}
