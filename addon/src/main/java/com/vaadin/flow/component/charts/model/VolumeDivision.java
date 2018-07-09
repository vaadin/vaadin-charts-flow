package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * The styles for bars when volume is divided into positive/negative.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class VolumeDivision extends AbstractConfigurationObject {

	private Boolean enabled;
	private Styles styles;

	public VolumeDivision() {
	}

	public VolumeDivision(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Option to control if volume is divided.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Styles getStyles() {
		if (styles == null) {
			styles = new Styles();
		}
		return styles;
	}

	public void setStyles(Styles styles) {
		this.styles = styles;
	}
}
