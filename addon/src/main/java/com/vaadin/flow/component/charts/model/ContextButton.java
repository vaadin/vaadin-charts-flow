package com.vaadin.flow.component.charts.model;

import javax.annotation.Generated;
import java.util.ArrayList;

/**
 * Options for the export button. In styled mode, export button styles can be
 * applied with the `.highcharts-contextbutton` class.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/vaadin-charts-flow/issues/new")
public class ContextButton extends ButtonOptions {

	private String _titleKey;
	private String className;
	private String menuClassName;
	private ArrayList<ContextButtonMenuItem> menuItems;
	private String _fn_onclick;
	private String symbol;
	private Number x;

	public ContextButton() {
	}

	/**
	 * @see #set_titleKey(String)
	 */
	public String get_titleKey() {
		return _titleKey;
	}

	/**
	 * The key to a [lang](#lang) option setting that is used for the button's
	 * title tooltip. When the key is `contextButtonTitle`, it refers to
	 * [lang.contextButtonTitle](#lang.contextButtonTitle) that defaults to
	 * "Chart context menu".
	 */
	public void set_titleKey(String _titleKey) {
		this._titleKey = _titleKey;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * The class name of the context button.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setMenuClassName(String)
	 */
	public String getMenuClassName() {
		return menuClassName;
	}

	/**
	 * The class name of the menu appearing from the button.
	 */
	public void setMenuClassName(String menuClassName) {
		this.menuClassName = menuClassName;
	}

	/**
	 * @see #setMenuItems(ArrayList)
	 */
	public ArrayList<ContextButtonMenuItem> getMenuItems() {
		if (menuItems == null) {
			menuItems = new ArrayList<ContextButtonMenuItem>();
		}
		return menuItems;
	}

	/**
	 * A collection of strings pointing to config options for the menu items.
	 * The config options are defined in the `menuItemDefinitions` option. By
	 * default, there is the "Print" menu item plus one menu item for each of
	 * the available export types. Defaults to
	 * 
	 * <pre>
	 * 	[
	 * 	   'printChart',
	 * 	   'separator',
	 * 	   'downloadPNG',
	 * 	   'downloadJPEG',
	 * 	   'downloadPDF',
	 * 	   'downloadSVG'
	 * 	]
	 * </pre>
	 */
	public void setMenuItems(ArrayList<ContextButtonMenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	/**
	 * @see #set_fn_onclick(String)
	 */
	public String getOnclick() {
		return _fn_onclick;
	}

	/**
	 * A click handler callback to use on the button directly instead of the
	 * popup menu.
	 */
	public void setOnclick(String _fn_onclick) {
		this._fn_onclick = _fn_onclick;
	}

	/**
	 * @see #setSymbol(String)
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * The symbol for the button. Points to a definition function in the
	 * `Highcharts.Renderer.symbols` collection. The default `exportIcon`
	 * function is part of the exporting module.
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * @see #setX(Number)
	 */
	public Number getX() {
		return x;
	}

	/**
	 * The horizontal position of the button relative to the `align` option.
	 */
	public void setX(Number x) {
		this.x = x;
	}
}
