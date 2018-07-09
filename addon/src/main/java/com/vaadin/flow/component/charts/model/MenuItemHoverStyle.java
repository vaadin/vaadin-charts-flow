package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * CSS styles for the hover state of the individual items within the popup menu
 * appearing by default when the export icon is clicked. The menu items are
 * rendered in HTML.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class MenuItemHoverStyle extends AbstractConfigurationObject {

	private String background;
	private String color;

	public MenuItemHoverStyle() {
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
