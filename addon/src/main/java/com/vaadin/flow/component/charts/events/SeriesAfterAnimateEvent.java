package com.vaadin.flow.component.charts.events;

import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;
import com.vaadin.flow.component.charts.Chart;

/**
 * Fired after a chart series is animated
 */
@DomEvent("series-after-animate")
public class SeriesAfterAnimateEvent extends ComponentEvent<Chart> implements HasSeries {

    private final int seriesIndex;

    public SeriesAfterAnimateEvent(Chart source, boolean fromClient,
                                   @EventData("event.detail.originalEvent.target.index") int seriesIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
    }

    @Override
    public int getSeriesItemIndex() {
        return seriesIndex;
    }
}