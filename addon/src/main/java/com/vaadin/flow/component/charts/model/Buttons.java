package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Options for the export related buttons, print and export. In addition to the
 * default buttons listed here, custom buttons can be added. See
 * [navigation.buttonOptions](#navigation.buttonOptions) for general options.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Buttons extends AbstractConfigurationObject {

	private ContextButton contextButton;

	public Buttons() {
	}

	/**
	 * @see #setContextButton(ContextButton)
	 */
	public ContextButton getContextButton() {
		if (contextButton == null) {
			contextButton = new ContextButton();
		}
		return contextButton;
	}

	/**
	 * Options for the export button. In styled mode, export button styles can
	 * be applied with the `.highcharts-contextbutton` class.
	 */
	public void setContextButton(ContextButton contextButton) {
		this.contextButton = contextButton;
	}
}
