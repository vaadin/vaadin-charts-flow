package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.ArrayList;

@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class Labels extends AbstractConfigurationObject {

	private HorizontalAlign align;
	private ArrayList<Number> autoRotation;
	private Number autoRotationLimit;
	private Number distance;
	private Boolean enabled;
	private String format;
	private String _fn_formatter;
	private ArrayList<Items> items;
	private Number maxStaggerLines;
	private Overflow overflow;
	private Number padding;
	private String position3d;
	private Boolean reserveSpace;
	private Boolean skew3d;
	private Number staggerLines;
	private Number step;
	private Boolean useHTML;
	private Number x;
	private Number y;
	private Number zIndex;

	public Labels() {
	}

	public Labels(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setAlign(HorizontalAlign)
	 */
	public HorizontalAlign getAlign() {
		return align;
	}

	/**
	 * What part of the string the given position is anchored to. Can be one of
	 * `"left"`, `"center"` or `"right"`. The exact position also depends on the
	 * `labels.x` setting. Angular gauges and solid gauges defaults to `center`.
	 */
	public void setAlign(HorizontalAlign align) {
		this.align = align;
	}

	/**
	 * @see #setAutoRotation(ArrayList)
	 */
	public ArrayList<Number> getAutoRotation() {
		if (autoRotation == null) {
			autoRotation = new ArrayList<Number>();
		}
		return autoRotation;
	}

	/**
	 * For horizontal axes, the allowed degrees of label rotation to prevent
	 * overlapping labels. If there is enough space, labels are not rotated. As
	 * the chart gets narrower, it will start rotating the labels -45 degrees,
	 * then remove every second label and try again with rotations 0 and -45
	 * etc. Set it to `false` to disable rotation, which will cause the labels
	 * to word-wrap if possible.
	 */
	public void setAutoRotation(ArrayList<Number> autoRotation) {
		this.autoRotation = autoRotation;
	}

	/**
	 * @see #setAutoRotationLimit(Number)
	 */
	public Number getAutoRotationLimit() {
		return autoRotationLimit;
	}

	/**
	 * When each category width is more than this many pixels, we don't apply
	 * auto rotation. Instead, we lay out the axis label with word wrap. A lower
	 * limit makes sense when the label contains multiple short words that don't
	 * extend the available horizontal space for each label.
	 */
	public void setAutoRotationLimit(Number autoRotationLimit) {
		this.autoRotationLimit = autoRotationLimit;
	}

	/**
	 * @see #setDistance(Number)
	 */
	public Number getDistance() {
		return distance;
	}

	/**
	 * Angular gauges and solid gauges only. The label's pixel distance from the
	 * perimeter of the plot area.
	 */
	public void setDistance(Number distance) {
		this.distance = distance;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Enable or disable the axis labels.
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setFormat(String)
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * A [format string](http://www.highcharts.com/docs/chart-
	 * concepts/labels-and-string-formatting) for the axis label.
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * @see #set_fn_formatter(String)
	 */
	public String getFormatter() {
		return _fn_formatter;
	}

	/**
	 * Callback JavaScript function to format the label. The value is given by
	 * `this.value`. Additional properties for `this` are `axis`, `chart`,
	 * `isFirst` and `isLast`. The value of the default label formatter can be
	 * retrieved by calling `this.axis.defaultLabelFormatter.call(this)` within
	 * the function. Defaults to:
	 * 
	 * <pre>
	 * function() {
	 * 	return this.value;
	 * }
	 * </pre>
	 */
	public void setFormatter(String _fn_formatter) {
		this._fn_formatter = _fn_formatter;
	}

	/**
	 * @see #setItems(ArrayList)
	 */
	public ArrayList<Items> getItems() {
		if (items == null) {
			items = new ArrayList<Items>();
		}
		return items;
	}

	/**
	 * A HTML label that can be positioned anywhere in the chart area.
	 */
	public void setItems(ArrayList<Items> items) {
		this.items = items;
	}

	/**
	 * @see #setMaxStaggerLines(Number)
	 */
	public Number getMaxStaggerLines() {
		return maxStaggerLines;
	}

	/**
	 * Horizontal axis only. When `staggerLines` is not set, `maxStaggerLines`
	 * defines how many lines the axis is allowed to add to automatically avoid
	 * overlapping X labels. Set to `1` to disable overlap detection.
	 */
	public void setMaxStaggerLines(Number maxStaggerLines) {
		this.maxStaggerLines = maxStaggerLines;
	}

	/**
	 * @see #setOverflow(Overflow)
	 */
	public Overflow getOverflow() {
		return overflow;
	}

	/**
	 * How to handle overflowing labels on horizontal axis. Can be undefined,
	 * `false` or `"justify"`. By default it aligns inside the chart area. If
	 * "justify", labels will not render outside the plot area. If `false`, it
	 * will not be aligned at all. If there is room to move it, it will be
	 * aligned to the edge, else it will be removed.
	 */
	public void setOverflow(Overflow overflow) {
		this.overflow = overflow;
	}

	/**
	 * @see #setPadding(Number)
	 */
	public Number getPadding() {
		return padding;
	}

	/**
	 * The pixel padding for axis labels, to ensure white space between them.
	 */
	public void setPadding(Number padding) {
		this.padding = padding;
	}

	/**
	 * @see #setPosition3d(String)
	 */
	public String getPosition3d() {
		return position3d;
	}

	/**
	 * Defines how the labels are be repositioned according to the 3D chart
	 * orientation. - `'offset'`: Maintain a fixed horizontal/vertical distance
	 * from the tick marks, despite the chart orientation. This is the backwards
	 * compatible behavior, and causes skewing of X and Z axes. - `'chart'`:
	 * Preserve 3D position relative to the chart. This looks nice, but hard to
	 * read if the text isn't forward-facing. - `'flap'`: Rotated text along the
	 * axis to compensate for the chart orientation. This tries to maintain text
	 * as legible as possible on all orientations. - `'ortho'`: Rotated text
	 * along the axis direction so that the labels are orthogonal to the axis.
	 * This is very similar to `'flap'`, but prevents skewing the labels (X and
	 * Y scaling are still present).
	 */
	public void setPosition3d(String position3d) {
		this.position3d = position3d;
	}

	public Boolean getReserveSpace() {
		return reserveSpace;
	}

	public void setReserveSpace(Boolean reserveSpace) {
		this.reserveSpace = reserveSpace;
	}

	/**
	 * @see #setSkew3d(Boolean)
	 */
	public Boolean getSkew3d() {
		return skew3d;
	}

	/**
	 * If enabled, the axis labels will skewed to follow the perspective. This
	 * will fix overlapping labels and titles, but texts become less legible due
	 * to the distortion. The final appearance depends heavily on
	 * `labels.position3d`.
	 */
	public void setSkew3d(Boolean skew3d) {
		this.skew3d = skew3d;
	}

	/**
	 * @see #setStaggerLines(Number)
	 */
	public Number getStaggerLines() {
		return staggerLines;
	}

	/**
	 * Horizontal axes only. The number of lines to spread the labels over to
	 * make room or tighter labels.
	 */
	public void setStaggerLines(Number staggerLines) {
		this.staggerLines = staggerLines;
	}

	/**
	 * @see #setStep(Number)
	 */
	public Number getStep() {
		return step;
	}

	/**
	 * To show only every _n_'th label on the axis, set the step to _n_. Setting
	 * the step to 2 shows every other label. By default, the step is calculated
	 * automatically to avoid overlap. To prevent this, set it to 1\. This
	 * usually only happens on a category axis, and is often a sign that you
	 * have chosen the wrong axis type. Read more at [Axis
	 * docs](http://www.highcharts.com/docs/chart-concepts/axes) => What axis
	 * should I use?
	 */
	public void setStep(Number step) {
		this.step = step;
	}

	/**
	 * @see #setUseHTML(Boolean)
	 */
	public Boolean getUseHTML() {
		return useHTML;
	}

	/**
	 * Whether to [use HTML](http://www.highcharts.com/docs/chart-
	 * concepts/labels-and-string-formatting#html) to render the labels.
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
	 * The x position offset of the label relative to the tick position on the
	 * axis. Defaults to -15 for left axis, 15 for right axis.
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
	 * The y position offset of the label relative to the tick position on the
	 * axis.
	 */
	public void setY(Number y) {
		this.y = y;
	}

	/**
	 * @see #setZIndex(Number)
	 */
	public Number getZIndex() {
		return zIndex;
	}

	/**
	 * The Z index for the axis labels.
	 */
	public void setZIndex(Number zIndex) {
		this.zIndex = zIndex;
	}
}
