package com.vaadin.flow.component.charts.model;

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
