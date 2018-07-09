package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Global extends AbstractConfigurationObject {

	private String VMLRadialGradientURL;
	private String timezone;
	private Number timezoneOffset;
	private Boolean useUTC;

	public Global() {
	}

	/**
	 * @see #setVMLRadialGradientURL(String)
	 */
	public String getVMLRadialGradientURL() {
		return VMLRadialGradientURL;
	}

	/**
	 * Path to the pattern image required by VML browsers in order to draw
	 * radial gradients.
	 */
	public void setVMLRadialGradientURL(String VMLRadialGradientURL) {
		this.VMLRadialGradientURL = VMLRadialGradientURL;
	}

	/**
	 * @see #setTimezone(String)
	 */
	public String getTimezone() {
		return timezone;
	}

	/**
	 * This option is deprecated since v6.0.5. Instead, use
	 * [time.timezone](#time.timezone) that supports individual time settings
	 * per chart.
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/**
	 * @see #setTimezoneOffset(Number)
	 */
	public Number getTimezoneOffset() {
		return timezoneOffset;
	}

	/**
	 * This option is deprecated since v6.0.5. Instead, use
	 * [time.timezoneOffset](#time.timezoneOffset) that supports individual time
	 * settings per chart.
	 */
	public void setTimezoneOffset(Number timezoneOffset) {
		this.timezoneOffset = timezoneOffset;
	}

	/**
	 * @see #setUseUTC(Boolean)
	 */
	public Boolean getUseUTC() {
		return useUTC;
	}

	/**
	 * This option is deprecated since v6.0.5. Instead, use
	 * [time.useUTC](#time.useUTC) that supports individual time settings per
	 * chart.
	 */
	public void setUseUTC(Boolean useUTC) {
		this.useUTC = useUTC;
	}
}
