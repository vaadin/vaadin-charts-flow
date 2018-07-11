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
 * Options for annotation's labels. Each label inherits options from the
 * labelOptions object. An option from the labelOptions can be overwritten by
 * config for a specific label.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class LabelOptions extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private Boolean allowOverlap;
	private Color backgroundColor;
	private Color borderColor;
	private Number borderRadius;
	private Number borderWidth;
	private String className;
	private Boolean crop;
	private Number distance;
	private String format;
	private String _fn_formatter;
	private String overflow;
	private Number padding;
	private Boolean shadow;
	private Shape shape;
	private String text;
	private Boolean useHTML;
	private VerticalAlign verticalAlign;
	private Number x;
	private Number y;

	public LabelOptions() {
	}

	public LabelOptions(String text) {
		setText(text);
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * The alignment of the annotation's label. If right, the right side of the
	 * label should be touching the point.
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
	 * Whether to allow the annotation's labels to overlap. To make the labels
	 * less sensitive for overlapping, the can be set to 0.
	 */
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
	}

	/**
	 * @see #setBackgroundColor(Color)
	 */
	public Color getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * The background color or gradient for the annotation's label.
	 */
	public void setBackgroundColor(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @see #setBorderColor(Color)
	 */
	public Color getBorderColor() {
		return borderColor;
	}

	/**
	 * The border color for the annotation's label.
	 */
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderRadius(Number)
	 */
	public Number getBorderRadius() {
		return borderRadius;
	}

	/**
	 * The border radius in pixels for the annotaiton's label.
	 */
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
	}

	/**
	 * @see #setBorderWidth(Number)
	 */
	public Number getBorderWidth() {
		return borderWidth;
	}

	/**
	 * The border width in pixels for the annotation's label
	 */
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A class name for styling by CSS.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setCrop(Boolean)
	 */
	public Boolean getCrop() {
		return crop;
	}

	/**
	 * Whether to hide the annotation's label that is outside the plot area.
	 */
	public void setCrop(Boolean crop) {
		this.crop = crop;
	}

	/**
	 * @see #setDistance(Number)
	 */
	public Number getDistance() {
		return distance;
	}

	/**
	 * The label's pixel distance from the point.
	 */
	public void setDistance(Number distance) {
		this.distance = distance;
	}

	/**
	 * @see #setFormat(String)
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * A [format](https://www.highcharts.com/docs/chart-concepts/labels-and-
	 * string-formatting) string for the data label.
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
	 * Callback JavaScript function to format the annotation's label. Note that
	 * if a `format` or `text` are defined, the format or text take precedence
	 * and the formatter is ignored. `This` refers to a point object.
	 */
	public void setFormatter(String _fn_formatter) {
		this._fn_formatter = _fn_formatter;
	}

	/**
	 * @see #setOverflow(String)
	 */
	public String getOverflow() {
		return overflow;
	}

	/**
	 * How to handle the annotation's label that flow outside the plot area. The
	 * justify option aligns the label inside the plot area.
	 */
	public void setOverflow(String overflow) {
		this.overflow = overflow;
	}

	/**
	 * @see #setPadding(Number)
	 */
	public Number getPadding() {
		return padding;
	}

	/**
	 * When either the borderWidth or the backgroundColor is set, this is the
	 * padding within the box.
	 */
	public void setPadding(Number padding) {
		this.padding = padding;
	}

	/**
	 * @see #setShadow(Boolean)
	 */
	public Boolean getShadow() {
		return shadow;
	}

	/**
	 * The shadow of the box. The shadow can be an object configuration
	 * containing `color`, `offsetX`, `offsetY`, `opacity` and `width`.
	 */
	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
	}

	/**
	 * @see #setShape(Shape)
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * The name of a symbol to use for the border around the label. Symbols are
	 * predefined functions on the Renderer object.
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * Alias for the format option.
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
	 * HTML](http://www.highcharts.com/docs/chart-concepts/labels
	 * -and-string-formatting#html) to render the annotation's label.
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
	 * The vertical alignment of the annotation's label.
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
	 * The x position offset of the label relative to the point. Note that if a
	 * `distance` is defined, the distance takes precedence over `x` and `y`
	 * options.
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
	 * The y position offset of the label relative to the point. Note that if a
	 * `distance` is defined, the distance takes precedence over `x` and `y`
	 * options.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
