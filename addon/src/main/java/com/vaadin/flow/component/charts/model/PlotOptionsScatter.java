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
import java.util.Arrays;
import java.util.ArrayList;
import com.vaadin.flow.component.charts.model.style.Color;
import java.time.Instant;
import com.vaadin.flow.component.charts.util.Util;

/**
 * A scatter plot uses cartesian coordinates to display values for two variables
 * for a set of data.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `scatter`
 * series are defined in [plotOptions.scatter](plotOptions.scatter). 3. Options
 * for one single series are given in [the series instance
 * array](series.scatter).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         scatter: {
 *             // shared options for all scatter series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'scatter'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsScatter extends AbstractPlotOptions {

	private String _fn_pointDescriptionFormatter;
	private Boolean allowPointSelect;
	private Boolean animation;
	private Number animationLimit;
	private Number boostThreshold;
	private String className;
	private Number colorIndex;
	private Compare compare;
	private Number compareBase;
	private Boolean compareStart;
	private Boolean connectEnds;
	private Boolean connectNulls;
	private Number cropThreshold;
	private Cursor cursor;
	private DataGrouping dataGrouping;
	private DataLabels dataLabels;
	private String description;
	private Boolean enableMouseTracking;
	private Boolean exposeElementToA11y;
	private Dimension findNearestPointBy;
	private Number gapSize;
	private String gapUnit;
	private Boolean getExtremesFromAll;
	private ArrayList<String> keys;
	private Label label;
	private String linecap;
	private Number linkedTo;
	private Marker marker;
	private NavigatorOptions navigatorOptions;
	private boolean negativeColor;
	private LabelPoint point;
	private Number pointInterval;
	private String pointIntervalUnit;
	private Number pointRange;
	private Number pointStart;
	private Boolean selected;
	private Boolean showCheckbox;
	private Boolean showInLegend;
	private Boolean showInNavigator;
	private Boolean skipKeyboardNavigation;
	private Boolean softThreshold;
	private Stacking stacking;
	private States states;
	private String step;
	private Boolean stickyTracking;
	private Number threshold;
	private SeriesTooltip tooltip;
	private Number turboThreshold;
	private Boolean visible;
	private ZoneAxis zoneAxis;
	private ArrayList<Zone> zones;

	public PlotOptionsScatter() {
	}

	/**
	 * @see #set_fn_pointDescriptionFormatter(String)
	 */
	public String getPointDescriptionFormatter() {
		return _fn_pointDescriptionFormatter;
	}

	/**
	 * Same as [accessibility.pointDescriptionFormatter](
	 * #accessibility.pointDescriptionFormatter), but for an individual series.
	 * Overrides the chart wide configuration.
	 */
	public void setPointDescriptionFormatter(
			String _fn_pointDescriptionFormatter) {
		this._fn_pointDescriptionFormatter = _fn_pointDescriptionFormatter;
	}

	/**
	 * @see #setAllowPointSelect(Boolean)
	 */
	public Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	/**
	 * Allow this series' points to be selected by clicking on the graphic
	 * (columns, point markers, pie slices, map areas etc).
	 */
	public void setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
	}

	/**
	 * @see #setAnimation(Boolean)
	 */
	public Boolean getAnimation() {
		return animation;
	}

	/**
	 * Enable or disable the initial animation when a series is displayed.
	 * Please note that this option only applies to the initial animation of the
	 * series itself. For other animations, see
	 * {@link ChartModel#setAnimation(Boolean)}
	 */
	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	/**
	 * @see #setAnimationLimit(Number)
	 */
	public Number getAnimationLimit() {
		return animationLimit;
	}

	/**
	 * For some series, there is a limit that shuts down initial animation by
	 * default when the total number of points in the chart is too high. For
	 * example, for a column chart and its derivatives, animation doesn't run if
	 * there is more than 250 points totally. To disable this cap, set
	 * `animationLimit` to `Infinity`.
	 */
	public void setAnimationLimit(Number animationLimit) {
		this.animationLimit = animationLimit;
	}

	/**
	 * @see #setBoostThreshold(Number)
	 */
	public Number getBoostThreshold() {
		return boostThreshold;
	}

	/**
	 * Set the point threshold for when a series should enter boost mode.
	 * Setting it to e.g. 2000 will cause the series to enter boost mode when
	 * there are 2000 or more points in the series. To disable boosting on the
	 * series, set the `boostThreshold` to 0. Setting it to 1 will force
	 * boosting. Requires `modules/boost.js`.
	 */
	public void setBoostThreshold(Number boostThreshold) {
		this.boostThreshold = boostThreshold;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A class name to apply to the series' graphical elements.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setColorIndex(Number)
	 */
	public Number getColorIndex() {
		return colorIndex;
	}

	/**
	 * Styled mode only. A specific color index to use for the series, so its
	 * graphic representations are given the class name `highcharts-color-{n}`.
	 */
	public void setColorIndex(Number colorIndex) {
		this.colorIndex = colorIndex;
	}

	/**
	 * @see #setCompare(Compare)
	 */
	public Compare getCompare() {
		return compare;
	}

	/**
	 * Compare the values of the series against the first non-null, non- zero
	 * value in the visible range. The y axis will show percentage or absolute
	 * change depending on whether `compare` is set to `"percent"` or `"value"`.
	 * When this is applied to multiple series, it allows comparing the
	 * development of the series against each other.
	 */
	public void setCompare(Compare compare) {
		this.compare = compare;
	}

	/**
	 * @see #setCompareBase(Number)
	 */
	public Number getCompareBase() {
		return compareBase;
	}

	/**
	 * When [compare](#plotOptions.series.compare) is `percent`, this option
	 * dictates whether to use 0 or 100 as the base of comparison.
	 */
	public void setCompareBase(Number compareBase) {
		this.compareBase = compareBase;
	}

	/**
	 * @see #setCompareStart(Boolean)
	 */
	public Boolean getCompareStart() {
		return compareStart;
	}

	/**
	 * Defines if comparisson should start from the first point within the
	 * visible range or should start from the first point <b>before</b> the
	 * range. In other words, this flag determines if first point within the
	 * visible range will have 0% (`compareStart=true`) or should have been
	 * already calculated according to the previous point
	 * (`compareStart=false`).
	 */
	public void setCompareStart(Boolean compareStart) {
		this.compareStart = compareStart;
	}

	/**
	 * @see #setConnectEnds(Boolean)
	 */
	public Boolean getConnectEnds() {
		return connectEnds;
	}

	/**
	 * Polar charts only. Whether to connect the ends of a line series plot
	 * across the extremes.
	 */
	public void setConnectEnds(Boolean connectEnds) {
		this.connectEnds = connectEnds;
	}

	/**
	 * @see #setConnectNulls(Boolean)
	 */
	public Boolean getConnectNulls() {
		return connectNulls;
	}

	/**
	 * Whether to connect a graph line across null points, or render a gap
	 * between the two points on either side of the null.
	 */
	public void setConnectNulls(Boolean connectNulls) {
		this.connectNulls = connectNulls;
	}

	/**
	 * @see #setCropThreshold(Number)
	 */
	public Number getCropThreshold() {
		return cropThreshold;
	}

	/**
	 * When the series contains less points than the crop threshold, all points
	 * are drawn, even if the points fall outside the visible plot area at the
	 * current zoom. The advantage of drawing all points (including markers and
	 * columns), is that animation is performed on updates. On the other hand,
	 * when the series contains more points than the crop threshold, the series
	 * data is cropped to only contain points that fall within the plot area.
	 * The advantage of cropping away invisible points is to increase
	 * performance on large series.
	 */
	public void setCropThreshold(Number cropThreshold) {
		this.cropThreshold = cropThreshold;
	}

	/**
	 * @see #setCursor(Cursor)
	 */
	public Cursor getCursor() {
		return cursor;
	}

	/**
	 * You can set the cursor to "pointer" if you have click events attached to
	 * the series, to signal to the user that the points and lines can be
	 * clicked.
	 */
	public void setCursor(Cursor cursor) {
		this.cursor = cursor;
	}

	/**
	 * @see #setDataGrouping(DataGrouping)
	 */
	public DataGrouping getDataGrouping() {
		if (dataGrouping == null) {
			dataGrouping = new DataGrouping();
		}
		return dataGrouping;
	}

	/**
	 * Data grouping is the concept of sampling the data values into larger
	 * blocks in order to ease readability and increase performance of the
	 * JavaScript charts. Highstock by default applies data grouping when the
	 * points become closer than a certain pixel value, determined by the
	 * `groupPixelWidth` option. If data grouping is applied, the grouping
	 * information of grouped points can be read from the
	 * [Point.dataGroup](#Point.dataGroup).
	 */
	public void setDataGrouping(DataGrouping dataGrouping) {
		this.dataGrouping = dataGrouping;
	}

	/**
	 * @see #setDataLabels(DataLabels)
	 */
	public DataLabels getDataLabels() {
		if (dataLabels == null) {
			dataLabels = new DataLabels();
		}
		return dataLabels;
	}

	/**
	 * Options for the series data labels, appearing next to each data point. In
	 * styled mode, the data labels can be styled wtih the
	 * `.highcharts-data-label-box` and `.highcharts-data-label` class names
	 * ([see
	 * example](http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts
	 * /tree/master/samples/highcharts/css/series-datalabels)).
	 */
	public void setDataLabels(DataLabels dataLabels) {
		this.dataLabels = dataLabels;
	}

	/**
	 * @see #setDescription(String)
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Requires the Accessibility module. A description of the series to add to
	 * the screen reader information about the series.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @see #setEnableMouseTracking(Boolean)
	 */
	public Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	/**
	 * Enable or disable the mouse tracking for a specific series. This includes
	 * point tooltips and click events on graphs and points. For large datasets
	 * it improves performance.
	 */
	public void setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
	}

	/**
	 * @see #setExposeElementToA11y(Boolean)
	 */
	public Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	/**
	 * By default, series are exposed to screen readers as regions. By enabling
	 * this option, the series element itself will be exposed in the same way as
	 * the data points. This is useful if the series is not used as a grouping
	 * entity in the chart, but you still want to attach a description to the
	 * series. Requires the Accessibility module.
	 */
	public void setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
	}

	public Dimension getFindNearestPointBy() {
		return findNearestPointBy;
	}

	public void setFindNearestPointBy(Dimension findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
	}

	/**
	 * @see #setGapSize(Number)
	 */
	public Number getGapSize() {
		return gapSize;
	}

	/**
	 * Defines when to display a gap in the graph, together with the
	 * [gapUnit](plotOptions.series.gapUnit) option. In case when `dataGrouping`
	 * is enabled, points can be grouped into a larger time span. This can make
	 * the grouped points to have a greater distance than the absolute value of
	 * `gapSize` property, which will result in disappearing graph completely.
	 * To prevent this situation the mentioned distance between grouped points
	 * is used instead of previously defined `gapSize`. In practice, this option
	 * is most often used to visualize gaps in time series. In a stock chart,
	 * intraday data is available for daytime hours, while gaps will appear in
	 * nights and weekends.
	 */
	public void setGapSize(Number gapSize) {
		this.gapSize = gapSize;
	}

	/**
	 * @see #setGapUnit(String)
	 */
	public String getGapUnit() {
		return gapUnit;
	}

	/**
	 * Together with [gapSize](plotOptions.series.gapSize), this option defines
	 * where to draw gaps in the graph. When the `gapUnit` is `relative`
	 * (default), a gap size of 5 means that if the distance between two points
	 * is greater than five times that of the two closest points, the graph will
	 * be broken. When the `gapUnit` is `value`, the gap is based on absolute
	 * axis values, which on a datetime axis is milliseconds. This also applies
	 * to the navigator series that inherits gap options from the base series.
	 */
	public void setGapUnit(String gapUnit) {
		this.gapUnit = gapUnit;
	}

	/**
	 * @see #setGetExtremesFromAll(Boolean)
	 */
	public Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	/**
	 * Whether to use the Y extremes of the total chart width or only the zoomed
	 * area when zooming in on parts of the X axis. By default, the Y axis
	 * adjusts to the min and max of the visible data. Cartesian series only.
	 */
	public void setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
	}

	/**
	 * @see #setKeys(ArrayList)
	 */
	public ArrayList<String> getKeys() {
		if (keys == null) {
			keys = new ArrayList<String>();
		}
		return keys;
	}

	/**
	 * An array specifying which option maps to which key in the data point
	 * array. This makes it convenient to work with unstructured data arrays
	 * from different sources.
	 */
	public void setKeys(ArrayList<String> keys) {
		this.keys = keys;
	}

	/**
	 * @see #setLabel(Label)
	 */
	public Label getLabel() {
		if (label == null) {
			label = new Label();
		}
		return label;
	}

	/**
	 * Series labels are placed as close to the series as possible in a natural
	 * way, seeking to avoid other series. The goal of this feature is to make
	 * the chart more easily readable, like if a human designer placed the
	 * labels in the optimal position. The series labels currently work with
	 * series types having a `graph` or an `area`. Requires the
	 * `series-label.js` module.
	 */
	public void setLabel(Label label) {
		this.label = label;
	}

	/**
	 * @see #setLinecap(String)
	 */
	public String getLinecap() {
		return linecap;
	}

	/**
	 * The SVG value used for the `stroke-linecap` and `stroke-linejoin` of a
	 * line graph. Round means that lines are rounded in the ends and bends.
	 */
	public void setLinecap(String linecap) {
		this.linecap = linecap;
	}

	/**
	 * @see #setLinkedTo(Number)
	 */
	public Number getLinkedTo() {
		return linkedTo;
	}

	/**
	 * The [id](#series.id) of another series to link to. Additionally, the
	 * value can be ":previous" to link to the previous series. When two series
	 * are linked, only the first one appears in the legend. Toggling the
	 * visibility of this also toggles the linked series.
	 */
	public void setLinkedTo(Number linkedTo) {
		this.linkedTo = linkedTo;
	}

	public Marker getMarker() {
		if (marker == null) {
			marker = new Marker();
		}
		return marker;
	}

	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	/**
	 * @see #setNavigatorOptions(NavigatorOptions)
	 */
	public NavigatorOptions getNavigatorOptions() {
		if (navigatorOptions == null) {
			navigatorOptions = new NavigatorOptions();
		}
		return navigatorOptions;
	}

	/**
	 * Options for the corresponding navigator series if `showInNavigator` is
	 * `true` for this series. Available options are the same as any series,
	 * documented at [plotOptions](#plotOptions.series) and [series](#series).
	 * 
	 * These options are merged with options in [navigator.series](
	 * #navigator.series), and will take precedence if the same option is
	 * defined both places.
	 */
	public void setNavigatorOptions(NavigatorOptions navigatorOptions) {
		this.navigatorOptions = navigatorOptions;
	}

	/**
	 * @see #setNegativeColor(boolean)
	 */
	public boolean isNegativeColor() {
		return negativeColor;
	}

	/**
	 * Enable or disable the color for parts of the graph that are bellow
	 * {@link #getThreshold()}. A negative color is applied by setting this
	 * option to <code>true</code> combined with the
	 * <code>.highcharts-negative</code> class name.
	 */
	public void setNegativeColor(boolean negativeColor) {
		this.negativeColor = negativeColor;
	}

	/**
	 * @see #setPoint(LabelPoint)
	 */
	public LabelPoint getPoint() {
		if (point == null) {
			point = new LabelPoint();
		}
		return point;
	}

	/**
	 * Properties for each single point.
	 */
	public void setPoint(LabelPoint point) {
		this.point = point;
	}

	/**
	 * @see #setPointInterval(Number)
	 */
	public Number getPointInterval() {
		return pointInterval;
	}

	/**
	 * If no x values are given for the points in a series, `pointInterval`
	 * defines the interval of the x values. For example, if a series contains
	 * one value every decade starting from year 0, set `pointInterval` to `10`.
	 * In true `datetime` axes, the `pointInterval` is set in milliseconds. It
	 * can be also be combined with `pointIntervalUnit` to draw irregular time
	 * intervals. Please note that this options applies to the _series data_,
	 * not the interval of the axis ticks, which is independent.
	 */
	public void setPointInterval(Number pointInterval) {
		this.pointInterval = pointInterval;
	}

	/**
	 * @see #setPointIntervalUnit(String)
	 */
	public String getPointIntervalUnit() {
		return pointIntervalUnit;
	}

	/**
	 * On datetime series, this allows for setting the
	 * [pointInterval](#plotOptions.series.pointInterval) to irregular time
	 * units, `day`, `month` and `year`. A day is usually the same as 24 hours,
	 * but `pointIntervalUnit` also takes the DST crossover into consideration
	 * when dealing with local time. Combine this option with `pointInterval` to
	 * draw weeks, quarters, 6 months, 10 years etc. Please note that this
	 * options applies to the _series data_, not the interval of the axis ticks,
	 * which is independent.
	 */
	public void setPointIntervalUnit(String pointIntervalUnit) {
		this.pointIntervalUnit = pointIntervalUnit;
	}

	/**
	 * @see #setPointRange(Number)
	 */
	public Number getPointRange() {
		return pointRange;
	}

	/**
	 * The width of each point on the x axis. For example in a column chart with
	 * one value each day, the pointRange would be 1 day (= 24 * 3600 1000
	 * milliseconds). This is normally computed automatically, but this option
	 * can be used to override the automatic value.
	 */
	public void setPointRange(Number pointRange) {
		this.pointRange = pointRange;
	}

	/**
	 * @see #setPointStart(Number)
	 */
	public Number getPointStart() {
		return pointStart;
	}

	/**
	 * If no x values are given for the points in a series, pointStart defines
	 * on what value to start. For example, if a series contains one yearly
	 * value starting from 1945, set pointStart to 1945.
	 */
	public void setPointStart(Number pointStart) {
		this.pointStart = pointStart;
	}

	/**
	 * @see #setSelected(Boolean)
	 */
	public Boolean getSelected() {
		return selected;
	}

	/**
	 * Whether to select the series initially. If `showCheckbox` is true, the
	 * checkbox next to the series name in the legend will be checked for a
	 * selected series.
	 */
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	/**
	 * @see #setShowCheckbox(Boolean)
	 */
	public Boolean getShowCheckbox() {
		return showCheckbox;
	}

	/**
	 * If true, a checkbox is displayed next to the legend item to allow
	 * selecting the series. The state of the checkbox is determined by the
	 * `selected` option.
	 */
	public void setShowCheckbox(Boolean showCheckbox) {
		this.showCheckbox = showCheckbox;
	}

	/**
	 * @see #setShowInLegend(Boolean)
	 */
	public Boolean getShowInLegend() {
		return showInLegend;
	}

	/**
	 * Whether to display this particular series or series type in the legend.
	 * The default value is `true` for standalone series, `false` for linked
	 * series.
	 */
	public void setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
	}

	/**
	 * @see #setShowInNavigator(Boolean)
	 */
	public Boolean getShowInNavigator() {
		return showInNavigator;
	}

	/**
	 * Whether or not to show the series in the navigator. Takes precedence over
	 * [navigator.baseSeries](#navigator.baseSeries) if defined.
	 */
	public void setShowInNavigator(Boolean showInNavigator) {
		this.showInNavigator = showInNavigator;
	}

	/**
	 * @see #setSkipKeyboardNavigation(Boolean)
	 */
	public Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	/**
	 * If set to `True`, the accessibility module will skip past the points in
	 * this series for keyboard navigation.
	 */
	public void setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
	}

	/**
	 * @see #setSoftThreshold(Boolean)
	 */
	public Boolean getSoftThreshold() {
		return softThreshold;
	}

	/**
	 * When this is true, the series will not cause the Y axis to cross the zero
	 * plane (or [threshold](#plotOptions.series.threshold) option) unless the
	 * data actually crosses the plane. For example, if `softThreshold` is
	 * `false`, a series of 0, 1, 2, 3 will make the Y axis show negative values
	 * according to the `minPadding` option. If `softThreshold` is `true`, the Y
	 * axis starts at 0.
	 */
	public void setSoftThreshold(Boolean softThreshold) {
		this.softThreshold = softThreshold;
	}

	/**
	 * @see #setStacking(Stacking)
	 */
	public Stacking getStacking() {
		return stacking;
	}

	/**
	 * Whether to stack the values of each series on top of each other. Possible
	 * values are `null` to disable, `"normal"` to stack by value or
	 * `"percent"`. When stacking is enabled, data must be sorted in ascending X
	 * order. A special stacking option is with the streamgraph series type,
	 * where the stacking option is set to `"stream"`.
	 */
	public void setStacking(Stacking stacking) {
		this.stacking = stacking;
	}

	/**
	 * @see #setStates(States)
	 */
	public States getStates() {
		if (states == null) {
			states = new States();
		}
		return states;
	}

	/**
	 * A wrapper object for all the series options in specific states.
	 */
	public void setStates(States states) {
		this.states = states;
	}

	/**
	 * @see #setStep(String)
	 */
	public String getStep() {
		return step;
	}

	/**
	 * Whether to apply steps to the line. Possible values are `left`, `center`
	 * and `right`.
	 */
	public void setStep(String step) {
		this.step = step;
	}

	/**
	 * @see #setStickyTracking(Boolean)
	 */
	public Boolean getStickyTracking() {
		return stickyTracking;
	}

	/**
	 * Sticky tracking of mouse events. When true, the `mouseOut` event on a
	 * series isn't triggered until the mouse moves over another series, or out
	 * of the plot area. When false, the `mouseOut` event on a series is
	 * triggered when the mouse leaves the area around the series' graph or
	 * markers. This also implies the tooltip. When `stickyTracking` is false
	 * and `tooltip.shared` is false, the tooltip will be hidden when moving the
	 * mouse between series.
	 */
	public void setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
	}

	/**
	 * @see #setThreshold(Number)
	 */
	public Number getThreshold() {
		return threshold;
	}

	/**
	 * The threshold, also called zero level or base level. For line type series
	 * this is only used in conjunction with
	 * [negativeColor](#plotOptions.series.negativeColor).
	 */
	public void setThreshold(Number threshold) {
		this.threshold = threshold;
	}

	/**
	 * @see #setTooltip(SeriesTooltip)
	 */
	public SeriesTooltip getTooltip() {
		if (tooltip == null) {
			tooltip = new SeriesTooltip();
		}
		return tooltip;
	}

	/**
	 * A configuration object for the tooltip rendering of each single series.
	 * Properties are inherited from [tooltip](#tooltip). Overridable properties
	 * are `headerFormat`, `pointFormat`, `yDecimals`, `xDateFormat`, `yPrefix`
	 * and `ySuffix`. Unlike other series, in a scatter plot the series.name by
	 * default shows in the headerFormat and point.x and point.y in the
	 * pointFormat.
	 */
	public void setTooltip(SeriesTooltip tooltip) {
		this.tooltip = tooltip;
	}

	/**
	 * @see #setTurboThreshold(Number)
	 */
	public Number getTurboThreshold() {
		return turboThreshold;
	}

	/**
	 * When a series contains a data array that is longer than this, only one
	 * dimensional arrays of numbers, or two dimensional arrays with x and y
	 * values are allowed. Also, only the first point is tested, and the rest
	 * are assumed to be the same format. This saves expensive data checking and
	 * indexing in long series. Set it to `0` disable.
	 */
	public void setTurboThreshold(Number turboThreshold) {
		this.turboThreshold = turboThreshold;
	}

	/**
	 * @see #setVisible(Boolean)
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * Set the initial visibility of the series.
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/**
	 * @see #setZoneAxis(ZoneAxis)
	 */
	public ZoneAxis getZoneAxis() {
		return zoneAxis;
	}

	/**
	 * Defines the Axis on which the zones are applied.
	 */
	public void setZoneAxis(ZoneAxis zoneAxis) {
		this.zoneAxis = zoneAxis;
	}

	/**
	 * @see #setZones(ArrayList)
	 */
	public ArrayList<Zone> getZones() {
		if (zones == null) {
			zones = new ArrayList<Zone>();
		}
		return zones;
	}

	/**
	 * An array defining zones within a series. Zones can be applied to the X
	 * axis, Y axis or Z axis for bubbles, according to the `zoneAxis` option.
	 * In styled mode, the color zones are styled with the
	 * `.highcharts-zone-{n}` class, or custom classed from the `className`
	 * option ([view live
	 * demo](http://jsfiddle.net/gh/get/library/pure/highcharts
	 * /highcharts/tree/master/samples/highcharts/css/color-zones/)).
	 */
	public void setZones(ArrayList<Zone> zones) {
		this.zones = zones;
	}

	public void setKeys(String... keys) {
		this.keys = new ArrayList<String>(Arrays.asList(keys));
	}

	public void addKey(String key) {
		if (this.keys == null) {
			this.keys = new ArrayList<String>();
		}
		this.keys.add(key);
	}

	public void removeKey(String key) {
		this.keys.remove(key);
	}

	public void setZones(Zone... zones) {
		this.zones = new ArrayList<Zone>(Arrays.asList(zones));
	}

	public void addZone(Zone zone) {
		if (this.zones == null) {
			this.zones = new ArrayList<Zone>();
		}
		this.zones.add(zone);
	}

	public void removeZone(Zone zone) {
		this.zones.remove(zone);
	}

	/**
	 * @see #setPointStart(Number)
	 */
	public void setPointStart(Instant instant) {
		this.pointStart = Util.toHighchartsTS(instant);
	}
}
