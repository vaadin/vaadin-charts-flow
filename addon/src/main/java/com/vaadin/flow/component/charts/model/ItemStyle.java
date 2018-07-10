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
