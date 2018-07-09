package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Options for drill down, the concept of inspecting increasingly high
 * resolution data through clicking on chart items like columns or pie slices.
 * The drilldown feature requires the drilldown.js file to be loaded, found in
 * the modules directory of the download package, or online at
 * (code.highcharts.com/modules/drilldown.js)[code.highcharts.com/modules/
 * drilldown.js].
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Drilldown extends AbstractConfigurationObject {

	private Boolean allowPointDrilldown;
	private Boolean animation;
	private DrillUpButton drillUpButton;
	private ArrayList<Series> series;
	@JsonIgnore
	private Configuration configuration;

	public Drilldown() {
	}

	/**
	 * @see #setAllowPointDrilldown(Boolean)
	 */
	public Boolean getAllowPointDrilldown() {
		return allowPointDrilldown;
	}

	/**
	 * When this option is false, clicking a single point will drill down all
	 * points in the same category, equivalent to clicking the X axis label.
	 */
	public void setAllowPointDrilldown(Boolean allowPointDrilldown) {
		this.allowPointDrilldown = allowPointDrilldown;
	}

	/**
	 * @see #setAnimation(Boolean)
	 */
	public Boolean getAnimation() {
		return animation;
	}

	/**
	 * Set the animation for all drilldown animations. Animation of a drilldown
	 * occurs when drilling between a column point and a column series, or a pie
	 * slice and a full pie series. Drilldown can still be used between series
	 * and points of different types, but animation will not occur. The
	 * animation can either be set as a boolean or a configuration object. If
	 * `true`, it will use the 'swing' jQuery easing and a duration of 500 ms.
	 * If used as a configuration object, the following properties are
	 * supported:
	 * <dl>
	 * <dt>duration</dt>
	 * <dd>The duration of the animation in milliseconds.</dd>
	 * <dt>easing</dt>
	 * <dd>A string reference to an easing function set on the `Math` object.
	 * See [the easing
	 * demo](http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts
	 * /tree/master/samples/highcharts/plotoptions/series- animation-easing/).</dd>
	 * </dl>
	 */
	public void setAnimation(Boolean animation) {
		this.animation = animation;
	}

	/**
	 * @see #setDrillUpButton(DrillUpButton)
	 */
	public DrillUpButton getDrillUpButton() {
		if (drillUpButton == null) {
			drillUpButton = new DrillUpButton();
		}
		return drillUpButton;
	}

	/**
	 * Options for the drill up button that appears when drilling down on a
	 * series. The text for the button is defined in
	 * [lang.drillUpText](#lang.drillUpText).
	 */
	public void setDrillUpButton(DrillUpButton drillUpButton) {
		this.drillUpButton = drillUpButton;
	}

	/**
	 * @see #setSeries(ArrayList)
	 */
	public ArrayList<Series> getSeries() {
		if (series == null) {
			series = new ArrayList<Series>();
		}
		return series;
	}

	/**
	 * An array of series configurations for the drill down. Each series
	 * configuration uses the same syntax as the [series](#series) option set.
	 * These drilldown series are hidden by default. The drilldown series is
	 * linked to the parent series' point by its `id`.
	 */
	public void setSeries(ArrayList<Series> series) {
		this.series = series;
	}

	/**
	 * @return the {@link Configuration} that this series is linked to.
	 * @see #setConfiguration(Configuration)
	 */
	@JsonIgnoreProperties
	public Configuration getConfiguration() {
		return configuration;
	}

	/**
	 * Sets the configuration linked to the drilldown series.
	 */
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}

	public void setSeries(Series... series) {
		this.series = new ArrayList<Series>(Arrays.asList(series));
	}

	public void addSeries(Series series) {
		if (this.series == null) {
			this.series = new ArrayList<Series>();
		}
		this.series.add(series);
	}

	public void removeSeries(Series series) {
		this.series.remove(series);
	}
}
