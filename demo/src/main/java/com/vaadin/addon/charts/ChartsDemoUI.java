package com.vaadin.addon.charts;

import com.vaadin.flow.dom.Element;
import com.vaadin.router.HasUrlParameter;
import com.vaadin.router.OptionalParameter;
import com.vaadin.router.Route;
import com.vaadin.router.event.BeforeNavigationEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.UI;
import com.vaadin.ui.common.JavaScript;
import com.vaadin.ui.html.Label;
import com.vaadin.ui.polymertemplate.Id;
import org.reflections.Reflections;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;

/**
 * The Application's "main" class
 */
@SuppressWarnings("serial")
@JavaScript("prettify.js")
@Route("/*")
public class ChartsDemoUI extends UI implements HasUrlParameter<String> {

    private static final Properties prop = new Properties();

    static {
        try {
            prop.load(ChartsDemoUI.class.getResourceAsStream("config.properties"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static Map<String, List<Class<? extends AbstractVaadinChartExample>>> tests;

    private static final String[] GROUP_ORDER = {"columnandbar", "pie",
            "area", "lineandscatter", "dynamic", "combinations", "other",
            "dataprovider", "timeline", "threed", "declarative", "container" };
    private static final String[] GROUP_CAPTIONS = {"Column and Bar", "Pie",
            "Area", "Line and Scatter", "Dynamic", "Combinations", "Other",
            "Data Provider", "Timeline", "3D", "Declarative",
            "Vaadin 7 Container" };

    static {
        Reflections reflections = new Reflections("com.vaadin.addon.charts.examples");

        Set<Class<? extends AbstractVaadinChartExample>> subTypes = reflections
                .getSubTypesOf(AbstractVaadinChartExample.class);

        Map<String, List<Class<? extends AbstractVaadinChartExample>>> grouped = subTypes.stream()
                .filter(e -> !e.isAnnotationPresent(SkipFromDemo.class))
                .collect(groupingBy(ChartsDemoUI::lastTokenInPackageName));
        grouped.values().forEach(e -> e.sort(comparing(Class::getSimpleName)));

        tests = grouped;
    }

    @Id("navigation")
    private Element demoNavigation;

    @Id("snippet")
    private Element demoSnippet;

    @Override
    protected void init(VaadinRequest request) {
        Link homepage = new Link("Home page", new ExternalResource(
                "https://vaadin.com/add-ons/charts"));
        Link javadoc = new Link("JavaDoc", new ExternalResource(
                "http://demo.vaadin.com/javadoc/com.vaadin/vaadin-charts/"
                        + getVersion() + "/"));
        Link manual = new Link("Manual", new ExternalResource(
                "https://vaadin.com/docs/-/part/charts/charts-overview.html"));
        Label version = new Label("Version " + getVersion());
        version.addStyleName("version");
    }

    @Override
    public void setParameter(BeforeNavigationEvent event, @OptionalParameter String parameter) {

    }

    static String getVersion() {
        return prop.get("charts.version").toString();
    }

    static String splitCamelCase(String s) {
        String replaced = s.replaceAll(String.format("%s|%s|%s",
                "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
                "(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
        // Make things look nicer with some special case handling
        replaced = replaced.replaceAll("And", "and");
        replaced = replaced.replaceAll("With", "with");
        replaced = replaced.replaceAll("To", "to");
        replaced = replaced.replaceAll("Of", "of");
        replaced = replaced.replaceAll("Api", "API");
        replaced = replaced.replaceAll("3 D", "3D");
        return replaced.substring(0, 1).toUpperCase() + replaced.substring(1);
    }

    private static String lastTokenInPackageName(Class<? extends AbstractVaadinChartExample> clazz) {
        String name = clazz.getPackage().getName();
        return name.substring(name.lastIndexOf('.') + 1);
    }
}
