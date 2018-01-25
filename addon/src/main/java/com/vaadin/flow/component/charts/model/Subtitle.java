package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
/**
 * The chart's subtitle
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Subtitle extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private Boolean floating;
	private String text;
	private Boolean useHTML;
	private VerticalAlign verticalAlign;
	private Number widthAdjust;
	private Number x;
	private Number y;

	public Subtitle() {
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * The horizontal alignment of the subtitle. Can be one of "left", "center"
	 * and "right".
	 * <p>
	 * Defaults to: center
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setFloating(Boolean)
	 */
	public Boolean getFloating() {
		return floating;
	}

	/**
	 * When the subtitle is floating, the plot area will not move to make space
	 * for it.
	 * <p>
	 * Defaults to: false
	 */
	public void setFloating(Boolean floating) {
		this.floating = floating;
	}

	public Subtitle(String text) {
		this.text = text;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * The subtitle of the chart.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @see #setUseHTML(Boolean)
	 */
	public Boolean getUseHTML() {
		return useHTML;
	}

	/**
	 * Whether to <a href=
	 * "http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html"
	 * >use HTML</a> to render the text.
	 * <p>
	 * Defaults to: false
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
	 * The vertical alignment of the title. Can be one of "top", "middle" and
	 * "bottom". When a value is given, the title behaves as floating.
	 * <p>
	 * Defaults to:
	 */
	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setWidthAdjust(Number)
	 */
	public Number getWidthAdjust() {
		return widthAdjust;
	}

	/**
	 * Adjustment made to the subtitle width, normally to reserve space for the
	 * exporting burger menu.
	 * <p>
	 * Defaults to: -44
	 */
	public void setWidthAdjust(Number widthAdjust) {
		this.widthAdjust = widthAdjust;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * The x position of the subtitle relative to the alignment within
	 * chart.spacingLeft and chart.spacingRight.
	 * <p>
	 * Defaults to: 0
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
	 * The y position of the subtitle relative to the alignment within
	 * chart.spacingTop and chart.spacingBottom. By default the subtitle is laid
	 * out below the title unless the title is floating.
	 * <p>
	 * Defaults to: null
	 */
	public void setY(Number y) {
		this.y = y;
	}
}