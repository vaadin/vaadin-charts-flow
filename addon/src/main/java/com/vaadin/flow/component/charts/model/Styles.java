package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import com.vaadin.flow.component.charts.model.style.Color;

/**
 * Styles for a bottom line.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Styles extends AbstractConfigurationObject {

	private Number fill;
	private String lineColor;
	private Number lineWidth;
	private Color negativeColor;
	private Color positiveColor;

	public Styles() {
	}

	/**
	 * @see #setFill(Number)
	 */
	public Number getFill() {
		return fill;
	}

	/**
	 * Color of the area between Senkou Span A and B.
	 */
	public void setFill(Number fill) {
		this.fill = fill;
	}

	/**
	 * @see #setLineColor(String)
	 */
	public String getLineColor() {
		return lineColor;
	}

	/**
	 * Color of the line. If not set, it's inherited from
	 * [plotOptions.bb.color](#plotOptions.bb.color).
	 */
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	/**
	 * @see #setLineWidth(Number)
	 */
	public Number getLineWidth() {
		return lineWidth;
	}

	/**
	 * Pixel width of the line.
	 */
	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * @see #setNegativeColor(Color)
	 */
	public Color getNegativeColor() {
		return negativeColor;
	}

	/**
	 * Color of negative volume bars.
	 */
	public void setNegativeColor(Color negativeColor) {
		this.negativeColor = negativeColor;
	}

	/**
	 * @see #setPositiveColor(Color)
	 */
	public Color getPositiveColor() {
		return positiveColor;
	}

	/**
	 * Color of positive volume bars.
	 */
	public void setPositiveColor(Color positiveColor) {
		this.positiveColor = positiveColor;
	}
}
