package com.ait.toolkit.libs.jquery.collapser.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface CollapserResources extends ClientBundle {

	@Source("lib.js")
	public TextResource lib();

	@Source("libMin.js")
	public TextResource libMin();
}
