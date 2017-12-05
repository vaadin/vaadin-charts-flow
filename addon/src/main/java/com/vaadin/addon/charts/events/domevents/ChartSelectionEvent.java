package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.model.ChartModel;
import com.vaadin.addon.charts.model.Dimension;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;
import elemental.json.impl.JreJsonNumber;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2014 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

/**
 * The ChartSelectionEvent class stores information on selection events on the
 * chart's area.
 */
@DomEvent("chart-selection")
public class ChartSelectionEvent extends ComponentEvent<Chart> {

    private final Double selectionStart;
    private final Double selectionEnd;
    private final Double valueStart;
    private final Double valueEnd;

    /**
     * Construct a ChartSelectionEvent
     * 
     * @param source
     * @param selectionStart
     * @param selectionEnd
     * @param valueStart
     * @param valueEnd
     */
    public ChartSelectionEvent(Chart source, boolean fromClient,
                               @EventData("event.detail.originalEvent.selectionStart") JreJsonNumber selectionStart,
                               @EventData("event.detail.originalEvent.selectionEnd") JreJsonNumber selectionEnd,
                               @EventData("event.detail.originalEvent.valueStart") JreJsonNumber valueStart,
                               @EventData("event.detail.originalEvent.valueEnd") JreJsonNumber valueEnd) {
        super(source, fromClient);
        this.selectionStart = selectionStart.asNumber();
        this.selectionEnd = selectionEnd.asNumber();
        this.valueStart = valueStart.asNumber();
        this.valueEnd = valueEnd.asNumber();
    }

    /**
     * This value is undefined and shouldn't be considered if
     * {@link ChartModel#setZoomType(com.vaadin.addon.charts.model.Dimension)}
     * was set to {@link Dimension#Y}
     * 
     * @return the X coordinate where the selection started if ZoomType is
     *         {@link Dimension#X} or {@link Dimension#XY}.
     */
    public Double getSelectionStart() {
        return selectionStart;
    }

    /**
     * This value is undefined and shouldn't be considered if
     * {@link ChartModel#setZoomType(com.vaadin.addon.charts.model.Dimension)}
     * was set to {@link Dimension#Y}
     * 
     * @return the X coordinate where the selection endedif ZoomType is
     *         {@link Dimension#X} or {@link Dimension#XY}.
     */
    public Double getSelectionEnd() {
        return selectionEnd;
    }

    /**
     * This value is undefined and shouldn't be considered if
     * {@link ChartModel#setZoomType(com.vaadin.addon.charts.model.Dimension)}
     * was set to {@link Dimension#X}
     * 
     * @return the Y coordinate where the selection started if ZoomType is
     *         {@link Dimension#Y} or {@link Dimension#XY}.
     */
    public Double getValueStart() {
        return valueStart;
    }

    /**
     * This value is undefined and shouldn't be considered if
     * {@link ChartModel#setZoomType(com.vaadin.addon.charts.model.Dimension)}
     * was set to {@link Dimension#X}
     * 
     * @return the Y coordinate where the selection ended if ZoomType is
     *         {@link Dimension#Y} or {@link Dimension#XY}.
     */
    public Double getValueEnd() {
        return valueEnd;
    }
}
