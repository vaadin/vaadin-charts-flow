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

/**
 * Options for the navigator Y axis. Default series options for the navigator
 * yAxis are:
 * 
 * <pre>
 * yAxis: {
 *     gridLineWidth: 0,
 *     startOnTick: false,
 *     endOnTick: false,
 *     minPadding: 0.1,
 *     maxPadding: 0.1,
 *     labels: {
 *         enabled: false
 *     },
 *     title: {
 *         text: null
 *     },
 *     tickWidth: 0
 * }
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class NavigatorYAxis extends AbstractConfigurationObject {

	private String _fn_tickPositioner;
	private Boolean alignTicks;
	private Boolean allowDecimals;
	private Boolean alternateGridColor;
	private Number angle;
	private ArrayList<Breaks> breaks;
	private ArrayList<String> categories;
	private Number ceiling;
	private String className;
	private Boolean crosshair;
	private DateTimeLabelFormats dateTimeLabelFormats;
	private String description;
	private Boolean endOnTick;
	private Number floor;
	private String gridLineInterpolation;
	private Number gridZIndex;
	private String id;
	private Labels labels;
	private Number maxPadding;
	private Number minPadding;
	private Number minTickInterval;
	private String minorTickInterval;
	private Number minorTickLength;
	private TickPosition minorTickPosition;
	private Boolean minorTicks;
	private Number offset;
	private Boolean opposite;
	private Number pane;
	private ArrayList<PlotBand> plotBands;
	private ArrayList<PlotLine> plotLines;
	private Boolean reversed;
	private Boolean reversedStacks;
	private Boolean showFirstLabel;
	private Boolean showLastLabel;
	private Number softMax;
	private Number softMin;
	private StackLabels stackLabels;
	private Number startOfWeek;
	private Boolean startOnTick;
	private ArrayList<String[]> stops;
	private Number tickAmount;
	private Number tickInterval;
	private Number tickLength;
	private Number tickPixelInterval;
	private TickPosition tickPosition;
	private ArrayList<Number> tickPositions;
	private Number tickWidth;
	private TickmarkPlacement tickmarkPlacement;
	private NavigatorTitle title;
	private String tooltipValueFormat;
	private AxisType type;
	private Boolean uniqueNames;
	private Boolean visible;

	public NavigatorYAxis() {
	}

	/**
	 * @see #set_fn_tickPositioner(String)
	 */
	public String getTickPositioner() {
		return _fn_tickPositioner;
	}

	/**
	 * A callback function returning array defining where the ticks are laid out
	 * on the axis. This overrides the default behaviour of
	 * [tickPixelInterval](#xAxis.tickPixelInterval) and
	 * [tickInterval](#xAxis.tickInterval). The automatic tick positions are
	 * accessible through `this.tickPositions` and can be modified by the
	 * callback.
	 */
	public void setTickPositioner(String _fn_tickPositioner) {
		this._fn_tickPositioner = _fn_tickPositioner;
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
	 * @see #setAllowDecimals(Boolean)
	 */
	public Boolean getAllowDecimals() {
		return allowDecimals;
	}

	/**
	 * Whether to allow decimals in this axis' ticks. When counting integers,
	 * like persons or hits on a web page, decimals should be avoided in the
	 * labels.
	 */
	public void setAllowDecimals(Boolean allowDecimals) {
		this.allowDecimals = allowDecimals;
	}

	/**
	 * @see #setAlternateGridColor(Boolean)
	 */
	public Boolean getAlternateGridColor() {
		return alternateGridColor;
	}

	/**
	 * When using an alternate grid color, a band is painted across the plot
	 * area between every other grid line.
	 */
	public void setAlternateGridColor(Boolean alternateGridColor) {
		this.alternateGridColor = alternateGridColor;
	}

	/**
	 * @see #setAngle(Number)
	 */
	public Number getAngle() {
		return angle;
	}

	/**
	 * In a polar chart, this is the angle of the Y axis in degrees, where 0 is
	 * up and 90 is right. The angle determines the position of the axis line
	 * and the labels, though the coordinate system is unaffected.
	 */
	public void setAngle(Number angle) {
		this.angle = angle;
	}

	/**
	 * @see #setBreaks(ArrayList)
	 */
	public ArrayList<Breaks> getBreaks() {
		if (breaks == null) {
			breaks = new ArrayList<Breaks>();
		}
		return breaks;
	}

	/**
	 * An array defining breaks in the axis, the sections defined will be left
	 * out and all the points shifted closer to each other.
	 */
	public void setBreaks(ArrayList<Breaks> breaks) {
		this.breaks = breaks;
	}

	/**
	 * @see #setCategories(ArrayList)
	 */
	public ArrayList<String> getCategories() {
		if (categories == null) {
			categories = new ArrayList<String>();
		}
		return categories;
	}

	/**
	 * If categories are present for the xAxis, names are used instead of
	 * numbers for that axis. Since Highcharts 3.0, categories can also be
	 * extracted by giving each point a [name](#series.data) and setting axis
	 * [type](#xAxis.type) to `category`. However, if you have multiple series,
	 * best practice remains defining the `categories` array. Example:
	 * 
	 * <pre>
	 * categories: ['Apples', 'Bananas', 'Oranges']
	 * </pre>
	 */
	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}

	/**
	 * @see #setCeiling(Number)
	 */
	public Number getCeiling() {
		return ceiling;
	}

	/**
	 * The highest allowed value for automatically computed axis extremes.
	 */
	public void setCeiling(Number ceiling) {
		this.ceiling = ceiling;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Boolean getCrosshair() {
		return crosshair;
	}

	public void setCrosshair(Boolean crosshair) {
		this.crosshair = crosshair;
	}

	/**
	 * @see #setDateTimeLabelFormats(DateTimeLabelFormats)
	 */
	public DateTimeLabelFormats getDateTimeLabelFormats() {
		if (dateTimeLabelFormats == null) {
			dateTimeLabelFormats = new DateTimeLabelFormats();
		}
		return dateTimeLabelFormats;
	}

	/**
	 * For a datetime axis, the scale will automatically adjust to the
	 * appropriate unit. This member gives the default string representations
	 * used for each unit. For intermediate values, different units may be used,
	 * for example the `day` unit can be used on midnight and `hour` unit be
	 * used for intermediate values on the same axis. For an overview of the
	 * replacement codes, see [dateFormat](#Highcharts.dateFormat). Defaults to:
	 * 
	 * <pre>
	 * {
	 * 	    millisecond: '%H:%M:%S.%L',
	 * 	    second: '%H:%M:%S',
	 * 	    minute: '%H:%M',
	 * 	    hour: '%H:%M',
	 * 	    day: '%e. %b',
	 * 	    week: '%e. %b',
	 * 	    month: '%b \'%y',
	 * 	    year: '%Y'
	 * 	}
	 * </pre>
	 */
	public void setDateTimeLabelFormats(
			DateTimeLabelFormats dateTimeLabelFormats) {
		this.dateTimeLabelFormats = dateTimeLabelFormats;
	}

	/**
	 * @see #setDescription(String)
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * _Requires Accessibility module_ Description of the axis to screen reader
	 * users.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getEndOnTick() {
		return endOnTick;
	}

	public void setEndOnTick(Boolean endOnTick) {
		this.endOnTick = endOnTick;
	}

	/**
	 * @see #setFloor(Number)
	 */
	public Number getFloor() {
		return floor;
	}

	/**
	 * The lowest allowed value for automatically computed axis extremes.
	 */
	public void setFloor(Number floor) {
		this.floor = floor;
	}

	/**
	 * @see #setGridLineInterpolation(String)
	 */
	public String getGridLineInterpolation() {
		return gridLineInterpolation;
	}

	/**
	 * Polar charts only. Whether the grid lines should draw as a polygon with
	 * straight lines between categories, or as circles. Can be either `circle`
	 * or `polygon`.
	 */
	public void setGridLineInterpolation(String gridLineInterpolation) {
		this.gridLineInterpolation = gridLineInterpolation;
	}

	/**
	 * @see #setGridZIndex(Number)
	 */
	public Number getGridZIndex() {
		return gridZIndex;
	}

	/**
	 * The Z index of the grid lines.
	 */
	public void setGridZIndex(Number gridZIndex) {
		this.gridZIndex = gridZIndex;
	}

	/**
	 * @see #setId(String)
	 */
	public String getId() {
		return id;
	}

	/**
	 * An id for the axis. This can be used after render time to get a pointer
	 * to the axis object through `chart.get()`.
	 */
	public void setId(String id) {
		this.id = id;
	}

	public Labels getLabels() {
		if (labels == null) {
			labels = new Labels();
		}
		return labels;
	}

	public void setLabels(Labels labels) {
		this.labels = labels;
	}

	public Number getMaxPadding() {
		return maxPadding;
	}

	public void setMaxPadding(Number maxPadding) {
		this.maxPadding = maxPadding;
	}

	public Number getMinPadding() {
		return minPadding;
	}

	public void setMinPadding(Number minPadding) {
		this.minPadding = minPadding;
	}

	/**
	 * @see #setMinTickInterval(Number)
	 */
	public Number getMinTickInterval() {
		return minTickInterval;
	}

	/**
	 * The minimum tick interval allowed in axis values. For example on zooming
	 * in on an axis with daily data, this can be used to prevent the axis from
	 * showing hours. Defaults to the closest distance between two points on the
	 * axis.
	 */
	public void setMinTickInterval(Number minTickInterval) {
		this.minTickInterval = minTickInterval;
	}

	/**
	 * @see #setMinorTickInterval(String)
	 */
	public String getMinorTickInterval() {
		return minorTickInterval;
	}

	/**
	 * Specific tick interval in axis units for the minor ticks. On a linear
	 * axis, if `"auto"`, the minor tick interval is calculated as a fifth of
	 * the tickInterval. If `null`, minor ticks are not shown. On logarithmic
	 * axes, the unit is the power of the value. For example, setting the
	 * minorTickInterval to 1 puts one tick on each of 0.1, 1, 10, 100 etc.
	 * Setting the minorTickInterval to 0.1 produces 9 ticks between 1 and 10,
	 * 10 and 100 etc. If user settings dictate minor ticks to become too dense,
	 * they don't make sense, and will be ignored to prevent performance
	 * problems.
	 */
	public void setMinorTickInterval(String minorTickInterval) {
		this.minorTickInterval = minorTickInterval;
	}

	/**
	 * @see #setMinorTickLength(Number)
	 */
	public Number getMinorTickLength() {
		return minorTickLength;
	}

	/**
	 * The pixel length of the minor tick marks.
	 */
	public void setMinorTickLength(Number minorTickLength) {
		this.minorTickLength = minorTickLength;
	}

	/**
	 * @see #setMinorTickPosition(TickPosition)
	 */
	public TickPosition getMinorTickPosition() {
		return minorTickPosition;
	}

	/**
	 * The position of the minor tick marks relative to the axis line. Can be
	 * one of `inside` and `outside`.
	 */
	public void setMinorTickPosition(TickPosition minorTickPosition) {
		this.minorTickPosition = minorTickPosition;
	}

	/**
	 * @see #setMinorTicks(Boolean)
	 */
	public Boolean getMinorTicks() {
		return minorTicks;
	}

	/**
	 * Enable or disable minor ticks. Unless
	 * [minorTickInterval](#xAxis.minorTickInterval) is set, the tick interval
	 * is calculated as a fifth of the `tickInterval`. On a logarithmic axis,
	 * minor ticks are laid out based on a best guess, attempting to enter
	 * approximately 5 minor ticks between each major tick. Prior to v6.0.0,
	 * ticks were unabled in auto layout by setting `minorTickInterval` to
	 * `"auto"`.
	 */
	public void setMinorTicks(Boolean minorTicks) {
		this.minorTicks = minorTicks;
	}

	/**
	 * @see #setOffset(Number)
	 */
	public Number getOffset() {
		return offset;
	}

	/**
	 * The distance in pixels from the plot area to the axis line. A positive
	 * offset moves the axis with it's line, labels and ticks away from the plot
	 * area. This is typically used when two or more axes are displayed on the
	 * same side of the plot. With multiple axes the offset is dynamically
	 * adjusted to avoid collision, this can be overridden by setting offset
	 * explicitly.
	 */
	public void setOffset(Number offset) {
		this.offset = offset;
	}

	public Boolean getOpposite() {
		return opposite;
	}

	public void setOpposite(Boolean opposite) {
		this.opposite = opposite;
	}

	/**
	 * @see #setPane(Number)
	 */
	public Number getPane() {
		return pane;
	}

	/**
	 * Refers to the index in the [panes](#panes) array. Used for circular
	 * gauges and polar charts. When the option is not set then first pane will
	 * be used.
	 */
	public void setPane(Number pane) {
		this.pane = pane;
	}

	/**
	 * @see #setPlotBands(ArrayList)
	 */
	public ArrayList<PlotBand> getPlotBands() {
		if (plotBands == null) {
			plotBands = new ArrayList<PlotBand>();
		}
		return plotBands;
	}

	/**
	 * An array of objects defining plot bands on the Y axis.
	 */
	public void setPlotBands(ArrayList<PlotBand> plotBands) {
		this.plotBands = plotBands;
	}

	/**
	 * @see #setPlotLines(ArrayList)
	 */
	public ArrayList<PlotLine> getPlotLines() {
		if (plotLines == null) {
			plotLines = new ArrayList<PlotLine>();
		}
		return plotLines;
	}

	/**
	 * An array of objects representing plot lines on the X axis
	 */
	public void setPlotLines(ArrayList<PlotLine> plotLines) {
		this.plotLines = plotLines;
	}

	/**
	 * @see #setReversed(Boolean)
	 */
	public Boolean getReversed() {
		return reversed;
	}

	/**
	 * Whether to reverse the axis so that the highest number is closest to the
	 * origin. If the chart is inverted, the x axis is reversed by default.
	 */
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
	}

	/**
	 * @see #setReversedStacks(Boolean)
	 */
	public Boolean getReversedStacks() {
		return reversedStacks;
	}

	/**
	 * If `true`, the first series in a stack will be drawn on top in a
	 * positive, non-reversed Y axis. If `false`, the first series is in the
	 * base of the stack.
	 */
	public void setReversedStacks(Boolean reversedStacks) {
		this.reversedStacks = reversedStacks;
	}

	/**
	 * @see #setShowFirstLabel(Boolean)
	 */
	public Boolean getShowFirstLabel() {
		return showFirstLabel;
	}

	/**
	 * Whether to show the first tick label.
	 */
	public void setShowFirstLabel(Boolean showFirstLabel) {
		this.showFirstLabel = showFirstLabel;
	}

	public Boolean getShowLastLabel() {
		return showLastLabel;
	}

	public void setShowLastLabel(Boolean showLastLabel) {
		this.showLastLabel = showLastLabel;
	}

	/**
	 * @see #setSoftMax(Number)
	 */
	public Number getSoftMax() {
		return softMax;
	}

	/**
	 * A soft maximum for the axis. If the series data maximum is less than
	 * this, the axis will stay at this maximum, but if the series data maximum
	 * is higher, the axis will flex to show all data.
	 */
	public void setSoftMax(Number softMax) {
		this.softMax = softMax;
	}

	/**
	 * @see #setSoftMin(Number)
	 */
	public Number getSoftMin() {
		return softMin;
	}

	/**
	 * A soft minimum for the axis. If the series data minimum is greater than
	 * this, the axis will stay at this minimum, but if the series data minimum
	 * is lower, the axis will flex to show all data.
	 */
	public void setSoftMin(Number softMin) {
		this.softMin = softMin;
	}

	/**
	 * @see #setStackLabels(StackLabels)
	 */
	public StackLabels getStackLabels() {
		if (stackLabels == null) {
			stackLabels = new StackLabels();
		}
		return stackLabels;
	}

	/**
	 * The stack labels show the total value for each bar in a stacked column or
	 * bar chart. The label will be placed on top of positive columns and below
	 * negative columns. In case of an inverted column chart or a bar chart the
	 * label is placed to the right of positive bars and to the left of negative
	 * bars.
	 */
	public void setStackLabels(StackLabels stackLabels) {
		this.stackLabels = stackLabels;
	}

	/**
	 * @see #setStartOfWeek(Number)
	 */
	public Number getStartOfWeek() {
		return startOfWeek;
	}

	/**
	 * For datetime axes, this decides where to put the tick between weeks. 0 =
	 * Sunday, 1 = Monday.
	 */
	public void setStartOfWeek(Number startOfWeek) {
		this.startOfWeek = startOfWeek;
	}

	public Boolean getStartOnTick() {
		return startOnTick;
	}

	public void setStartOnTick(Boolean startOnTick) {
		this.startOnTick = startOnTick;
	}

	/**
	 * @see #setStops(ArrayList)
	 */
	public ArrayList<String[]> getStops() {
		if (stops == null) {
			stops = new ArrayList<String[]>();
		}
		return stops;
	}

	/**
	 * Solid gauge series only. Color stops for the solid gauge. Use this in
	 * cases where a linear gradient between a `minColor` and `maxColor` is not
	 * sufficient. The stops is an array of tuples, where the first item is a
	 * float between 0 and 1 assigning the relative position in the gradient,
	 * and the second item is the color. For solid gauges, the Y axis also
	 * inherits the concept of [data classes](http://api.
	 * highcharts.com/highmaps#colorAxis.dataClasses) from the Highmaps color
	 * axis.
	 */
	public void setStops(ArrayList<String[]> stops) {
		this.stops = stops;
	}

	/**
	 * @see #setTickAmount(Number)
	 */
	public Number getTickAmount() {
		return tickAmount;
	}

	/**
	 * The amount of ticks to draw on the axis. This opens up for aligning the
	 * ticks of multiple charts or panes within a chart. This option overrides
	 * the `tickPixelInterval` option. This option only has an effect on linear
	 * axes. Datetime, logarithmic or category axes are not affected.
	 */
	public void setTickAmount(Number tickAmount) {
		this.tickAmount = tickAmount;
	}

	/**
	 * @see #setTickInterval(Number)
	 */
	public Number getTickInterval() {
		return tickInterval;
	}

	/**
	 * The interval of the tick marks in axis units. When `null`, the tick
	 * interval is computed to approximately follow the [tickPixelInterval](
	 * #xAxis.tickPixelInterval) on linear and datetime axes. On categorized
	 * axes, a `null` tickInterval will default to 1, one category. Note that
	 * datetime axes are based on milliseconds, so for example an interval of
	 * one day is expressed as `24 * 3600 * 1000`. On logarithmic axes, the
	 * tickInterval is based on powers, so a tickInterval of 1 means one tick on
	 * each of 0.1, 1, 10, 100 etc. A tickInterval of 2 means a tick of 0.1, 10,
	 * 1000 etc. A tickInterval of 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8,
	 * 1, 2, 4, 6, 8, 10, 20, 40 etc.
	 * 
	 * If the tickInterval is too dense for labels to be drawn, Highcharts may
	 * remove ticks. If the chart has multiple axes, the
	 * [alignTicks](#chart.alignTicks) option may interfere with the
	 * `tickInterval` setting.
	 */
	public void setTickInterval(Number tickInterval) {
		this.tickInterval = tickInterval;
	}

	public Number getTickLength() {
		return tickLength;
	}

	public void setTickLength(Number tickLength) {
		this.tickLength = tickLength;
	}

	public Number getTickPixelInterval() {
		return tickPixelInterval;
	}

	public void setTickPixelInterval(Number tickPixelInterval) {
		this.tickPixelInterval = tickPixelInterval;
	}

	/**
	 * @see #setTickPosition(TickPosition)
	 */
	public TickPosition getTickPosition() {
		return tickPosition;
	}

	/**
	 * The position of the major tick marks relative to the axis line. Can be
	 * one of `inside` and `outside`.
	 */
	public void setTickPosition(TickPosition tickPosition) {
		this.tickPosition = tickPosition;
	}

	/**
	 * @see #setTickPositions(ArrayList)
	 */
	public ArrayList<Number> getTickPositions() {
		if (tickPositions == null) {
			tickPositions = new ArrayList<Number>();
		}
		return tickPositions;
	}

	/**
	 * An array defining where the ticks are laid out on the axis. This
	 * overrides the default behaviour of
	 * [tickPixelInterval](#xAxis.tickPixelInterval) and
	 * [tickInterval](#xAxis.tickInterval).
	 */
	public void setTickPositions(ArrayList<Number> tickPositions) {
		this.tickPositions = tickPositions;
	}

	public Number getTickWidth() {
		return tickWidth;
	}

	public void setTickWidth(Number tickWidth) {
		this.tickWidth = tickWidth;
	}

	/**
	 * @see #setTickmarkPlacement(TickmarkPlacement)
	 */
	public TickmarkPlacement getTickmarkPlacement() {
		return tickmarkPlacement;
	}

	/**
	 * For categorized axes only. If `on` the tick mark is placed in the center
	 * of the category, if `between` the tick mark is placed between categories.
	 * The default is `between` if the `tickInterval` is 1, else `on`.
	 */
	public void setTickmarkPlacement(TickmarkPlacement tickmarkPlacement) {
		this.tickmarkPlacement = tickmarkPlacement;
	}

	public NavigatorTitle getTitle() {
		if (title == null) {
			title = new NavigatorTitle();
		}
		return title;
	}

	public void setTitle(NavigatorTitle title) {
		this.title = title;
	}

	/**
	 * @see #setTooltipValueFormat(String)
	 */
	public String getTooltipValueFormat() {
		return tooltipValueFormat;
	}

	/**
	 * Parallel coordinates only. Format that will be used for point.y and
	 * available in [tooltip.pointFormat](#tooltip.pointFormat) as
	 * `{point.formattedValue}`. If not set, `{point.formattedValue}` will use
	 * other options, in this order: 1.
	 * [yAxis.labels.format](#yAxis.labels.format) will be used if set 2. if
	 * yAxis is a category, then category name will be displayed 3. if yAxis is
	 * a datetime, then value will use the same format as yAxis labels 4. if
	 * yAxis is linear/logarithmic type, then simple value will be used
	 */
	public void setTooltipValueFormat(String tooltipValueFormat) {
		this.tooltipValueFormat = tooltipValueFormat;
	}

	/**
	 * @see #setType(AxisType)
	 */
	public AxisType getType() {
		return type;
	}

	/**
	 * The type of axis. Can be one of `linear`, `logarithmic`, `datetime` or
	 * `category`. In a datetime axis, the numbers are given in milliseconds,
	 * and tick marks are placed on appropriate values like full hours or days.
	 * In a category axis, the [point names](#series.line.data.name) of the
	 * chart's series are used for categories, if not a
	 * [categories](#xAxis.categories) array is defined.
	 */
	public void setType(AxisType type) {
		this.type = type;
	}

	/**
	 * @see #setUniqueNames(Boolean)
	 */
	public Boolean getUniqueNames() {
		return uniqueNames;
	}

	/**
	 * Applies only when the axis `type` is `category`. When `uniqueNames` is
	 * true, points are placed on the X axis according to their names. If the
	 * same point name is repeated in the same or another series, the point is
	 * placed on the same X position as other points of the same name. When
	 * `uniqueNames` is false, the points are laid out in increasing X positions
	 * regardless of their names, and the X axis category will take the name of
	 * the last point in each position.
	 */
	public void setUniqueNames(Boolean uniqueNames) {
		this.uniqueNames = uniqueNames;
	}

	/**
	 * @see #setVisible(Boolean)
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * Whether axis, including axis title, line, ticks and labels, should be
	 * visible.
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	public void setCategories(String... categories) {
		this.categories = new ArrayList<String>(Arrays.asList(categories));
	}

	public void addCategory(String category) {
		if (this.categories == null) {
			this.categories = new ArrayList<String>();
		}
		this.categories.add(category);
	}

	public void removeCategory(String category) {
		this.categories.remove(category);
	}

	public void setPlotBands(PlotBand... plotBands) {
		this.plotBands = new ArrayList<PlotBand>(Arrays.asList(plotBands));
	}

	public void addPlotBand(PlotBand plotBand) {
		if (this.plotBands == null) {
			this.plotBands = new ArrayList<PlotBand>();
		}
		this.plotBands.add(plotBand);
	}

	public void removePlotBand(PlotBand plotBand) {
		this.plotBands.remove(plotBand);
	}

	public void setPlotLines(PlotLine... plotLines) {
		this.plotLines = new ArrayList<PlotLine>(Arrays.asList(plotLines));
	}

	public void addPlotLine(PlotLine plotLine) {
		if (this.plotLines == null) {
			this.plotLines = new ArrayList<PlotLine>();
		}
		this.plotLines.add(plotLine);
	}

	public void removePlotLine(PlotLine plotLine) {
		this.plotLines.remove(plotLine);
	}
}
