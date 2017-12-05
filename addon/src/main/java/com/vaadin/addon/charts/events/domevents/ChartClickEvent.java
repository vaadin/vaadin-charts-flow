package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;
import elemental.json.impl.JreJsonNumber;

@DomEvent("chart-click")
public class ChartClickEvent extends ComponentEvent<Chart> {

    private final int x;
    private final int y;

    public ChartClickEvent(Chart source, boolean fromClient,
                           @EventData("event.detail.originalEvent.chartX") JreJsonNumber x,
                           @EventData("event.detail.originalEvent.chartY") JreJsonNumber y) {
        super(source, fromClient);

        this.x = (int) x.asNumber();
        this.y = (int) y.asNumber();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
