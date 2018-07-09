package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * A collection of options for buttons appearing in the exporting module.
 * 
 * In styled mode, the buttons are styled with the `.highcharts-contextbutton`
 * and `.highcharts-button-symbol` classes.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ButtonOptions extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private Number buttonSpacing;
	private Boolean enabled;
	private Number height;
	private Number symbolSize;
	private Number symbolStrokeWidth;
	private Number symbolX;
	private Number symbolY;
	private String text;
	private VerticalAlign verticalAlign;
	private Number width;
	private Number y;

	public ButtonOptions() {
	}

	public ButtonOptions(Boolean enabled) {
		this.enabled = enabled;
	}

	public ButtonOptions(String text) {
		this.text = text;
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * Alignment for the buttons.
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setButtonSpacing(Number)
	 */
	public Number getButtonSpacing() {
		return buttonSpacing;
	}

	/**
	 * The pixel spacing between buttons.
	 */
	public void setButtonSpacing(Number buttonSpacing) {
		this.buttonSpacing = buttonSpacing;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Whether to enable buttons.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setHeight(Number)
	 */
	public Number getHeight() {
		return height;
	}

	/**
	 * Pixel height of the buttons.
	 */
	public void setHeight(Number height) {
		this.height = height;
	}

	/**
	 * @see #setSymbolSize(Number)
	 */
	public Number getSymbolSize() {
		return symbolSize;
	}

	/**
	 * The pixel size of the symbol on the button.
	 */
	public void setSymbolSize(Number symbolSize) {
		this.symbolSize = symbolSize;
	}

	/**
	 * @see #setSymbolStrokeWidth(Number)
	 */
	public Number getSymbolStrokeWidth() {
		return symbolStrokeWidth;
	}

	/**
	 * The pixel stroke width of the symbol on the button.
	 */
	public void setSymbolStrokeWidth(Number symbolStrokeWidth) {
		this.symbolStrokeWidth = symbolStrokeWidth;
	}

	/**
	 * @see #setSymbolX(Number)
	 */
	public Number getSymbolX() {
		return symbolX;
	}

	/**
	 * The x position of the center of the symbol inside the button.
	 */
	public void setSymbolX(Number symbolX) {
		this.symbolX = symbolX;
	}

	/**
	 * @see #setSymbolY(Number)
	 */
	public Number getSymbolY() {
		return symbolY;
	}

	/**
	 * The y position of the center of the symbol inside the button.
	 */
	public void setSymbolY(Number symbolY) {
		this.symbolY = symbolY;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * A text string to add to the individual button.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @see #setVerticalAlign(VerticalAlign)
	 */
	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * The vertical alignment of the buttons. Can be one of "top", "middle" or
	 * "bottom".
	 */
	public void setVerticalAlign(VerticalAlign verticalAlign) {
		this.verticalAlign = verticalAlign;
	}

	/**
	 * @see #setWidth(Number)
	 */
	public Number getWidth() {
		return width;
	}

	/**
	 * The pixel width of the button.
	 */
	public void setWidth(Number width) {
		this.width = width;
	}

	/**
	 * @see #setY(Number)
	 */
	public Number getY() {
		return y;
	}

	/**
	 * The vertical offset of the button's position relative to its
	 * `verticalAlign`.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
