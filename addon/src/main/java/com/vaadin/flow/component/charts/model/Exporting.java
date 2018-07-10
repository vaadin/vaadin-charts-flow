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
import java.util.LinkedHashMap;

/**
 * Options for the exporting module. For an overview on the matter, see [the
 * docs](http://www.highcharts.com/docs/export-module/export-module-overview).
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Exporting extends AbstractConfigurationObject {

	private Boolean allowHTML;
	private Buttons buttons;
	private Configuration chartOptions;
	private Csv csv;
	private Boolean enabled;
	private String _fn_error;
	private Boolean fallbackToExportServer;
	private String filename;
	private LinkedHashMap<String, String> formAttributes;
	private String libURL;
	private LinkedHashMap<String, ExportingMenuItemDefinition> menuItemDefinitions;
	private Number printMaxWidth;
	private Number scale;
	private Boolean showTable;
	private Number sourceHeight;
	private Number sourceWidth;
	private String tableCaption;
	private ExportFileType type;
	private String url;
	private Boolean useMultiLevelHeaders;
	private Boolean useRowspanHeaders;
	private Number width;

	public Exporting() {
	}

	public Exporting(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setAllowHTML(Boolean)
	 */
	public Boolean getAllowHTML() {
		return allowHTML;
	}

	/**
	 * Experimental setting to allow HTML inside the chart (added through the
	 * `useHTML` options), directly in the exported image. This allows you to
	 * preserve complicated HTML structures like tables or bi-directional text
	 * in exported charts. Disclaimer: The HTML is rendered in a `foreignObject`
	 * tag in the generated SVG. The official export server is based on
	 * PhantomJS, which supports this, but other SVG clients, like Batik, does
	 * not support it. This also applies to downloaded SVG that you want to open
	 * in a desktop client.
	 */
	public void setAllowHTML(Boolean allowHTML) {
		this.allowHTML = allowHTML;
	}

	/**
	 * @see #setButtons(Buttons)
	 */
	public Buttons getButtons() {
		if (buttons == null) {
			buttons = new Buttons();
		}
		return buttons;
	}

	/**
	 * Options for the export related buttons, print and export. In addition to
	 * the default buttons listed here, custom buttons can be added. See
	 * [navigation.buttonOptions](#navigation.buttonOptions) for general
	 * options.
	 */
	public void setButtons(Buttons buttons) {
		this.buttons = buttons;
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
	 * Additional chart options to be merged into an exported chart. For
	 * example, a common use case is to add data labels to improve readability
	 * of the exported chart, or to add a printer-friendly color scheme.
	 */
	public void setChartOptions(Configuration chartOptions) {
		this.chartOptions = chartOptions;
	}

	/**
	 * @see #setCsv(Csv)
	 */
	public Csv getCsv() {
		if (csv == null) {
			csv = new Csv();
		}
		return csv;
	}

	/**
	 * Options for exporting data to CSV or ExCel, or displaying the data in a
	 * HTML table or a JavaScript structure. Requires the `export-data.js`
	 * module. This module adds data export options to the export menu and
	 * provides functions like `Chart.getCSV`, `Chart.getTable`,
	 * `Chart.getDataRows` and `Chart.viewData`.
	 */
	public void setCsv(Csv csv) {
		this.csv = csv;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Whether to enable the exporting module. Disabling the module will hide
	 * the context button, but API methods will still be available.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #set_fn_error(String)
	 */
	public String getError() {
		return _fn_error;
	}

	/**
	 * Function to call if the offline-exporting module fails to export a chart
	 * on the client side, and [fallbackToExportServer](
	 * #exporting.fallbackToExportServer) is disabled. If left undefined, an
	 * exception is thrown instead.
	 */
	public void setError(String _fn_error) {
		this._fn_error = _fn_error;
	}

	/**
	 * @see #setFallbackToExportServer(Boolean)
	 */
	public Boolean getFallbackToExportServer() {
		return fallbackToExportServer;
	}

	/**
	 * Whether or not to fall back to the export server if the offline-exporting
	 * module is unable to export the chart on the client side.
	 */
	public void setFallbackToExportServer(Boolean fallbackToExportServer) {
		this.fallbackToExportServer = fallbackToExportServer;
	}

	/**
	 * @see #setFilename(String)
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * The filename, without extension, to use for the exported chart.
	 */
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * @see #setFormAttributes(LinkedHashMap)
	 */
	public LinkedHashMap<String, String> getFormAttributes() {
		if (formAttributes == null) {
			formAttributes = new LinkedHashMap<String, String>();
		}
		return formAttributes;
	}

	/**
	 * An object containing additional attributes for the POST form that sends
	 * the SVG to the export server. For example, a `target` can be set to make
	 * sure the generated image is received in another frame, or a custom
	 * `enctype` or `encoding` can be set.
	 */
	public void setFormAttributes(LinkedHashMap<String, String> formAttributes) {
		this.formAttributes = formAttributes;
	}

	/**
	 * @see #setLibURL(String)
	 */
	public String getLibURL() {
		return libURL;
	}

	/**
	 * Path where Highcharts will look for export module dependencies to load on
	 * demand if they don't already exist on `window`. Should currently point to
	 * location of [CanVG](https://github.com/canvg/canvg) library,
	 * [RGBColor.js](https://github.com/canvg/canvg), [jsPDF](https://github.
	 * com/yWorks/jsPDF) and [svg2pdf.js](https://github.com/yWorks/svg2pdf.
	 * js), required for client side export in certain browsers.
	 */
	public void setLibURL(String libURL) {
		this.libURL = libURL;
	}

	/**
	 * @see #setMenuItemDefinitions(LinkedHashMap)
	 */
	public LinkedHashMap<String, ExportingMenuItemDefinition> getMenuItemDefinitions() {
		if (menuItemDefinitions == null) {
			menuItemDefinitions = new LinkedHashMap<String, ExportingMenuItemDefinition>();
		}
		return menuItemDefinitions;
	}

	/**
	 * An object consisting of definitions for the menu items in the context
	 * menu. Each key value pair has a `key` that is referenced in the
	 * [menuItems](#exporting.buttons.contextButton.menuItems) setting, and a
	 * `value`, which is an object with the following properties:
	 * <dl>
	 * <dt>onclick</dt>
	 * <dd>The click handler for the menu item</dd>
	 * <dt>text</dt>
	 * <dd>The text for the menu item</dd>
	 * <dt>textKey</dt>
	 * <dd>If internationalization is required, the key to a language string</dd>
	 * </dl>
	 */
	public void setMenuItemDefinitions(
			LinkedHashMap<String, ExportingMenuItemDefinition> menuItemDefinitions) {
		this.menuItemDefinitions = menuItemDefinitions;
	}

	/**
	 * @see #setPrintMaxWidth(Number)
	 */
	public Number getPrintMaxWidth() {
		return printMaxWidth;
	}

	/**
	 * When printing the chart from the menu item in the burger menu, if the
	 * on-screen chart exceeds this width, it is resized. After printing or
	 * cancelled, it is restored. The default width makes the chart fit into
	 * typical paper format. Note that this does not affect the chart when
	 * printing the web page as a whole.
	 */
	public void setPrintMaxWidth(Number printMaxWidth) {
		this.printMaxWidth = printMaxWidth;
	}

	/**
	 * @see #setScale(Number)
	 */
	public Number getScale() {
		return scale;
	}

	/**
	 * Defines the scale or zoom factor for the exported image compared to the
	 * on-screen display. While for instance a 600px wide chart may look good on
	 * a website, it will look bad in print. The default scale of 2 makes this
	 * chart export to a 1200px PNG or JPG.
	 */
	public void setScale(Number scale) {
		this.scale = scale;
	}

	/**
	 * @see #setShowTable(Boolean)
	 */
	public Boolean getShowTable() {
		return showTable;
	}

	/**
	 * Export-data module required. Show a HTML table below the chart with the
	 * chart's current data.
	 */
	public void setShowTable(Boolean showTable) {
		this.showTable = showTable;
	}

	/**
	 * @see #setSourceHeight(Number)
	 */
	public Number getSourceHeight() {
		return sourceHeight;
	}

	/**
	 * Analogous to [sourceWidth](#exporting.sourceWidth).
	 */
	public void setSourceHeight(Number sourceHeight) {
		this.sourceHeight = sourceHeight;
	}

	/**
	 * @see #setSourceWidth(Number)
	 */
	public Number getSourceWidth() {
		return sourceWidth;
	}

	/**
	 * The width of the original chart when exported, unless an explicit
	 * [chart.width](#chart.width) is set. The width exported raster image is
	 * then multiplied by [scale](#exporting.scale).
	 */
	public void setSourceWidth(Number sourceWidth) {
		this.sourceWidth = sourceWidth;
	}

	/**
	 * @see #setTableCaption(String)
	 */
	public String getTableCaption() {
		return tableCaption;
	}

	/**
	 * Export-data module required. Caption for the data table. Same as chart
	 * title by default. Set to `false` to disable.
	 */
	public void setTableCaption(String tableCaption) {
		this.tableCaption = tableCaption;
	}

	/**
	 * @see #setType(ExportFileType)
	 */
	public ExportFileType getType() {
		return type;
	}

	/**
	 * Default MIME type for exporting if `chart.exportChart()` is called
	 * without specifying a `type` option. Possible values are `image/png`,
	 * `image/jpeg`, `application/pdf` and `image/svg+xml`.
	 */
	public void setType(ExportFileType type) {
		this.type = type;
	}

	/**
	 * @see #setUrl(String)
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * The URL for the server module converting the SVG string to an image
	 * format. By default this points to Highchart's free web service.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @see #setUseMultiLevelHeaders(Boolean)
	 */
	public Boolean getUseMultiLevelHeaders() {
		return useMultiLevelHeaders;
	}

	/**
	 * Export-data module required. Use multi level headers in data table. If
	 * [csv.columnHeaderFormatter](#exporting.csv.columnHeaderFormatter) is
	 * defined, it has to return objects in order for multi level headers to
	 * work.
	 */
	public void setUseMultiLevelHeaders(Boolean useMultiLevelHeaders) {
		this.useMultiLevelHeaders = useMultiLevelHeaders;
	}

	/**
	 * @see #setUseRowspanHeaders(Boolean)
	 */
	public Boolean getUseRowspanHeaders() {
		return useRowspanHeaders;
	}

	/**
	 * Export-data module required. If using multi level table headers, use
	 * rowspans for headers that have only one level.
	 */
	public void setUseRowspanHeaders(Boolean useRowspanHeaders) {
		this.useRowspanHeaders = useRowspanHeaders;
	}

	/**
	 * @see #setWidth(Number)
	 */
	public Number getWidth() {
		return width;
	}

	/**
	 * The pixel width of charts exported to PNG or JPG. As of Highcharts 3.0,
	 * the default pixel width is a function of the [chart.width]( #chart.width)
	 * or [exporting.sourceWidth](#exporting.sourceWidth) and the
	 * [exporting.scale](#exporting.scale).
	 */
	public void setWidth(Number width) {
		this.width = width;
	}
}
