package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;

/**
 * Options for the button appearing when drilling down in a treemap.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class DrillUpButton extends AbstractConfigurationObject {

	private Position position;
	private DrillUpButtonRelativeTo relativeTo;
	private ButtonTheme theme;

	public DrillUpButton() {
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
	 * The position of the button.
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * @see #setRelativeTo(DrillUpButtonRelativeTo)
	 */
	public DrillUpButtonRelativeTo getRelativeTo() {
		return relativeTo;
	}

	/**
	 * What box to align the button to. Can be either `plotBox` or `spacingBox`.
	 */
	public void setRelativeTo(DrillUpButtonRelativeTo relativeTo) {
		this.relativeTo = relativeTo;
	}

	/**
	 * @see #setTheme(ButtonTheme)
	 */
	public ButtonTheme getTheme() {
		if (theme == null) {
			theme = new ButtonTheme();
		}
		return theme;
	}

	/**
	 * A collection of attributes for the button. The object takes SVG
	 * attributes like `fill`, `stroke`, `stroke-width` or `r`, the border
	 * radius. The theme also supports `style`, a collection of CSS properties
	 * for the text. Equivalent attributes for the hover state are given in
	 * `theme.states.hover`.
	 */
	public void setTheme(ButtonTheme theme) {
		this.theme = theme;
	}
}
