package com.vaadin.addon.charts.model;

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

public abstract class AbstractDataLabels extends AbstractConfigurationObject {

    public static final String OVERFLOW_JUSTIFY = "justify";
    public static final String OVERFLOW_NONE = "none";

    /**
     * @see #setClassName(String)
     */
    public abstract String getClassName();

    /**
     * A class name for the data label. Particularly in <a href=
     * "http://www.highcharts.com/docs/chart-design-and-style/style-by-css"
     * >styled mode</a>, this can be used to give each series' or point's data
     * label unique styling. In addition to this option, a default color class
     * name is added so that we can give the labels a <a href=
     * "http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/data-label-contrast/"
     * >contrast text shadow</a>.
     */
    public abstract void setClassName(String className);

    /**
     * @see #setCrop(Boolean)
     */
    public abstract Boolean getCrop();

    /**
     * Whether to hide data labels that are outside the plot area. By default,
     * the data label is moved inside the plot area according to the <a
     * href="#plotOptions.series.dataLabels.overflow">overflow</a> option.
     * <p>
     * Defaults to: true
     */
    public abstract void setCrop(Boolean crop);

    /**
     * @see #setDefer(Boolean)
     */
    public abstract Boolean getDefer();

    /**
     * Whether to defer displaying the data labels until the initial series
     * animation has finished.
     * <p>
     * Defaults to: true
     */
    public abstract void setDefer(Boolean defer);

    /**
     * @see #setEnabled(Boolean)
     */
    public abstract Boolean getEnabled();

    /**
     * Enable or disable the data labels.
     * <p>
     * Defaults to: false
     */
    public abstract void setEnabled(Boolean enabled);

    /**
     * @see #setFormat(String)
     */
    public abstract String getFormat();

    /**
     * A <a href=
     * "http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting"
     * >format string</a> for the data label. Available variables are the same
     * as for <code>formatter</code>.
     * <p>
     * Defaults to: {y}
     */
    public abstract void setFormat(String format);

    public abstract String getFormatter();

    public abstract void setFormatter(String _fn_formatter);

    /**
     * @see #setInside(Boolean)
     */
    public abstract Boolean getInside();

    /**
     * For points with an extent, like columns, whether to align the data label
     * inside the box or to the actual value point. Defaults to
     * <code>false</code> in most cases, <code>true</code> in stacked columns.
     */
    public abstract void setInside(Boolean inside);

    /**
     * @see #setOverflow(String)
     */
    public abstract String getOverflow();

    /**
     * How to handle data labels that flow outside the plot area. The default is
     * <code>justify</code>, which aligns them inside the plot area. For columns
     * and bars, this means it will be moved inside the bar. To display data
     * labels outside the plot area, set <code>crop</code> to <code>false</code>
     * and <code>overflow</code> to <code>"none"</code>.
     * <p>
     * Defaults to: justify
     */
    public abstract void setOverflow(String overflow);

    /**
     * @see #setPadding(Number)
     */
    public abstract Number getPadding();

    /**
     * When either the <code>borderWidth</code> or the
     * <code>backgroundColor</code> is set, this is the padding within the box.
     * <p>
     * Defaults to: 5
     */
    public abstract void setPadding(Number padding);

    /**
     * @see #setRotation(Number)
     */
    public abstract Number getRotation();

    /**
     * Text rotation in degrees. Note that due to a more complex structure,
     * backgrounds, borders and padding will be lost on a rotated data label.
     * <p>
     * Defaults to: 0
     */
    public abstract void setRotation(Number rotation);

    /**
     * @see #setShadow(Boolean)
     */
    public abstract Boolean getShadow();

    /**
     * The shadow of the box. Works best with <code>borderWidth</code> or
     * <code>backgroundColor</code>. Since 2.3 the shadow can be an object
     * configuration containing <code>color</code>, <code>offsetX</code>,
     * <code>offsetY</code>, <code>opacity</code> and <code>width</code>.
     * <p>
     * Defaults to: false
     */
    public abstract void setShadow(Boolean shadow);

    /**
     * @see #setShape(Shape)
     */
    public abstract Shape getShape();

    /**
     * The name of a symbol to use for the border around the label. Symbols are
     * predefined functions on the Renderer object.
     * <p>
     * Defaults to: square
     */
    public abstract void setShape(Shape shape);

    /**
     * @see #setUseHTML(Boolean)
     */
    public abstract Boolean getUseHTML();

    /**
     * Whether to <a href=
     * "http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html"
     * >use HTML</a> to render the labels.
     * <p>
     * Defaults to: false
     */
    public abstract void setUseHTML(Boolean useHTML);

    /**
     * @see #setVerticalAlign(VerticalAlign)
     */
    public abstract VerticalAlign getVerticalAlign();

    /**
     * The vertical alignment of a data label. Can be one of <code>top</code>,
     * <code>middle</code> or <code>bottom</code>. The default value depends on
     * the data, for instance in a column chart, the label is above positive
     * values and below negative values.
     */
    public abstract void setVerticalAlign(VerticalAlign verticalAlign);

    /**
     * @see #setZIndex(Number)
     */
    public abstract Number getZIndex();

    /**
     * The Z index of the data labels. The default Z index puts it above the
     * series. Use a Z index of 2 to display it behind the series.
     * <p>
     * Defaults to: 6
     */
    public abstract void setZIndex(Number zIndex);
}
