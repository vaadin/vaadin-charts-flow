package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class States extends AbstractConfigurationObject {

	private Hover hover;
	private Select select;

	public States() {
	}

	/**
	 * @see #setHover(Hover)
	 */
	public Hover getHover() {
		if (hover == null) {
			hover = new Hover();
		}
		return hover;
	}

	public void setHover(Hover hover) {
		this.hover = hover;
	}

	/**
	 * @see #setSelect(Select)
	 */
	public Select getSelect() {
		if (select == null) {
			select = new Select();
		}
		return select;
	}

	/**
	 * The appearance of the point marker when selected. In order to allow a
	 * point to be selected, set the <code>series.allowPointSelect</code> option
	 * to true.
	 */
	public void setSelect(Select select) {
		this.select = select;
	}
}