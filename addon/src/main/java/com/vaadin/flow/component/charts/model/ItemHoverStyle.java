package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * CSS styles for each legend item in hover mode. Only a subset of CSS is
 * supported, notably those options related to text. Properties are inherited
 * from `style` unless overridden here.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ItemHoverStyle extends AbstractConfigurationObject {

	private String color;

	public ItemHoverStyle() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
