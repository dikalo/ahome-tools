package com.ait.toolkit.libs.jquery.notify.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface NotifyResouces extends ClientBundle {

	@Source("lib.js")
	TextResource js();

	@Source("style.css")
	TextResource css();

}
