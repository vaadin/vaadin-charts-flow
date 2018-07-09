package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * The styles for lines which determine price zones.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ZoneLines extends AbstractConfigurationObject {

	private Boolean enabled;
	private Styles styles;

	public ZoneLines() {
	}

	public ZoneLines(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable/disable zone lines.
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
