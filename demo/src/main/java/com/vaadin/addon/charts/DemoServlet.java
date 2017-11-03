package com.vaadin.addon.charts;

import com.vaadin.server.VaadinServlet;
import com.vaadin.server.VaadinServletConfiguration;

import javax.servlet.annotation.WebServlet;

@WebServlet("/*")
@VaadinServletConfiguration(productionMode = false, ui = ChartsDemoUI.class)
public class DemoServlet extends VaadinServlet {
}
