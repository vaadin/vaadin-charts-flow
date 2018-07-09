package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A HTML label that can be positioned anywhere in the chart area.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Items extends AbstractConfigurationObject {

	private String html;

	public Items() {
	}

	/**
	 * @see #setHtml(String)
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * Inner HTML or text for the label.
	 */
	public void setHtml(String html) {
		this.html = html;
	}
}
