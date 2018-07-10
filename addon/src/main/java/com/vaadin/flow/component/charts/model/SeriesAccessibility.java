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
 * Lang configuration for different series types. For more dynamic control over
 * the series element descriptions, see
 * [accessibility.seriesDescriptionFormatter](
 * accessibility.seriesDescriptionFormatter).
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class SeriesAccessibility extends AbstractConfigurationObject {

	private String description;
	private Summary summary;
	private String xAxisDescription;
	private String yAxisDescription;

	public SeriesAccessibility() {
	}

	/**
	 * @see #setDescription(String)
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * User supplied description text. This is added after the main summary if
	 * present.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @see #setSummary(Summary)
	 */
	public Summary getSummary() {
		if (summary == null) {
			summary = new Summary();
		}
		return summary;
	}

	/**
	 * Lang configuration for the series main summary. Each series type has two
	 * modes: 1. This series type is the only series type used in the chart 2.
	 * This is a combination chart with multiple series types If a definition
	 * does not exist for the specific series type and mode, the 'default' lang
	 * definitions are used.
	 */
	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	/**
	 * @see #setXAxisDescription(String)
	 */
	public String getXAxisDescription() {
		return xAxisDescription;
	}

	/**
	 * xAxis description for series if there are multiple xAxes in the chart.
	 */
	public void setXAxisDescription(String xAxisDescription) {
		this.xAxisDescription = xAxisDescription;
	}

	/**
	 * @see #setYAxisDescription(String)
	 */
	public String getYAxisDescription() {
		return yAxisDescription;
	}

	/**
	 * yAxis description for series if there are multiple yAxes in the chart.
	 */
	public void setYAxisDescription(String yAxisDescription) {
		this.yAxisDescription = yAxisDescription;
	}
}
