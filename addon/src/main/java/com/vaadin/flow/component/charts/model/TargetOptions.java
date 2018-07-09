package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import com.vaadin.flow.component.charts.model.style.Color;

/**
 * All options related with look and positiong of targets.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class TargetOptions extends AbstractConfigurationObject {

	private Color borderColor;
	private Number borderWidth;
	private Color color;
	private Number height;
	private String width;

	public TargetOptions() {
	}

	/**
	 * @see #setBorderColor(Color)
	 */
	public Color getBorderColor() {
		return borderColor;
	}

	/**
	 * The border color of the rectangle representing the target. When not set,
	 * the point's border color is used. In styled mode, use class
	 * `highcharts-bullet-target` instead.
	 */
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderWidth(Number)
	 */
	public Number getBorderWidth() {
		return borderWidth;
	}

	/**
	 * The border width of the rectangle representing the target. In styled
	 * mode, use class `highcharts-bullet-target` instead.
	 */
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * The color of the rectangle representing the target. When not set, point's
	 * color (if set in point's options - [`color`](#series.bullet.data.color))
	 * or zone of the target value (if [`zones`](#plotOptions.bullet.zones) or
	 * [`negativeColor`](#plotOptions.bullet.negativeColor) are set) or the same
	 * color as the point has is used. In styled mode, use class
	 * `highcharts-bullet-target` instead.
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @see #setHeight(Number)
	 */
	public Number getHeight() {
		return height;
	}

	/**
	 * The height of the rectangle representing the target.
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * @see #setWidth(String)
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * The width of the rectangle representing the target. Could be set as a
	 * pixel value or as a percentage of a column width.
	 */
	public void setWidth(String width) {
		this.width = width;
	}
}
