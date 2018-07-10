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
 * Options for configuring accessibility for the chart. Requires the
 * [accessibility module](//code.highcharts.com/modules/accessibility. js) to be
 * loaded. For a description of the module and information on its features, see
 * [Highcharts Accessibility](http://www.highcharts.
 * com/docs/chart-concepts/accessibility).
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Accessibility extends AbstractConfigurationObject {

	private Boolean describeSingleSeries;
	private Boolean enabled;
	private KeyboardNavigation keyboardNavigation;
	private String _fn_onTableAnchorClick;
	private String pointDateFormat;
	private String _fn_pointDateFormatter;
	private String _fn_pointDescriptionFormatter;
	private Number pointDescriptionThreshold;
	private String _fn_screenReaderSectionFormatter;
	private String _fn_seriesDescriptionFormatter;

	public Accessibility() {
	}

	public Accessibility(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setDescribeSingleSeries(Boolean)
	 */
	public Boolean getDescribeSingleSeries() {
		return describeSingleSeries;
	}

	/**
	 * Whether or not to add series descriptions to charts with a single series.
	 */
	public void setDescribeSingleSeries(Boolean describeSingleSeries) {
		this.describeSingleSeries = describeSingleSeries;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable accessibility features for the chart.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setKeyboardNavigation(KeyboardNavigation)
	 */
	public KeyboardNavigation getKeyboardNavigation() {
		if (keyboardNavigation == null) {
			keyboardNavigation = new KeyboardNavigation();
		}
		return keyboardNavigation;
	}

	/**
	 * Options for keyboard navigation.
	 */
	public void setKeyboardNavigation(KeyboardNavigation keyboardNavigation) {
		this.keyboardNavigation = keyboardNavigation;
	}

	/**
	 * @see #set_fn_onTableAnchorClick(String)
	 */
	public String getOnTableAnchorClick() {
		return _fn_onTableAnchorClick;
	}

	/**
	 * Function to run upon clicking the "View as Data Table" link in the screen
	 * reader region. By default Highcharts will insert and set focus to a data
	 * table representation of the chart.
	 */
	public void setOnTableAnchorClick(String _fn_onTableAnchorClick) {
		this._fn_onTableAnchorClick = _fn_onTableAnchorClick;
	}

	/**
	 * @see #setPointDateFormat(String)
	 */
	public String getPointDateFormat() {
		return pointDateFormat;
	}

	/**
	 * Date format to use for points on datetime axes when describing them to
	 * screen reader users. Defaults to the same format as in tooltip. For an
	 * overview of the replacement codes, see
	 * [dateFormat](#Highcharts.dateFormat).
	 */
	public void setPointDateFormat(String pointDateFormat) {
		this.pointDateFormat = pointDateFormat;
	}

	/**
	 * @see #set_fn_pointDateFormatter(String)
	 */
	public String getPointDateFormatter() {
		return _fn_pointDateFormatter;
	}

	/**
	 * Formatter function to determine the date/time format used with points on
	 * datetime axes when describing them to screen reader users. Receives one
	 * argument, `point`, referring to the point to describe. Should return a
	 * date format string compatible with [dateFormat](#Highcharts.dateFormat).
	 */
	public void setPointDateFormatter(String _fn_pointDateFormatter) {
		this._fn_pointDateFormatter = _fn_pointDateFormatter;
	}

	/**
	 * @see #set_fn_pointDescriptionFormatter(String)
	 */
	public String getPointDescriptionFormatter() {
		return _fn_pointDescriptionFormatter;
	}

	/**
	 * Formatter function to use instead of the default for point descriptions.
	 * Receives one argument, `point`, referring to the point to describe.
	 * Should return a String with the description of the point for a screen
	 * reader user.
	 */
	public void setPointDescriptionFormatter(
			String _fn_pointDescriptionFormatter) {
		this._fn_pointDescriptionFormatter = _fn_pointDescriptionFormatter;
	}

	/**
	 * @see #setPointDescriptionThreshold(Number)
	 */
	public Number getPointDescriptionThreshold() {
		return pointDescriptionThreshold;
	}

	/**
	 * When a series contains more points than this, we no longer expose
	 * information about individual points to screen readers. Set to `false` to
	 * disable.
	 */
	public void setPointDescriptionThreshold(Number pointDescriptionThreshold) {
		this.pointDescriptionThreshold = pointDescriptionThreshold;
	}

	/**
	 * @see #set_fn_screenReaderSectionFormatter(String)
	 */
	public String getScreenReaderSectionFormatter() {
		return _fn_screenReaderSectionFormatter;
	}

	/**
	 * A formatter function to create the HTML contents of the hidden screen
	 * reader information region. Receives one argument, `chart`, referring to
	 * the chart object. Should return a String with the HTML content of the
	 * region. The link to view the chart as a data table will be added
	 * automatically after the custom HTML content.
	 */
	public void setScreenReaderSectionFormatter(
			String _fn_screenReaderSectionFormatter) {
		this._fn_screenReaderSectionFormatter = _fn_screenReaderSectionFormatter;
	}

	/**
	 * @see #set_fn_seriesDescriptionFormatter(String)
	 */
	public String getSeriesDescriptionFormatter() {
		return _fn_seriesDescriptionFormatter;
	}

	/**
	 * Formatter function to use instead of the default for series descriptions.
	 * Receives one argument, `series`, referring to the series to describe.
	 * Should return a String with the description of the series for a screen
	 * reader user.
	 */
	public void setSeriesDescriptionFormatter(
			String _fn_seriesDescriptionFormatter) {
		this._fn_seriesDescriptionFormatter = _fn_seriesDescriptionFormatter;
	}
}
