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

/**
 * Common options for all yAxes rendered in a parallel coordinates plot. This
 * feature requires `modules/parallel-coordinates.js`. The default options are:
 * 
 * <pre>
 * parallelAxes: {
 *    lineWidth: 1,       // classic mode only
 *    gridlinesWidth: 0,  // classic mode only
 *    title: {
 *        text: '',
 *        reserveSpace: false
 *    },
 *    labels: {
 *        x: 0,
 *        y: 0,
 *        align: 'center',
 *        reserveSpace: false
 *    },
 *    offset: 0
 * }
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ParallelAxes extends AbstractConfigurationObject {

	private String _fn_tickPositioner;
	private Boolean alignTicks;
	private Boolean allowDecimals;
	private ArrayList<String> categories;
	private Number ceiling;
	private String className;
	private Crosshair crosshair;
	private DateTimeLabelFormats dateTimeLabelFormats;
	private String description;
	private Boolean endOnTick;
	private Number floor;
	private Number gridZIndex;
	private String height;
	private Labels labels;
	private Number lineWidth;
	private Number linkedTo;
	private String maxLength;
	private Number maxPadding;
	private Number maxRange;
	private String minLength;
	private Number minPadding;
	private Number minRange;
	private Number minTickInterval;
	private String minorTickInterval;
	private Number minorTickLength;
	private TickPosition minorTickPosition;
	private Boolean minorTicks;
	private Number offset;
	private Boolean opposite;
	private Number pane;
	private Number range;
	private Resize resize;
	private Boolean reversed;
	private Boolean reversedStacks;
	private Boolean showEmpty;
	private Boolean showFirstLabel;
	private Boolean showLastLabel;
	private Number softMax;
	private Number softMin;
	private Number startOfWeek;
	private Boolean startOnTick;
	private Number tickAmount;
	private Number tickInterval;
	private Number tickLength;
	private Number tickPixelInterval;
	private TickPosition tickPosition;
	private ArrayList<Number> tickPositions;
	private TickmarkPlacement tickmarkPlacement;
	private NavigatorTitle title;
	private String tooltipValueFormat;
	private String top;
	private AxisType type;
	private Boolean uniqueNames;
	private ArrayList<TimeUnitMultiples> units;
	private Boolean visible;

	public ParallelAxes() {
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
	 * @see #setCrosshair(Crosshair)
	 */
	public Crosshair getCrosshair() {
		if (crosshair == null) {
			crosshair = new Crosshair();
		}
		return crosshair;
	}

	/**
	 * Configure a crosshair that follows either the mouse pointer or the
	 * hovered point. In styled mode, the crosshairs are styled in the
	 * `.highcharts-crosshair`, `.highcharts-crosshair-thin` or
	 * `.highcharts-xaxis-category` classes.
	 */
	public void setCrosshair(Crosshair crosshair) {
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
	 * @see #setHeight(String)
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * The height of the Y axis. If it's a number, it is interpreted as pixels.
	 * Since Highstock 2: If it's a percentage string, it is interpreted as
	 * percentages of the total plot height.
	 */
	public void setHeight(String height) {
		this.height = height;
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

	public Number getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(Number lineWidth) {
		this.lineWidth = lineWidth;
	}

	/**
	 * @see #setLinkedTo(Number)
	 */
	public Number getLinkedTo() {
		return linkedTo;
	}

	/**
	 * Index of another axis that this axis is linked to. When an axis is linked
	 * to a master axis, it will take the same extremes as the master, but as
	 * assigned by min or max or by setExtremes. It can be used to show
	 * additional info, or to ease reading the chart by duplicating the scales.
	 */
	public void setLinkedTo(Number linkedTo) {
		this.linkedTo = linkedTo;
	}

	/**
	 * @see #setMaxLength(String)
	 */
	public String getMaxLength() {
		return maxLength;
	}

	/**
	 * Maximal size of a resizable axis. Could be set as a percent of plot area
	 * or pixel size. This feature requires the `drag-panes.js` module.
	 */
	public void setMaxLength(String maxLength) {
		this.maxLength = maxLength;
	}

	/**
	 * @see #setMaxPadding(Number)
	 */
	public Number getMaxPadding() {
		return maxPadding;
	}

	/**
	 * Padding of the max value relative to the length of the axis. A padding of
	 * 0.05 will make a 100px axis 5px longer. This is useful when you don't
	 * want the highest data value to appear on the edge of the plot area. When
	 * the axis' `max` option is set or a max extreme is set using
	 * `axis.setExtremes()`, the maxPadding will be ignored.
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
	 * @see #setMinLength(String)
	 */
	public String getMinLength() {
		return minLength;
	}

	/**
	 * Minimal size of a resizable axis. Could be set as a percent of plot area
	 * or pixel size. This feature requires the `drag-panes.js` module.
	 */
	public void setMinLength(String minLength) {
		this.minLength = minLength;
	}

	/**
	 * @see #setMinPadding(Number)
	 */
	public Number getMinPadding() {
		return minPadding;
	}

	/**
	 * Padding of the min value relative to the length of the axis. A padding of
	 * 0.05 will make a 100px axis 5px longer. This is useful when you don't
	 * want the lowest data value to appear on the edge of the plot area. When
	 * the axis' `min` option is set or a max extreme is set using
	 * `axis.setExtremes()`, the maxPadding will be ignored.
	 */
	public void setMinPadding(Number minPadding) {
		this.minPadding = minPadding;
	}

	/**
	 * @see #setMinRange(Number)
	 */
	public Number getMinRange() {
		return minRange;
	}

	/**
	 * The minimum range to display on this axis. The entire axis will not be
	 * allowed to span over a smaller interval than this. For example, for a
	 * datetime axis the main unit is milliseconds. If minRange is set to
	 * 3600000, you can't zoom in more than to one hour. The default minRange
	 * for the x axis is five times the smallest interval between any of the
	 * data points. On a logarithmic axis, the unit for the minimum range is the
	 * power. So a minRange of 1 means that the axis can be zoomed to 10-100,
	 * 100-1000, 1000-10000 etc. Note that the `minPadding`, `maxPadding`,
	 * `startOnTick` and `endOnTick` settings also affect how the extremes of
	 * the axis are computed.
	 */
	public void setMinRange(Number minRange) {
		this.minRange = minRange;
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

	public Number getOffset() {
		return offset;
	}

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
	 * @see #setResize(Resize)
	 */
	public Resize getResize() {
		if (resize == null) {
			resize = new Resize();
		}
		return resize;
	}

	/**
	 * Options for axis resizing. This feature requires the `drag-panes.js` -
	 * [classic](http://code.highcharts.com/stock/modules/drag-panes.js) or
	 * [styled](http://code.highcharts.com/stock/js/modules/drag-panes.js) mode
	 * - module.
	 */
	public void setResize(Resize resize) {
		this.resize = resize;
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
	 * @see #setShowEmpty(Boolean)
	 */
	public Boolean getShowEmpty() {
		return showEmpty;
	}

	/**
	 * Whether to show the axis line and title when the axis has no data.
	 */
	public void setShowEmpty(Boolean showEmpty) {
		this.showEmpty = showEmpty;
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

	/**
	 * @see #setTickLength(Number)
	 */
	public Number getTickLength() {
		return tickLength;
	}

	/**
	 * The pixel length of the main tick marks.
	 */
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
	 * @see #setTitle(NavigatorTitle)
	 */
	public NavigatorTitle getTitle() {
		if (title == null) {
			title = new NavigatorTitle();
		}
		return title;
	}

	/**
	 * Titles for yAxes are taken from [xAxis.categories](#xAxis.categories).
	 * All options for `xAxis.labels` applies to parallel coordinates titles.
	 * For example, to style categories, use
	 * [xAxis.labels.style](#xAxis.labels.style).
	 */
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
	 * @see #setTop(String)
	 */
	public String getTop() {
		return top;
	}

	/**
	 * The top position of the Y axis. If it's a number, it is interpreted as
	 * pixel position relative to the chart. Since Highstock 2: If it's a
	 * percentage string, it is interpreted as percentages of the plot height,
	 * offset from plot area top.
	 */
	public void setTop(String top) {
		this.top = top;
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
