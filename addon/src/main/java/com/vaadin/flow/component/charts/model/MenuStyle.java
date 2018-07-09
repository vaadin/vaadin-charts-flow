package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * CSS styles for the popup menu appearing by default when the export icon is
 * clicked. This menu is rendered in HTML.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class MenuStyle extends AbstractConfigurationObject {

	private String background;
	private String border;
	private String padding;

	public MenuStyle() {
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}

	public String getPadding() {
		return padding;
	}

	public void setPadding(String padding) {
		this.padding = padding;
	}
}
