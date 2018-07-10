package com.vaadin.flow.component.charts.model;

/*-
 * #%L
 * Vaadin Charts for Flow
 * %%
 * Copyright (C) 2014 - 2018 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import javax.annotation.Generated;

/**
 * Options for the Boost module. The Boost module allows certain series types to
 * be rendered by WebGL instead of the default SVG. This allows hundreds of
 * thousands of data points to be rendered in milliseconds. In addition to the
 * WebGL rendering it saves time by skipping processing and inspection of the
 * data wherever possible. This introduces some limitations to what features are
 * available in Boost mode. See [the docs](
 * https://www.highcharts.com/docs/advanced-chart-features/boost-module) for
 * details. In addition to the global `boost` option, each series has a
 * [boostThreshold](#plotOptions.series.boostThreshold) that defines when the
 * boost should kick in. Requires the `modules/boost.js` module.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Boost extends AbstractConfigurationObject {

	private Boolean allowForce;
	private Debug debug;
	private Boolean enabled;
	private Number seriesThreshold;
	private Boolean useGPUTranslations;

	public Boost() {
	}

	public Boost(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setAllowForce(Boolean)
	 */
	public Boolean getAllowForce() {
		return allowForce;
	}

	/**
	 * If set to true, the whole chart will be boosted if one of the series
	 * crosses its threshold, and all the series can be boosted.
	 */
	public void setAllowForce(Boolean allowForce) {
		this.allowForce = allowForce;
	}

	/**
	 * @see #setDebug(Debug)
	 */
	public Debug getDebug() {
		if (debug == null) {
			debug = new Debug();
		}
		return debug;
	}

	/**
	 * Debugging options for boost. Useful for benchmarking, and general timing.
	 */
	public void setDebug(Debug debug) {
		this.debug = debug;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable boost on a chart.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setSeriesThreshold(Number)
	 */
	public Number getSeriesThreshold() {
		return seriesThreshold;
	}

	/**
	 * Set the series threshold for when the boost should kick in globally.
	 * Setting to e.g. 20 will cause the whole chart to enter boost mode if
	 * there are 20 or more series active. When the chart is in boost mode,
	 * every series in it will be rendered to a common canvas. This offers a
	 * significant speed improvment in charts with a very high amount of series.
	 */
	public void setSeriesThreshold(Number seriesThreshold) {
		this.seriesThreshold = seriesThreshold;
	}

	/**
	 * @see #setUseGPUTranslations(Boolean)
	 */
	public Boolean getUseGPUTranslations() {
		return useGPUTranslations;
	}

	/**
	 * Enable or disable GPU translations. GPU translations are faster than
	 * doing the translation in JavaScript. This option may cause rendering
	 * issues with certain datasets. Namely, if your dataset has large numbers
	 * with small increments (such as timestamps), it won't work correctly. This
	 * is due to floating point precission.
	 */
	public void setUseGPUTranslations(Boolean useGPUTranslations) {
		this.useGPUTranslations = useGPUTranslations;
	}
}
