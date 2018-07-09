package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * The normal state of a single point marker. Currently only used for setting
 * animation when returning to normal state from hover.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Normal extends AbstractConfigurationObject {

	private Boolean animation;

	public Normal() {
	}

	/**
	 * @see #setAnimation(Boolean)
	 */
	public Boolean getAnimation() {
		return animation;
	}

	/**
	 * Animation when returning to normal state after hovering.
	 */
	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}
}
