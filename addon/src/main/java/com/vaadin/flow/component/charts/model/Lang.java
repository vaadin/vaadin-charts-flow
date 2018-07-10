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
import java.util.ArrayList;

/**
 * Language object. The language object is global and it can't be set on each
 * chart initiation. Instead, use `Highcharts.setOptions` to set it before any
 * chart is initialized.
 * 
 * <pre>
 * Highcharts.setOptions({
 *     lang: {
 *         months: [
 *             'Janvier', 'Février', 'Mars', 'Avril',
 *             'Mai', 'Juin', 'Juillet', 'Août',
 *             'Septembre', 'Octobre', 'Novembre', 'Décembre'
 *         ],
 *         weekdays: [
 *             'Dimanche', 'Lundi', 'Mardi', 'Mercredi',
 *             'Jeudi', 'Vendredi', 'Samedi'
 *         ]
 *     }
 * });
 * </pre>
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Lang extends AbstractConfigurationObject {

	private LangAccessibility accessibility;
	private String contextButtonTitle;
	private String decimalPoint;
	private String downloadCSV;
	private String downloadJPEG;
	private String downloadPDF;
	private String downloadPNG;
	private String downloadSVG;
	private String downloadXLS;
	private String drillUpText;
	private String invalidDate;
	private String loading;
	private ArrayList<String> months;
	private String noData;
	private Number numericSymbolMagnitude;
	private ArrayList<String> numericSymbols;
	private String openInCloud;
	private String printChart;
	private String rangeSelectorFrom;
	private String rangeSelectorTo;
	private String rangeSelectorZoom;
	private String resetZoom;
	private String resetZoomTitle;
	private ArrayList<String> shortMonths;
	private ArrayList<String> shortWeekdays;
	private String thousandsSep;
	private String viewData;
	private ArrayList<String> weekdays;

	public Lang() {
	}

	/**
	 * @see #setAccessibility(LangAccessibility)
	 */
	public LangAccessibility getAccessibility() {
		if (accessibility == null) {
			accessibility = new LangAccessibility();
		}
		return accessibility;
	}

	/**
	 * Configure the accessibility strings in the chart. Requires the
	 * [accessibility module](//code.highcharts.com/modules/accessibility. js)
	 * to be loaded. For a description of the module and information on its
	 * features, see [Highcharts Accessibility](http://www.highcharts.
	 * com/docs/chart-concepts/accessibility). For more dynamic control over the
	 * accessibility functionality, see
	 * [accessibility.pointDescriptionFormatter](
	 * accessibility.pointDescriptionFormatter),
	 * [accessibility.seriesDescriptionFormatter](
	 * accessibility.seriesDescriptionFormatter), and
	 * [accessibility.screenReaderSectionFormatter](
	 * accessibility.screenReaderSectionFormatter).
	 */
	public void setAccessibility(LangAccessibility accessibility) {
		this.accessibility = accessibility;
	}

	/**
	 * @see #setContextButtonTitle(String)
	 */
	public String getContextButtonTitle() {
		return contextButtonTitle;
	}

	/**
	 * Exporting module menu. The tooltip title for the context menu holding
	 * print and export menu items.
	 */
	public void setContextButtonTitle(String contextButtonTitle) {
		this.contextButtonTitle = contextButtonTitle;
	}

	/**
	 * @see #setDecimalPoint(String)
	 */
	public String getDecimalPoint() {
		return decimalPoint;
	}

	/**
	 * The default decimal point used in the `Highcharts.numberFormat` method
	 * unless otherwise specified in the function arguments.
	 */
	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
	}

	/**
	 * @see #setDownloadCSV(String)
	 */
	public String getDownloadCSV() {
		return downloadCSV;
	}

	/**
	 * Export-data module only. The text for the menu item.
	 */
	public void setDownloadCSV(String downloadCSV) {
		this.downloadCSV = downloadCSV;
	}

	/**
	 * @see #setDownloadJPEG(String)
	 */
	public String getDownloadJPEG() {
		return downloadJPEG;
	}

	/**
	 * Exporting module only. The text for the JPEG download menu item.
	 */
	public void setDownloadJPEG(String downloadJPEG) {
		this.downloadJPEG = downloadJPEG;
	}

	/**
	 * @see #setDownloadPDF(String)
	 */
	public String getDownloadPDF() {
		return downloadPDF;
	}

	/**
	 * Exporting module only. The text for the PDF download menu item.
	 */
	public void setDownloadPDF(String downloadPDF) {
		this.downloadPDF = downloadPDF;
	}

	/**
	 * @see #setDownloadPNG(String)
	 */
	public String getDownloadPNG() {
		return downloadPNG;
	}

	/**
	 * Exporting module only. The text for the PNG download menu item.
	 */
	public void setDownloadPNG(String downloadPNG) {
		this.downloadPNG = downloadPNG;
	}

	/**
	 * @see #setDownloadSVG(String)
	 */
	public String getDownloadSVG() {
		return downloadSVG;
	}

	/**
	 * Exporting module only. The text for the SVG download menu item.
	 */
	public void setDownloadSVG(String downloadSVG) {
		this.downloadSVG = downloadSVG;
	}

	/**
	 * @see #setDownloadXLS(String)
	 */
	public String getDownloadXLS() {
		return downloadXLS;
	}

	/**
	 * Export-data module only. The text for the menu item.
	 */
	public void setDownloadXLS(String downloadXLS) {
		this.downloadXLS = downloadXLS;
	}

	/**
	 * @see #setDrillUpText(String)
	 */
	public String getDrillUpText() {
		return drillUpText;
	}

	/**
	 * The text for the button that appears when drilling down, linking back to
	 * the parent series. The parent series' name is inserted for
	 * `{series.name}`.
	 */
	public void setDrillUpText(String drillUpText) {
		this.drillUpText = drillUpText;
	}

	/**
	 * @see #setInvalidDate(String)
	 */
	public String getInvalidDate() {
		return invalidDate;
	}

	/**
	 * What to show in a date field for invalid dates. Defaults to an empty
	 * string.
	 */
	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}

	/**
	 * @see #setLoading(String)
	 */
	public String getLoading() {
		return loading;
	}

	/**
	 * The loading text that appears when the chart is set into the loading
	 * state following a call to `chart.showLoading`.
	 */
	public void setLoading(String loading) {
		this.loading = loading;
	}

	/**
	 * @see #setMonths(ArrayList)
	 */
	public ArrayList<String> getMonths() {
		if (months == null) {
			months = new ArrayList<String>();
		}
		return months;
	}

	/**
	 * An array containing the months names. Corresponds to the `%B` format in
	 * `Highcharts.dateFormat()`.
	 */
	public void setMonths(ArrayList<String> months) {
		this.months = months;
	}

	/**
	 * @see #setNoData(String)
	 */
	public String getNoData() {
		return noData;
	}

	/**
	 * The text to display when the chart contains no data. Requires the no-data
	 * module, see [noData](#noData).
	 */
	public void setNoData(String noData) {
		this.noData = noData;
	}

	/**
	 * @see #setNumericSymbolMagnitude(Number)
	 */
	public Number getNumericSymbolMagnitude() {
		return numericSymbolMagnitude;
	}

	/**
	 * The magnitude of [numericSymbols](#lang.numericSymbol) replacements. Use
	 * 10000 for Japanese, Korean and various Chinese locales, which use symbols
	 * for 10^4, 10^8 and 10^12.
	 */
	public void setNumericSymbolMagnitude(Number numericSymbolMagnitude) {
		this.numericSymbolMagnitude = numericSymbolMagnitude;
	}

	/**
	 * @see #setNumericSymbols(ArrayList)
	 */
	public ArrayList<String> getNumericSymbols() {
		if (numericSymbols == null) {
			numericSymbols = new ArrayList<String>();
		}
		return numericSymbols;
	}

	/**
	 * Metric prefixes used to shorten high numbers in axis labels. Setting
	 * numericSymbols to null sets default values. Setting numericSymbols to an
	 * empty array disables shortening - shows initial numbers.
	 * <p>
	 * Defaults to: [ "k" , "M" , "G" , "T" , "P" , "E"]
	 */
	public void setNumericSymbols(ArrayList<String> numericSymbols) {
		this.numericSymbols = numericSymbols;
	}

	/**
	 * @see #setOpenInCloud(String)
	 */
	public String getOpenInCloud() {
		return openInCloud;
	}

	/**
	 * Export-data module only. The text for the menu item.
	 */
	public void setOpenInCloud(String openInCloud) {
		this.openInCloud = openInCloud;
	}

	/**
	 * @see #setPrintChart(String)
	 */
	public String getPrintChart() {
		return printChart;
	}

	/**
	 * Exporting module only. The text for the menu item to print the chart.
	 */
	public void setPrintChart(String printChart) {
		this.printChart = printChart;
	}

	/**
	 * @see #setRangeSelectorFrom(String)
	 */
	public String getRangeSelectorFrom() {
		return rangeSelectorFrom;
	}

	/**
	 * The text for the label for the "from" input box in the range selector.
	 */
	public void setRangeSelectorFrom(String rangeSelectorFrom) {
		this.rangeSelectorFrom = rangeSelectorFrom;
	}

	/**
	 * @see #setRangeSelectorTo(String)
	 */
	public String getRangeSelectorTo() {
		return rangeSelectorTo;
	}

	/**
	 * The text for the label for the "to" input box in the range selector.
	 */
	public void setRangeSelectorTo(String rangeSelectorTo) {
		this.rangeSelectorTo = rangeSelectorTo;
	}

	/**
	 * @see #setRangeSelectorZoom(String)
	 */
	public String getRangeSelectorZoom() {
		return rangeSelectorZoom;
	}

	/**
	 * The text for the label for the range selector buttons.
	 */
	public void setRangeSelectorZoom(String rangeSelectorZoom) {
		this.rangeSelectorZoom = rangeSelectorZoom;
	}

	/**
	 * @see #setResetZoom(String)
	 */
	public String getResetZoom() {
		return resetZoom;
	}

	/**
	 * The text for the label appearing when a chart is zoomed.
	 */
	public void setResetZoom(String resetZoom) {
		this.resetZoom = resetZoom;
	}

	/**
	 * @see #setResetZoomTitle(String)
	 */
	public String getResetZoomTitle() {
		return resetZoomTitle;
	}

	/**
	 * The tooltip title for the label appearing when a chart is zoomed.
	 */
	public void setResetZoomTitle(String resetZoomTitle) {
		this.resetZoomTitle = resetZoomTitle;
	}

	/**
	 * @see #setShortMonths(ArrayList)
	 */
	public ArrayList<String> getShortMonths() {
		if (shortMonths == null) {
			shortMonths = new ArrayList<String>();
		}
		return shortMonths;
	}

	/**
	 * An array containing the months names in abbreviated form. Corresponds to
	 * the `%b` format in `Highcharts.dateFormat()`.
	 */
	public void setShortMonths(ArrayList<String> shortMonths) {
		this.shortMonths = shortMonths;
	}

	/**
	 * @see #setShortWeekdays(ArrayList)
	 */
	public ArrayList<String> getShortWeekdays() {
		if (shortWeekdays == null) {
			shortWeekdays = new ArrayList<String>();
		}
		return shortWeekdays;
	}

	/**
	 * Short week days, starting Sunday. If not specified, Highcharts uses the
	 * first three letters of the `lang.weekdays` option.
	 */
	public void setShortWeekdays(ArrayList<String> shortWeekdays) {
		this.shortWeekdays = shortWeekdays;
	}

	/**
	 * @see #setThousandsSep(String)
	 */
	public String getThousandsSep() {
		return thousandsSep;
	}

	/**
	 * The default thousands separator used in the `Highcharts.numberFormat`
	 * method unless otherwise specified in the function arguments. Since
	 * Highcharts 4.1 it defaults to a single space character, which is
	 * compatible with ISO and works across Anglo-American and continental
	 * European languages. The default is a single space.
	 */
	public void setThousandsSep(String thousandsSep) {
		this.thousandsSep = thousandsSep;
	}

	/**
	 * @see #setViewData(String)
	 */
	public String getViewData() {
		return viewData;
	}

	/**
	 * Export-data module only. The text for the menu item.
	 */
	public void setViewData(String viewData) {
		this.viewData = viewData;
	}

	/**
	 * @see #setWeekdays(ArrayList)
	 */
	public ArrayList<String> getWeekdays() {
		if (weekdays == null) {
			weekdays = new ArrayList<String>();
		}
		return weekdays;
	}

	/**
	 * An array containing the weekday names.
	 */
	public void setWeekdays(ArrayList<String> weekdays) {
		this.weekdays = weekdays;
	}
}
