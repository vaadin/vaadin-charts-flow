package com.vaadin.addon.charts;

import com.vaadin.ui.Component;
import com.vaadin.ui.Tag;
import com.vaadin.ui.common.HtmlImport;

@Tag("demo-snippet")
@HtmlImport("frontend://bower_components/iron-demo-helpers/demo-snippet.html")
public class DemoSnippet extends Component {

    public void setContent(Component content) {
        getElement().getShadowRoot()
                .orElseGet(() -> getElement().attachShadow())
                .appendChild(content.getElement());
    }

    public void setMarkdown(String markdown) {
        getElement().setProperty("_markdown", markdown);
    }
}
