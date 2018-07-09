package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Zones extends AbstractConfigurationObject {

	private String className;
	private Number value;

	public Zones() {
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * Styled mode only. A custom class name for the zone.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setValue(Number)
	 */
	public Number getValue() {
		return value;
	}

	/**
	 * The value up to where the zone extends, if undefined the zones stretches
	 * to the last value in the series.
	 */
	public void setValue(Number value) {
		this.value = value;
	}
}
