package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.model.DataSeries;
import com.vaadin.addon.charts.model.DataSeriesItem;

public interface HasItem extends HasSeries {

    Chart getSource();

    String getCategory();

    /**
     * Returns the value of the item
     *
     * @return
     */
    double getValue();

    /**
     * Returns the index of {@link #getItem()} in {@link #getSeries()}.
     *
     * @return
     */
    int getItemIndex();

    /**
     * Returns the item that was clicked
     *
     * @return
     */
    default DataSeriesItem getItem() {
        return ((DataSeries) getSeries()).get(getItemIndex());
    }
}
