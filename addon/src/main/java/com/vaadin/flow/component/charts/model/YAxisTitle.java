package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class YAxisTitle extends AxisTitle {

	private Number margin;
	private Number rotation;
	private String text;

	public YAxisTitle() {
	}

	public YAxisTitle(String text) {
		this.text = text;
	}

	/**
	 * @see #setMargin(Number)
	 */
	public Number getMargin() {
		return margin;
	}

	/**
	 * The pixel distance between the axis labels and the title. Positive values
	 * are outside the axis line, negative are inside.
	 */
	public void setMargin(Number margin) {
		this.margin = margin;
	}

	/**
	 * @see #setRotation(Number)
	 */
	public Number getRotation() {
		return rotation;
	}

	/**
	 * The rotation of the text in degrees. 0 is horizontal, 270 is vertical
	 * reading from bottom to top.
	 */
	public void setRotation(Number rotation) {
		this.rotation = rotation;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * The actual text of the axis title. Horizontal texts can contain HTML, but
	 * rotated texts are painted using vector techniques and must be clean text.
	 * The Y axis title is disabled by setting the `text` option to `null`.
	 */
	public void setText(String text) {
		this.text = text;
	}
}
