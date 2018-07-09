package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Error bars are a graphical representation of the variability of data and are
 * used on graphs to indicate the error, or uncertainty in a reported
 * measurement.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all
 * `errorbar` series are defined in
 * [plotOptions.errorbar](plotOptions.errorbar). 3. Options for one single
 * series are given in [the series instance array](series.errorbar).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         errorbar: {
 *             // shared options for all errorbar series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'errorbar'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptionsErrorBars extends PlotOptionsBoxPlot {

	private Boolean grouping;
	private Number linkedTo;
	private SeriesTooltip tooltip;
	private Number whiskerWidth;

	public PlotOptionsErrorBars() {
	}

	public Boolean getGrouping() {
		return grouping;
	}

	public void setGrouping(Boolean grouping) {
		this.grouping = grouping;
	}

	/**
	 * @see #setLinkedTo(Number)
	 */
	public Number getLinkedTo() {
		return linkedTo;
	}

	/**
	 * The parent series of the error bar. The default value links it to the
	 * previous series. Otherwise, use the id of the parent series.
	 */
	public void setLinkedTo(Number linkedTo) {
		this.linkedTo = linkedTo;
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
	 * @see #setWhiskerWidth(Number)
	 */
	public Number getWhiskerWidth() {
		return whiskerWidth;
	}

	/**
	 * The line width of the whiskers, the horizontal lines marking low and high
	 * values. When `null`, the general
	 * [lineWidth](#plotOptions.errorbar.lineWidth) applies.
	 */
	public void setWhiskerWidth(Number whiskerWidth) {
		this.whiskerWidth = whiskerWidth;
	}
}
