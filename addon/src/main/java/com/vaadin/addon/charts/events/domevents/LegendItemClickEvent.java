package com.vaadin.addon.charts.events.domevents;

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.events.domevents.details.MouseEventDetails;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

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
 * The LegendItemClickEvent class stores information on click events on the
 * charts's legend items.
 */
@DomEvent("series-legend-item-click")
public class LegendItemClickEvent extends ComponentEvent<Chart> implements ClickEvent, HasSeries {

    private final int seriesIndex;
    private final MouseEventDetails details;

    /**
     * Constructs a LegendItemClickEvent
     * 
     * @param source
     * @param fromClient
     */
    public LegendItemClickEvent(Chart source, boolean fromClient,
                                @EventData("event.detail.originalEvent.pageX") int pageX,
                                @EventData("event.detail.originalEvent.pageY") int pageY,
                                @EventData("event.detail.originalEvent.altKey") boolean altKey,
                                @EventData("event.detail.originalEvent.ctrlKey") boolean ctrlKey,
                                @EventData("event.detail.originalEvent.metaKey") boolean metaKey,
                                @EventData("event.detail.originalEvent.shiftKey") boolean shiftKey,
                                @EventData("event.detail.originalEvent.button") int button,
                                @EventData("event.detail.originalEvent.target.index") int seriesIndex) {
        super(source, fromClient);
        this.seriesIndex = seriesIndex;

        details = new MouseEventDetails();
        details.setAbsoluteX(pageX);
        details.setAbsoluteY(pageY);
        details.setButton(MouseEventDetails.MouseButton.of(button));
        details.setAltKey(altKey);
        details.setCtrlKey(ctrlKey);
        details.setMetaKey(metaKey);
        details.setShiftKey(shiftKey);
    }

    @Override
    public MouseEventDetails getMouseDetails() {
        return details;
    }

    @Override
    public int getSeriesItemIndex() {
        return seriesIndex;
    }
}
