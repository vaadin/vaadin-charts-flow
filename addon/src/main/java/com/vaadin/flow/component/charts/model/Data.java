package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.ArrayList;
import com.vaadin.flow.component.charts.model.style.Color;
import java.util.LinkedHashMap;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Data extends AbstractConfigurationObject {

	private String _fn_beforeParse;
	private Color color;
	private ArrayList<Object> columns;
	private String columnsURL;
	private String _fn_complete;
	private String csv;
	private String csvURL;
	private Number dataRefreshRate;
	private String dateFormat;
	private String decimalPoint;
	private Boolean enablePolling;
	private Number endColumn;
	private Number endRow;
	private Boolean firstRowAsNames;
	private String googleSpreadsheetKey;
	private String googleSpreadsheetWorksheet;
	private String itemDelimiter;
	private String lineDelimiter;
	private String _fn_parseDate;
	private String _fn_parsed;
	private Number partialFill;
	private ArrayList<Object> rows;
	private String rowsURL;
	private LinkedHashMap<String, Integer> seriesMapping;
	private Number startColumn;
	private Number startRow;
	private Boolean switchRowsAndColumns;
	private String table;
	private Number x;
	private Number x2;
	private Number y;

	public Data() {
	}

	/**
	 * @see #set_fn_beforeParse(String)
	 */
	public String getBeforeParse() {
		return _fn_beforeParse;
	}

	/**
	 * A callback function to modify the CSV before parsing it. Return the
	 * modified string.
	 */
	public void setBeforeParse(String _fn_beforeParse) {
		this._fn_beforeParse = _fn_beforeParse;
	}

	/**
	 * @see #setColor(Color)
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * The color of the point. In tilemaps the point color is rarely set
	 * explicitly, as we use the color to denote the `value`. Options for this
	 * are set in the [colorAxis](#colorAxis) configuration.
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @see #setColumns(ArrayList)
	 */
	public ArrayList<Object> getColumns() {
		if (columns == null) {
			columns = new ArrayList<Object>();
		}
		return columns;
	}

	/**
	 * A two-dimensional array representing the input data on tabular form. This
	 * input can be used when the data is already parsed, for example from a
	 * grid view component. Each cell can be a string or number. If not
	 * switchRowsAndColumns is set, the columns are interpreted as series.
	 */
	public void setColumns(ArrayList<Object> columns) {
		this.columns = columns;
	}

	/**
	 * @see #setColumnsURL(String)
	 */
	public String getColumnsURL() {
		return columnsURL;
	}

	/**
	 * A URL to a remote JSON dataset, structured as a column array. Will be
	 * fetched when the chart is created using Ajax.
	 */
	public void setColumnsURL(String columnsURL) {
		this.columnsURL = columnsURL;
	}

	/**
	 * @see #set_fn_complete(String)
	 */
	public String getComplete() {
		return _fn_complete;
	}

	/**
	 * The callback that is evaluated when the data is finished loading,
	 * optionally from an external source, and parsed. The first argument passed
	 * is a finished chart options object, containing the series. These options
	 * can be extended with additional options and passed directly to the chart
	 * constructor.
	 */
	public void setComplete(String _fn_complete) {
		this._fn_complete = _fn_complete;
	}

	/**
	 * @see #setCsv(String)
	 */
	public String getCsv() {
		return csv;
	}

	/**
	 * A comma delimited string to be parsed. Related options are [startRow](
	 * #data.startRow), [endRow](#data.endRow), [startColumn](#data.startColumn)
	 * and [endColumn](#data.endColumn) to delimit what part of the table is
	 * used. The [lineDelimiter](#data.lineDelimiter) and [itemDelimiter](
	 * #data.itemDelimiter) options define the CSV delimiter formats. The
	 * built-in CSV parser doesn't support all flavours of CSV, so in some cases
	 * it may be necessary to use an external CSV parser. See [this
	 * example](http://jsfiddle.net/highcharts/u59176h4/) of parsing CSV through
	 * the MIT licensed [Papa Parse](http://papaparse.com/) library.
	 */
	public void setCsv(String csv) {
		this.csv = csv;
	}

	/**
	 * @see #setCsvURL(String)
	 */
	public String getCsvURL() {
		return csvURL;
	}

	/**
	 * A URL to a remote CSV dataset. Will be fetched when the chart is created
	 * using Ajax.
	 */
	public void setCsvURL(String csvURL) {
		this.csvURL = csvURL;
	}

	/**
	 * @see #setDataRefreshRate(Number)
	 */
	public Number getDataRefreshRate() {
		return dataRefreshRate;
	}

	/**
	 * Sets the refresh rate for data polling when importing remote dataset by
	 * setting [data.csvURL](data.csvURL), [data.rowsURL](data.rowsURL),
	 * [data.columnsURL](data.columnsURL), or
	 * [data.googleSpreadsheetKey](data.googleSpreadsheetKey). Note that polling
	 * must be enabled by setting [data.enablePolling](data.enablePolling) to
	 * true. The value is the number of seconds between pollings. It cannot be
	 * set to less than 1 second.
	 */
	public void setDataRefreshRate(Number dataRefreshRate) {
		this.dataRefreshRate = dataRefreshRate;
	}

	/**
	 * @see #setDateFormat(String)
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * Which of the predefined date formats in Date.prototype.dateFormats to use
	 * to parse date values. Defaults to a best guess based on what format gives
	 * valid and ordered dates. Valid options include: `YYYY/mm/dd` `dd/mm/YYYY`
	 * `mm/dd/YYYY` `dd/mm/YY` `mm/dd/YY`
	 */
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	/**
	 * @see #setDecimalPoint(String)
	 */
	public String getDecimalPoint() {
		return decimalPoint;
	}

	/**
	 * The decimal point used for parsing numbers in the CSV. If both this and
	 * data.delimiter is set to false, the parser will attempt to deduce the
	 * decimal point automatically.
	 */
	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
	}

	/**
	 * @see #setEnablePolling(Boolean)
	 */
	public Boolean getEnablePolling() {
		return enablePolling;
	}

	/**
	 * Enables automatic refetching of remote datasets every _n_ seconds
	 * (defined by setting [data.dataRefreshRate](data.dataRefreshRate)). Only
	 * works when either [data.csvURL](data.csvURL),
	 * [data.rowsURL](data.rowsURL), [data.columnsURL](data.columnsURL), or
	 * [data.googleSpreadsheetKey](data.googleSpreadsheetKey).
	 */
	public void setEnablePolling(Boolean enablePolling) {
		this.enablePolling = enablePolling;
	}

	/**
	 * @see #setEndColumn(Number)
	 */
	public Number getEndColumn() {
		return endColumn;
	}

	/**
	 * In tabular input data, the last column (indexed by 0) to use. Defaults to
	 * the last column containing data.
	 */
	public void setEndColumn(Number endColumn) {
		this.endColumn = endColumn;
	}

	/**
	 * @see #setEndRow(Number)
	 */
	public Number getEndRow() {
		return endRow;
	}

	/**
	 * In tabular input data, the last row (indexed by 0) to use. Defaults to
	 * the last row containing data.
	 */
	public void setEndRow(Number endRow) {
		this.endRow = endRow;
	}

	/**
	 * @see #setFirstRowAsNames(Boolean)
	 */
	public Boolean getFirstRowAsNames() {
		return firstRowAsNames;
	}

	/**
	 * Whether to use the first row in the data set as series names.
	 */
	public void setFirstRowAsNames(Boolean firstRowAsNames) {
		this.firstRowAsNames = firstRowAsNames;
	}

	/**
	 * @see #setGoogleSpreadsheetKey(String)
	 */
	public String getGoogleSpreadsheetKey() {
		return googleSpreadsheetKey;
	}

	/**
	 * The key for a Google Spreadsheet to load. See [general information on
	 * GS](https://developers.google.com/gdata/samples/spreadsheet_sample).
	 */
	public void setGoogleSpreadsheetKey(String googleSpreadsheetKey) {
		this.googleSpreadsheetKey = googleSpreadsheetKey;
	}

	/**
	 * @see #setGoogleSpreadsheetWorksheet(String)
	 */
	public String getGoogleSpreadsheetWorksheet() {
		return googleSpreadsheetWorksheet;
	}

	/**
	 * The Google Spreadsheet worksheet to use in combination with
	 * [googleSpreadsheetKey](#data.googleSpreadsheetKey). The available id's
	 * from your sheet can be read from
	 * `https://spreadsheets.google.com/feeds/worksheets/{key}/public/basic`.
	 */
	public void setGoogleSpreadsheetWorksheet(String googleSpreadsheetWorksheet) {
		this.googleSpreadsheetWorksheet = googleSpreadsheetWorksheet;
	}

	/**
	 * @see #setItemDelimiter(String)
	 */
	public String getItemDelimiter() {
		return itemDelimiter;
	}

	/**
	 * Item or cell delimiter for parsing CSV. Defaults to the tab character
	 * `\t` if a tab character is found in the CSV string, if not it defaults to
	 * `,`. If this is set to false or undefined, the parser will attempt to
	 * deduce the delimiter automatically.
	 */
	public void setItemDelimiter(String itemDelimiter) {
		this.itemDelimiter = itemDelimiter;
	}

	/**
	 * @see #setLineDelimiter(String)
	 */
	public String getLineDelimiter() {
		return lineDelimiter;
	}

	/**
	 * Line delimiter for parsing CSV.
	 */
	public void setLineDelimiter(String lineDelimiter) {
		this.lineDelimiter = lineDelimiter;
	}

	/**
	 * @see #set_fn_parseDate(String)
	 */
	public String getParseDate() {
		return _fn_parseDate;
	}

	/**
	 * A callback function to parse string representations of dates into
	 * JavaScript timestamps. Should return an integer timestamp on success.
	 */
	public void setParseDate(String _fn_parseDate) {
		this._fn_parseDate = _fn_parseDate;
	}

	/**
	 * @see #set_fn_parsed(String)
	 */
	public String getParsed() {
		return _fn_parsed;
	}

	/**
	 * A callback function to access the parsed columns, the two-dimentional
	 * input data array directly, before they are interpreted into series data
	 * and categories. Return `false` to stop completion, or call
	 * `this.complete()` to continue async.
	 */
	public void setParsed(String _fn_parsed) {
		this._fn_parsed = _fn_parsed;
	}

	/**
	 * @see #setPartialFill(Number)
	 */
	public Number getPartialFill() {
		return partialFill;
	}

	/**
	 * A partial fill for each point, typically used to visualize how much of a
	 * task is performed. The partial fill object can be set either on series or
	 * point level.
	 */
	public void setPartialFill(Number partialFill) {
		this.partialFill = partialFill;
	}

	/**
	 * @see #setRows(ArrayList)
	 */
	public ArrayList<Object> getRows() {
		if (rows == null) {
			rows = new ArrayList<Object>();
		}
		return rows;
	}

	/**
	 * The same as the columns input option, but defining rows intead of
	 * columns.
	 */
	public void setRows(ArrayList<Object> rows) {
		this.rows = rows;
	}

	/**
	 * @see #setRowsURL(String)
	 */
	public String getRowsURL() {
		return rowsURL;
	}

	/**
	 * A URL to a remote JSON dataset, structured as a row array. Will be
	 * fetched when the chart is created using Ajax.
	 */
	public void setRowsURL(String rowsURL) {
		this.rowsURL = rowsURL;
	}

	/**
	 * @see #setSeriesMapping(LinkedHashMap)
	 */
	public LinkedHashMap<String, Integer> getSeriesMapping() {
		if (seriesMapping == null) {
			seriesMapping = new LinkedHashMap<String, Integer>();
		}
		return seriesMapping;
	}

	/**
	 * An array containing object with Point property names along with what
	 * column id the property should be taken from.
	 */
	public void setSeriesMapping(LinkedHashMap<String, Integer> seriesMapping) {
		this.seriesMapping = seriesMapping;
	}

	/**
	 * @see #setStartColumn(Number)
	 */
	public Number getStartColumn() {
		return startColumn;
	}

	/**
	 * In tabular input data, the first column (indexed by 0) to use.
	 */
	public void setStartColumn(Number startColumn) {
		this.startColumn = startColumn;
	}

	/**
	 * @see #setStartRow(Number)
	 */
	public Number getStartRow() {
		return startRow;
	}

	/**
	 * In tabular input data, the first row (indexed by 0) to use.
	 */
	public void setStartRow(Number startRow) {
		this.startRow = startRow;
	}

	/**
	 * @see #setSwitchRowsAndColumns(Boolean)
	 */
	public Boolean getSwitchRowsAndColumns() {
		return switchRowsAndColumns;
	}

	/**
	 * Switch rows and columns of the input data, so that `this.columns`
	 * effectively becomes the rows of the data set, and the rows are
	 * interpreted as series.
	 */
	public void setSwitchRowsAndColumns(Boolean switchRowsAndColumns) {
		this.switchRowsAndColumns = switchRowsAndColumns;
	}

	/**
	 * @see #setTable(String)
	 */
	public String getTable() {
		return table;
	}

	/**
	 * A HTML table or the id of such to be parsed as input data. Related
	 * options are `startRow`, `endRow`, `startColumn` and `endColumn` to
	 * delimit what part of the table is used.
	 */
	public void setTable(String table) {
		this.table = table;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * The x coordinate of the point. Note that for some
	 * [tileShapes](#plotOptions.tilemap.tileShape) the grid coordinates are
	 * offset.
	 */
	public void setX(Number x) {
		this.x = x;
	}

	/**
	 * @see #setX2(Number)
	 */
	public Number getX2() {
		return x2;
	}

	/**
	 * The ending X value of the range point.
	 */
	public void setX2(Number x2) {
		this.x2 = x2;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * The y coordinate of the point. Note that for some
	 * [tileShapes](#plotOptions.tilemap.tileShape) the grid coordinates are
	 * offset.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
