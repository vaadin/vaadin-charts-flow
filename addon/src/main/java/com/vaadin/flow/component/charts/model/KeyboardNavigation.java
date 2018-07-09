package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Options for keyboard navigation.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class KeyboardNavigation extends AbstractConfigurationObject {

	private Boolean enabled;
	private FocusBorder focusBorder;
	private KeyboardNavigationMode mode;
	private Boolean skipNullPoints;

	public KeyboardNavigation() {
	}

	public KeyboardNavigation(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable keyboard navigation for the chart.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setFocusBorder(FocusBorder)
	 */
	public FocusBorder getFocusBorder() {
		if (focusBorder == null) {
			focusBorder = new FocusBorder();
		}
		return focusBorder;
	}

	/**
	 * Options for the focus border drawn around elements while navigating
	 * through them.
	 */
	public void setFocusBorder(FocusBorder focusBorder) {
		this.focusBorder = focusBorder;
	}

	/**
	 * @see #setMode(KeyboardNavigationMode)
	 */
	public KeyboardNavigationMode getMode() {
		return mode;
	}

	/**
	 * Set the keyboard navigation mode for the chart. Can be "normal" or
	 * "serialize". In normal mode, left/right arrow keys move between points in
	 * a series, while up/down arrow keys move between series. Up/down
	 * navigation acts intelligently to figure out which series makes sense to
	 * move to from any given point. In "serialize" mode, points are instead
	 * navigated as a single list. Left/right behaves as in "normal" mode.
	 * Up/down arrow keys will behave like left/right. This is useful for
	 * unifying navigation behavior with/without screen readers enabled.
	 */
	public void setMode(KeyboardNavigationMode mode) {
		this.mode = mode;
	}

	/**
	 * @see #setSkipNullPoints(Boolean)
	 */
	public Boolean getSkipNullPoints() {
		return skipNullPoints;
	}

	/**
	 * Skip null points when navigating through points with the keyboard.
	 */
	public void setSkipNullPoints(Boolean skipNullPoints) {
		this.skipNullPoints = skipNullPoints;
	}
}
