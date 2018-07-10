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
 * Options for annotation's shapes. Each shape inherits options from the
 * shapeOptions object. An option from the shapeOptions can be overwritten by
 * config for a specific shape.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ShapeOptions extends AbstractConfigurationObject {

	private Color fill;
	private Number height;
	private Number r;
	private Color stroke;
	private Number strokeWidth;
	private String type;
	private Number width;

	public ShapeOptions() {
	}

	/**
	 * @see #setFill(Color)
	 */
	public Color getFill() {
		return fill;
	}

	/**
	 * The color of the shape's fill.
	 */
	public void setFill(Color fill) {
		this.fill = fill;
	}

	/**
	 * @see #setHeight(Number)
	 */
	public Number getHeight() {
		return height;
	}

	/**
	 * The height of the shape.
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * @see #setR(Number)
	 */
	public Number getR() {
		return r;
	}

	/**
	 * The radius of the shape.
	 */
	public void setR(Number r) {
		this.r = r;
	}

	/**
	 * @see #setStroke(Color)
	 */
	public Color getStroke() {
		return stroke;
	}

	/**
	 * The color of the shape's stroke.
	 */
	public void setStroke(Color stroke) {
		this.stroke = stroke;
	}

	/**
	 * @see #setStrokeWidth(Number)
	 */
	public Number getStrokeWidth() {
		return strokeWidth;
	}

	/**
	 * The pixel stroke width of the shape.
	 */
	public void setStrokeWidth(Number strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

	/**
	 * @see #setType(String)
	 */
	public String getType() {
		return type;
	}

	/**
	 * The type of the shape, e.g. circle or rectangle.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @see #setWidth(Number)
	 */
	public Number getWidth() {
		return width;
	}

	/**
	 * The width of the shape.
	 */
	public void setWidth(Number width) {
		this.width = width;
	}
}
