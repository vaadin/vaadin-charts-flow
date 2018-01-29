package com.vaadin.flow.component.charts;

import com.vaadin.flow.server.BootstrapListener;
import com.vaadin.flow.server.BootstrapPageResponse;
import org.jsoup.nodes.Element;

public class CustomBootstrapListener implements BootstrapListener {

	@Override public void modifyBootstrapPage(BootstrapPageResponse response) {
		injectInlineCustomStyles(response.getDocument().head());
	}

	private void injectInlineCustomStyles(Element head) {
		head.append(
				"<meta name=\"viewport\" content=\"width=device-width, minimum-scale=1, initial-scale=1, user-scalable=yes\">"
			+   "<meta name=\"theme-color\" content=\"#00B4F0\">");
	}
}
