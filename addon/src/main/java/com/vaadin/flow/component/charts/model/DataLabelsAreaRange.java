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
 * Extended data labels for range series types. Range series data labels have no
 * `x` and `y` options. Instead, they have `xLow`, `xHigh`, `yLow` and `yHigh`
 * options to allow the higher and lower data label sets individually.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class DataLabelsAreaRange extends AbstractConfigurationObject {

	private String _fn_formatter;
	private HorizontalAlign align;
	private Boolean allowOverlap;
	private String className;
	private Boolean crop;
	private Boolean defer;
	private Boolean enabled;
	private Filter filter;
	private String format;
	private Boolean inside;
	private String overflow;
	private Number padding;
	private Number rotation;
	private Boolean shadow;
	private Shape shape;
	private Boolean useHTML;
	private VerticalAlign verticalAlign;
	private Number xHigh;
	private Number xLow;
	private String yHigh;
	private String yLow;
	private Number zIndex;

	public DataLabelsAreaRange() {
	}

	public DataLabelsAreaRange(Boolean enabled) {
		setEnabled(enabled);
	}

	/**
	 * @see #set_fn_formatter(String)
	 */
	public String getFormatter() {
		return _fn_formatter;
	}

	/**
	 * Callback JavaScript function to format the data label. Note that if a
	 * `format` is defined, the format takes precedence and the formatter is
	 * ignored. Available data are:
	 * <table>
	 * <tbody>
	 * <tr>
	 * <td>`this.percentage`</td>
	 * <td>Stacked series and pies only. The point's percentage of the total.</td>
	 * </tr>
	 * <tr>
	 * <td>`this.point`</td>
	 * <td>The point object. The point name, if defined, is available through
	 * `this.point.name`.</td>
	 * </tr>
	 * <tr>
	 * <td>`this.series`:</td>
	 * <td>The series object. The series name is available through
	 * `this.series.name`.</td>
	 * </tr>
	 * <tr>
	 * <td>`this.total`</td>
	 * <td>Stacked series only. The total value at this point's x value.</td>
	 * </tr>
	 * <tr>
	 * <td>`this.x`:</td>
	 * <td>The x value.</td>
	 * </tr>
	 * <tr>
	 * <td>`this.y`:</td>
	 * <td>The y value.</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 */
	public void setFormatter(String _fn_formatter) {
		this._fn_formatter = _fn_formatter;
	}

	public HorizontalAlign getAlign() {
		return align;
	}

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
	 * Whether to allow data labels to overlap. To make the labels less
	 * sensitive for overlapping, the [dataLabels.padding](
	 * #plotOptions.series.dataLabels.padding) can be set to 0.
	 */
	public void setAllowOverlap(Boolean allowOverlap) {
		this.allowOverlap = allowOverlap;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A class name for the data label. Particularly in styled mode, this can be
	 * used to give each series' or point's data label unique styling. In
	 * addition to this option, a default color class name is added so that we
	 * can give the labels a [contrast text
	 * shadow](http://jsfiddle.net/gh/get/library
	 * /pure/highcharts/highcharts/tree
	 * /master/samples/highcharts/css/data-label-contrast/).
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
	 * Whether to hide data labels that are outside the plot area. By default,
	 * the data label is moved inside the plot area according to the
	 * [overflow](#plotOptions.series.dataLabels.overflow) option.
	 */
	public void setCrop(Boolean crop) {
		this.crop = crop;
	}

	/**
	 * @see #setDefer(Boolean)
	 */
	public Boolean getDefer() {
		return defer;
	}

	/**
	 * Whether to defer displaying the data labels until the initial series
	 * animation has finished.
	 */
	public void setDefer(Boolean defer) {
		this.defer = defer;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the data labels.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setFilter(Filter)
	 */
	public Filter getFilter() {
		if (filter == null) {
			filter = new Filter();
		}
		return filter;
	}

	/**
	 * A declarative filter for which data labels to display. The declarative
	 * filter is designed for use when callback functions are not available,
	 * like when the chart options require a pure JSON structure or for use with
	 * graphical editors. For programmatic control, use the `formatter` instead,
	 * and return `false` to disable a single data label.
	 */
	public void setFilter(Filter filter) {
		this.filter = filter;
	}

	/**
	 * @see #setFormat(String)
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * A [format
	 * string](http://www.highcharts.com/docs/chart-concepts/labels-and
	 * -string-formatting) for the data label. Available variables are the same
	 * as for `formatter`.
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @see #setInside(Boolean)
	 */
	public Boolean getInside() {
		return inside;
	}

	/**
	 * For points with an extent, like columns or map areas, whether to align
	 * the data label inside the box or to the actual value point. Defaults to
	 * `false` in most cases, `true` in stacked columns.
	 */
	public void setInside(Boolean inside) {
		this.inside = inside;
	}

	/**
	 * @see #setOverflow(String)
	 */
	public String getOverflow() {
		return overflow;
	}

	/**
	 * How to handle data labels that flow outside the plot area. The default is
	 * `justify`, which aligns them inside the plot area. For columns and bars,
	 * this means it will be moved inside the bar. To display data labels
	 * outside the plot area, set `crop` to `false` and `overflow` to `"none"`.
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
	 * When either the `borderWidth` or the `backgroundColor` is set, this is
	 * the padding within the box.
	 */
	public void setPadding(Number padding) {
		this.padding = padding;
	}

	/**
	 * @see #setRotation(Number)
	 */
	public Number getRotation() {
		return rotation;
	}

	/**
	 * Text rotation in degrees. Note that due to a more complex structure,
	 * backgrounds, borders and padding will be lost on a rotated data label.
	 */
	public void setRotation(Number rotation) {
		this.rotation = rotation;
	}

	/**
	 * @see #setShadow(Boolean)
	 */
	public Boolean getShadow() {
		return shadow;
	}

	/**
	 * The shadow of the box. Works best with `borderWidth` or
	 * `backgroundColor`. Since 2.3 the shadow can be an object configuration
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

	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setXHigh(Number)
	 */
	public Number getXHigh() {
		return xHigh;
	}

	/**
	 * X offset of the higher data labels relative to the point value.
	 */
	public void setXHigh(Number xHigh) {
		this.xHigh = xHigh;
	}

	/**
	 * @see #setXLow(Number)
	 */
	public Number getXLow() {
		return xLow;
	}

	/**
	 * X offset of the lower data labels relative to the point value.
	 */
	public void setXLow(Number xLow) {
		this.xLow = xLow;
	}

	/**
	 * @see #setYHigh(String)
	 */
	public String getYHigh() {
		return yHigh;
	}

	/**
	 * Y offset of the higher data labels relative to the point value.
	 */
	public void setYHigh(String yHigh) {
		this.yHigh = yHigh;
	}

	/**
	 * @see #setYLow(String)
	 */
	public String getYLow() {
		return yLow;
	}

	/**
	 * Y offset of the lower data labels relative to the point value.
	 */
	public void setYLow(String yLow) {
		this.yLow = yLow;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The Z index of the data labels. The default Z index puts it above the
	 * series. Use a Z index of 2 to display it behind the series.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
