package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * The styles for Senkou Span A line
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class SenkouSpanA extends AbstractConfigurationObject {

	private Styles styles;

	public SenkouSpanA() {
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
