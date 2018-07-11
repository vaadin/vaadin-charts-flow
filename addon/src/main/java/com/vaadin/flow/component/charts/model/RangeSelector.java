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
import java.util.Arrays;
import java.util.ArrayList;

/**
 * The range selector is a tool for selecting ranges to display within the
 * chart. It provides buttons to select preconfigured ranges in the chart, like
 * 1 day, 1 week, 1 month etc. It also provides input boxes where min and max
 * dates can be manually input.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class RangeSelector extends AbstractConfigurationObject {

	private Boolean allButtonsEnabled;
	private ButtonPosition buttonPosition;
	private Number buttonSpacing;
	private ArrayList<RangeSelectorButton> buttons;
	private Boolean enabled;
	private Boolean floating;
	private Number height;
	private Number inputBoxHeight;
	private Number inputBoxWidth;
	private String inputDateFormat;
	private String _fn_inputDateParser;
	private String inputEditDateFormat;
	private Boolean inputEnabled;
	private InputPosition inputPosition;
	private Number selected;
	private VerticalAlign verticalAlign;
	private Number x;
	private Number y;

	public RangeSelector() {
	}

	public RangeSelector(Boolean enabled) {
		setEnabled(enabled);
	}

	/**
	 * @see #setAllButtonsEnabled(Boolean)
	 */
	public Boolean getAllButtonsEnabled() {
		return allButtonsEnabled;
	}

	/**
	 * Whether to enable all buttons from the start. By default buttons are only
	 * enabled if the corresponding time range exists on the X axis, but
	 * enabling all buttons allows for dynamically loading different time
	 * ranges.
	 */
	public void setAllButtonsEnabled(Boolean allButtonsEnabled) {
		this.allButtonsEnabled = allButtonsEnabled;
	}

	/**
	 * @see #setButtonPosition(ButtonPosition)
	 */
	public ButtonPosition getButtonPosition() {
		if (buttonPosition == null) {
			buttonPosition = new ButtonPosition();
		}
		return buttonPosition;
	}

	/**
	 * Positioning for the button row.
	 */
	public void setButtonPosition(ButtonPosition buttonPosition) {
		this.buttonPosition = buttonPosition;
	}

	/**
	 * @see #setButtonSpacing(Number)
	 */
	public Number getButtonSpacing() {
		return buttonSpacing;
	}

	/**
	 * The space in pixels between the buttons in the range selector.
	 */
	public void setButtonSpacing(Number buttonSpacing) {
		this.buttonSpacing = buttonSpacing;
	}

	/**
	 * @see #setButtons(ArrayList)
	 */
	public ArrayList<RangeSelectorButton> getButtons() {
		if (buttons == null) {
			buttons = new ArrayList<RangeSelectorButton>();
		}
		return buttons;
	}

	/**
	 * An array of configuration objects for the buttons. Defaults to
	 * 
	 * <pre>
	 * buttons: [{
	 * 	    type: 'month',
	 * 	    count: 1,
	 * 	    text: '1m'
	 * 	}, {
	 * 	    type: 'month',
	 * 	    count: 3,
	 * 	    text: '3m'
	 * 	}, {
	 * 	    type: 'month',
	 * 	    count: 6,
	 * 	    text: '6m'
	 * 	}, {
	 * 	    type: 'ytd',
	 * 	    text: 'YTD'
	 * 	}, {
	 * 	    type: 'year',
	 * 	    count: 1,
	 * 	    text: '1y'
	 * 	}, {
	 * 	    type: 'all',
	 * 	    text: 'All'
	 * 	}]
	 * </pre>
	 */
	public void setButtons(ArrayList<RangeSelectorButton> buttons) {
		this.buttons = buttons;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the range selector.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setFloating(Boolean)
	 */
	public Boolean getFloating() {
		return floating;
	}

	/**
	 * When the rangeselector is floating, the plot area does not reserve space
	 * for it. This opens for positioning anywhere on the chart.
	 */
	public void setFloating(Boolean floating) {
		this.floating = floating;
	}

	/**
	 * @see #setHeight(Number)
	 */
	public Number getHeight() {
		return height;
	}

	/**
	 * Deprecated. The height of the range selector. Currently it is calculated
	 * dynamically.
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * @see #setInputBoxHeight(Number)
	 */
	public Number getInputBoxHeight() {
		return inputBoxHeight;
	}

	/**
	 * The pixel height of the date input boxes.
	 */
	public void setInputBoxHeight(Number inputBoxHeight) {
		this.inputBoxHeight = inputBoxHeight;
	}

	/**
	 * @see #setInputBoxWidth(Number)
	 */
	public Number getInputBoxWidth() {
		return inputBoxWidth;
	}

	/**
	 * The pixel width of the date input boxes.
	 */
	public void setInputBoxWidth(Number inputBoxWidth) {
		this.inputBoxWidth = inputBoxWidth;
	}

	/**
	 * @see #setInputDateFormat(String)
	 */
	public String getInputDateFormat() {
		return inputDateFormat;
	}

	/**
	 * The date format in the input boxes when not selected for editing.
	 * Defaults to `%b %e, %Y`.
	 */
	public void setInputDateFormat(String inputDateFormat) {
		this.inputDateFormat = inputDateFormat;
	}

	/**
	 * @see #set_fn_inputDateParser(String)
	 */
	public String getInputDateParser() {
		return _fn_inputDateParser;
	}

	/**
	 * A custom callback function to parse values entered in the input boxes and
	 * return a valid JavaScript time as milliseconds since 1970.
	 */
	public void setInputDateParser(String _fn_inputDateParser) {
		this._fn_inputDateParser = _fn_inputDateParser;
	}

	/**
	 * @see #setInputEditDateFormat(String)
	 */
	public String getInputEditDateFormat() {
		return inputEditDateFormat;
	}

	/**
	 * The date format in the input boxes when they are selected for editing.
	 * This must be a format that is recognized by JavaScript Date.parse.
	 */
	public void setInputEditDateFormat(String inputEditDateFormat) {
		this.inputEditDateFormat = inputEditDateFormat;
	}

	/**
	 * @see #setInputEnabled(Boolean)
	 */
	public Boolean getInputEnabled() {
		return inputEnabled;
	}

	/**
	 * Enable or disable the date input boxes. Defaults to enabled when there is
	 * enough space, disabled if not (typically mobile).
	 */
	public void setInputEnabled(Boolean inputEnabled) {
		this.inputEnabled = inputEnabled;
	}

	/**
	 * @see #setInputPosition(InputPosition)
	 */
	public InputPosition getInputPosition() {
		if (inputPosition == null) {
			inputPosition = new InputPosition();
		}
		return inputPosition;
	}

	/**
	 * Positioning for the input boxes. Allowed properties are `align`, `x` and
	 * `y`.
	 */
	public void setInputPosition(InputPosition inputPosition) {
		this.inputPosition = inputPosition;
	}

	/**
	 * @see #setSelected(Number)
	 */
	public Number getSelected() {
		return selected;
	}

	/**
	 * The index of the button to appear pre-selected.
	 */
	public void setSelected(Number selected) {
		this.selected = selected;
	}

	/**
	 * @see #setVerticalAlign(VerticalAlign)
	 */
	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * The vertical alignment of the rangeselector box. Allowed properties are
	 * `top`, `middle`, `bottom`.
	 */
	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * The x offset of the range selector relative to its horizontal alignment
	 * within `chart.spacingLeft` and `chart.spacingRight`.
	 */
	public void setX(Number x) {
		this.x = x;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * The y offset of the range selector relative to its horizontal alignment
	 * within `chart.spacingLeft` and `chart.spacingRight`.
	 */
	public void setY(Number y) {
		this.y = y;
	}

	public void setButtons(RangeSelectorButton... buttons) {
		this.buttons = new ArrayList<RangeSelectorButton>(
				Arrays.asList(buttons));
	}

	public void addButton(RangeSelectorButton button) {
		if (this.buttons == null) {
			this.buttons = new ArrayList<RangeSelectorButton>();
		}
		this.buttons.add(button);
	}

	public void removeButton(RangeSelectorButton button) {
		this.buttons.remove(button);
	}
}
