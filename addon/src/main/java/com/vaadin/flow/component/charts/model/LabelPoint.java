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

/**
 * This option defines the point to which the label will be connected. It can be
 * either the point which exists in the series - it is referenced by the point's
 * id - or a new point with defined x, y properies and optionally axes.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class LabelPoint extends AbstractConfigurationObject {

	private Number x;
	private String xAxis;
	private Number y;
	private String yAxis;

	public LabelPoint() {
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * The x position of the point. Units can be either in axis or chart pixel
	 * coordinates.
	 */
	public void setX(Number x) {
		this.x = x;
	}

	/**
	 * @see #setXAxis(String)
	 */
	public String getXAxis() {
		return xAxis;
	}

	/**
	 * This number defines which xAxis the point is connected to. It refers to
	 * either the axis id or the index of the axis in the xAxis array. If the
	 * option is not configured or the axis is not found the point's x
	 * coordinate refers to the chart pixels.
	 */
	public void setXAxis(String xAxis) {
		this.xAxis = xAxis;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * The y position of the point. Units can be either in axis or chart pixel
	 * coordinates.
	 */
	public void setY(Number y) {
		this.y = y;
	}

	/**
	 * @see #setYAxis(String)
	 */
	public String getYAxis() {
		return yAxis;
	}

	/**
	 * This number defines which yAxis the point is connected to. It refers to
	 * either the axis id or the index of the axis in the yAxis array. If the
	 * option is not configured or the axis is not found the point's y
	 * coordinate refers to the chart pixels.
	 */
	public void setYAxis(String yAxis) {
		this.yAxis = yAxis;
	}
}
