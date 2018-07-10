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
