package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Options for the focus border drawn around elements while navigating through
 * them.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class FocusBorder extends AbstractConfigurationObject {

	private Boolean enabled;
	private Boolean hideBrowserFocusOutline;
	private Number margin;

	public FocusBorder() {
	}

	public FocusBorder(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable/disable focus border for chart.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setHideBrowserFocusOutline(Boolean)
	 */
	public Boolean getHideBrowserFocusOutline() {
		return hideBrowserFocusOutline;
	}

	/**
	 * Hide the browser's default focus indicator.
	 */
	public void setHideBrowserFocusOutline(Boolean hideBrowserFocusOutline) {
		this.hideBrowserFocusOutline = hideBrowserFocusOutline;
	}

	/**
	 * @see #setMargin(Number)
	 */
	public Number getMargin() {
		return margin;
	}

	/**
	 * Focus border margin around the elements.
	 */
	public void setMargin(Number margin) {
		this.margin = margin;
	}
}
