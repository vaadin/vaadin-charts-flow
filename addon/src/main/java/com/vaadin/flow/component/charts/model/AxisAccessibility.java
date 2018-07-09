package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Axis description format strings.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class AxisAccessibility extends AbstractConfigurationObject {

	private String xAxisDescriptionPlural;
	private String xAxisDescriptionSingular;
	private String yAxisDescriptionPlural;
	private String yAxisDescriptionSingular;

	public AxisAccessibility() {
	}

	public String getXAxisDescriptionPlural() {
		return xAxisDescriptionPlural;
	}

	public void setXAxisDescriptionPlural(String xAxisDescriptionPlural) {
		this.xAxisDescriptionPlural = xAxisDescriptionPlural;
	}

	public String getXAxisDescriptionSingular() {
		return xAxisDescriptionSingular;
	}

	public void setXAxisDescriptionSingular(String xAxisDescriptionSingular) {
		this.xAxisDescriptionSingular = xAxisDescriptionSingular;
	}

	public String getYAxisDescriptionPlural() {
		return yAxisDescriptionPlural;
	}

	public void setYAxisDescriptionPlural(String yAxisDescriptionPlural) {
		this.yAxisDescriptionPlural = yAxisDescriptionPlural;
	}

	public String getYAxisDescriptionSingular() {
		return yAxisDescriptionSingular;
	}

	public void setYAxisDescriptionSingular(String yAxisDescriptionSingular) {
		this.yAxisDescriptionSingular = yAxisDescriptionSingular;
	}
}
