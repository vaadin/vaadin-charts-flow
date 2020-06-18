package com.vaadin.flow.component.charts.examples.other;

import com.vaadin.flow.component.charts.AbstractChartExample;
import com.vaadin.flow.component.charts.Chart;
import com.vaadin.flow.component.charts.model.ChartType;
import com.vaadin.flow.component.charts.model.Configuration;
import com.vaadin.flow.component.charts.model.DataLabels;
import com.vaadin.flow.component.charts.model.DataSeries;
import com.vaadin.flow.component.charts.model.DataSeriesItem;
import com.vaadin.flow.component.charts.model.Exporting;
import com.vaadin.flow.component.charts.model.HorizontalAlign;
import com.vaadin.flow.component.charts.model.Level;
import com.vaadin.flow.component.charts.model.LinkSeries;
import com.vaadin.flow.component.charts.model.Node;
import com.vaadin.flow.component.charts.model.PlotOptionsOrganization;
import com.vaadin.flow.component.charts.model.PlotOptionsTreemap;
import com.vaadin.flow.component.charts.model.Tooltip;
import com.vaadin.flow.component.charts.model.TreeMapLayoutAlgorithm;
import com.vaadin.flow.component.charts.model.TreeSeries;
import com.vaadin.flow.component.charts.model.TreeSeriesItem;
import com.vaadin.flow.component.charts.model.VerticalAlign;
import com.vaadin.flow.component.charts.model.style.Color;
import com.vaadin.flow.component.charts.model.style.SolidColor;

import java.util.ArrayList;
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
        conf.setExporting(createExporting());
        conf.setTooltip(createTooltip());

        PlotOptionsOrganization plotOptions = new PlotOptionsOrganization();
        plotOptions.setKeys("from","to");
        plotOptions.setColorByPoint(false);
        plotOptions.setColor(new SolidColor("#007ad0"));
        DataLabels dataLabels = new DataLabels();
        dataLabels.setColor(SolidColor.BLACK);
        plotOptions.setDataLabels(dataLabels);
        plotOptions.setBorderColor(SolidColor.WHITE);
        plotOptions.setNodeWidth(65);

        LinkSeries series = createSeries();
        series.setPlotOptions(plotOptions);

        createLevels().forEach(plotOptions::addLevel);
        createNodes().forEach(plotOptions::addNode);
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

    private LinkSeries createSeries() {
        LinkSeries series = new LinkSeries();
        series.add("Acme", "Head Office");
        series.add("Acme", "Labs");
        series.add("Head Office", "Coyote Building");
        series.add("Head Office", "Road Runner Building");
        series.add("Coyote Building", "Sales");
        series.add("Coyote Building", "Marketing");
        series.add("Coyote Building", "Accounting");
        series.add("Road Runner Building", "Administration");
        series.add("Road Runner Building", "MD&apos;s Office");
        series.add("Sales", "Joseph Miler");
        series.add("Marketing", "Erik Perez");
        series.add("Accounting", "Emily Fox");
        series.add("Administration", "Ewan Herbert");
        series.add("MD&apos;s Office", "Sally Brown");
        series.add("Joseph Miler", "Kate Kirby");
        series.add("Joseph Miler", "Vaughn Whiting");
        series.add("Erik Perez", "Lisa Warner");
        series.add("Ewan Herbert", "Molly Dodd");
        series.add("Ewan Herbert", "Natasha Kelly");

        return series;
    }

    private List<Node> createNodes() {
        List<Node> nodes = new ArrayList<>();
        nodes.add(createNode( "Acme" ));
        nodes.add(createNode("Head Office" ));
        nodes.add(createNode("Labs" ));
        nodes.add(createNode("Coyote Building" ));
        nodes.add(createNode("Road Runner Building" ));
        nodes.add(createNode("Sales" ));
        nodes.add(createNode("Marketing" ));
        nodes.add(createNode("Accounting" ));
        nodes.add(createNode("Administration" ));
        nodes.add(createNode("MD&apos;s Office" ));
        nodes.add(createNode("Joseph Miler", "Head of Sales" ));
        nodes.add(createNode("Erik Perez", "Head of Marketing" ));
        nodes.add(createNode("Emily Fox", "Head of Accounting" ));
        nodes.add(createNode("Ewan Herbert", "Head of Admin" ));
        nodes.add(createNode("Lisa Warner" ));
        nodes.add(createNode("Kate Kirby" ));
        nodes.add(createNode("Vaughn Whiting" ));
        nodes.add(createNode("Molly Dodd" ));
        nodes.add(createNode("Natasha Kelly" ));
        Node directorNode = createNode("Sally Brown", "Managing Director");
        directorNode.setName("Sally Brown");
        directorNode.setColor(new SolidColor("#E4B651"));
        nodes.add(directorNode);
        return nodes;
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
        level0.setHeight(25);
        Level level1 = createLevel(1, "#CCE6C3");
        level1.setHeight(25);
        Level level2 = createLevel(2, "#E1F39D");
        Level level3 = createLevel(3, "#CCE6C3");
        Level level4 = createLevel(4, "#CABEDC");
        Level level5 = createLevel(5, "#CABDD4");
        return Arrays.asList(level0, level1, level2, level3, level4, level5);
    }

    private Level createLevel(int level, String color) {
        Level level5 = new Level();
        level5.setColor(new SolidColor("#CABDD4"));
        level5.setLevel(5);
        return level5;
    }
}
