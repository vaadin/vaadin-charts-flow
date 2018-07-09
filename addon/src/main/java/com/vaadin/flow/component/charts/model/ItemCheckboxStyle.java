package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Default styling for the checkbox next to a legend item when `showCheckbox` is
 * true.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ItemCheckboxStyle extends AbstractConfigurationObject {

	private String height;
	private String position;
	private String width;

	public ItemCheckboxStyle() {
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}
}
