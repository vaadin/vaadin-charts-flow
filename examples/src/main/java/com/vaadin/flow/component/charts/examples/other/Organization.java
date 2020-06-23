package com.vaadin.flow.component.charts.examples.other;

import com.vaadin.flow.component.charts.AbstractChartExample;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.ChartType;
import com.vaadin.flow.component.charts.model.Configuration;
import com.vaadin.flow.component.charts.model.DataLabels;
import com.vaadin.flow.component.charts.model.Exporting;
import com.vaadin.flow.component.charts.model.Level;
import com.vaadin.flow.component.charts.model.NodeSeries;
import com.vaadin.flow.component.charts.model.Node;
import com.vaadin.flow.component.charts.model.PlotOptionsOrganization;
import com.vaadin.flow.component.charts.model.Tooltip;
import com.vaadin.flow.component.charts.model.style.SolidColor;

import java.util.Arrays;
import java.util.List;

public class Organization extends AbstractChartExample {

    @Override
    public void initDemo() {
        Chart chart = new Chart(ChartType.ORGANIZATION);

        Configuration conf = chart.getConfiguration();
        conf.getTooltip().setEnabled(true);
        conf.getChart().setInverted(true);
        conf.getChart().setStyledMode(false);
        //conf.setExporting(createExporting());
        conf.setTooltip(createTooltip());

        PlotOptionsOrganization plotOptions = new PlotOptionsOrganization();
        plotOptions.setColorByPoint(false);
        plotOptions.setColor(new SolidColor("#007ad0"));
        DataLabels dataLabels = new DataLabels();
        dataLabels.setColor(SolidColor.BLACK);
        plotOptions.setDataLabels(dataLabels);
        plotOptions.setBorderColor(SolidColor.WHITE);
        plotOptions.setNodeWidth(100);

        NodeSeries series = createSeries();
        series.setPlotOptions(plotOptions);

        createLevels().forEach(plotOptions::addLevel);
        chart.getConfiguration().addSeries(series);

        chart.getConfiguration().setTitle("Acme organization chart");

        add(chart);
    }

    private Exporting createExporting() {
        Exporting exporting = new Exporting();
        exporting.setAllowHTML(true);
        exporting.setSourceWidth(800);
        exporting.setSourceHeight(600);
        return exporting;
    }

    private Tooltip createTooltip() {
        Tooltip tooltip = new Tooltip();
        tooltip.setOutside(true);
        return tooltip;
    }

    private NodeSeries createSeries() {
        NodeSeries series = new NodeSeries();
        Node acme = createNode( "Acme" );
        series.add(acme);
        Node headOffice = add(series, acme,createNode("Head Office" ));
        add(series, acme,createNode("Labs" ));
        Node coyoteBuilding = add(series, headOffice,createNode("Coyote Building" ));
        Node roadRunnerBuilding = add(series, headOffice,createNode("Road Runner Building" ));
        Node sales = add(series, coyoteBuilding,createNode("Sales" ));
        Node marketing = add(series, coyoteBuilding , createNode("Marketing" ));
        Node accounting = add(series, coyoteBuilding, createNode("Accounting" ));
        Node administration = add(series, roadRunnerBuilding, createNode("Administration" ));
        Node mdsOffice = add(series, roadRunnerBuilding, createNode("MD&apos;s Office" ));
        Node josephMiler = add(series, sales, createNode("Joseph Miler", "Head of Sales" ));
        Node erikPerez = add(series, marketing, createNode("Erik Perez", "Head of Marketing" ));
        Node emilyFox = add(series, accounting, createNode("Emily Fox", "Head of Accounting" ));
        Node ewanHerbert = add(series, administration, createNode("Ewan Herbert", "Head of Admin" ));
        Node kateKirby = add(series, josephMiler, createNode("Kate Kirby" ));
        Node vaughnWhiting = add(series, josephMiler, createNode("Vaughn Whiting" ));
        Node lisaWarner = add(series, erikPerez, createNode("Lisa Warner" ));
        Node mollyDodd = add(series, ewanHerbert, createNode("Molly Dodd" ));
        Node natashaKelly = add(series, ewanHerbert, createNode("Natasha Kelly" ));
        Node directorNode = add(series, mdsOffice, createNode("Sally Brown", "Managing Director"));
        directorNode.setName("Sally Brown");
        directorNode.setColor(new SolidColor("#E4B651"));

        return series;
    }

    private Node add(NodeSeries series, Node from, Node to) {
       series.add(from, to);
       return to;
    }

    private Node createNode(String id) {
       Node node = new Node();
       node.setId(id);
       return node;
    }

    private Node createNode(String id, String title) {
        Node node = createNode(id);
        node.setTitle(title);
        return node;
    }

    private List<Level> createLevels() {
        Level level0 = createLevel(0, "#99AED3");
        //level0.setHeight(125);
        Level level1 = createLevel(1, "#CCE6C3");
        //level1.setHeight(125);
        Level level2 = createLevel(2, "#E1F39D");
        Level level3 = createLevel(3, "#CCE6C3");
        Level level4 = createLevel(4, "#CABEDC");
        Level level5 = createLevel(5, "#CABDD4");
        return Arrays.asList(level0, level1, level2, level3, level4, level5);
    }

    private Level createLevel(int levelNumber, String color) {
        Level level = new Level();
        level.setColor(new SolidColor(color));
        level.setLevel(levelNumber);
        level.setHeight(125);
        return level;
    }
}
