package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

/**
 * Fired when the mouse exits the neighborhood of a point
 */
@DomEvent("point-mouse-out")
public class PointMouseOutEvent extends ComponentEvent<Chart> implements HasItem {

    private final String category;
    private final double value;
    private final int seriesIndex;
    private final int pointIndex;

    public PointMouseOutEvent(Chart source, boolean fromClient,
                              @EventData("event.detail.originalEvent.target.series.index") int seriesIndex,
                              @EventData("event.detail.originalEvent.target.index") int pointIndex,
                              @EventData("event.detail.originalEvent.target.category") String category,
                              @EventData("event.detail.originalEvent.target.y") double value) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        this.pointIndex = pointIndex;
        this.category = category;
        this.value = value;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public int getItemIndex() {
        return pointIndex;
    }

    @Override
    public int getSeriesItemIndex() {
        return seriesIndex;
    }
}
