package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.ArrayList;

/**
 * Allows setting a set of rules to apply for different screen or chart sizes.
 * Each rule specifies additional chart options.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Responsive extends AbstractConfigurationObject {

	private ArrayList<Rules> rules;

	public Responsive() {
	}

	/**
	 * @see #setRules(ArrayList)
	 */
	public ArrayList<Rules> getRules() {
		if (rules == null) {
			rules = new ArrayList<Rules>();
		}
		return rules;
	}

	/**
	 * A set of rules for responsive settings. The rules are executed from the
	 * top down.
	 */
	public void setRules(ArrayList<Rules> rules) {
		this.rules = rules;
	}
}
