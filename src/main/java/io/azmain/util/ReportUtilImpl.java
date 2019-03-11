package io.azmain.util;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Component
public class ReportUtilImpl implements ReportUtil{

    @Override
    public void generatePieChart(String path, List<Object[]> data) {

        DefaultPieDataset dataset = new DefaultPieDataset();

        for (Object[] objects: data){
            dataset.setValue(objects[0].toString(),new Double(objects[1].toString()));
        }

        JFreeChart chart = ChartFactory.createPieChart3D("Location Report", dataset);

        try {
            ChartUtilities.saveChartAsJPEG(new File(path+"report.jpeg"),chart,300,300);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
