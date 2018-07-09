package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * The X-range series displays ranges on the X axis, typically time intervals
 * with a start and end date.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `xrange`
 * series are defined in [plotOptions.xrange](plotOptions.xrange). 3. Options
 * for one single series are given in [the series instance
 * array](series.xrange).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         xrange: {
 *             // shared options for all xrange series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'xrange'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsXRange extends AbstractPlotOptions {

	private String _fn_pointDescriptionFormatter;
	private Boolean allowPointSelect;
	private Boolean animation;
	private Number animationLimit;
	private Number borderRadius;
	private String className;
	private Boolean colorByPoint;
	private Number colorIndex;
	private Compare compare;
	private Number compareBase;
	private Boolean compareStart;
	private Cursor cursor;
	private Data data;
	private DataGrouping dataGrouping;
	private DataLabels dataLabels;
	private String description;
	private Boolean enableMouseTracking;
	private Boolean exposeElementToA11y;
	private Number groupZPadding;
	private ArrayList<String> keys;
	private Label label;
	private Number linkedTo;
	private Number maxPointWidth;
	private Number minPointLength;
	private NavigatorOptions navigatorOptions;
	private PartialFill partialFill;
	private LabelPoint point;
	private Number pointPadding;
	private Number pointRange;
	private Number pointWidth;
	private Boolean selected;
	private Boolean shadow;
	private Boolean showCheckbox;
	private Boolean showInLegend;
	private Boolean showInNavigator;
	private Boolean skipKeyboardNavigation;
	private States states;
	private Boolean stickyTracking;
	private SeriesTooltip tooltip;
	private Number turboThreshold;
	private Boolean visible;
	private ZoneAxis zoneAxis;
	private ArrayList<Zone> zones;

	public PlotOptionsXRange() {
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

	public Number getBorderRadius() {
		return borderRadius;
	}

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
	 * A class name to apply to the series' graphical elements.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setColorByPoint(Boolean)
	 */
	public Boolean getColorByPoint() {
		return colorByPoint;
	}

	/**
	 * In an X-range series, this option makes all points of the same Y-axis
	 * category the same color.
	 */
	public void setColorByPoint(Boolean colorByPoint) {
		this.colorByPoint = colorByPoint;
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

	public Data getData() {
		if (data == null) {
			data = new Data();
		}
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public DataGrouping getDataGrouping() {
		if (dataGrouping == null) {
			dataGrouping = new DataGrouping();
		}
		return dataGrouping;
	}

	public void setDataGrouping(DataGrouping dataGrouping) {
		this.dataGrouping = dataGrouping;
	}

	public DataLabels getDataLabels() {
		if (dataLabels == null) {
			dataLabels = new DataLabels();
		}
		return dataLabels;
	}

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

	/**
	 * @see #setGroupZPadding(Number)
	 */
	public Number getGroupZPadding() {
		return groupZPadding;
	}

	/**
	 * The spacing between columns on the Z Axis in a 3D chart. Requires
	 * `highcharts-3d.js`.
	 */
	public void setGroupZPadding(Number groupZPadding) {
		this.groupZPadding = groupZPadding;
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

	/**
	 * @see #setMaxPointWidth(Number)
	 */
	public Number getMaxPointWidth() {
		return maxPointWidth;
	}

	/**
	 * The maximum allowed pixel width for a column, translated to the height of
	 * a bar in a bar chart. This prevents the columns from becoming too wide
	 * when there is a small number of points in the chart.
	 */
	public void setMaxPointWidth(Number maxPointWidth) {
		this.maxPointWidth = maxPointWidth;
	}

	/**
	 * @see #setMinPointLength(Number)
	 */
	public Number getMinPointLength() {
		return minPointLength;
	}

	/**
	 * The minimal height for a column or width for a bar. By default, 0 values
	 * are not shown. To visualize a 0 (or close to zero) point, set the minimal
	 * point length to a pixel value like 3\. In stacked column charts,
	 * minPointLength might not be respected for tightly packed values.
	 */
	public void setMinPointLength(Number minPointLength) {
		this.minPointLength = minPointLength;
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
	 * @see #setPartialFill(PartialFill)
	 */
	public PartialFill getPartialFill() {
		if (partialFill == null) {
			partialFill = new PartialFill();
		}
		return partialFill;
	}

	/**
	 * A partial fill for each point, typically used to visualize how much of a
	 * task is performed. The partial fill object can be set either on series or
	 * point level.
	 */
	public void setPartialFill(PartialFill partialFill) {
		this.partialFill = partialFill;
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
	 * @see #setPointPadding(Number)
	 */
	public Number getPointPadding() {
		return pointPadding;
	}

	/**
	 * Padding between each column or bar, in x axis units.
	 */
	public void setPointPadding(Number pointPadding) {
		this.pointPadding = pointPadding;
	}

	public Number getPointRange() {
		return pointRange;
	}

	public void setPointRange(Number pointRange) {
		this.pointRange = pointRange;
	}

	/**
	 * @see #setPointWidth(Number)
	 */
	public Number getPointWidth() {
		return pointWidth;
	}

	/**
	 * A pixel value specifying a fixed width for each column or bar. When
	 * `null`, the width is calculated from the `pointPadding` and
	 * `groupPadding`.
	 */
	public void setPointWidth(Number pointWidth) {
		this.pointWidth = pointWidth;
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
	 * @see #setShadow(Boolean)
	 */
	public Boolean getShadow() {
		return shadow;
	}

	/**
	 * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow
	 * can be an object configuration containing `color`, `offsetX`, `offsetY`,
	 * `opacity` and `width`.
	 */
	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
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

	public States getStates() {
		if (states == null) {
			states = new States();
		}
		return states;
	}

	public void setStates(States states) {
		this.states = states;
	}

	public Boolean getStickyTracking() {
		return stickyTracking;
	}

	public void setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
	}

	public SeriesTooltip getTooltip() {
		if (tooltip == null) {
			tooltip = new SeriesTooltip();
		}
		return tooltip;
	}

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
}
