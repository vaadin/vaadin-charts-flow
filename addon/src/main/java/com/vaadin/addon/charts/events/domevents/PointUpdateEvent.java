package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

@DomEvent("point-update")
public class PointUpdateEvent extends ComponentEvent<Chart> {

    private final int seriesItemIndex;
    private final String category;
    private final double oldValue;
    private final double newValue;
    private final int pointIndex;

    public PointUpdateEvent(Chart source, boolean fromClient,
                            @EventData("event.detail.originalEvent.target.series.index") int seriesItemIndex,
                            @EventData("event.detail.originalEvent.target.category") String category,
                            @EventData("event.detail.originalEvent.target.index") int pointIndex,
                            @EventData("event.detail.originalEvent.target.y") double oldValue,
                            @EventData("event.detail.originalEvent.options.y") double newValue) {
        super(source, fromClient);
        this.seriesItemIndex = seriesItemIndex;
        this.category = category;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.pointIndex = pointIndex;
    }

    public int getSeriesItemIndex() {
        return seriesItemIndex;
    }

    public String getCategory() {
        return category;
    }

    public double getOldValue() {
        return oldValue;
    }

    public double getNewValue() {
        return newValue;
    }

    public int getPointIndex() {
        return pointIndex;
    }
}
