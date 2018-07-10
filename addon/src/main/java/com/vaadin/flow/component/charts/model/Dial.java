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
 * Options for the dial or arrow pointer of the gauge. In styled mode, the dial
 * is styled with the `.highcharts-gauge-series .highcharts-dial` rule.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Dial extends AbstractConfigurationObject {

	private String baseLength;
	private Number baseWidth;
	private String radius;
	private String rearLength;
	private Number topWidth;

	public Dial() {
	}

	/**
	 * @see #setBaseLength(String)
	 */
	public String getBaseLength() {
		return baseLength;
	}

	/**
	 * The length of the dial's base part, relative to the total radius or
	 * length of the dial.
	 */
	public void setBaseLength(String baseLength) {
		this.baseLength = baseLength;
	}

	/**
	 * @see #setBaseWidth(Number)
	 */
	public Number getBaseWidth() {
		return baseWidth;
	}

	/**
	 * The pixel width of the base of the gauge dial. The base is the part
	 * closest to the pivot, defined by baseLength.
	 */
	public void setBaseWidth(Number baseWidth) {
		this.baseWidth = baseWidth;
	}

	/**
	 * @see #setRadius(String)
	 */
	public String getRadius() {
		return radius;
	}

	/**
	 * The radius or length of the dial, in percentages relative to the radius
	 * of the gauge itself.
	 */
	public void setRadius(String radius) {
		this.radius = radius;
	}

	/**
	 * @see #setRearLength(String)
	 */
	public String getRearLength() {
		return rearLength;
	}

	/**
	 * The length of the dial's rear end, the part that extends out on the other
	 * side of the pivot. Relative to the dial's length.
	 */
	public void setRearLength(String rearLength) {
		this.rearLength = rearLength;
	}

	/**
	 * @see #setTopWidth(Number)
	 */
	public Number getTopWidth() {
		return topWidth;
	}

	/**
	 * The width of the top of the dial, closest to the perimeter. The pivot
	 * narrows in from the base to the top.
	 */
	public void setTopWidth(Number topWidth) {
		this.topWidth = topWidth;
	}
}
