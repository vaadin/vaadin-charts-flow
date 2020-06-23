package com.vaadin.flow.component.charts.model;

/*-
 * #%L
 * Vaadin Charts for Flow
 * %%
 * Copyright (C) 2014 - 2020 Vaadin Ltd
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

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@JsonPropertyOrder({ "nodes", "values" })
public class NodeSeries extends AbstractSeries {

    private List<NodeSeriesItem> data;

    private static boolean containsNode(NodeSeriesItem item, Node node) {
        return equals(item.getFrom(), node) || equals(item.getTo(), node);
    }

    private static boolean equals(Node node1, Node node2) {
        return node1.getId().equals(node2.getId());
    }

    public void add(NodeSeriesItem nodeSeriesItem) {
        validateNodeSeriesItem(nodeSeriesItem);
        ensureLinks().add(nodeSeriesItem);
    }

    public NodeSeriesItem add(Node from, Node to) {
        NodeSeriesItem item = new NodeSeriesItem(from, to);
        add(item);
        return item;
    }

    public void remove(NodeSeriesItem nodeSeriesItem) {
        validateNodeSeriesItem(nodeSeriesItem);
        if (data != null) {
            data.remove(nodeSeriesItem);
        }
    }

    public void remove(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("Node may not be null");
        }
        if (data != null) {
            data = data.stream().filter(item -> !containsNode(item, node))
                .collect(Collectors.toList());
        }
    }

    @JsonGetter
    public Collection<Node> getNodes() {
        if (data == null) {
            return Collections.emptyList();
        }
        return data.stream()
            .flatMap(item -> Stream.of(item.getFrom(), item.getTo()))
            .collect(LinkedHashMap<String, Node>::new,
                (map, item) -> map.putIfAbsent(item.getId(), item),
                (map1, map2) -> {
                    throw new UnsupportedOperationException();
                }).values();
    }

    private void validateNodeSeriesItem(NodeSeriesItem item) {
        if (item == null) {
            throw new IllegalArgumentException(
                "NodeSeriesItem may not be null");
        }
        item.validate();
        if (item.getFrom() == null) {
            throw new IllegalArgumentException(
                "NodeSeriesItem must have a from node");
        }
        if (item.getTo() == null) {
            throw new IllegalArgumentException(
                "NodeSeriesItem must have a to node");
        }
    }

    private List<NodeSeriesItem> ensureLinks() {
        return data = data != null ? data : new ArrayList<>();
    }

}
