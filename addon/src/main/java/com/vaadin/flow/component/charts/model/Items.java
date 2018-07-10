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
