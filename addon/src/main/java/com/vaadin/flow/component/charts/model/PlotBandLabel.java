package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Text labels for the plot bands
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotBandLabel extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private Number rotation;
	private String text;
	private HorizontalAlign textAlign;
	private Boolean useHTML;
	private VerticalAlign verticalAlign;
	private Number x;
	private Number y;

	public PlotBandLabel() {
	}

	public PlotBandLabel(String text) {
		this.text = text;
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * Horizontal alignment of the label. Can be one of "left", "center" or
	 * "right".
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setRotation(Number)
	 */
	public Number getRotation() {
		return rotation;
	}

	/**
	 * Rotation of the text label in degrees .
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
	 * The string text itself. A subset of HTML is supported.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @see #setTextAlign(HorizontalAlign)
	 */
	public HorizontalAlign getTextAlign() {
		return textAlign;
	}

	/**
	 * The text alignment for the label. While `align` determines where the
	 * texts anchor point is placed within the plot band, `textAlign` determines
	 * how the text is aligned against its anchor point. Possible values are
	 * "left", "center" and "right". Defaults to the same as the `align` option.
	 */
	public void setTextAlign(HorizontalAlign textAlign) {
		this.textAlign = textAlign;
	}

	/**
	 * @see #setUseHTML(Boolean)
	 */
	public Boolean getUseHTML() {
		return useHTML;
	}

	/**
	 * Whether to [use
	 * HTML](http://www.highcharts.com/docs/chart-concepts/labels-
	 * and-string-formatting#html) to render the labels.
	 */
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
	}

	/**
	 * @see #setVerticalAlign(VerticalAlign)
	 */
	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * Vertical alignment of the label relative to the plot band. Can be one of
	 * "top", "middle" or "bottom".
	 */
	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * Horizontal position relative the alignment. Default varies by
	 * orientation.
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
	 * Vertical position of the text baseline relative to the alignment. Default
	 * varies by orientation.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
