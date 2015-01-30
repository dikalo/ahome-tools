package com.ait.toolkit.libs.jquery.slick.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface SlickResources extends ClientBundle {

	@Source("slick.js")
	TextResource js();

	@Source("slick.css")
	TextResource css();
}
