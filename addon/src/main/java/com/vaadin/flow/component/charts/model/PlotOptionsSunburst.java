package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * A Sunburst displays hierarchical data, where a level in the hierarchy is
 * represented by a circle. The center represents the root node of the tree. The
 * visualization bears a resemblance to both treemap and pie charts.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all
 * `sunburst` series are defined in
 * [plotOptions.sunburst](plotOptions.sunburst). 3. Options for one single
 * series are given in [the series instance array](series.sunburst).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         sunburst: {
 *             // shared options for all sunburst series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'sunburst'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsSunburst extends AbstractPlotOptions {

	private String _fn_pointDescriptionFormatter;
	private Boolean allowDrillToNode;
	private Boolean allowPointSelect;
	private Boolean animation;
	private ArrayList<String> center;
	private String className;
	private Boolean colorByPoint;
	private Number colorIndex;
	private Boolean compareStart;
	private Cursor cursor;
	private SunburstDataLabels dataLabels;
	private String description;
	private Boolean enableMouseTracking;
	private Boolean exposeElementToA11y;
	private ArrayList<String> keys;
	private Label label;
	private Boolean levelIsConstant;
	private LevelSize levelSize;
	private ArrayList<Level> levels;
	private Number linkedTo;
	private LabelPoint point;
	private String rootId;
	private Boolean selected;
	private Boolean shadow;
	private Boolean showCheckbox;
	private Boolean showInLegend;
	private Boolean showInNavigator;
	private String size;
	private Boolean skipKeyboardNavigation;
	private Number slicedOffset;
	private Number startAngle;
	private States states;
	private Boolean stickyTracking;
	private SeriesTooltip tooltip;
	private Boolean visible;

	public PlotOptionsSunburst() {
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
	 * @see #setAllowDrillToNode(Boolean)
	 */
	public Boolean getAllowDrillToNode() {
		return allowDrillToNode;
	}

	/**
	 * When enabled the user can click on a point which is a parent and zoom in
	 * on its children.
	 */
	public void setAllowDrillToNode(Boolean allowDrillToNode) {
		this.allowDrillToNode = allowDrillToNode;
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
	 * @see #setCenter(ArrayList)
	 */
	public ArrayList<String> getCenter() {
		if (center == null) {
			center = new ArrayList<String>();
		}
		return center;
	}

	/**
	 * The center of the sunburst chart relative to the plot area. Can be
	 * percentages or pixel values.
	 */
	public void setCenter(ArrayList<String> center) {
		this.center = center;
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

	public SunburstDataLabels getDataLabels() {
		if (dataLabels == null) {
			dataLabels = new SunburstDataLabels();
		}
		return dataLabels;
	}

	public void setDataLabels(SunburstDataLabels dataLabels) {
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
	 * @see #setLevelIsConstant(Boolean)
	 */
	public Boolean getLevelIsConstant() {
		return levelIsConstant;
	}

	/**
	 * Used together with the levels and `allowDrillToNode` options. When set to
	 * false the first level visible when drilling is considered to be level
	 * one. Otherwise the level will be the same as the tree structure.
	 */
	public void setLevelIsConstant(Boolean levelIsConstant) {
		this.levelIsConstant = levelIsConstant;
	}

	/**
	 * @see #setLevelSize(LevelSize)
	 */
	public LevelSize getLevelSize() {
		if (levelSize == null) {
			levelSize = new LevelSize();
		}
		return levelSize;
	}

	/**
	 * Determines the width of the ring per level.
	 */
	public void setLevelSize(LevelSize levelSize) {
		this.levelSize = levelSize;
	}

	/**
	 * @see #setLevels(ArrayList)
	 */
	public ArrayList<Level> getLevels() {
		if (levels == null) {
			levels = new ArrayList<Level>();
		}
		return levels;
	}

	/**
	 * Set options on specific levels. Takes precedence over series options, but
	 * not point options.
	 */
	public void setLevels(ArrayList<Level> levels) {
		this.levels = levels;
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

	public LabelPoint getPoint() {
		if (point == null) {
			point = new LabelPoint();
		}
		return point;
	}

	public void setPoint(LabelPoint point) {
		this.point = point;
	}

	/**
	 * @see #setRootId(String)
	 */
	public String getRootId() {
		return rootId;
	}

	/**
	 * Which point to use as a root in the visualization.
	 */
	public void setRootId(String rootId) {
		this.rootId = rootId;
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
	 * Since 2.1, pies are not shown in the legend by default.
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
	 * @see #setSize(String)
	 */
	public String getSize() {
		return size;
	}

	/**
	 * The diameter of the pie relative to the plot area. Can be a percentage or
	 * pixel value. Pixel values are given as integers. The default behaviour
	 * (as of 3.0) is to scale to the plot area and give room for data labels
	 * within the plot area. [slicedOffset](#plotOptions.pie.slicedOffset) is
	 * also included in the default size calculation. As a consequence, the size
	 * of the pie may vary when points are updated and data labels more around.
	 * In that case it is best to set a fixed value, for example `"75%"`.
	 */
	public void setSize(String size) {
		this.size = size;
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
	 * @see #setSlicedOffset(Number)
	 */
	public Number getSlicedOffset() {
		return slicedOffset;
	}

	/**
	 * If a point is sliced, moved out from the center, how many pixels should
	 * it be moved?.
	 */
	public void setSlicedOffset(Number slicedOffset) {
		this.slicedOffset = slicedOffset;
	}

	/**
	 * @see #setStartAngle(Number)
	 */
	public Number getStartAngle() {
		return startAngle;
	}

	/**
	 * The start angle of the pie slices in degrees where 0 is top and 90 right.
	 */
	public void setStartAngle(Number startAngle) {
		this.startAngle = startAngle;
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

	public void setLevels(Level... levels) {
		this.levels = new ArrayList<Level>(Arrays.asList(levels));
	}

	public void addLevel(Level level) {
		if (this.levels == null) {
			this.levels = new ArrayList<Level>();
		}
		this.levels.add(level);
	}

	public void removeLevel(Level level) {
		this.levels.remove(level);
	}

	public void setCenter(String x, String y) {
		this.center = new ArrayList<>(Arrays.asList(x, y));
	}
}
