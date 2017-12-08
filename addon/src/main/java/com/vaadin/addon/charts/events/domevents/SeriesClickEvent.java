package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

@DomEvent("series-click")
public class SeriesClickEvent extends ComponentEvent<Chart> {

    private final int seriesItemIndex;

    public SeriesClickEvent(Chart source, boolean fromClient,
                                   @EventData("event.detail.originalEvent.point.series.index") int seriesItemIndex) {
        super(source, fromClient);
        this.seriesItemIndex = seriesItemIndex;
    }

    public int getSeriesItemIndex() {
        return seriesItemIndex;
    }
}
