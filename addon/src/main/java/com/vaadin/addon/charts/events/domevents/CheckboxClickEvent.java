package com.vaadin.addon.charts.events.domevents;

/*
 * #%L
 * Vaadin Charts Addon
 * %%
 * Copyright (C) 2012 - 2015 Vaadin Ltd
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

import com.vaadin.addon.charts.Chart;
import com.vaadin.addon.charts.events.domevents.details.MouseEventDetails;
import com.vaadin.ui.event.ComponentEvent;
import com.vaadin.ui.event.DomEvent;
import com.vaadin.ui.event.EventData;

/**
 * CheckboxClickEvent triggered when a checkbox in a legend is clicked
 */
@DomEvent("series-checkbox-click")
public class CheckboxClickEvent extends ComponentEvent<Chart> implements ClickEvent, HasSeries {

    private final boolean checked;
    private final int seriesIndex;
    private final MouseEventDetails details;

    public CheckboxClickEvent(Chart source, boolean fromClient,
                              @EventData("event.detail.originalEvent.pageX") int pageX,
                              @EventData("event.detail.originalEvent.pageY") int pageY,
                              @EventData("event.detail.originalEvent.altKey") boolean altKey,
                              @EventData("event.detail.originalEvent.ctrlKey") boolean ctrlKey,
                              @EventData("event.detail.originalEvent.metaKey") boolean metaKey,
                              @EventData("event.detail.originalEvent.shiftKey") boolean shiftKey,
                              @EventData("event.detail.originalEvent.button") int button,
                              @EventData("event.detail.originalEvent.checked") boolean isChecked,
                              @EventData("event.detail.originalEvent.item.index") int seriesIndex) {
        super(source, fromClient);
        this.checked = isChecked;
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

    public boolean isChecked() {
        return checked;
    }

    @Override
    public int getSeriesItemIndex() {
        return seriesIndex;
    }
}
