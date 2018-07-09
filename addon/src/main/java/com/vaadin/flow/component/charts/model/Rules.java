package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A set of rules for responsive settings. The rules are executed from the top
 * down.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Rules extends AbstractConfigurationObject {

	private Configuration chartOptions;
	private Condition condition;

	public Rules() {
	}

	/**
	 * @see #setChartOptions(Configuration)
	 */
	public Configuration getChartOptions() {
		if (chartOptions == null) {
			chartOptions = new Configuration();
		}
		return chartOptions;
	}

	/**
	 * A full set of chart options to apply as overrides to the general chart
	 * options. The chart options are applied when the given rule is active. A
	 * special case is configuration objects that take arrays, for example
	 * [xAxis](#xAxis), [yAxis](#yAxis) or [series](#series). For these
	 * collections, an `id` option is used to map the new option set to an
	 * existing object. If an existing object of the same id is not found, the
	 * item of the same indexupdated. So for example, setting `chartOptions`
	 * with two series items without an `id`, will cause the existing chart's
	 * two series to be updated with respective options.
	 */
	public void setChartOptions(Configuration chartOptions) {
		this.chartOptions = chartOptions;
	}

	/**
	 * @see #setCondition(Condition)
	 */
	public Condition getCondition() {
		if (condition == null) {
			condition = new Condition();
		}
		return condition;
	}

	/**
	 * Under which conditions the rule applies.
	 */
	public void setCondition(Condition condition) {
		this.condition = condition;
	}
}
