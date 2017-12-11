package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

/**
 * The PointRemoveEvent class stores data for remove events on the points of the
 * chart
 */
@DomEvent("point-remove")
public class PointRemoveEvent extends ComponentEvent<Chart> implements HasItem {

    private final int seriesIndex;
    private final String category;
    private final double value;
    private final int pointIndex;

    public PointRemoveEvent(Chart source, boolean fromClient,
                            @EventData("event.detail.originalEvent.target.series.index") int seriesIndex,
                            @EventData("event.detail.originalEvent.target.category") String category,
                            @EventData("event.detail.originalEvent.target.y") double value,
                            @EventData("event.detail.originalEvent.target.index") int pointIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;
        this.category = category;
        this.value = value;
        this.pointIndex = pointIndex;
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
    public double getValue() {
        return value;
    }

    @Override
    public int getItemIndex() {
        return pointIndex;
    }
}
