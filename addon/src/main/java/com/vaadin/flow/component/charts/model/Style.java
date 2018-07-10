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
import com.vaadin.flow.component.charts.model.style.Color;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Style extends AbstractConfigurationObject {

	private String backgroundColor;
	private String cursor;
	private String fontFamily;
	private String fontSize;
	private String fontWeight;
	private Number opacity;
	private String position;
	private HorizontalAlign textAlign;
	private String textOutline;
	private String textOverflow;

	public Style() {
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getCursor() {
		return cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
	}

	public String getFontFamily() {
		return fontFamily;
	}

	public void setFontFamily(String fontFamily) {
		this.fontFamily = fontFamily;
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

	public Number getOpacity() {
		return opacity;
	}

	public void setOpacity(Number opacity) {
		this.opacity = opacity;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public HorizontalAlign getTextAlign() {
		return textAlign;
	}

	public void setTextAlign(HorizontalAlign textAlign) {
		this.textAlign = textAlign;
	}

	public String getTextOutline() {
		return textOutline;
	}

	public void setTextOutline(String textOutline) {
		this.textOutline = textOutline;
	}

	public String getTextOverflow() {
		return textOverflow;
	}

	public void setTextOverflow(String textOverflow) {
		this.textOverflow = textOverflow;
	}
}
