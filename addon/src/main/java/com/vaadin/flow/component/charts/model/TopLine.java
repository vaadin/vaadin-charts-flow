package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Top line options.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class TopLine extends BottomLine {

	private Styles styles;

	public TopLine() {
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
