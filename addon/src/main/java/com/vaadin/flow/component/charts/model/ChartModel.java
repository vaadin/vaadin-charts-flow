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
import java.util.ArrayList;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ChartModel extends AbstractConfigurationObject {

	private Boolean alignTicks;
	private Boolean animation;
	private Number borderRadius;
	private String className;
	private Number colorCount;
	private ChartType defaultSeriesType;
	private String description;
	private String height;
	private Boolean ignoreHiddenSeries;
	private Boolean inverted;
	private ArrayList<Number> margin;
	private Number marginBottom;
	private Number marginLeft;
	private Number marginRight;
	private Number marginTop;
	private Options3d options3d;
	private PanKey panKey;
	private Boolean panning;
	private ParallelAxes parallelAxes;
	private Boolean parallelCoordinates;
	private Dimension pinchType;
	private Boolean polar;
	private Boolean reflow;
	private String renderTo;
	private ResetZoomButton resetZoomButton;
	private ScrollablePlotArea scrollablePlotArea;
	private Boolean showAxes;
	private ArrayList<Number> spacing;
	private Number spacingBottom;
	private Number spacingLeft;
	private Number spacingRight;
	private Number spacingTop;
	private ChartType type;
	private String typeDescription;
	private Number width;
	private Dimension zoomType;

	public ChartModel() {
	}

	/**
	 * @see #setAlignTicks(Boolean)
	 */
	public Boolean getAlignTicks() {
		return alignTicks;
	}

	/**
	 * When using multiple axis, the ticks of two or more opposite axes will
	 * automatically be aligned by adding ticks to the axis or axes with the
	 * least ticks, as if `tickAmount` were specified. This can be prevented by
	 * setting `alignTicks` to false. If the grid lines look messy, it's a good
	 * idea to hide them for the secondary axis by setting `gridLineWidth` to 0.
	 * If `startOnTick` or `endOnTick` in an Axis options are set to false, then
	 * the `alignTicks ` will be disabled for the Axis. Disabled for logarithmic
	 * axes.
	 */
	public void setAlignTicks(Boolean alignTicks) {
		this.alignTicks = alignTicks;
	}

	/**
	 * @see #setAnimation(Boolean)
	 */
	public Boolean getAnimation() {
		return animation;
	}

	/**
	 * Set the overall animation for all chart updating. Animation can be
	 * disabled throughout the chart by setting it to false here
	 * <p>
	 * The only animation not affected by this option is the initial series
	 * animation, see <code>setAnimation</code> method in plot option classes
	 * <p>
	 * Defaults to: true
	 */
	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	/**
	 * @see #setBorderRadius(Number)
	 */
	public Number getBorderRadius() {
		return borderRadius;
	}

	/**
	 * The corner radius of the outer chart border.
	 */
	public void setBorderRadius(Number borderRadius) {
		this.borderRadius = borderRadius;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A CSS class name to apply to the charts container `div`, allowing unique
	 * CSS styling for each chart.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setColorCount(Number)
	 */
	public Number getColorCount() {
		return colorCount;
	}

	/**
	 * In styled mode, this sets how many colors the class names should rotate
	 * between. With ten colors, series (or points) are given class names like
	 * `highcharts-color-0`, `highcharts-color-0` [...] `highcharts-color-9`.
	 * The equivalent in non-styled mode is to set colors using the
	 * [colors](#colors) setting.
	 */
	public void setColorCount(Number colorCount) {
		this.colorCount = colorCount;
	}

	/**
	 * @see #setDefaultSeriesType(ChartType)
	 */
	public ChartType getDefaultSeriesType() {
		return defaultSeriesType;
	}

	/**
	 * Alias of `type`.
	 */
	public void setDefaultSeriesType(ChartType defaultSeriesType) {
		this.defaultSeriesType = defaultSeriesType;
	}

	/**
	 * @see #setDescription(String)
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * A text description of the chart. If the Accessibility module is loaded,
	 * this is included by default as a long description of the chart and its
	 * contents in the hidden screen reader information region.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @see #setHeight(String)
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * An explicit height for the chart. If a _number_, the height is given in
	 * pixels. If given a _percentage string_ (for example `'56%'`), the height
	 * is given as the percentage of the actual chart width. This allows for
	 * preserving the aspect ratio across responsive sizes. By default (when
	 * `null`) the height is calculated from the offset height of the containing
	 * element, or 400 pixels if the containing element's height is 0.
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @see #setIgnoreHiddenSeries(Boolean)
	 */
	public Boolean getIgnoreHiddenSeries() {
		return ignoreHiddenSeries;
	}

	/**
	 * If true, the axes will scale to the remaining visible series once one
	 * series is hidden. If false, hiding and showing a series will not affect
	 * the axes or the other series. For stacks, once one series within the
	 * stack is hidden, the rest of the stack will close in around it even if
	 * the axis is not affected.
	 */
	public void setIgnoreHiddenSeries(Boolean ignoreHiddenSeries) {
		this.ignoreHiddenSeries = ignoreHiddenSeries;
	}

	/**
	 * @see #setInverted(Boolean)
	 */
	public Boolean getInverted() {
		return inverted;
	}

	/**
	 * Whether to invert the axes so that the x axis is vertical and y axis is
	 * horizontal. When `true`, the x axis is [reversed](#xAxis.reversed) by
	 * default.
	 */
	public void setInverted(Boolean inverted) {
		this.inverted = inverted;
	}

	/**
	 * @see #setMargin(ArrayList)
	 */
	public ArrayList<Number> getMargin() {
		if (margin == null) {
			margin = new ArrayList<Number>();
		}
		return margin;
	}

	/**
	 * The margin between the outer edge of the chart and the plot area. The
	 * numbers in the array designate top, right, bottom and left respectively.
	 * Use the options `marginTop`, `marginRight`, `marginBottom` and
	 * `marginLeft` for shorthand setting of one option. By default there is no
	 * margin. The actual space is dynamically calculated from the offset of
	 * axis labels, axis title, title, subtitle and legend in addition to the
	 * `spacingTop`, `spacingRight`, `spacingBottom` and `spacingLeft` options.
	 */
	public void setMargin(ArrayList<Number> margin) {
		this.margin = margin;
	}

	/**
	 * @see #setMarginBottom(Number)
	 */
	public Number getMarginBottom() {
		return marginBottom;
	}

	/**
	 * The margin between the bottom outer edge of the chart and the plot area.
	 * Use this to set a fixed pixel value for the margin as opposed to the
	 * default dynamic margin. See also `spacingBottom`.
	 */
	public void setMarginBottom(Number marginBottom) {
		this.marginBottom = marginBottom;
	}

	/**
	 * @see #setMarginLeft(Number)
	 */
	public Number getMarginLeft() {
		return marginLeft;
	}

	/**
	 * The margin between the left outer edge of the chart and the plot area.
	 * Use this to set a fixed pixel value for the margin as opposed to the
	 * default dynamic margin. See also `spacingLeft`.
	 */
	public void setMarginLeft(Number marginLeft) {
		this.marginLeft = marginLeft;
	}

	/**
	 * @see #setMarginRight(Number)
	 */
	public Number getMarginRight() {
		return marginRight;
	}

	/**
	 * The margin between the right outer edge of the chart and the plot area.
	 * Use this to set a fixed pixel value for the margin as opposed to the
	 * default dynamic margin. See also `spacingRight`.
	 */
	public void setMarginRight(Number marginRight) {
		this.marginRight = marginRight;
	}

	/**
	 * @see #setMarginTop(Number)
	 */
	public Number getMarginTop() {
		return marginTop;
	}

	/**
	 * The margin between the top outer edge of the chart and the plot area. Use
	 * this to set a fixed pixel value for the margin as opposed to the default
	 * dynamic margin. See also `spacingTop`.
	 */
	public void setMarginTop(Number marginTop) {
		this.marginTop = marginTop;
	}

	/**
	 * @see #setOptions3d(Options3d)
	 */
	public Options3d getOptions3d() {
		if (options3d == null) {
			options3d = new Options3d();
		}
		return options3d;
	}

	/**
	 * Options to render charts in 3 dimensions. This feature requires
	 * `highcharts-3d.js`, found in the download package or online at
	 * [code.highcharts
	 * .com/highcharts-3d.js](http://code.highcharts.com/highcharts- 3d.js).
	 */
	public void setOptions3d(Options3d options3d) {
		this.options3d = options3d;
	}

	/**
	 * @see #setPanKey(PanKey)
	 */
	public PanKey getPanKey() {
		return panKey;
	}

	/**
	 * Allows setting a key to switch between zooming and panning. Can be one of
	 * `alt`, `ctrl`, `meta` (the command key on Mac and Windows key on Windows)
	 * or `shift`. The keys are mapped directly to the key properties of the
	 * click event argument (`event.altKey`, `event.ctrlKey`, `event.metaKey`
	 * and `event.shiftKey`).
	 */
	public void setPanKey(PanKey panKey) {
		this.panKey = panKey;
	}

	/**
	 * @see #setPanning(Boolean)
	 */
	public Boolean getPanning() {
		return panning;
	}

	/**
	 * Allow panning in a chart. Best used with [panKey](#chart.panKey) to
	 * combine zooming and panning. On touch devices, when the
	 * [tooltip.followTouchMove](#tooltip.followTouchMove) option is `true`
	 * (default), panning requires two fingers. To allow panning with one
	 * finger, set `followTouchMove` to `false`.
	 */
	public void setPanning(Boolean panning) {
		this.panning = panning;
	}

	/**
	 * @see #setParallelAxes(ParallelAxes)
	 */
	public ParallelAxes getParallelAxes() {
		if (parallelAxes == null) {
			parallelAxes = new ParallelAxes();
		}
		return parallelAxes;
	}

	/**
	 * Common options for all yAxes rendered in a parallel coordinates plot.
	 * This feature requires `modules/parallel-coordinates.js`. The default
	 * options are:
	 * 
	 * <pre>
	 * 	parallelAxes: {
	 * 	   lineWidth: 1,       // classic mode only
	 * 	   gridlinesWidth: 0,  // classic mode only
	 * 	   title: {
	 * 	       text: '',
	 * 	       reserveSpace: false
	 * 	   },
	 * 	   labels: {
	 * 	       x: 0,
	 * 	       y: 0,
	 * 	       align: 'center',
	 * 	       reserveSpace: false
	 * 	   },
	 * 	   offset: 0
	 * 	}
	 * </pre>
	 */
	public void setParallelAxes(ParallelAxes parallelAxes) {
		this.parallelAxes = parallelAxes;
	}

	/**
	 * @see #setParallelCoordinates(Boolean)
	 */
	public Boolean getParallelCoordinates() {
		return parallelCoordinates;
	}

	/**
	 * Flag to render charts as a parallel coordinates plot. In a parallel
	 * coordinates plot (||-coords) by default all required yAxes are generated
	 * and the legend is disabled. This feature requires
	 * `modules/parallel-coordinates.js`.
	 */
	public void setParallelCoordinates(Boolean parallelCoordinates) {
		this.parallelCoordinates = parallelCoordinates;
	}

	/**
	 * @see #setPinchType(Dimension)
	 */
	public Dimension getPinchType() {
		return pinchType;
	}

	/**
	 * Equivalent to [zoomType](#chart.zoomType), but for multitouch gestures
	 * only. By default, the `pinchType` is the same as the `zoomType` setting.
	 * However, pinching can be enabled separately in some cases, for example in
	 * stock charts where a mouse drag pans the chart, while pinching is
	 * enabled. When [tooltip.followTouchMove](#tooltip.followTouchMove) is
	 * true, pinchType only applies to two-finger touches.
	 */
	public void setPinchType(Dimension pinchType) {
		this.pinchType = pinchType;
	}

	/**
	 * @see #setPolar(Boolean)
	 */
	public Boolean getPolar() {
		return polar;
	}

	/**
	 * When true, cartesian charts like line, spline, area and column are
	 * transformed into the polar coordinate system. Requires
	 * `highcharts-more.js`.
	 */
	public void setPolar(Boolean polar) {
		this.polar = polar;
	}

	/**
	 * @see #setReflow(Boolean)
	 */
	public Boolean getReflow() {
		return reflow;
	}

	/**
	 * Whether to reflow the chart to fit the width of the container div on
	 * resizing the window.
	 */
	public void setReflow(Boolean reflow) {
		this.reflow = reflow;
	}

	/**
	 * @see #setRenderTo(String)
	 */
	public String getRenderTo() {
		return renderTo;
	}

	/**
	 * The HTML element where the chart will be rendered. If it is a string, the
	 * element by that id is used. The HTML element can also be passed by direct
	 * reference, or as the first argument of the chart constructor, in which
	 * case the option is not needed.
	 */
	public void setRenderTo(String renderTo) {
		this.renderTo = renderTo;
	}

	/**
	 * @see #setResetZoomButton(ResetZoomButton)
	 */
	public ResetZoomButton getResetZoomButton() {
		if (resetZoomButton == null) {
			resetZoomButton = new ResetZoomButton();
		}
		return resetZoomButton;
	}

	/**
	 * The button that appears after a selection zoom, allowing the user to
	 * reset zoom.
	 */
	public void setResetZoomButton(ResetZoomButton resetZoomButton) {
		this.resetZoomButton = resetZoomButton;
	}

	/**
	 * @see #setScrollablePlotArea(ScrollablePlotArea)
	 */
	public ScrollablePlotArea getScrollablePlotArea() {
		if (scrollablePlotArea == null) {
			scrollablePlotArea = new ScrollablePlotArea();
		}
		return scrollablePlotArea;
	}

	/**
	 * Options for a scrollable plot area. This feature provides a minimum width
	 * for the plot area of the chart. If the width gets smaller than this,
	 * typically on mobile devices, a native browser scrollbar is presented
	 * below the chart. This scrollbar provides smooth scrolling for the
	 * contents of the plot area, whereas the title, legend and axes are fixed.
	 */
	public void setScrollablePlotArea(ScrollablePlotArea scrollablePlotArea) {
		this.scrollablePlotArea = scrollablePlotArea;
	}

	/**
	 * @see #setShowAxes(Boolean)
	 */
	public Boolean getShowAxes() {
		return showAxes;
	}

	/**
	 * Whether to show the axes initially. This only applies to empty charts
	 * where series are added dynamically, as axes are automatically added to
	 * cartesian series.
	 */
	public void setShowAxes(Boolean showAxes) {
		this.showAxes = showAxes;
	}

	/**
	 * @see #setSpacing(ArrayList)
	 */
	public ArrayList<Number> getSpacing() {
		if (spacing == null) {
			spacing = new ArrayList<Number>();
		}
		return spacing;
	}

	/**
	 * The distance between the outer edge of the chart and the content, like
	 * title or legend, or axis title and labels if present. The numbers in the
	 * array designate top, right, bottom and left respectively. Use the options
	 * spacingTop, spacingRight, spacingBottom and spacingLeft options for
	 * shorthand setting of one option.
	 */
	public void setSpacing(ArrayList<Number> spacing) {
		this.spacing = spacing;
	}

	/**
	 * @see #setSpacingBottom(Number)
	 */
	public Number getSpacingBottom() {
		return spacingBottom;
	}

	/**
	 * The space between the bottom edge of the chart and the content (plot
	 * area, axis title and labels, title, subtitle or legend in top position).
	 */
	public void setSpacingBottom(Number spacingBottom) {
		this.spacingBottom = spacingBottom;
	}

	/**
	 * @see #setSpacingLeft(Number)
	 */
	public Number getSpacingLeft() {
		return spacingLeft;
	}

	/**
	 * The space between the left edge of the chart and the content (plot area,
	 * axis title and labels, title, subtitle or legend in top position).
	 */
	public void setSpacingLeft(Number spacingLeft) {
		this.spacingLeft = spacingLeft;
	}

	/**
	 * @see #setSpacingRight(Number)
	 */
	public Number getSpacingRight() {
		return spacingRight;
	}

	/**
	 * The space between the right edge of the chart and the content (plot area,
	 * axis title and labels, title, subtitle or legend in top position).
	 */
	public void setSpacingRight(Number spacingRight) {
		this.spacingRight = spacingRight;
	}

	/**
	 * @see #setSpacingTop(Number)
	 */
	public Number getSpacingTop() {
		return spacingTop;
	}

	/**
	 * The space between the top edge of the chart and the content (plot area,
	 * axis title and labels, title, subtitle or legend in top position).
	 */
	public void setSpacingTop(Number spacingTop) {
		this.spacingTop = spacingTop;
	}

	/**
	 * @see #setType(ChartType)
	 */
	public ChartType getType() {
		return type;
	}

	/**
	 * The default series type for the chart. Can be any of the chart types
	 * listed under [plotOptions](#plotOptions).
	 */
	public void setType(ChartType type) {
		this.type = type;
	}

	/**
	 * @see #setTypeDescription(String)
	 */
	public String getTypeDescription() {
		return typeDescription;
	}

	/**
	 * A text description of the chart type. If the Accessibility module is
	 * loaded, this will be included in the description of the chart in the
	 * screen reader information region.
	 * 
	 * Highcharts will by default attempt to guess the chart type, but for more
	 * complex charts it is recommended to specify this property for clarity.
	 */
	public void setTypeDescription(String typeDescription) {
		this.typeDescription = typeDescription;
	}

	/**
	 * @see #setWidth(Number)
	 */
	public Number getWidth() {
		return width;
	}

	/**
	 * An explicit width for the chart. By default (when `null`) the width is
	 * calculated from the offset width of the containing element.
	 */
	public void setWidth(Number width) {
		this.width = width;
	}

	/**
	 * @see #setZoomType(Dimension)
	 */
	public Dimension getZoomType() {
		return zoomType;
	}

	/**
	 * Decides in what dimensions the user can zoom by dragging the mouse. Can
	 * be one of `x`, `y` or `xy`.
	 */
	public void setZoomType(Dimension zoomType) {
		this.zoomType = zoomType;
	}
}
