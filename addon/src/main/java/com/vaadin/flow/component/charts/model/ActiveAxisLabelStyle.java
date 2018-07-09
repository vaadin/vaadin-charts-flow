package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Additional styles to apply to the X axis label for a point that has drilldown
 * data. By default it is underlined and blue to invite to interaction.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ActiveAxisLabelStyle extends AbstractConfigurationObject {

	private String color;
	private String cursor;
	private String fontWeight;
	private String textDecoration;

	public ActiveAxisLabelStyle() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getFontWeight() {
		return fontWeight;
	}

	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
	}

	public String getTextDecoration() {
		return textDecoration;
	}

	public void setTextDecoration(String textDecoration) {
		this.textDecoration = textDecoration;
	}
}
