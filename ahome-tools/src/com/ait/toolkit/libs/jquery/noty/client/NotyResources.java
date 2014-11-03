package com.ait.toolkit.libs.jquery.noty.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface NotyResources extends ClientBundle {

	@Source("lib.js")
	TextResource js();

	@Source("btn.css")
	TextResource buttonCss();
}
