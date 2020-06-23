package com.vaadin.flow.component.charts.model;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TODO Link node ids to to and from. NodeSeriesItem.
@JsonPropertyOrder({"nodes","values"})
public class NodeSeries extends AbstractSeries {
    private final String[] keys = new String[] { "to", "from" };

    private List<Node> nodes;
    private List<Link> data;

    public void add(Node node) {
        ensureNodes();
        if(!nodes.contains(node)) {
            nodes.add(node);
        }
    }

    public List<Node> getNodes() {
        return nodes != null ?
            Collections.unmodifiableList(nodes) :
            Collections.emptyList();
    }

    public void add(Node parent, Node child) {
        add(parent);
        add(child);
        addLink(parent, child);
    }

    public String[][] getData() {
        if(data == null) {
            return new String[0][0];
        }
        return data.stream().map(Link::toArray).toArray(String[][]::new);
    }

    private void addLink(Node from, Node to) {
       ensureLinks();
       Link link = new Link();
       link.from = from;
       link.to = to;
       data.add(link);
    }

    private void ensureNodes() {
        nodes = nodes != null ? nodes : new ArrayList<>();
    }

    private void ensureLinks() {
        data = data != null ? data : new ArrayList<>();
    }

    public class Link extends AbstractConfigurationObject {
        @JsonIdentityReference
        private Node from;

        @JsonIdentityReference
        private Node to;

        private String[] toArray() {
            return new String[]{from.getId(), to.getId()};
        }
    }
}
