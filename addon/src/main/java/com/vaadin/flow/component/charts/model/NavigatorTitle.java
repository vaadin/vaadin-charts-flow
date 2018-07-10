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
 * Titles for yAxes are taken from [xAxis.categories](#xAxis.categories). All
 * options for `xAxis.labels` applies to parallel coordinates titles. For
 * example, to style categories, use [xAxis.labels.style](#xAxis.labels.style).
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class NavigatorTitle extends AbstractConfigurationObject {

	private Boolean reserveSpace;
	private String text;

	public NavigatorTitle() {
	}

	public NavigatorTitle(String text) {
		this.text = text;
	}

	public Boolean getReserveSpace() {
		return reserveSpace;
	}

	public void setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
