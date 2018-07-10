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
 * CSS styles for the individual items within the popup menu appearing by
 * default when the export icon is clicked. The menu items are rendered in HTML.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class MenuItemStyle extends AbstractConfigurationObject {

	private String background;
	private String color;
	private String fontSize;
	private String padding;
	private String transition;

	public MenuItemStyle() {
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

	/**
	 * @see #setFontSize(String)
	 */
	public String getFontSize() {
		return fontSize;
	}

	/**
	 * Defaults to `14px` on touch devices and `11px` on desktop.
	 */
	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}

	public String getPadding() {
		return padding;
	}

	public void setPadding(String padding) {
		this.padding = padding;
	}

	public String getTransition() {
		return transition;
	}

	public void setTransition(String transition) {
		this.transition = transition;
	}
}
