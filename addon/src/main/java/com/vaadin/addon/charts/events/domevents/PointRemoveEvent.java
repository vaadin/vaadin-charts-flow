package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.events.domevents.details.MouseEventDetails;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

@DomEvent("point-remove")
public class PointRemoveEvent extends ComponentEvent<Chart> {

    private final int seriesItemIndex;
    private final String category;
    private final double value;
    private final int pointIndex;

    public PointRemoveEvent(Chart source, boolean fromClient,
                               @EventData("event.detail.originalEvent.target.series.index") int seriesItemIndex,
                               @EventData("event.detail.originalEvent.target.category") String category,
                               @EventData("event.detail.originalEvent.target.y") double value,
                               @EventData("event.detail.originalEvent.target.index") int pointIndex) {
        super(source, fromClient);
        this.seriesItemIndex = seriesItemIndex;
        this.category = category;
        this.value = value;
        this.pointIndex = pointIndex;
    }

    public int getSeriesItemIndex() {
        return seriesItemIndex;
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
}
