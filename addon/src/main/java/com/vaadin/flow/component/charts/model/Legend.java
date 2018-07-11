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
 * The legend is a box containing a symbol and name for each series item or
 * point item in the chart. Each series (or points in case of pie charts) is
 * represented by a symbol and its name in the legend. It is possible to
 * override the symbol creator function and create [custom legend
 * symbols](http:/
 * /jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master
 * /samples/highcharts/studies/legend- custom-symbol/).
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Legend extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private Boolean alignColumns;
	private Number borderRadius;
	private Boolean enabled;
	private Boolean floating;
	private ItemCheckboxStyle itemCheckboxStyle;
	private Number itemDistance;
	private Number itemMarginBottom;
	private Number itemMarginTop;
	private Number itemWidth;
	private KeyboardNavigation keyboardNavigation;
	private String labelFormat;
	private String _fn_labelFormatter;
	private LayoutDirection layout;
	private Number lineHeight;
	private Number margin;
	private Number maxHeight;
	private LegendNavigation navigation;
	private Number padding;
	private Boolean reversed;
	private Boolean rtl;
	private Boolean shadow;
	private Boolean squareSymbol;
	private Number symbolHeight;
	private Number symbolPadding;
	private Number symbolRadius;
	private Number symbolWidth;
	private LegendTitle title;
	private Boolean useHTML;
	private VerticalAlign verticalAlign;
	private Number width;
	private Number x;
	private Number y;

	public Legend() {
	}

	public Legend(Boolean enabled) {
		setEnabled(enabled);
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * The horizontal alignment of the legend box within the chart area. Valid
	 * values are `left`, `center` and `right`. In the case that the legend is
	 * aligned in a corner position, the `layout` option will determine whether
	 * to place it above/below or on the side of the plot area.
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setAlignColumns(Boolean)
	 */
	public Boolean getAlignColumns() {
		return alignColumns;
	}

	/**
	 * If the [layout](legend.layout) is `horizontal` and the legend items span
	 * over two lines or more, whether to align the items into vertical columns.
	 * Setting this to `false` makes room for more items, but will look more
	 * messy.
	 */
	public void setAlignColumns(Boolean alignColumns) {
		this.alignColumns = alignColumns;
	}

	/**
	 * @see #setBorderRadius(Number)
	 */
	public Number getBorderRadius() {
		return borderRadius;
	}

	/**
	 * The border corner radius of the legend.
	 */
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the legend.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setFloating(Boolean)
	 */
	public Boolean getFloating() {
		return floating;
	}

	/**
	 * When the legend is floating, the plot area ignores it and is allowed to
	 * be placed below it.
	 */
	public void setFloating(Boolean floating) {
		this.floating = floating;
	}

	/**
	 * @see #setItemCheckboxStyle(ItemCheckboxStyle)
	 */
	public ItemCheckboxStyle getItemCheckboxStyle() {
		if (itemCheckboxStyle == null) {
			itemCheckboxStyle = new ItemCheckboxStyle();
		}
		return itemCheckboxStyle;
	}

	/**
	 * Default styling for the checkbox next to a legend item when
	 * `showCheckbox` is true.
	 */
	public void setItemCheckboxStyle(ItemCheckboxStyle itemCheckboxStyle) {
		this.itemCheckboxStyle = itemCheckboxStyle;
	}

	/**
	 * @see #setItemDistance(Number)
	 */
	public Number getItemDistance() {
		return itemDistance;
	}

	/**
	 * In a legend with horizontal layout, the itemDistance defines the pixel
	 * distance between each item.
	 */
	public void setItemDistance(Number itemDistance) {
		this.itemDistance = itemDistance;
	}

	/**
	 * @see #setItemMarginBottom(Number)
	 */
	public Number getItemMarginBottom() {
		return itemMarginBottom;
	}

	/**
	 * The pixel bottom margin for each legend item.
	 */
	public void setItemMarginBottom(Number itemMarginBottom) {
		this.itemMarginBottom = itemMarginBottom;
	}

	/**
	 * @see #setItemMarginTop(Number)
	 */
	public Number getItemMarginTop() {
		return itemMarginTop;
	}

	/**
	 * The pixel top margin for each legend item.
	 */
	public void setItemMarginTop(Number itemMarginTop) {
		this.itemMarginTop = itemMarginTop;
	}

	/**
	 * @see #setItemWidth(Number)
	 */
	public Number getItemWidth() {
		return itemWidth;
	}

	/**
	 * The width for each legend item. By default the items are laid out
	 * successively. In a [horizontal layout](legend.layout), if the items are
	 * laid out across two rows or more, they will be vertically aligned
	 * depending on the [legend.alignColumns](legend.alignColumns) option.
	 */
	public void setItemWidth(Number itemWidth) {
		this.itemWidth = itemWidth;
	}

	/**
	 * @see #setKeyboardNavigation(KeyboardNavigation)
	 */
	public KeyboardNavigation getKeyboardNavigation() {
		if (keyboardNavigation == null) {
			keyboardNavigation = new KeyboardNavigation();
		}
		return keyboardNavigation;
	}

	/**
	 * Keyboard navigation for the legend. Requires the Accessibility module.
	 */
	public void setKeyboardNavigation(KeyboardNavigation keyboardNavigation) {
		this.keyboardNavigation = keyboardNavigation;
	}

	/**
	 * @see #setLabelFormat(String)
	 */
	public String getLabelFormat() {
		return labelFormat;
	}

	/**
	 * A [format string](http://www.highcharts.com/docs/chart-concepts/labels-
	 * and-string-formatting) for each legend label. Available variables relates
	 * to properties on the series, or the point in case of pies.
	 */
	public void setLabelFormat(String labelFormat) {
		this.labelFormat = labelFormat;
	}

	/**
	 * @see #set_fn_labelFormatter(String)
	 */
	public String getLabelFormatter() {
		return _fn_labelFormatter;
	}

	/**
	 * Callback function to format each of the series' labels. The `this`
	 * keyword refers to the series object, or the point object in case of pie
	 * charts. By default the series or point name is printed.
	 */
	public void setLabelFormatter(String _fn_labelFormatter) {
		this._fn_labelFormatter = _fn_labelFormatter;
	}

	/**
	 * @see #setLayout(LayoutDirection)
	 */
	public LayoutDirection getLayout() {
		return layout;
	}

	/**
	 * The layout of the legend items. Can be one of "horizontal" or "vertical".
	 */
	public void setLayout(LayoutDirection layout) {
		this.layout = layout;
	}

	/**
	 * @see #setLineHeight(Number)
	 */
	public Number getLineHeight() {
		return lineHeight;
	}

	/**
	 * Line height for the legend items. Deprecated as of 2.1\. Instead, the
	 * line height for each item can be set using itemStyle.lineHeight, and the
	 * padding between items using itemMarginTop and itemMarginBottom.
	 */
	public void setLineHeight(Number lineHeight) {
		this.lineHeight = lineHeight;
	}

	/**
	 * @see #setMargin(Number)
	 */
	public Number getMargin() {
		return margin;
	}

	/**
	 * If the plot area sized is calculated automatically and the legend is not
	 * floating, the legend margin is the space between the legend and the axis
	 * labels or plot area.
	 */
	public void setMargin(Number margin) {
		this.margin = margin;
	}

	/**
	 * @see #setMaxHeight(Number)
	 */
	public Number getMaxHeight() {
		return maxHeight;
	}

	/**
	 * Maximum pixel height for the legend. When the maximum height is extended,
	 * navigation will show.
	 */
	public void setMaxHeight(Number maxHeight) {
		this.maxHeight = maxHeight;
	}

	/**
	 * @see #setNavigation(LegendNavigation)
	 */
	public LegendNavigation getNavigation() {
		if (navigation == null) {
			navigation = new LegendNavigation();
		}
		return navigation;
	}

	/**
	 * Options for the paging or navigation appearing when the legend is
	 * overflown. Navigation works well on screen, but not in static exported
	 * images. One way of working around that is to [increase the chart height
	 * in export](http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/
	 * tree/master/samples/highcharts/legend/navigation- enabled-false/).
	 */
	public void setNavigation(LegendNavigation navigation) {
		this.navigation = navigation;
	}

	/**
	 * @see #setPadding(Number)
	 */
	public Number getPadding() {
		return padding;
	}

	/**
	 * The inner padding of the legend box.
	 */
	public void setPadding(Number padding) {
		this.padding = padding;
	}

	/**
	 * @see #setReversed(Boolean)
	 */
	public Boolean getReversed() {
		return reversed;
	}

	/**
	 * Whether to reverse the order of the legend items compared to the order of
	 * the series or points as defined in the configuration object.
	 */
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
	}

	/**
	 * @see #setRtl(Boolean)
	 */
	public Boolean getRtl() {
		return rtl;
	}

	/**
	 * Whether to show the symbol on the right side of the text rather than the
	 * left side. This is common in Arabic and Hebraic.
	 */
	public void setRtl(Boolean rtl) {
		this.rtl = rtl;
	}

	/**
	 * @see #setShadow(Boolean)
	 */
	public Boolean getShadow() {
		return shadow;
	}

	/**
	 * Whether to apply a drop shadow to the legend. A `backgroundColor` also
	 * needs to be applied for this to take effect. The shadow can be an object
	 * configuration containing `color`, `offsetX`, `offsetY`, `opacity` and
	 * `width`.
	 */
	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
	}

	/**
	 * @see #setSquareSymbol(Boolean)
	 */
	public Boolean getSquareSymbol() {
		return squareSymbol;
	}

	/**
	 * When this is true, the legend symbol width will be the same as the symbol
	 * height, which in turn defaults to the font size of the legend items.
	 */
	public void setSquareSymbol(Boolean squareSymbol) {
		this.squareSymbol = squareSymbol;
	}

	/**
	 * @see #setSymbolHeight(Number)
	 */
	public Number getSymbolHeight() {
		return symbolHeight;
	}

	/**
	 * The pixel height of the symbol for series types that use a rectangle in
	 * the legend. Defaults to the font size of legend items.
	 */
	public void setSymbolHeight(Number symbolHeight) {
		this.symbolHeight = symbolHeight;
	}

	/**
	 * @see #setSymbolPadding(Number)
	 */
	public Number getSymbolPadding() {
		return symbolPadding;
	}

	/**
	 * The pixel padding between the legend item symbol and the legend item
	 * text.
	 */
	public void setSymbolPadding(Number symbolPadding) {
		this.symbolPadding = symbolPadding;
	}

	/**
	 * @see #setSymbolRadius(Number)
	 */
	public Number getSymbolRadius() {
		return symbolRadius;
	}

	/**
	 * The border radius of the symbol for series types that use a rectangle in
	 * the legend. Defaults to half the `symbolHeight`.
	 */
	public void setSymbolRadius(Number symbolRadius) {
		this.symbolRadius = symbolRadius;
	}

	/**
	 * @see #setSymbolWidth(Number)
	 */
	public Number getSymbolWidth() {
		return symbolWidth;
	}

	/**
	 * The pixel width of the legend item symbol. When the `squareSymbol` option
	 * is set, this defaults to the `symbolHeight`, otherwise 16.
	 */
	public void setSymbolWidth(Number symbolWidth) {
		this.symbolWidth = symbolWidth;
	}

	/**
	 * @see #setTitle(LegendTitle)
	 */
	public LegendTitle getTitle() {
		if (title == null) {
			title = new LegendTitle();
		}
		return title;
	}

	/**
	 * A title to be added on top of the legend.
	 */
	public void setTitle(LegendTitle title) {
		this.title = title;
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
	 * and-string-formatting#html) to render the legend item texts. Prior to
	 * 4.1.7, when using HTML, [legend.navigation](#legend.navigation) was
	 * disabled.
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
	 * The vertical alignment of the legend box. Can be one of `top`, `middle`
	 * or `bottom`. Vertical position can be further determined by the `y`
	 * option. In the case that the legend is aligned in a corner position, the
	 * `layout` option will determine whether to place it above/below or on the
	 * side of the plot area.
	 */
	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setWidth(Number)
	 */
	public Number getWidth() {
		return width;
	}

	/**
	 * The width of the legend box.
	 */
	public void setWidth(Number width) {
		this.width = width;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * The x offset of the legend relative to its horizontal alignment `align`
	 * within chart.spacingLeft and chart.spacingRight. Negative x moves it to
	 * the left, positive x moves it to the right.
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
	 * The vertical offset of the legend relative to it's vertical alignment
	 * `verticalAlign` within chart.spacingTop and chart.spacingBottom. Negative
	 * y moves it up, positive y moves it down.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
