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
 * Options for exporting data to CSV or ExCel, or displaying the data in a HTML
 * table or a JavaScript structure. Requires the `export-data.js` module. This
 * module adds data export options to the export menu and provides functions
 * like `Chart.getCSV`, `Chart.getTable`, `Chart.getDataRows` and
 * `Chart.viewData`.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Csv extends AbstractConfigurationObject {

	private String _fn_columnHeaderFormatter;
	private String dateFormat;
	private String decimalPoint;
	private String itemDelimiter;
	private String lineDelimiter;

	public Csv() {
	}

	/**
	 * @see #set_fn_columnHeaderFormatter(String)
	 */
	public String getColumnHeaderFormatter() {
		return _fn_columnHeaderFormatter;
	}

	/**
	 * Formatter callback for the column headers. Parameters are: - `item` - The
	 * series or axis object) - `key` - The point key, for example y or z -
	 * `keyLength` - The amount of value keys for this item, for example a range
	 * series has the keys `low` and `high` so the key length is 2. If
	 * [useMultiLevelHeaders](#exporting.useMultiLevelHeaders) is true,
	 * columnHeaderFormatter by default returns an object with columnTitle and
	 * topLevelColumnTitle for each key. Columns with the same
	 * topLevelColumnTitle have their titles merged into a single cell with
	 * colspan for table/Excel export. If `useMultiLevelHeaders` is false, or
	 * for CSV export, it returns the series name, followed by the key if there
	 * is more than one key. For the axis it returns the axis title or
	 * "Category" or "DateTime" by default. Return `false` to use Highcharts'
	 * proposed header.
	 */
	public void setColumnHeaderFormatter(String _fn_columnHeaderFormatter) {
		this._fn_columnHeaderFormatter = _fn_columnHeaderFormatter;
	}

	/**
	 * @see #setDateFormat(String)
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * Which date format to use for exported dates on a datetime X axis. See
	 * `Highcharts.dateFormat`.
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
	 * Which decimal point to use for exported CSV. Defaults to the same as the
	 * browser locale, typically `.` (English) or `,` (German, French etc).
	 */
	public void setDecimalPoint(String decimalPoint) {
		this.decimalPoint = decimalPoint;
	}

	/**
	 * @see #setItemDelimiter(String)
	 */
	public String getItemDelimiter() {
		return itemDelimiter;
	}

	/**
	 * The item delimiter in the exported data. Use `;` for direct exporting to
	 * Excel. Defaults to a best guess based on the browser locale. If the
	 * locale _decimal point_ is `,`, the `itemDelimiter` defaults to `;`,
	 * otherwise the `itemDelimiter` defaults to `,`.
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
	 * The line delimiter in the exported data, defaults to a newline.
	 */
	public void setLineDelimiter(String lineDelimiter) {
		this.lineDelimiter = lineDelimiter;
	}
}
