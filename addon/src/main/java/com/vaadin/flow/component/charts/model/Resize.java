package com.vaadin.flow.component.charts.model;

/*-
 * #%L
 * Vaadin Charts for Flow
 * %%
 * Copyright (C) 2014 - 2018 Vaadin Ltd
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

import javax.annotation.Generated;
import com.vaadin.flow.component.charts.model.style.Color;

/**
 * Options for axis resizing. This feature requires the `drag-panes.js` -
 * [classic](http://code.highcharts.com/stock/modules/drag-panes.js) or
 * [styled](http://code.highcharts.com/stock/js/modules/drag-panes.js) mode -
 * module.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Resize extends AbstractConfigurationObject {

	private ControlledAxis controlledAxis;
	private String cursor;
	private Boolean enabled;
	private Color lineColor;
	private String lineDashStyle;
	private Number lineWidth;
	private Number x;
	private Number y;

	public Resize() {
	}

	public Resize(Boolean enabled) {
		setEnabled(enabled);
	}

	/**
	 * @see #setControlledAxis(ControlledAxis)
	 */
	public ControlledAxis getControlledAxis() {
		if (controlledAxis == null) {
			controlledAxis = new ControlledAxis();
		}
		return controlledAxis;
	}

	/**
	 * Contains two arrays of axes that are controlled by control line of the
	 * axis. This feature requires the `drag-panes.js` module.
	 */
	public void setControlledAxis(ControlledAxis controlledAxis) {
		this.controlledAxis = controlledAxis;
	}

	/**
	 * @see #setCursor(String)
	 */
	public String getCursor() {
		return cursor;
	}

	/**
	 * Cursor style for the control line. In styled mode use class
	 * `highcharts-axis-resizer` instead. This feature requires the
	 * `drag-panes.js` module.
	 */
	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable resize by drag for the axis. This feature requires the
	 * `drag-panes.js` module.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setLineColor(Color)
	 */
	public Color getLineColor() {
		return lineColor;
	}

	/**
	 * Color of the control line. In styled mode use class
	 * `highcharts-axis-resizer` instead. This feature requires the
	 * `drag-panes.js` module.
	 */
	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}

	/**
	 * @see #setLineDashStyle(String)
	 */
	public String getLineDashStyle() {
		return lineDashStyle;
	}

	/**
	 * Dash style of the control line. In styled mode use class
	 * `highcharts-axis-resizer` instead. This feature requires the
	 * `drag-panes.js` module.
	 */
	public void setLineDashStyle(String lineDashStyle) {
		this.lineDashStyle = lineDashStyle;
	}

	/**
	 * @see #setLineWidth(Number)
	 */
	public Number getLineWidth() {
		return lineWidth;
	}

	/**
	 * Width of the control line. In styled mode use class
	 * `highcharts-axis-resizer` instead. This feature requires the
	 * `drag-panes.js` module.
	 */
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * Horizontal offset of the control line. This feature requires the
	 * `drag-panes.js` module.
	 */
	public void setX(Number x) {
		this.x = x;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * Vertical offset of the control line. This feature requires the
	 * `drag-panes.js` module.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
