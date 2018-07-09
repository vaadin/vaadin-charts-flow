package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A 3D scatter plot uses x, y and z coordinates to display values for three
 * variables for a set of data.
 * 
 * Configuration options for the series are given in three levels: 1. Options
 * for all series in a chart are defined in the
 * [plotOptions.series](plotOptions.series) object. 2. Options for all
 * `scatter3d` series are defined in
 * [plotOptions.scatter3d](plotOptions.scatter3d). 3. Options for one single
 * series are given in [the series instance array](series.scatter3d).
 * 
 * <pre>
 * Highcharts.chart('container', {
 *     plotOptions: {
 *         series: {
 *             // general options for all series
 *         },
 *         scatter3d: {
 *             // shared options for all scatter3d series
 *         }
 *     },
 *     series: [{
 *         // specific options for this series instance
 *         type: 'scatter3d'
 *     }]
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class PlotOptions3DScatter extends PlotOptionsScatter {

	private SeriesTooltip tooltip;

	public PlotOptions3DScatter() {
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
}
