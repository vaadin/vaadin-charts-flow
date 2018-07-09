package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.ArrayList;

/**
 * Series labels are placed as close to the series as possible in a natural way,
 * seeking to avoid other series. The goal of this feature is to make the chart
 * more easily readable, like if a human designer placed the labels in the
 * optimal position. The series labels currently work with series types having a
 * `graph` or an `area`. Requires the `series-label.js` module.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Label extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private ArrayList<Box> boxesToAvoid;
	private Boolean connectorAllowed;
	private Number connectorNeighbourDistance;
	private Boolean enabled;
	private Number maxFontSize;
	private Number minFontSize;
	private Boolean onArea;
	private Number rotation;
	private String text;
	private HorizontalAlign textAlign;
	private Boolean useHTML;
	private VerticalAlign verticalAlign;
	private Number x;
	private Number y;

	public Label() {
	}

	public Label(Boolean enabled) {
		this.enabled = enabled;
	}

	public Label(String text) {
		this.text = text;
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * Horizontal alignment of the label. Can be one of "left", "center" or
	 * "right".
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setBoxesToAvoid(ArrayList)
	 */
	public ArrayList<Box> getBoxesToAvoid() {
		if (boxesToAvoid == null) {
			boxesToAvoid = new ArrayList<Box>();
		}
		return boxesToAvoid;
	}

	/**
	 * An array of boxes to avoid when laying out the labels. Each item has a
	 * `left`, `right`, `top` and `bottom` property.
	 */
	public void setBoxesToAvoid(ArrayList<Box> boxesToAvoid) {
		this.boxesToAvoid = boxesToAvoid;
	}

	/**
	 * @see #setConnectorAllowed(Boolean)
	 */
	public Boolean getConnectorAllowed() {
		return connectorAllowed;
	}

	/**
	 * Allow labels to be placed distant to the graph if necessary, and draw a
	 * connector line to the graph. Setting this option to true may decrease the
	 * performance significantly, since the algorithm with systematically search
	 * for open spaces in the while plot area. Visually, it may also result in a
	 * more cluttered chart, though more of the series will be labeled.
	 */
	public void setConnectorAllowed(Boolean connectorAllowed) {
		this.connectorAllowed = connectorAllowed;
	}

	/**
	 * @see #setConnectorNeighbourDistance(Number)
	 */
	public Number getConnectorNeighbourDistance() {
		return connectorNeighbourDistance;
	}

	/**
	 * If the label is closer than this to a neighbour graph, draw a connector.
	 */
	public void setConnectorNeighbourDistance(Number connectorNeighbourDistance) {
		this.connectorNeighbourDistance = connectorNeighbourDistance;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable the series label per series.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setMaxFontSize(Number)
	 */
	public Number getMaxFontSize() {
		return maxFontSize;
	}

	/**
	 * For area-like series, allow the font size to vary so that small areas get
	 * a smaller font size. The default applies this effect to area-like series
	 * but not line-like series.
	 */
	public void setMaxFontSize(Number maxFontSize) {
		this.maxFontSize = maxFontSize;
	}

	/**
	 * @see #setMinFontSize(Number)
	 */
	public Number getMinFontSize() {
		return minFontSize;
	}

	/**
	 * For area-like series, allow the font size to vary so that small areas get
	 * a smaller font size. The default applies this effect to area-like series
	 * but not line-like series.
	 */
	public void setMinFontSize(Number minFontSize) {
		this.minFontSize = minFontSize;
	}

	/**
	 * @see #setOnArea(Boolean)
	 */
	public Boolean getOnArea() {
		return onArea;
	}

	/**
	 * Draw the label on the area of an area series. By default it is drawn on
	 * the area. Set it to `false` to draw it next to the graph instead.
	 */
	public void setOnArea(Boolean onArea) {
		this.onArea = onArea;
	}

	/**
	 * @see #setRotation(Number)
	 */
	public Number getRotation() {
		return rotation;
	}

	/**
	 * Rotation of the text label in degrees. Defaults to 0 for horizontal plot
	 * lines and 90 for vertical lines.
	 */
	public void setRotation(Number rotation) {
		this.rotation = rotation;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * The text itself. A subset of HTML is supported.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @see #setTextAlign(HorizontalAlign)
	 */
	public HorizontalAlign getTextAlign() {
		return textAlign;
	}

	/**
	 * The text alignment for the label. While `align` determines where the
	 * texts anchor point is placed within the plot band, `textAlign` determines
	 * how the text is aligned against its anchor point. Possible values are
	 * "left", "center" and "right". Defaults to the same as the `align` option.
	 */
	public void setTextAlign(HorizontalAlign textAlign) {
		this.textAlign = textAlign;
	}

	/**
	 * @see #setUseHTML(Boolean)
	 */
	public Boolean getUseHTML() {
		return useHTML;
	}

	/**
	 * Whether to [use
	 * HTML](http://www.highcharts.com/docs/chart-concepts/labels-
	 * and-string-formatting#html) to render the labels.
	 */
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
	}

	/**
	 * @see #setVerticalAlign(VerticalAlign)
	 */
	public VerticalAlign getVerticalAlign() {
		return verticalAlign;
	}

	/**
	 * Vertical alignment of the label relative to the plot line. Can be one of
	 * "top", "middle" or "bottom".
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
	 * Horizontal position relative the alignment. Default varies by
	 * orientation.
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
	 * Vertical position of the text baseline relative to the alignment. Default
	 * varies by orientation.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
