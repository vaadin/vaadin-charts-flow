package com.vaadin.flow.component.charts.model;

import java.util.ArrayList;
import java.util.List;

public class LinkSeries extends AbstractSeries {
    private List<String[]> data;

    public void add(String from, String to) {
       if(data == null)  {
           data = new ArrayList<>();
       }
       data.add(new String[]{from, to});
    }
}
