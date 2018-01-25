package com.vaadin.flow.component.charts;

import com.vaadin.flow.server.RequestHandler;
import com.vaadin.flow.server.VaadinRequest;
import com.vaadin.flow.server.VaadinResponse;
import com.vaadin.flow.server.VaadinSession;
import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class StaticFileServer implements RequestHandler {

    @Override
    public boolean handleRequest(VaadinSession session, VaadinRequest request, VaadinResponse response) throws IOException {
        final String requestPath = request.getPathInfo();
        System.out.println("Request to serve file: " + requestPath);
        if (requestPath.startsWith("/examples")) {
            response.setContentType("text/html");
            response.getWriter().write(IOUtils.toString(getClass().getResourceAsStream(requestPath)));
            System.out.println("File served");
            return true;
        }
        return false;
    }
}