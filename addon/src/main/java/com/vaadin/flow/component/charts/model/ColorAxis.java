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
 * A color axis for choropleth maps and heat maps. Visually, the color axis will
 * appear as a gradient or as separate items inside the legend, depending on
 * whether the axis is scalar or based on data classes. For supported color
 * formats, see the [docs article about
 * colors](http://www.highcharts.com/docs/chart-design-and-style/colors). A
 * scalar color axis is represented by a gradient. The colors either range
 * between the [minColor](#colorAxis.minColor) and the
 * [maxColor](#colorAxis.maxColor), or for more fine grained control the colors
 * can be defined in [stops](#colorAxis.stops). Often times, the color axis
 * needs to be adjusted to get the right color spread for the data. In addition
 * to stops, consider using a logarithmic [axis type](#colorAxis.type), or
 * setting [min](#colorAxis.min) and [max](#colorAxis.max) to avoid the colors
 * being determined by outliers. When [dataClasses](#colorAxis.dataClasses) are
 * used, the ranges are subdivided into separate classes like categories based
 * on their values. This can be used for ranges between two values, but also for
 * a true category. However, when your data is categorized, it may be as
 * convenient to add each category to a separate series. See [the Axis
 * object](#Axis) for programmatic access to the axis.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ColorAxis extends Axis {

	private String _fn_tickPositioner;
	private Boolean alignTicks;
	private Boolean allowDecimals;
	private Number ceiling;
	private String className;
	private String dataClassColor;
	private ArrayList<DataClasses> dataClasses;
	private String description;
	private Boolean endOnTick;
	private Events events;
	private Number floor;
	private Number gridZIndex;
	private String id;
	private Labels labels;
	private Marker marker;
	private Number max;
	private Color maxColor;
	private Number maxPadding;
	private Number maxRange;
	private Number min;
	private Color minColor;
	private Number minPadding;
	private String minorTickInterval;
	private Number minorTickLength;
	private TickPosition minorTickPosition;
	private Boolean minorTicks;
	private Boolean ordinal;
	private Number overscroll;
	private Number pane;
	private Number range;
	private Boolean reversed;
	private Scrollbar scrollbar;
	private Boolean showFirstLabel;
	private Boolean showInLegend;
	private Boolean showLastLabel;
	private Number softMax;
	private Number softMin;
	private Number startOfWeek;
	private Boolean startOnTick;
	private ArrayList<String[]> stops;
	private Number tickAmount;
	private Number tickInterval;
	private Number tickLength;
	private Number tickPixelInterval;
	private TickPosition tickPosition;
	private ArrayList<Number> tickPositions;
	private TickmarkPlacement tickmarkPlacement;
	private String type;
	private Boolean uniqueNames;
	private ArrayList<TimeUnitMultiples> units;
	private Boolean visible;

	public ColorAxis() {
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
	 * Whether to allow decimals on the color axis.
	 */
	public void setAllowDecimals(Boolean allowDecimals) {
		this.allowDecimals = allowDecimals;
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

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A class name that opens for styling the axis by CSS, especially in
	 * Highcharts styled mode. The class name is applied to group elements for
	 * the grid, axis elements and labels.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setDataClassColor(String)
	 */
	public String getDataClassColor() {
		return dataClassColor;
	}

	/**
	 * Determines how to set each data class' color if no individual color is
	 * set. The default value, `tween`, computes intermediate colors between
	 * `minColor` and `maxColor`. The other possible value, `category`, pulls
	 * colors from the global or chart specific [colors](#colors) array.
	 */
	public void setDataClassColor(String dataClassColor) {
		this.dataClassColor = dataClassColor;
	}

	/**
	 * @see #setDataClasses(ArrayList)
	 */
	public ArrayList<DataClasses> getDataClasses() {
		if (dataClasses == null) {
			dataClasses = new ArrayList<DataClasses>();
		}
		return dataClasses;
	}

	/**
	 * An array of data classes or ranges for the choropleth map. If none given,
	 * the color axis is scalar and values are distributed as a gradient between
	 * the minimum and maximum colors.
	 */
	public void setDataClasses(ArrayList<DataClasses> dataClasses) {
		this.dataClasses = dataClasses;
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

	/**
	 * @see #setEndOnTick(Boolean)
	 */
	public Boolean getEndOnTick() {
		return endOnTick;
	}

	/**
	 * Whether to force the axis to end on a tick. Use this option with the
	 * [maxPadding](#colorAxis.maxPadding) option to control the axis end.
	 */
	public void setEndOnTick(Boolean endOnTick) {
		this.endOnTick = endOnTick;
	}

	public Events getEvents() {
		if (events == null) {
			events = new Events();
		}
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
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

	/**
	 * @see #setLabels(Labels)
	 */
	public Labels getLabels() {
		if (labels == null) {
			labels = new Labels();
		}
		return labels;
	}

	/**
	 * The axis labels show the number for each tick. For more live examples on
	 * label options, see [xAxis.labels in the Highcharts
	 * API.](/highcharts#xAxis.labels)
	 */
	public void setLabels(Labels labels) {
		this.labels = labels;
	}

	/**
	 * @see #setMarker(Marker)
	 */
	public Marker getMarker() {
		if (marker == null) {
			marker = new Marker();
		}
		return marker;
	}

	/**
	 * The triangular marker on a scalar color axis that points to the value of
	 * the hovered area. To disable the marker, set `marker: null`.
	 */
	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	/**
	 * @see #setMax(Number)
	 */
	public Number getMax() {
		return max;
	}

	/**
	 * The maximum value of the axis in terms of map point values. If `null`,
	 * the max value is automatically calculated. If the `endOnTick` option is
	 * true, the max value might be rounded up.
	 */
	public void setMax(Number max) {
		this.max = max;
	}

	/**
	 * @see #setMaxColor(Color)
	 */
	public Color getMaxColor() {
		return maxColor;
	}

	/**
	 * The color to represent the maximum of the color axis. Unless
	 * [dataClasses](#colorAxis.dataClasses) or [stops](#colorAxis.stops) are
	 * set, the gradient ends at this value. If dataClasses are set, the color
	 * is based on minColor and maxColor unless a color is set for each data
	 * class, or the [dataClassColor](#colorAxis.dataClassColor) is set.
	 */
	public void setMaxColor(Color maxColor) {
		this.maxColor = maxColor;
	}

	/**
	 * @see #setMaxPadding(Number)
	 */
	public Number getMaxPadding() {
		return maxPadding;
	}

	/**
	 * Padding of the max value relative to the length of the axis. A padding of
	 * 0.05 will make a 100px axis 5px longer.
	 */
	public void setMaxPadding(Number maxPadding) {
		this.maxPadding = maxPadding;
	}

	/**
	 * @see #setMaxRange(Number)
	 */
	public Number getMaxRange() {
		return maxRange;
	}

	/**
	 * Maximum range which can be set using the navigator's handles. Opposite of
	 * [xAxis.minRange](#xAxis.minRange).
	 */
	public void setMaxRange(Number maxRange) {
		this.maxRange = maxRange;
	}

	/**
	 * @see #setMin(Number)
	 */
	public Number getMin() {
		return min;
	}

	/**
	 * The minimum value of the axis in terms of map point values. If `null`,
	 * the min value is automatically calculated. If the `startOnTick` option is
	 * true, the min value might be rounded down.
	 */
	public void setMin(Number min) {
		this.min = min;
	}

	/**
	 * @see #setMinColor(Color)
	 */
	public Color getMinColor() {
		return minColor;
	}

	/**
	 * The color to represent the minimum of the color axis. Unless
	 * [dataClasses](#colorAxis.dataClasses) or [stops](#colorAxis.stops) are
	 * set, the gradient starts at this value. If dataClasses are set, the color
	 * is based on minColor and maxColor unless a color is set for each data
	 * class, or the [dataClassColor](#colorAxis.dataClassColor) is set.
	 */
	public void setMinColor(Color minColor) {
		this.minColor = minColor;
	}

	/**
	 * @see #setMinPadding(Number)
	 */
	public Number getMinPadding() {
		return minPadding;
	}

	/**
	 * Padding of the min value relative to the length of the axis. A padding of
	 * 0.05 will make a 100px axis 5px longer.
	 */
	public void setMinPadding(Number minPadding) {
		this.minPadding = minPadding;
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
	 * @see #setOrdinal(Boolean)
	 */
	public Boolean getOrdinal() {
		return ordinal;
	}

	/**
	 * In an ordinal axis, the points are equally spaced in the chart regardless
	 * of the actual time or x distance between them. This means that missing
	 * data for nights or weekends will not take up space in the chart.
	 */
	public void setOrdinal(Boolean ordinal) {
		this.ordinal = ordinal;
	}

	/**
	 * @see #setOverscroll(Number)
	 */
	public Number getOverscroll() {
		return overscroll;
	}

	/**
	 * Additional range on the right side of the xAxis. Works similar to
	 * `xAxis.maxPadding`, but value is set in milliseconds. Can be set for both
	 * main `xAxis` and the navigator's `xAxis`.
	 */
	public void setOverscroll(Number overscroll) {
		this.overscroll = overscroll;
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
	 * @see #setRange(Number)
	 */
	public Number getRange() {
		return range;
	}

	/**
	 * The zoomed range to display when only defining one or none of `min` or
	 * `max`. For example, to show the latest month, a range of one month can be
	 * set.
	 */
	public void setRange(Number range) {
		this.range = range;
	}

	/**
	 * @see #setReversed(Boolean)
	 */
	public Boolean getReversed() {
		return reversed;
	}

	/**
	 * Whether to reverse the axis so that the highest number is closest to the
	 * origin. Defaults to `false` in a horizontal legend and `true` in a
	 * vertical legend, where the smallest value starts on top.
	 */
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
	}

	/**
	 * @see #setScrollbar(Scrollbar)
	 */
	public Scrollbar getScrollbar() {
		if (scrollbar == null) {
			scrollbar = new Scrollbar();
		}
		return scrollbar;
	}

	/**
	 * An optional scrollbar to display on the X axis in response to limiting
	 * the minimum and maximum of the axis values. In styled mode, all the
	 * presentational options for the scrollbar are replaced by the classes
	 * `.highcharts-scrollbar-thumb`, `.highcharts-scrollbar-arrow`,
	 * `.highcharts-scrollbar-button`, `.highcharts-scrollbar-rifles` and
	 * `.highcharts-scrollbar-track`.
	 */
	public void setScrollbar(Scrollbar scrollbar) {
		this.scrollbar = scrollbar;
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

	/**
	 * @see #setShowInLegend(Boolean)
	 */
	public Boolean getShowInLegend() {
		return showInLegend;
	}

	/**
	 * Whether to display the colorAxis in the legend.
	 */
	public void setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
	}

	/**
	 * @see #setShowLastLabel(Boolean)
	 */
	public Boolean getShowLastLabel() {
		return showLastLabel;
	}

	/**
	 * Whether to show the last tick label. Defaults to `true` on cartesian
	 * charts, and `false` on polar charts.
	 */
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

	/**
	 * @see #setStartOnTick(Boolean)
	 */
	public Boolean getStartOnTick() {
		return startOnTick;
	}

	/**
	 * Whether to force the axis to start on a tick. Use this option with the
	 * `maxPadding` option to control the axis start.
	 */
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
	 * Color stops for the gradient of a scalar color axis. Use this in cases
	 * where a linear gradient between a `minColor` and `maxColor` is not
	 * sufficient. The stops is an array of tuples, where the first item is a
	 * float between 0 and 1 assigning the relative position in the gradient,
	 * and the second item is the color.
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
	 * interval is computed to approximately follow the `tickPixelInterval`.
	 */
	public void setTickInterval(Number tickInterval) {
		this.tickInterval = tickInterval;
	}

	/**
	 * @see #setTickLength(Number)
	 */
	public Number getTickLength() {
		return tickLength;
	}

	/**
	 * The pixel length of the main tick marks on the color axis.
	 */
	public void setTickLength(Number tickLength) {
		this.tickLength = tickLength;
	}

	/**
	 * @see #setTickPixelInterval(Number)
	 */
	public Number getTickPixelInterval() {
		return tickPixelInterval;
	}

	/**
	 * If [tickInterval](#colorAxis.tickInterval) is `null` this option sets the
	 * approximate pixel interval of the tick marks.
	 */
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

	/**
	 * @see #setType(String)
	 */
	public String getType() {
		return type;
	}

	/**
	 * The type of interpolation to use for the color axis. Can be `linear` or
	 * `logarithmic`.
	 */
	public void setType(String type) {
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
	 * @see #setUnits(ArrayList)
	 */
	public ArrayList<TimeUnitMultiples> getUnits() {
		if (units == null) {
			units = new ArrayList<TimeUnitMultiples>();
		}
		return units;
	}

	/**
	 * Datetime axis only. An array determining what time intervals the ticks
	 * are allowed to fall on. Each array item is an array where the first value
	 * is the time unit and the second value another array of allowed multiples.
	 * Defaults to:
	 * 
	 * <pre>
	 * units: [[
	 * 	    'millisecond', // unit name
	 * 	    [1, 2, 5, 10, 20, 25, 50, 100, 200, 500] // allowed multiples
	 * 	], [
	 * 	    'second',
	 * 	    [1, 2, 5, 10, 15, 30]
	 * 	], [
	 * 	    'minute',
	 * 	    [1, 2, 5, 10, 15, 30]
	 * 	], [
	 * 	    'hour',
	 * 	    [1, 2, 3, 4, 6, 8, 12]
	 * 	], [
	 * 	    'day',
	 * 	    [1]
	 * 	], [
	 * 	    'week',
	 * 	    [1]
	 * 	], [
	 * 	    'month',
	 * 	    [1, 3, 6]
	 * 	], [
	 * 	    'year',
	 * 	    null
	 * 	]]
	 * </pre>
	 */
	public void setUnits(ArrayList<TimeUnitMultiples> units) {
		this.units = units;
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

	public void setUnits(TimeUnitMultiples... units) {
		this.units = new ArrayList<TimeUnitMultiples>(Arrays.asList(units));
	}

	public void addUnit(TimeUnitMultiples unit) {
		if (this.units == null) {
			this.units = new ArrayList<TimeUnitMultiples>();
		}
		this.units.add(unit);
	}

	public void removeUnit(TimeUnitMultiples unit) {
		this.units.remove(unit);
	}
}
