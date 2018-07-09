package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Enable or disable the initial animation when a series is displayed. The
 * animation can also be set as a configuration object. Please note that this
 * option only applies to the initial animation of the series itself. For other
 * animations, see [chart.animation]( #chart.animation) and the animation
 * parameter under the API methods. The following properties are supported:
 * <dl>
 * <dt>duration</dt>
 * <dd>The duration of the animation in milliseconds.</dd>
 * <dt>easing</dt>
 * <dd>A string reference to an easing function set on the `Math` object. See
 * the _Custom easing function_ demo below.</dd>
 * </dl>
 * Due to poor performance, animation is disabled in old IE browsers for several
 * chart types.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Animation extends AbstractConfigurationObject {

	private Number duration;

	public Animation() {
	}

	public Number getDuration() {
		return duration;
	}

	public void setDuration(Number duration) {
		this.duration = duration;
	}
}
