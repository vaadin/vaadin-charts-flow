package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

@DomEvent("series-mouse-out")
public class SeriesMouseOutEvent extends ComponentEvent<Chart> {

    private final int seriesItemIndex;

    public SeriesMouseOutEvent(Chart source, boolean fromClient,
                                   @EventData("event.detail.originalEvent.target.index") int seriesItemIndex) {
        super(source, fromClient);
        this.seriesItemIndex = seriesItemIndex;
    }

    public int getSeriesItemIndex() {
        return seriesItemIndex;
    }
}
