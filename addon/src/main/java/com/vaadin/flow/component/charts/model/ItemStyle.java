package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * CSS styles for each legend item. Only a subset of CSS is supported, notably
 * those options related to text. The default `textOverflow` property makes long
 * texts truncate. Set it to `null` to wrap text instead. A `width` property can
 * be added to control the text width.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ItemStyle extends AbstractConfigurationObject {

	private String color;
	private String fontSize;
	private String fontWeight;
	private String textOverflow;

	public ItemStyle() {
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFontSize() {
		return fontSize;
	}

	public void setFontSize(String fontSize) {
		this.fontSize = fontSize;
	}

	public String getFontWeight() {
		return fontWeight;
	}

	public void setFontWeight(String fontWeight) {
		this.fontWeight = fontWeight;
	}

	public String getTextOverflow() {
		return textOverflow;
	}

	public void setTextOverflow(String textOverflow) {
		this.textOverflow = textOverflow;
	}
}
