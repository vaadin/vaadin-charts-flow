package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * A sankey diagram is a type of flow diagram, in which the width of the link
 * between two nodes is shown proportionally to the flow quantity.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all `sankey`
 * series are defined in [plotOptions.sankey](plotOptions.sankey). 3. Options
 * for one single series are given in [the series instance
 * array](series.sankey).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         sankey: {
 *             // shared options for all sankey series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'sankey'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsSankeyDiagram extends AbstractPlotOptions {

	private String _fn_pointDescriptionFormatter;
	private Boolean allowPointSelect;
	private Boolean animation;
	private String className;
	private Boolean colorByPoint;
	private Number colorIndex;
	private Compare compare;
	private Number compareBase;
	private Boolean compareStart;
	private Cursor cursor;
	private Number curveFactor;
	private DataGrouping dataGrouping;
	private SankeyDataLabels dataLabels;
	private String description;
	private Boolean enableMouseTracking;
	private Boolean exposeElementToA11y;
	private Boolean getExtremesFromAll;
	private ArrayList<String> keys;
	private Label label;
	private Number linkOpacity;
	private Number linkedTo;
	private Number minPointLength;
	private NavigatorOptions navigatorOptions;
	private Number nodePadding;
	private Number nodeWidth;
	private LabelPoint point;
	private Boolean selected;
	private Boolean showCheckbox;
	private Boolean showInLegend;
	private Boolean showInNavigator;
	private Boolean skipKeyboardNavigation;
	private States states;
	private Boolean stickyTracking;
	private SeriesTooltip tooltip;
	private Number turboThreshold;
	private Boolean visible;

	public PlotOptionsSankeyDiagram() {
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

	public Boolean getColorByPoint() {
		return colorByPoint;
	}

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

	/**
	 * @see #setCurveFactor(Number)
	 */
	public Number getCurveFactor() {
		return curveFactor;
	}

	/**
	 * Higher numbers makes the links in a sankey diagram render more curved. A
	 * `curveFactor` of 0 makes the lines straight.
	 */
	public void setCurveFactor(Number curveFactor) {
		this.curveFactor = curveFactor;
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

	/**
	 * @see #setDataLabels(SankeyDataLabels)
	 */
	public SankeyDataLabels getDataLabels() {
		if (dataLabels == null) {
			dataLabels = new SankeyDataLabels();
		}
		return dataLabels;
	}

	/**
	 * Options for the data labels appearing on top of the nodes and links. For
	 * sankey charts, data labels are visible for the nodes by default, but
	 * hidden for links. This is controlled by modifying the `nodeFormat`, and
	 * the `format` that applies to links and is an empty string by default.
	 */
	public void setDataLabels(SankeyDataLabels dataLabels) {
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
	 * @see #setLinkOpacity(Number)
	 */
	public Number getLinkOpacity() {
		return linkOpacity;
	}

	/**
	 * Opacity for the links between nodes in the sankey diagram.
	 */
	public void setLinkOpacity(Number linkOpacity) {
		this.linkOpacity = linkOpacity;
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
	 * @see #setNodePadding(Number)
	 */
	public Number getNodePadding() {
		return nodePadding;
	}

	/**
	 * The padding between nodes in a sankey diagram, in pixels.
	 */
	public void setNodePadding(Number nodePadding) {
		this.nodePadding = nodePadding;
	}

	/**
	 * @see #setNodeWidth(Number)
	 */
	public Number getNodeWidth() {
		return nodeWidth;
	}

	/**
	 * The pixel width of each node in a sankey diagram, or the height in case
	 * the chart is inverted.
	 */
	public void setNodeWidth(Number nodeWidth) {
		this.nodeWidth = nodeWidth;
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

	public Boolean getShowInLegend() {
		return showInLegend;
	}

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
}
