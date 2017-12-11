package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.events.domevents.details.MouseEventDetails;
import com.vaadin.addon.charts.events.domevents.details.MouseEventDetails.MouseButton;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

/**
 * The ChartClickEvent class stores information on click events anywhere on the
 * area of the chart.
 */
@DomEvent("chart-click")
public class ChartClickEvent extends ComponentEvent<Chart> implements ClickEvent {

    private final int x;
    private final int y;
    private final MouseEventDetails details;

    public ChartClickEvent(Chart source, boolean fromClient,
                           @EventData("event.detail.originalEvent.chartX") int x,
                           @EventData("event.detail.originalEvent.chartY") int y,
                           @EventData("event.detail.originalEvent.pageX") int pageX,
                           @EventData("event.detail.originalEvent.pageY") int pageY,
                           @EventData("event.detail.originalEvent.altKey") boolean altKey,
                           @EventData("event.detail.originalEvent.ctrlKey") boolean ctrlKey,
                           @EventData("event.detail.originalEvent.metaKey") boolean metaKey,
                           @EventData("event.detail.originalEvent.shiftKey") boolean shiftKey,
                           @EventData("event.detail.originalEvent.button") int button) {
        super(source, fromClient);

        this.x = x;
        this.y = y;

        details = new MouseEventDetails();
        details.setAbsoluteX(pageX);
        details.setAbsoluteY(pageY);
        details.setButton(MouseButton.of(button));
        details.setAltKey(altKey);
        details.setCtrlKey(ctrlKey);
        details.setMetaKey(metaKey);
        details.setShiftKey(shiftKey);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public MouseEventDetails getMouseDetails() {
        return details;
    }
}
