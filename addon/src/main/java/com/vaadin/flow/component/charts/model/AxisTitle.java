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

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class AxisTitle extends AbstractConfigurationObject {

	private VerticalAlign align;
	private Boolean enabled;
	private Number margin;
	private Number offset;
	private String position3d;
	private Boolean reserveSpace;
	private Number rotation;
	private Boolean skew3d;
	private String text;
	private Boolean useHTML;
	private Number x;
	private Number y;

	public AxisTitle() {
	}

	public AxisTitle(Boolean enabled) {
		setEnabled(enabled);
	}

	public AxisTitle(String text) {
		setText(text);
	}

	/**
	 * @see #setAlign(VerticalAlign)
	 */
	public VerticalAlign getAlign() {
		return align;
	}

	/**
	 * Alignment of the title relative to the axis values. Possible values are
	 * "low", "middle" or "high".
	 */
	public void setAlign(VerticalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Deprecated. Set the `text` to `null` to disable the title.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setMargin(Number)
	 */
	public Number getMargin() {
		return margin;
	}

	/**
	 * The pixel distance between the axis labels and the title. Positive values
	 * are outside the axis line, negative are inside.
	 */
	public void setMargin(Number margin) {
		this.margin = margin;
	}

	/**
	 * @see #setOffset(Number)
	 */
	public Number getOffset() {
		return offset;
	}

	/**
	 * The distance of the axis title from the axis line. By default, this
	 * distance is computed from the offset width of the labels, the labels'
	 * distance from the axis and the title's margin. However when the offset
	 * option is set, it overrides all this.
	 */
	public void setOffset(Number offset) {
		this.offset = offset;
	}

	/**
	 * @see #setPosition3d(String)
	 */
	public String getPosition3d() {
		return position3d;
	}

	/**
	 * Defines how the title is repositioned according to the 3D chart
	 * orientation. - `'offset'`: Maintain a fixed horizontal/vertical distance
	 * from the tick marks, despite the chart orientation. This is the backwards
	 * compatible behavior, and causes skewing of X and Z axes. - `'chart'`:
	 * Preserve 3D position relative to the chart. This looks nice, but hard to
	 * read if the text isn't forward-facing. - `'flap'`: Rotated text along the
	 * axis to compensate for the chart orientation. This tries to maintain text
	 * as legible as possible on all orientations. - `'ortho'`: Rotated text
	 * along the axis direction so that the labels are orthogonal to the axis.
	 * This is very similar to `'flap'`, but prevents skewing the labels (X and
	 * Y scaling are still present). - `null`: Will use the config from
	 * `labels.position3d`
	 */
	public void setPosition3d(String position3d) {
		this.position3d = position3d;
	}

	/**
	 * @see #setReserveSpace(Boolean)
	 */
	public Boolean getReserveSpace() {
		return reserveSpace;
	}

	/**
	 * Whether to reserve space for the title when laying out the axis.
	 */
	public void setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
	}

	/**
	 * @see #setRotation(Number)
	 */
	public Number getRotation() {
		return rotation;
	}

	/**
	 * The rotation of the text in degrees. 0 is horizontal, 270 is vertical
	 * reading from bottom to top.
	 */
	public void setRotation(Number rotation) {
		this.rotation = rotation;
	}

	/**
	 * @see #setSkew3d(Boolean)
	 */
	public Boolean getSkew3d() {
		return skew3d;
	}

	/**
	 * If enabled, the axis title will skewed to follow the perspective. This
	 * will fix overlapping labels and titles, but texts become less legible due
	 * to the distortion. The final appearance depends heavily on
	 * `title.position3d`. A `null` value will use the config from
	 * `labels.skew3d`.
	 */
	public void setSkew3d(Boolean skew3d) {
		this.skew3d = skew3d;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * The actual text of the axis title. Horizontal texts can contain HTML, but
	 * rotated texts are painted using vector techniques and must be clean text.
	 * The Y axis title is disabled by setting the `text` option to `null`.
	 */
	public void setText(String text) {
		this.text = text;
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
	 * and-string-formatting#html) to render the axis title.
	 */
	public void setUseHTML(Boolean useHTML) {
		this.useHTML = useHTML;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * Horizontal pixel offset of the title position.
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
	 * Vertical pixel offset of the title position.
	 */
	public void setY(Number y) {
		this.y = y;
	}
}
