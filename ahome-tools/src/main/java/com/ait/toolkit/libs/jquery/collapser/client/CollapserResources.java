package com.ait.toolkit.libs.jquery.collapser.client;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface CollapserResources extends ClientBundle {

	public static final CollapserResources INSTANCE = GWT.create(CollapserResources.class);

	@Source("lib.js")
	public TextResource lib();

	@Source("libMin.js")
	public TextResource libMin();
}
