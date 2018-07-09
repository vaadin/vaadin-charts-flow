package com.vaadin.flow.component.charts.model;

import java.util.ArrayList;
import java.util.Date;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 - 2015 Vaadin Ltd
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vaadin.flow.component.charts.util.Util;

public abstract class Axis extends AbstractConfigurationObject {

    private static final long serialVersionUID = 1L;

    public static final String MINOR_TICK_INTERVAL_AUTO = "auto";

    protected Number min;
    protected Number max;

    private Integer axisIndex;

    @JsonIgnore
    private ChartConfiguration configuration;

    public void setAxisIndex(int i) {
        axisIndex = i;
    }

    protected Integer getAxisIndex() {
        return axisIndex;
    }

    /**
     * @see #setMin(Number)
     * @return the minimum value of the axis or null
     */
    public Number getMin() {
        return min;
    }

    /**
     * The minimum value of the axis. If null the min value is automatically
     * calculated. If the startOnTick option is true, the min value might be
     * rounded down.
     *
     * @param min
     */
    public void setMin(Number min) {
        this.min = min;
    }

    /**
     * The minimum value of the axis as Date.
     *
     * @param min
     * @see #setMin(Number)
     */
    public void setMin(Date min) {
        this.min = Util.toHighchartsTS(min);
    }

    /**
     * @see #setMax(Number)
     * @return Maximum value of axis or null
     */
    public Number getMax() {
        return max;
    }

    /**
     * The maximum value of the axis. If null, the max value is automatically
     * calculated. If the endOnTick option is true, the max value might be
     * rounded up. The actual maximum value is also influenced by
     * chart.alignTicks.
     *
     * @param max
     */
    public void setMax(Number max) {
        this.max = max;
    }

    /**
     * The maximum value of the axis as Date.
     *
     * @param max
     * @see #setMax(Number)
     */
    public void setMax(Date max) {
        this.max = Util.toHighchartsTS(max);
    }


    /**
     * Sets the minimum and maximum of the axes after rendering has finished. If
     * the startOnTick and endOnTick options are true, the minimum and maximum
     * values are rounded off to the nearest tick. To prevent this, these
     * options can be set to false before calling setExtremes.
     *
     * @param min
     *            The new minimum value
     * @param max
     *            The new maximum value
     */
    public void setExtremes(Number min, Number max) {
        this.setExtremes(min, max, true, true);
    }

    /**
     * The minimum and maximum value of the axis as Date.
     *
     * @see #setExtremes(Number, Number)
     */
    public void setExtremes(Date min, Date max) {
        this.setExtremes(min, max, true, true);
    }

    /**
     * Sets the extremes at runtime.
     *
     * @param min
     *            Minimum.
     * @param max
     *            Maximum.
     * @param redraw
     *            Whether or not to redraw the chart.
     */
    public void setExtremes(Number min, Number max, boolean redraw) {
        this.setExtremes(min, max, redraw, true);
    }

    /**
     * The minimum and maximum value of the axis as Date.
     *
     * @see #setExtremes(Number, Number, boolean)
     */
    public void setExtremes(Date min, Date max, boolean redraw) {
        this.setExtremes(min, max, redraw, true);
    }

    /**
     * Run-time modification of the axis extremes.
     *
     * @param minimum
     *            New minimum value.
     * @param maximum
     *            New maximum value.
     * @param redraw
     *            Whether or not to redraw the chart.
     * @param animate
     *            Whether or not to animate the rescaling.
     */
    public void setExtremes(Number minimum, Number maximum, boolean redraw,
                            boolean animate) {
        min = minimum;
        max = maximum;
        if (configuration != null) {
            configuration.fireAxesRescaled(this, minimum, maximum, redraw,
                    animate);
        }
    }

    /**
     * The minimum and maximum value of the axis as Date.
     *
     * @see #setExtremes(Number, Number, boolean, boolean)
     */
    public void setExtremes(Date minimum, Date maximum, boolean redraw,
                            boolean animate) {
        setMin(minimum);
        setMax(maximum);
        if (configuration != null) {
            configuration.fireAxesRescaled(this, min, max, redraw,
                    animate);
        }
    }

    /**
     * Returns the configuration this axis is bound to.
     *
     * @return The configuration.
     */
    public ChartConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the configuration this axis is bound to. This method is
     * automatically called by configuration, when the axis is added to it.
     *
     * @param configuration
     *            Configuration this object is linked to.
     */
    public void setConfiguration(ChartConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * @see #setAllowDecimals(Boolean)
     */
    public abstract Boolean getAllowDecimals();

    /**
     * Whether to allow decimals in this axis' ticks. When counting integers,
     * like persons or hits on a web page, decimals must be avoided in the axis
     * tick labels.
     */
    public abstract void setAllowDecimals(Boolean allowDecimals);

    /**
     * @see #setCeiling(Number)
     */
    public abstract Number getCeiling();

    /**
     * The highest allowed value for automatically computed axis extremes.
     */
    public abstract void setCeiling(Number ceiling);

    /**
     * @see #setClassName(String)
     */
    public abstract String getClassName();

    /**
     * A class name that opens for styling the axis by CSS.
     */
    public abstract void setClassName(String className);

    /**
     * @see #setDescription(String)
     */
    public abstract String getDescription();

    /**
     * Description of the axis to screen reader users.
     */
    public abstract void setDescription(String description);

    /**
     * @see #setEndOnTick(Boolean)
     */
    public abstract Boolean getEndOnTick();

    /**
     * Whether to force the axis to end on a tick. Use this option with the
     * <code>maxPadding</code> option to control the axis end.
     */
    public abstract void setEndOnTick(Boolean endOnTick);

    /**
     * @see #setFloor(Number)
     */
    public abstract Number getFloor();

    /**
     * The lowest allowed value for automatically computed axis extremes.
     */
    public abstract void setFloor(Number floor);

    /**
     * @see #setGridZIndex(Number)
     */
    public abstract Number getGridZIndex();

    /**
     * The Z index of the grid lines.
     */
    public abstract void setGridZIndex(Number gridZIndex);

    /**
     * @see #setId(String)
     */
    public abstract String getId();

    /**
     * An id for the axis. This can be used after render time to get a pointer
     * to the axis object through <code>chart.get()</code>.
     */
    public abstract void setId(String id);

    /**
     * @see #setLabels(Labels)
     */
    public abstract Labels getLabels();

    /**
     * The axis labels show the number or category for each tick.
     */
    public abstract void setLabels(Labels labels);

    /**
     * @see #setMaxPadding(Number)
     */
    public abstract Number getMaxPadding();

    /**
     * Padding of the max value relative to the length of the axis. A padding of
     * 0.05 will make a 100px axis 5px longer. This is useful when you don't
     * want the highest data value to appear on the edge of the plot area. When
     * the axis' <code>max</code> option is set or a max extreme is set using
     * <code>axis.setExtremes()</code>, the maxPadding will be ignored.
     */
    public abstract void setMaxPadding(Number maxPadding);

    /**
     * @see #setMinPadding(Number)
     */
    public abstract Number getMinPadding();

    /**
     * Padding of the min value relative to the length of the axis. A padding of
     * 0.05 will make a 100px axis 5px longer. This is useful when you don't
     * want the lowest data value to appear on the edge of the plot area. When
     * the axis' <code>min</code> option is set or a min extreme is set using
     * <code>axis.setExtremes()</code>, the minPadding will be ignored.
     */
    public abstract void setMinPadding(Number minPadding);

    /**
     * @see #setMinorTickInterval(String)
     */
    public abstract String getMinorTickInterval();

    /**
     * <p>
     * Tick interval in scale units for the minor ticks. On a linear axis, if
     * <code>"auto"</code>, the minor tick interval is calculated as a fifth of
     * the tickInterval. If <code>null</code>, minor ticks are not shown.
     * </p>
     * <p>
     * On logarithmic axes, the unit is the power of the value. For example,
     * setting the minorTickInterval to 1 puts one tick on each of 0.1, 1, 10,
     * 100 etc. Setting the minorTickInterval to 0.1 produces 9 ticks between 1
     * and 10, 10 and 100 etc. A minorTickInterval of "auto" on a log axis
     * results in a best guess, attempting to enter approximately 5 minor ticks
     * between each major tick.
     * </p>
     *
     * <p>
     * If user settings dictate minor ticks to become too dense, they don't make
     * sense, and will be ignored to prevent performance problems.</a>
     *
     * <p>
     * On axes using <code>categories</code>, minor ticks are
     * not supported.
     * </p>
     */
    public abstract void setMinorTickInterval(String minorTickInterval);

    /**
     * @see #setMinorTickLength(Number)
     */
    public abstract Number getMinorTickLength();

    /**
     * The pixel length of the minor tick marks.
     */
    public abstract void setMinorTickLength(Number minorTickLength);

    /**
     * @see #setMinorTickPosition(TickPosition)
     */
    public abstract TickPosition getMinorTickPosition();

    /**
     * The position of the minor tick marks relative to the axis line. Can be
     * one of <code>inside</code> and <code>outside</code>.
     */
    public abstract void setMinorTickPosition(TickPosition minorTickPosition);

    /**
     * @see #setReversed(Boolean)
     */
    public abstract Boolean getReversed();

    /**
     * Whether to reverse the axis so that the highest number is closest to the
     * origin.
     */
    public abstract void setReversed(Boolean reversed);

    /**
     * @see #setShowFirstLabel(Boolean)
     */
    public abstract Boolean getShowFirstLabel();

    /**
     * Whether to show the first tick label.
     */
    public abstract void setShowFirstLabel(Boolean showFirstLabel);

    /**
     * @see #setShowLastLabel(Boolean)
     */
    public abstract Boolean getShowLastLabel();

    /**
     * Whether to show the last tick label.
     */
    public abstract void setShowLastLabel(Boolean showLastLabel);

    /**
     * @see #setSoftMax(Number)
     */
    public abstract Number getSoftMax();

    /**
     * A soft maximum for the axis. If the series data maximum is less than
     * this, the axis will stay at this maximum, but if the series data maximum
     * is higher, the axis will flex to show all data.
     */
    public abstract void setSoftMax(Number softMax);

    /**
     * @see #setSoftMin(Number)
     */
    public abstract Number getSoftMin();

    /**
     * A soft minimum for the axis. If the series data minimum is greater than
     * this, the axis will stay at this minimum, but if the series data minimum
     * is lower, the axis will flex to show all data.
     */
    public abstract void setSoftMin(Number softMin);

    /**
     * @see #setStartOfWeek(Number)
     */
    public abstract Number getStartOfWeek();

    /**
     * For datetime axes, this decides where to put the tick between weeks. 0 =
     * Sunday, 1 = Monday.
     */
    public abstract void setStartOfWeek(Number startOfWeek);

    /**
     * @see #setStartOnTick(Boolean)
     */
    public abstract Boolean getStartOnTick();

    /**
     * Whether to force the axis to start on a tick. Use this option with the
     * <code>minPadding</code> option to control the axis start.
     */
    public abstract void setStartOnTick(Boolean startOnTick);

    /**
     * @see #setTickAmount(Number)
     */
    public abstract Number getTickAmount();

    /**
     * <p>
     * The amount of ticks to draw on the axis. This opens up for aligning the
     * ticks of multiple charts or panes within a chart. This option overrides
     * the <code>tickPixelInterval</code> option.
     * </p>
     * <p>
     * This option only has an effect on linear axes. Datetime, logarithmic or
     * category axes are not affected.
     * </p>
     */
    public abstract void setTickAmount(Number tickAmount);

    /**
     * @see #setTickInterval(Number)
     */
    public abstract Number getTickInterval();

    /**
     * <p>
     * The interval of the tick marks in axis units. When <code>null</code>, the
     * tick interval is computed to approximately follow the
     * <code>tickPixelInterval</code> on linear and
     * datetime axes. On categorized axes, a <code>null</code> tickInterval will
     * default to 1, one category. Note that datetime axes are based on
     * milliseconds, so for example an interval of one day is expressed as
     * <code>24 * 3600 * 1000</code>.
     * </p>
     * <p>
     * On logarithmic axes, the tickInterval is based on powers, so a
     * tickInterval of 1 means one tick on each of 0.1, 1, 10, 100 etc. A
     * tickInterval of 2 means a tick of 0.1, 10, 1000 etc. A tickInterval of
     * 0.2 puts a tick on 0.1, 0.2, 0.4, 0.6, 0.8, 1, 2, 4, 6, 8, 10, 20, 40
     * etc.
     * </p>
     * <p>
     * If the tickInterval is too dense for labels to be drawn, Highcharts may
     * remove ticks.
     * </p>
     */
    public abstract void setTickInterval(Number tickInterval);

    /**
     * @see #setTickLength(Number)
     */
    public abstract Number getTickLength();

    /**
     * The pixel length of the main tick marks.
     */
    public abstract void setTickLength(Number tickLength);

    /**
     * @see #setTickPixelInterval(Number)
     */
    public abstract Number getTickPixelInterval();

    /**
     * If tickInterval is <code>null</code> this option sets the approximate
     * pixel interval of the tick marks. Not applicable to categorized axis.
     */
    public abstract void setTickPixelInterval(Number tickPixelInterval);

    /**
     * @see #setTickPosition(TickPosition)
     */
    public abstract TickPosition getTickPosition();

    /**
     * The position of the major tick marks relative to the axis line. Can be
     * one of <code>inside</code> and <code>outside</code>.
     */
    public abstract void setTickPosition(TickPosition tickPosition);

    /**
     * @see #setTickPositions(Number[])
     */
    public abstract ArrayList<Number> getTickPositions();

    /**
     * An array defining where the ticks are laid out on the axis. This
     * overrides the default behaviour of <code>tickPixelInterval</code> and
     * <code>tickInterval</code>.
     */
    public abstract void setTickPositions(ArrayList<Number> tickPositions);

    /**
     * @see #setTickmarkPlacement(TickmarkPlacement)
     */
    public abstract TickmarkPlacement getTickmarkPlacement();

    /**
     * For categorized axes only. If <code>on</code> the tick mark is placed in
     * the center of the category, if <code>between</code> the tick mark is
     * placed between categories. The default is <code>between</code> if the
     * <code>tickInterval</code> is 1, else <code>on</code>.
     */
    public abstract void setTickmarkPlacement(TickmarkPlacement tickmarkPlacement);

    /**
     * @see #setUniqueNames(Boolean)
     */
    public abstract Boolean getUniqueNames();

    /**
     * Applies only when the axis <code>type</code> is <code>category</code>.
     * When <code>uniqueNames</code> is true, points are placed on the X axis
     * according to their names. If the same point name is repeated in the same
     * or another series, the point is placed on the same X position as other
     * points of the same name. When <code>uniqueNames</code> is false, the
     * points are laid out in increasing X positions regardless of their names,
     * and the X axis category will take the name of the last point in each
     * position.
     */
    public abstract void setUniqueNames(Boolean uniqueNames);

    /**
     * @see #setUnits(TimeUnitMultiples...)
     */
    public abstract ArrayList<TimeUnitMultiples> getUnits();

    /**
     * Datetime axis only. An array determining what time intervals the ticks
     * are allowed to fall on. Each array item is an array where the first value
     * is the time unit and the second value another array of allowed multiples.
     */
    public abstract void setUnits(TimeUnitMultiples... units);

    /**
     * Adds unit to the units array
     *
     * @param unit
     *            to add
     * @see #setUnits(TimeUnitMultiples...)
     */
    public abstract void addUnit(TimeUnitMultiples unit);

    /**
     * Removes first occurrence of unit in units array
     *
     * @param unit
     *            to remove
     * @see #setUnits(TimeUnitMultiples...)
     */
    public abstract void removeUnit(TimeUnitMultiples unit);

    /**
     * @see #setVisible(Boolean)
     */
    public abstract Boolean getVisible();

    /**
     * Whether axis, including axis title, line, ticks and labels, should be
     * visible.
     */
    public abstract void setVisible(Boolean visible);
}
