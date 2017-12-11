package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.model.Series;

public interface HasSeries {

    Chart getSource();

    /**
     * Returns the index of the series.
     *
     * @return
     */
    int getSeriesItemIndex();

    /**
     * Returns the series.
     *
     * @return
     */
    default Series getSeries() {
        return getSource().getConfiguration().getSeries().get(getSeriesItemIndex());
    }
}
