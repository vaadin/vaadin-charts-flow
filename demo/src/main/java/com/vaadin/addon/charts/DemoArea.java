package com.vaadin.addon.charts;

import com.vaadin.flow.dom.Element;
import com.vaadin.flow.model.TemplateModel;
import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;
import com.vaadin.ui.html.Div;
import com.vaadin.ui.html.H2;
import com.vaadin.ui.polymertemplate.Id;
import com.vaadin.ui.polymertemplate.PolymerTemplate;

@Tag("demo-area")
@HtmlImport("frontend://bower_components/vaadin-charts/vaadin-chart.html")
@HtmlImport("frontend://src/common/demo-area.html")
public class DemoArea extends PolymerTemplate<TemplateModel> {


    @Id("background")
    private Div div;

    private Component currentContent;

    public void setContent(Component content) {
        System.out.println("DIV: " + div);
        if (currentContent != null) {
            div.getElement().removeChild(currentContent.getElement());
        }

//        div.getElement().appendChild(content.getElement());
        div.setText("SAYO: " + Math.random());
        div.getElement().appendChild(new H2("Sayo").getElement());

//        currentContent = content.getElement();
    }
}
