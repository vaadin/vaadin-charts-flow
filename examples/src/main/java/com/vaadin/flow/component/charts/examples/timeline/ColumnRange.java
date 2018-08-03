package com.vaadin.flow.component.charts.examples.timeline;

import com.vaadin.flow.component.charts.AbstractChartExample;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.examples.timeline.util.StockPrices;
import com.vaadin.flow.component.charts.model.*;

public class ColumnRange extends AbstractChartExample {

    @Override
    public void initDemo() {
        final Chart chart = new Chart(ChartType.COLUMNRANGE);

        Configuration configuration = chart.getConfiguration();
        configuration.getTitle().setText("Temperature variation by day");

        DataSeries dataSeries = new DataSeries("Temperatures");
        for (StockPrices.RangeData data : StockPrices.fetchDailyTempRanges()) {
            dataSeries.add(new DataSeriesItem(data.getDate(), data.getMin(), data.getMax()));
        }
        configuration.setSeries(dataSeries);

        RangeSelector rangeSelector = new RangeSelector();
        rangeSelector.setSelected(2);
        configuration.setRangeSelector(rangeSelector);

        chart.setTimeline(true);
        add(chart);
    }
}