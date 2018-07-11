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
 * The stack labels show the total value for each bar in a stacked column or bar
 * chart. The label will be placed on top of positive columns and below negative
 * columns. In case of an inverted column chart or a bar chart the label is
 * placed to the right of positive bars and to the left of negative bars.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class StackLabels extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private Boolean allowOverlap;
	private Boolean enabled;
	private String format;
	private String _fn_formatter;
	private Number rotation;
	private HorizontalAlign textAlign;
	private Boolean useHTML;
	private VerticalAlign verticalAlign;
	private Number x;
	private Number y;

	public StackLabels() {
	}

	public StackLabels(Boolean enabled) {
		setEnabled(enabled);
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * Defines the horizontal alignment of the stack total label. Can be one of
	 * `"left"`, `"center"` or `"right"`. The default value is calculated at
	 * runtime and depends on orientation and whether the stack is positive or
	 * negative.
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setAllowOverlap(Boolean)
	 */
	public Boolean getAllowOverlap() {
		return allowOverlap;
	}

	/**
	 * Allow the stack labels to overlap.
	 */
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the stack total labels.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setFormat(String)
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * A [format string](http://docs.highcharts.com/#formatting) for the data
	 * label. Available variables are the same as for `formatter`.
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @see #set_fn_formatter(String)
	 */
	public String getFormatter() {
		return _fn_formatter;
	}

	/**
	 * Callback JavaScript function to format the label. The value is given by
	 * `this.total`.
	 */
	public void setFormatter(String _fn_formatter) {
		this._fn_formatter = _fn_formatter;
	}

	/**
	 * @see #setRotation(Number)
	 */
	public Number getRotation() {
		return rotation;
	}

	/**
	 * Rotation of the labels in degrees.
	 */
	public void setRotation(Number rotation) {
		this.rotation = rotation;
	}

	/**
	 * @see #setTextAlign(HorizontalAlign)
	 */
	public HorizontalAlign getTextAlign() {
		return textAlign;
	}

	/**
	 * The text alignment for the label. While `align` determines where the
	 * texts anchor point is placed with regards to the stack, `textAlign`
	 * determines how the text is aligned against its anchor point. Possible
	 * values are `"left"`, `"center"` and `"right"`. The default value is
	 * calculated at runtime and depends on orientation and whether the stack is
	 * positive or negative.
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
	 * HTML](http://www.highcharts.com/docs/chart-concepts/labels
	 * -and-string-formatting#html) to render the labels.
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
	 * Defines the vertical alignment of the stack total label. Can be one of
	 * `"top"`, `"middle"` or `"bottom"`. The default value is calculated at
	 * runtime and depends on orientation and whether the stack is positive or
	 * negative.
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
	 * The x position offset of the label relative to the left of the stacked
	 * bar. The default value is calculated at runtime and depends on
	 * orientation and whether the stack is positive or negative.
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
	 * The y position offset of the label relative to the tick position on the
	 * axis. The default value is calculated at runtime and depends on
	 * orientation and whether the stack is positive or negative.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
