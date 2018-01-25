package com.vaadin.flow.component.charts.model;
/**
 * Highchart by default puts a credits label in the lower right corner of the
 * chart. This can be changed using these options.
 */
public class Credits extends AbstractConfigurationObject {

	private Boolean enabled;
	private String href;
	private Position position;
	private String text;

	public Credits() {
	}

	public Credits(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setEnabled(Boolean)
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * Whether to show the credits text.
	 * <p>
	 * Defaults to: true
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @see #setHref(String)
	 */
	public String getHref() {
		return href;
	}

	/**
	 * The URL for the credits label.
	 * <p>
	 * Defaults to: http://www.highcharts.com
	 */
	public void setHref(String href) {
		this.href = href;
	}

	/**
	 * @see #setPosition(Position)
	 */
	public Position getPosition() {
		if (position == null) {
			position = new Position();
		}
		return position;
	}

	/**
	 * Position configuration for the credits label.
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	public Credits(String text) {
		this.text = text;
	}

	/**
	 * @see #setText(String)
	 */
	public String getText() {
		return text;
	}

	/**
	 * The text for the credits label.
	 * <p>
	 * Defaults to: Highcharts.com
	 */
	public void setText(String text) {
		this.text = text;
	}
}