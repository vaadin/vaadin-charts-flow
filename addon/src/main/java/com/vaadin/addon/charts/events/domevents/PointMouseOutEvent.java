package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.events.domevents.details.PointEventData;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

@DomEvent("point-mouse-out")
public class PointMouseOutEvent extends ComponentEvent<Chart> {

    private final String category;
    private final double value;
    private final int seriesItemIndex;
    private final int pointIndex;

    public PointMouseOutEvent(Chart source, boolean fromClient,
                               @EventData("event.detail.originalEvent.target.series.index") int seriesItemIndex,
                               @EventData("event.detail.originalEvent.target.index") int pointIndex,
                               @EventData("event.detail.originalEvent.target.category") String category,
                               @EventData("event.detail.originalEvent.target.y") double value) {
        super(source, fromClient);
        this.seriesItemIndex = seriesItemIndex;
        this.pointIndex = pointIndex;
        this.category = category;
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public double getValue() {
        return value;
    }

    public int getPointIndex() {
        return pointIndex;
    }

    public int getSeriesItemIndex() {
        return seriesItemIndex;
    }
}
