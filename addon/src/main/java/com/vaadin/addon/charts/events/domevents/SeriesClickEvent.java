package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.events.domevents.details.MouseEventDetails;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

/**
 * The SeriesClickEvent class stores data for click events on the series of the
 * chart.
 */
@DomEvent("series-click")
public class SeriesClickEvent extends ComponentEvent<Chart> implements ClickEvent, HasSeries {

    private final int seriesIndex;
    private final MouseEventDetails details;

    public SeriesClickEvent(Chart source, boolean fromClient,
                            @EventData("event.detail.originalEvent.chartX") int chartX,
                            @EventData("event.detail.originalEvent.chartY") int chartY,
                            @EventData("event.detail.originalEvent.pageX") int pageX,
                            @EventData("event.detail.originalEvent.pageY") int pageY,
                            @EventData("event.detail.originalEvent.altKey") boolean altKey,
                            @EventData("event.detail.originalEvent.ctrlKey") boolean ctrlKey,
                            @EventData("event.detail.originalEvent.metaKey") boolean metaKey,
                            @EventData("event.detail.originalEvent.shiftKey") boolean shiftKey,
                            @EventData("event.detail.originalEvent.button") int button,
                            @EventData("event.detail.originalEvent.point.series.index") int seriesIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;

        details = new MouseEventDetails();
        details.setX(chartX);
        details.setY(chartY);
        details.setAbsoluteX(pageX);
        details.setAbsoluteY(pageY);
        details.setButton(MouseEventDetails.MouseButton.of(button));
        details.setAltKey(altKey);
        details.setCtrlKey(ctrlKey);
        details.setMetaKey(metaKey);
        details.setShiftKey(shiftKey);
    }

    @Override
    public int getSeriesItemIndex() {
        return seriesIndex;
    }

    @Override
    public MouseEventDetails getMouseDetails() {
        return details;
    }
}
