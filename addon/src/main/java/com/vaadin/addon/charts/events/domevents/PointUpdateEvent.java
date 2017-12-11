package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

@DomEvent("point-update")
public class PointUpdateEvent extends ComponentEvent<Chart> implements HasPoint {

    private final int seriesIndex;
    private final String category;
    private final double oldValue;
    private final double newValue;
    private final int pointIndex;

    public PointUpdateEvent(Chart source, boolean fromClient,
                            @EventData("event.detail.originalEvent.target.series.index") int seriesIndex,
                            @EventData("event.detail.originalEvent.target.category") String category,
                            @EventData("event.detail.originalEvent.target.index") int pointIndex,
                            @EventData("event.detail.originalEvent.target.y") double oldValue,
                            @EventData("event.detail.originalEvent.options.y") double newValue) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        this.category = category;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.pointIndex = pointIndex;
    }

    public double getOldValue() {
        return oldValue;
    }

    @Override
    public double getValue() {
        return newValue;
    }

    @Override
    public int getSeriesItemIndex() {
        return seriesIndex;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public int getItemIndex() {
        return pointIndex;
    }
}
