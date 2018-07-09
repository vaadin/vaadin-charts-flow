package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Options for the pivot or the center point of the gauge. In styled mode, the
 * pivot is styled with the `.highcharts-gauge-series .highcharts-pivot` rule.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Pivot extends AbstractConfigurationObject {

	private Number radius;

	public Pivot() {
	}

	/**
	 * @see #setRadius(Number)
	 */
	public Number getRadius() {
		return radius;
	}

	/**
	 * The pixel radius of the pivot.
	 */
	public void setRadius(Number radius) {
		this.radius = radius;
	}
}
