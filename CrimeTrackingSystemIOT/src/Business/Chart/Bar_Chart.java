package Business.Chart;

import Business.Enterprise.Enterprise;
import Business.Organization.CommissionerOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author deivakumaran
 */
/**
 * This demonstration shows a 3D bar chart with item labels displayed.
 *
 */
public class Bar_Chart extends ApplicationFrame {

    private Enterprise enterprise;
    private CommissionerOrganization commissionerOrganization;
    String city = "";
    int count = 0;
    List<String> list = new ArrayList<String>();
    String cityArray[] = new String[10];
    int countArray[] = new int[10];

    public Bar_Chart(final String title, Enterprise enterprise, CommissionerOrganization organization) {

        super(title);
        this.enterprise = enterprise;
        this.commissionerOrganization = organization;
        getData();
        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);

    }

    // ****************************************************************************
    // * JFREECHART DEVELOPER GUIDE                                               *
    // * The JFreeChart Developer Guide, written by David Gilbert, is available   *
    // * to purchase from Object Refinery Limited:                                *
    // *                                                                          *
    // * http://www.object-refinery.com/jfreechart/guide.html                     *
    // *                                                                          *
    // * Sales are used to provide funding for the JFreeChart project - please    * 
    // * support us so that we can continue developing free software.             *
    // ****************************************************************************
    /**
     * Creates a sample dataset.
     *
     * @return a sample dataset.
     */
    private CategoryDataset createDataset() {

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int index = 0; index < count; index++) {
            dataset.setValue((countArray[index]), cityArray[index], "Year");

        }
        return dataset;

    }

    /**
     * Creates a chart.
     *
     * @param dataset the dataset.
     *
     * @return The chart.
     */
    private JFreeChart createChart(final CategoryDataset dataset) {

        final JFreeChart chart = ChartFactory.createBarChart3D(
                "3D Bar Chart Demo", // chart title
                "Year", // domain axis label
                "Total Number of Crime", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                false // urls
        );

        final CategoryPlot plot = chart.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(
                CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 8.0)
        );

        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true);
        final BarRenderer r = (BarRenderer) renderer;
        r.setMaximumBarWidth(0.05);

        return chart;

    }

    /**
     * Starting point for the demonstration application.
     *
     * @param args ignored.
     */
    public void main(final String[] args) {

        Bar_Chart demo = new Bar_Chart("3D Bar Chart Demo 3", enterprise, commissionerOrganization);
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

    public void getData() {
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (organization instanceof CommissionerOrganization) {
                for (WorkRequest request : commissionerOrganization.getWorkQueue().getWorkRequestList()) {
                    if (WorkRequest.Type.Enquiry.getValue().equalsIgnoreCase(request.getName())) {

                        list.add(String.valueOf(request.getYear()));

                    }
                }

                int index = 0;
                Set<String> unique = new HashSet<String>(list);
                for (String year : unique) {
                    cityArray[index] = year;
                    countArray[index] = Collections.frequency(list, year);
                    index++;
                    count++;
                }

            }
        }
    }
}
