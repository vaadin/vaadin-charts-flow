package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Bottom line options.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class BottomLine extends AbstractConfigurationObject {

	private Styles styles;

	public BottomLine() {
	}

	/**
	 * @see #setStyles(Styles)
	 */
	public Styles getStyles() {
		if (styles == null) {
			styles = new Styles();
		}
		return styles;
	}

	/**
	 * Styles for a bottom line.
	 */
	public void setStyles(Styles styles) {
		this.styles = styles;
	}
}
