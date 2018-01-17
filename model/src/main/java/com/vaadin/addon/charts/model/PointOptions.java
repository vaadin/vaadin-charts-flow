package com.vaadin.addon.charts.model;

/*
 * #%L
 * Vaadin Charts
 * %%
 * Copyright (C) 2012 - 2016 Vaadin Ltd
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

import java.time.Instant;
import java.util.Date;

public abstract class PointOptions extends AbstractPlotOptions {

    @Override
    public abstract ChartType getChartType();

    /**
     * @see #setAllowPointSelect(Boolean)
     */
    public abstract Boolean getAllowPointSelect();

    /**
     * Allow this series' points to be selected by clicking on the markers, bars
     * or pie slices.
     * <p>
     * Defaults to: false
     */
    public abstract void setAllowPointSelect(Boolean allowPointSelect);

    /**
     * @see #setAnimation(Boolean)
     */
    public abstract Boolean getAnimation();

    /**
     * <p>
     * Enable or disable the initial animation when a series is displayed. The
     * animation can also be set as a configuration object. Please note that
     * this option only applies to the initial animation of the series itself.
     * For other animations, see <a href="#chart.animation">chart.animation</a>
     * and the animation parameter under the API methods. The following
     * properties are supported:
     * </p>
     * <dl>
     * <dt>duration</dt>
     * <dd>The duration of the animation in milliseconds.</dd>
     * <dt>easing</dt>
     * <dd>A string reference to an easing function set on the <code>Math</code>
     * object. See <a href=
     * "http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-animation-easing/"
     * >the easing demo</a>.</dd>
     * </dl>
     * <p>
     * Due to poor performance, animation is disabled in old IE browsers for
     * column charts and polar charts.
     * </p>
     * <p>
     * Defaults to: true
     */
    public abstract void setAnimation(Boolean animation);

    /**
     * @see #setAnimationLimit(Number)
     */
    public abstract Number getAnimationLimit();

    /**
     * For some series, there is a limit that shuts down initial animation by
     * default when the total number of points in the chart is too high. For
     * example, for a column chart and its derivatives, animation doesn't run if
     * there is more than 250 points totally. To disable this cap, set
     * <code>animationLimit</code> to <code>Infinity</code>.
     */
    public abstract void setAnimationLimit(Number animationLimit);

    /**
     * @see #setClassName(String)
     */
    public abstract String getClassName();

    /**
     * A class name to apply to the series' graphical elements.
     */
    public abstract void setClassName(String className);

    /**
     * @see #setColorIndex(Number)
     */
    public abstract Number getColorIndex();

    /**
     * <a href=
     * "http://www.highcharts.com/docs/chart-design-and-style/style-by-css"
     * >Styled mode</a> only. A specific color index to use for the series, so
     * its graphic representations are given the class name
     * <code>highcharts-color-{n}</code>.
     */
    public abstract void setColorIndex(Number colorIndex);

    /**
     * @see #setCropThreshold(Number)
     */
    public abstract Number getCropThreshold();

    /**
     * When the series contains less points than the crop threshold, all points
     * are drawn, even if the points fall outside the visible plot area at the
     * current zoom. The advantage of drawing all points (including markers and
     * columns), is that animation is performed on updates. On the other hand,
     * when the series contains more points than the crop threshold, the series
     * data is cropped to only contain points that fall within the plot area.
     * The advantage of cropping away invisible points is to increase
     * performance on large series.
     * <p>
     * Defaults to: 300
     */
    public abstract void setCropThreshold(Number cropThreshold);

    /**
     * @see #setCursor(Cursor)
     */
    public abstract Cursor getCursor();

    /**
     * You can set the cursor to "pointer" if you have click events attached to
     * the series, to signal to the user that the points and lines can be
     * clicked.
     */
    public abstract void setCursor(Cursor cursor);

    /**
     * @see #setDataLabels(DataLabels)
     */
    public abstract DataLabels getDataLabels();

    /**
     * <p>
     * Options for the series data labels, appearing next to each data point.
     * </p>
     *
     * <p>
     * In <a href=
     * "http://www.highcharts.com/docs/chart-design-and-style/style-by-css"
     * >styled mode</a>, the data labels can be styled wtih the
     * <code>.highcharts-data-label-box</code> and
     * <code>.highcharts-data-label</code> class names (<a href=
     * "http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/series-datalabels"
     * >see example</a>).
     * </p>
     */
    public abstract void setDataLabels(DataLabels dataLabels);

    /**
     * @see #setDescription(String)
     */
    public abstract String getDescription();

    /**
     * <p>
     * <i>Requires Accessibility module</i>
     * </p>
     * <p>
     * A description of the series to add to the screen reader information about
     * the series.
     * </p>
     * <p>
     * Defaults to: undefined
     */
    public abstract void setDescription(String description);

    /**
     * @see #setEnableMouseTracking(Boolean)
     */
    public abstract Boolean getEnableMouseTracking();

    /**
     * Enable or disable the mouse tracking for a specific series. This includes
     * point tooltips and click events on graphs and points. For large datasets
     * it improves performance.
     * <p>
     * Defaults to: true
     */
    public abstract void setEnableMouseTracking(Boolean enableMouseTracking);

    /**
     * @see #setExposeElementToA11y(Boolean)
     */
    public abstract Boolean getExposeElementToA11y();

    /**
     * <p>
     * By default, series are exposed to screen readers as regions. By enabling
     * this option, the series element itself will be exposed in the same way as
     * the data points. This is useful if the series is not used as a grouping
     * entity in the chart, but you still want to attach a description to the
     * series.
     * </p>
     * <p>
     * Requires the Accessibility module.
     * </p>
     * <p>
     * Defaults to: undefined
     */
    public abstract void setExposeElementToA11y(Boolean exposeElementToA11y);

    /**
     * @see #setFindNearestPointBy(Dimension)
     */
    public abstract Dimension getFindNearestPointBy();

    /**
     * <p>
     * Determines whether the series should look for the nearest point in both
     * dimensions or just the x-dimension when hovering the series. Defaults to
     * <code>'xy'</code> for scatter series and <code>'x'</code> for most other
     * series. If the data has duplicate x-values, it is recommended to set this
     * to <code>'xy'</code> to allow hovering over all points.
     * </p>
     * <p>
     * Applies only to series types using nearest neighbor search (not direct
     * hover) for tooltip.
     * </p>
     */
    public abstract void setFindNearestPointBy(Dimension findNearestPointBy);

    /**
     * @see #setGetExtremesFromAll(Boolean)
     */
    public abstract Boolean getGetExtremesFromAll();

    /**
     * Whether to use the Y extremes of the total chart width or only the zoomed
     * area when zooming in on parts of the X axis. By default, the Y axis
     * adjusts to the min and max of the visible data. Cartesian series only.
     * <p>
     * Defaults to: false
     */
    public abstract void setGetExtremesFromAll(Boolean getExtremesFromAll);

    /**
     * @see #setKeys(String...)
     */
    public abstract String[] getKeys();

    /**
     * An array specifying which option maps to which key in the data point
     * array. This makes it convenient to work with unstructured data arrays
     * from different sources.
     */
    public abstract void setKeys(String... keys);

    /**
     * Adds key to the keys array
     *
     * @param key
     *            to add
     * @see #setKeys(String...)
     */
    public abstract void addKey(String key);

    /**
     * Removes first occurrence of key in keys array
     *
     * @param key
     *            to remove
     * @see #setKeys(String...)
     */
    public abstract void removeKey(String key);

    /**
     * @see #setLinkedTo(String)
     */
    public abstract String getLinkedTo();

    /**
     * The <a href="#series.id">id</a> of another series to link to.
     * Additionally, the value can be ":previous" to link to the previous
     * series. When two series are linked, only the first one appears in the
     * legend. Toggling the visibility of this also toggles the linked series.
     */
    public abstract void setLinkedTo(String linkedTo);

    /**
     * @see #setMarker(Marker)
     */
    public abstract Marker getMarker();

    /**
     * <p>
     * Options for the point markers of line-like series. Properties like
     * <code>fillColor</code>, <code>lineColor</code> and <code>lineWidth</code>
     * define the visual appearance of the markers. Other series types, like
     * column series, don't have markers, but have visual options on the series
     * level instead.
     * </p>
     *
     * <p>
     * In <a href=
     * "http://www.highcharts.com/docs/chart-design-and-style/style-by-css"
     * >styled mode</a>, the markers can be styled with the
     * <code>.highcharts-point</code>, <code>.highcharts-point-hover</code> and
     * <code>.highcharts-point-select</code> class names.
     * </p>
     */
    public abstract void setMarker(Marker marker);

    public abstract String getPointDescriptionFormatter();

    public abstract void setPointDescriptionFormatter(
            String _fn_pointDescriptionFormatter);

    /**
     * @see #setPointInterval(Number)
     */
    public abstract Number getPointInterval();

    /**
     * <p>
     * If no x values are given for the points in a series, pointInterval
     * defines the interval of the x values. For example, if a series contains
     * one value every decade starting from year 0, set pointInterval to 10.
     * </p>
     * <p>
     * Since Highcharts 4.1, it can be combined with
     * <code>pointIntervalUnit</code> to draw irregular intervals.
     * </p>
     * <p>
     * Defaults to: 1
     */
    public abstract void setPointInterval(Number pointInterval);

    /**
     * @see #setPointIntervalUnit(IntervalUnit)
     */
    public abstract IntervalUnit getPointIntervalUnit();

    /**
     * On datetime series, this allows for setting the <a
     * href="#plotOptions.series.pointInterval">pointInterval</a> to irregular
     * time units, <code>day</code>, <code>month</code> and <code>year</code>. A
     * day is usually the same as 24 hours, but pointIntervalUnit also takes the
     * DST crossover into consideration when dealing with local time. Combine
     * this option with <code>pointInterval</code> to draw weeks, quarters, 6
     * months, 10 years etc.
     */
    public abstract void setPointIntervalUnit(IntervalUnit pointIntervalUnit);

    /**
     * @see #setPointStart(Number)
     */
    public abstract Number getPointStart();

    /**
     * If no x values are given for the points in a series, pointStart defines
     * on what value to start. For example, if a series contains one yearly
     * value starting from 1945, set pointStart to 1945.
     * <p>
     * Defaults to: 0
     */
    public abstract void setPointStart(Number pointStart);

    /**
     * @see #setSelected(Boolean)
     */
    public abstract Boolean getSelected();

    /**
     * Whether to select the series initially. If <code>showCheckbox</code> is
     * true, the checkbox next to the series name will be checked for a selected
     * series.
     * <p>
     * Defaults to: false
     */
    public abstract void setSelected(Boolean selected);

    /**
     * @see #setShadow(Boolean)
     */
    public abstract Boolean getShadow();

    /**
     * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow
     * can be an object configuration containing <code>color</code>,
     * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and
     * <code>width</code>.
     * <p>
     * Defaults to: false
     */
    public abstract void setShadow(Boolean shadow);

    /**
     * @see #setShowCheckbox(Boolean)
     */
    public abstract Boolean getShowCheckbox();

    /**
     * If true, a checkbox is displayed next to the legend item to allow
     * selecting the series. The state of the checkbox is determined by the
     * <code>selected</code> option.
     * <p>
     * Defaults to: false
     */
    public abstract void setShowCheckbox(Boolean showCheckbox);

    /**
     * @see #setShowInLegend(Boolean)
     */
    public abstract Boolean getShowInLegend();

    /**
     * Whether to display this particular series or series type in the legend.
     * The default value is <code>true</code> for standalone series,
     * <code>false</code> for linked series.
     * <p>
     * Defaults to: true
     */
    public abstract void setShowInLegend(Boolean showInLegend);

    /**
     * @see #setSkipKeyboardNavigation(Boolean)
     */
    public abstract Boolean getSkipKeyboardNavigation();

    /**
     * If set to <code>True</code>, the accessibility module will skip past the
     * points in this series for keyboard navigation.
     */
    public abstract void setSkipKeyboardNavigation(Boolean skipKeyboardNavigation);

    /**
     * @see #setSoftThreshold(Boolean)
     */
    public abstract Boolean getSoftThreshold();

    /**
     * <p>
     * When this is true, the series will not cause the Y axis to cross the zero
     * plane (or <a href="#plotOptions.series.threshold">threshold</a> option)
     * unless the data actually crosses the plane.
     * </p>
     *
     * <p>
     * For example, if <code>softThreshold</code> is <code>false</code>, a
     * series of 0, 1, 2, 3 will make the Y axis show negative values according
     * to the <code>minPadding</code> option. If <code>softThreshold</code> is
     * <code>true</code>, the Y axis starts at 0.
     * </p>
     * <p>
     * Defaults to: true
     */
    public abstract void setSoftThreshold(Boolean softThreshold);

    /**
     * @see #setStates(States)
     */
    public abstract States getStates();

    /**
     * A wrapper object for all the series options in specific states.
     */
    public abstract void setStates(States states);

    /**
     * @see #setStickyTracking(Boolean)
     */
    public abstract Boolean getStickyTracking();

    /**
     * Sticky tracking of mouse events. When true, the <code>mouseOut</code>
     * event on a series isn't triggered until the mouse moves over another
     * series, or out of the plot area. When false, the <code>mouseOut</code>
     * event on a series is triggered when the mouse leaves the area around the
     * series' graph or markers. This also implies the tooltip. When
     * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is
     * false, the tooltip will be hidden when moving the mouse between series.
     * <p>
     * Defaults to: false
     */
    public abstract void setStickyTracking(Boolean stickyTracking);

    /**
     * @see #setThreshold(Number)
     */
    public abstract Number getThreshold();

    /**
     * The threshold, also called zero level or base level. For line type series
     * this is only used in conjunction with <a
     * href="#plotOptions.series.negativeColor">negativeColor</a>.
     * <p>
     * Defaults to: 0
     */
    public abstract void setThreshold(Number threshold);

    /**
     * @see #setTooltip(SeriesTooltip)
     */
    public abstract SeriesTooltip getTooltip();

    /**
     * A configuration object for the tooltip rendering of each single series.
     * Properties are inherited from <a href="#tooltip">tooltip</a>, but only
     * the following properties can be defined on a series level.
     */
    public abstract void setTooltip(SeriesTooltip tooltip);

    /**
     * @see #setTurboThreshold(Number)
     */
    public abstract Number getTurboThreshold();

    /**
     * When a series contains a data array that is longer than this, only one
     * dimensional arrays of numbers, or two dimensional arrays with x and y
     * values are allowed. Also, only the first point is tested, and the rest
     * are assumed to be the same format. This saves expensive data checking and
     * indexing in long series. Set it to <code>0</code> disable.
     * <p>
     * Defaults to: 1000
     */
    public abstract void setTurboThreshold(Number turboThreshold);

    /**
     * @see #setVisible(Boolean)
     */
    public abstract Boolean getVisible();

    /**
     * Set the initial visibility of the series.
     * <p>
     * Defaults to: true
     */
    public abstract void setVisible(Boolean visible);

    /**
     * @see #setZoneAxis(ZoneAxis)
     */
    public abstract ZoneAxis getZoneAxis();

    /**
     * Defines the Axis on which the zones are applied.
     * <p>
     * Defaults to: y
     */
    public abstract void setZoneAxis(ZoneAxis zoneAxis);

    /**
     * @see #setZones(Zones...)
     */
    public abstract Zones[] getZones();

    /**
     * <p>
     * An array defining zones within a series. Zones can be applied to the X
     * axis, Y axis or Z axis for bubbles, according to the
     * <code>zoneAxis</code> option.
     * </p>
     *
     * <p>
     * In <a href=
     * "http://www.highcharts.com/docs/chart-design-and-style/style-by-css"
     * >styled mode</a>, the color zones are styled with the
     * <code>.highcharts-zone-{n}</code> class, or custom classed from the
     * <code>className</code> option (<a href=
     * "http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/color-zones/"
     * >view live demo</a>).
     * </p>
     */
    public abstract void setZones(Zones... zones);

    /**
     * Adds zone to the zones array
     *
     * @param zone
     *            to add
     * @see #setZones(Zones...)
     */
    public abstract void addZone(Zones zone);

    /**
     * Removes first occurrence of zone in zones array
     *
     * @param zone
     *            to remove
     * @see #setZones(Zones...)
     */
    public abstract void removeZone(Zones zone);

    /**
     * @see #setCompare(Compare)
     */
    public abstract Compare getCompare();

    /**
     * Compare the values of the series against the first non-null, non-zero
     * value in the visible range. The y axis will show percentage or absolute
     * change depending on whether <code>compare</code> is set to
     * <code>"percent"</code> or <code>"value"</code>. When this is applied to
     * multiple series, it allows comparing the development of the series
     * against each other.
     * <p>
     * Defaults to: undefined
     */
    public abstract void setCompare(Compare compare);

    /**
     * @see #setCompareBase(Number)
     */
    public abstract Number getCompareBase();

    /**
     * When <a href="#plotOptions.series.compare">compare</a> is
     * <code>percent</code>, this option dictates whether to use 0 or 100 as the
     * base of comparison.
     * <p>
     * Defaults to: 0
     */
    public abstract void setCompareBase(Number compareBase);

    /**
     * @see #setDataGrouping(DataGrouping)
     */
    public abstract DataGrouping getDataGrouping();

    /**
     * <p>
     * Data grouping is the concept of sampling the data values into larger
     * blocks in order to ease readability and increase performance of the
     * JavaScript charts. Highstock by default applies data grouping when the
     * points become closer than a certain pixel value, determined by the
     * <code>groupPixelWidth</code> option.
     * </p>
     *
     * <p>
     * If data grouping is applied, the grouping information of grouped points
     * can be read from the <a href="#Point.dataGroup">Point.dataGroup</a>.
     * </p>
     */
    public abstract void setDataGrouping(DataGrouping dataGrouping);

    /**
     * @see #setGapUnit(String)
     */
    public abstract String getGapUnit();

    /**
     * Together with <code>gapSize</code>, this option defines where to draw
     * gaps in the graph.
     * <p>
     * Defaults to: relative
     */
    public abstract void setGapUnit(String gapUnit);

    /**
     * @see #setLegendIndex(Number)
     */
    public abstract Number getLegendIndex();

    /**
     * The sequential index of the series within the legend.
     * <p>
     * Defaults to: 0
     */
    public abstract void setLegendIndex(Number legendIndex);

    /**
     * @see #setNavigatorOptions(PlotOptionsSeries)
     */
    public abstract PlotOptionsSeries getNavigatorOptions();

    /**
     * <p>
     * Options for the corresponding navigator series if
     * <code>showInNavigator</code> is <code>true</code> for this series.
     * Available options are the same as any series, documented at <a
     * class="internal" href="#plotOptions.series">plotOptions</a> and <a
     * class="internal" href="#series">series</a>.
     * </p>
     *
     * <p>
     * These options are merged with options in <a
     * href="#navigator.series">navigator.series</a>, and will take precedence
     * if the same option is defined both places.
     * </p>
     * <p>
     * Defaults to: undefined
     */
    public abstract void setNavigatorOptions(PlotOptionsSeries navigatorOptions);

    /**
     * @see #setPointPlacement(PointPlacement)
     */
    public abstract PointPlacement getPointPlacement();

    /**
     * <p>
     * Possible values: <code>null</code>, <code>"on"</code>,
     * <code>"between"</code>.
     * </p>
     * <p>
     * In a column chart, when pointPlacement is <code>"on"</code>, the point
     * will not create any padding of the X axis. In a polar column chart this
     * means that the first column points directly north. If the pointPlacement
     * is <code>"between"</code>, the columns will be laid out between ticks.
     * This is useful for example for visualising an amount between two points
     * in time or in a certain sector of a polar chart.
     * </p>
     * <p>
     * Since Highcharts 3.0.2, the point placement can also be numeric, where 0
     * is on the axis value, -0.5 is between this value and the previous, and
     * 0.5 is between this value and the next. Unlike the textual options,
     * numeric point placement options won't affect axis padding.
     * </p>
     * <p>
     * Note that pointPlacement needs a <a
     * href="#plotOptions.series.pointRange">pointRange</a> to work. For column
     * series this is computed, but for line-type series it needs to be set.
     * </p>
     * <p>
     * Defaults to <code>null</code> in cartesian charts, <code>"between"</code>
     * in polar charts.
     * <p>
     * Defaults to: null
     */
    public abstract void setPointPlacement(PointPlacement pointPlacement);

    /**
     * @see #setPointRange(Number)
     */
    public abstract Number getPointRange();

    /**
     * The width of each point on the x axis. For example in a column chart with
     * one value each day, the pointRange would be 1 day (= 24 * 3600 * 1000
     * milliseconds). This is normally computed automatically, but this option
     * can be used to override the automatic value.
     * <p>
     * Defaults to: 0
     */
    public abstract void setPointRange(Number pointRange);

    /**
     * @see #setShowInNavigator(Boolean)
     */
    public abstract Boolean getShowInNavigator();

    /**
     * Whether or not to show the series in the navigator. Takes precedence over
     * <a href="#navigator.baseSeries">navigator.baseSeries</a> if defined.
     * <p>
     * Defaults to: undefined
     */
    public abstract void setShowInNavigator(Boolean showInNavigator);

    /**
     * @see #setStacking(Stacking)
     */
    public abstract Stacking getStacking();

    /**
     * Whether to stack the values of each series on top of each other. Possible
     * values are null to disable, "normal" to stack by value or "percent". When
     * stacking is enabled, data must be sorted in ascending X order.
     * <p>
     * Defaults to: null
     */
    public abstract void setStacking(Stacking stacking);

    /**
     * @deprecated as of 4.0. Use {@link #setPointStart(Instant)}
     */
    @Deprecated
    public abstract void setPointStart(Date date);

    /**
     * @see #setPointStart(Number)
     */
    public abstract void setPointStart(Instant instant);
}
