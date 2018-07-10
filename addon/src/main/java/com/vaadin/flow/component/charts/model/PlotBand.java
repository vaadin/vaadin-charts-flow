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
import java.time.Instant;
import com.vaadin.flow.component.charts.util.Util;

/**
 * An array of objects defining plot bands on the Y axis.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotBand extends AbstractConfigurationObject {

	private String className;
	private Number from;
	private String id;
	private String innerRadius;
	private PlotBandLabel label;
	private String outerRadius;
	private String thickness;
	private Number to;
	private Number zIndex;

	public PlotBand() {
	}

	public PlotBand(Number from, Number to) {
		this.from = from;
		this.to = to;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A custom class name, in addition to the default `highcharts-plot-band`,
	 * to apply to each individual band.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setFrom(Number)
	 */
	public Number getFrom() {
		return from;
	}

	/**
	 * The start position of the plot band in axis units.
	 */
	public void setFrom(Number from) {
		this.from = from;
	}

	/**
	 * @see #setId(String)
	 */
	public String getId() {
		return id;
	}

	/**
	 * An id used for identifying the plot band in Axis.removePlotBand.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @see #setInnerRadius(String)
	 */
	public String getInnerRadius() {
		return innerRadius;
	}

	/**
	 * In a gauge chart, this option determines the inner radius of the plot
	 * band that stretches along the perimeter. It can be given as a percentage
	 * string, like `"100%"`, or as a pixel number, like `100`. By default, the
	 * inner radius is controlled by the [thickness](
	 * #yAxis.plotBands.thickness) option.
	 */
	public void setInnerRadius(String innerRadius) {
		this.innerRadius = innerRadius;
	}

	/**
	 * @see #setLabel(PlotBandLabel)
	 */
	public PlotBandLabel getLabel() {
		if (label == null) {
			label = new PlotBandLabel();
		}
		return label;
	}

	/**
	 * Text labels for the plot bands
	 */
	public void setLabel(PlotBandLabel label) {
		this.label = label;
	}

	/**
	 * @see #setOuterRadius(String)
	 */
	public String getOuterRadius() {
		return outerRadius;
	}

	/**
	 * In a gauge chart, this option determines the outer radius of the plot
	 * band that stretches along the perimeter. It can be given as a percentage
	 * string, like `"100%"`, or as a pixel number, like `100`.
	 */
	public void setOuterRadius(String outerRadius) {
		this.outerRadius = outerRadius;
	}

	/**
	 * @see #setThickness(String)
	 */
	public String getThickness() {
		return thickness;
	}

	/**
	 * In a gauge chart, this option sets the width of the plot band stretching
	 * along the perimeter. It can be given as a percentage string, like
	 * `"10%"`, or as a pixel number, like `10`. The default value 10 is the
	 * same as the default [tickLength](#yAxis.tickLength), thus making the plot
	 * band act as a background for the tick markers.
	 */
	public void setThickness(String thickness) {
		this.thickness = thickness;
	}

	/**
	 * @see #setTo(Number)
	 */
	public Number getTo() {
		return to;
	}

	/**
	 * The end position of the plot band in axis units.
	 */
	public void setTo(Number to) {
		this.to = to;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The z index of the plot band within the chart, relative to other
	 * elements. Using the same z index as another element may give
	 * unpredictable results, as the last rendered element will be on top.
	 * Values from 0 to 20 make sense.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}

	/**
	 * @see #setFrom(Number)
	 */
	public void setFrom(Instant instant) {
		this.from = Util.toHighchartsTS(instant);
	}

	/**
	 * @see #setTo(Number)
	 */
	public void setTo(Instant instant) {
		this.to = Util.toHighchartsTS(instant);
	}
}
