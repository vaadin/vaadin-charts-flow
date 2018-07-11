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
 * The chart's subtitle. This can be used both to display a subtitle below the
 * main title, and to display random text anywhere in the chart. The subtitle
 * can be updated after chart initialization through the `Chart.setTitle`
 * method.
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

	public Subtitle(String text) {
		setText(text);
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
	 */
	public void setFloating(Boolean floating) {
		this.floating = floating;
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
	 * Whether to [use
	 * HTML](http://www.highcharts.com/docs/chart-concepts/labels-
	 * and-string-formatting#html) to render the text.
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
	 * The x position of the subtitle relative to the alignment within chart.
	 * spacingLeft and chart.spacingRight.
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
	 * The y position of the subtitle relative to the alignment within chart.
	 * spacingTop and chart.spacingBottom. By default the subtitle is laid out
	 * below the title unless the title is floating.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
