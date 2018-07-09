package com.vaadin.flow.component.charts.model;

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
 * Set the keyboard navigation mode for the chart.
 */
public enum KeyboardNavigationMode implements ChartEnum {

    /**
     * In normal mode, left/right arrow keys move between points in a series,
     * while up/down arrow keys move between series. Up/down navigation acts intelligently to figure out
     * which series makes sense to move to from any given point.
     */
    NORMAL,

    /**
     * In "serialize" mode, points are instead navigated as a single list.
     * Left/right behaves as in normal mode. Up/down arrow keys will behave like left/right.
     * This is useful for unifying navigation behavior with/without screen readers enabled.
     */
    SERIALIZE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
