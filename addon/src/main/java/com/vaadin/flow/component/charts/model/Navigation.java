package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A collection of options for buttons and menus appearing in the exporting
 * module.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Navigation extends AbstractConfigurationObject {

	private ButtonOptions buttonOptions;

	public Navigation() {
	}

	/**
	 * @see #setButtonOptions(ButtonOptions)
	 */
	public ButtonOptions getButtonOptions() {
		if (buttonOptions == null) {
			buttonOptions = new ButtonOptions();
		}
		return buttonOptions;
	}

	/**
	 * A collection of options for buttons appearing in the exporting module.
	 * 
	 * In styled mode, the buttons are styled with the
	 * `.highcharts-contextbutton` and `.highcharts-button-symbol` classes.
	 */
	public void setButtonOptions(ButtonOptions buttonOptions) {
		this.buttonOptions = buttonOptions;
	}
}
