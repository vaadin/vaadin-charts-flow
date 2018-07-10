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
