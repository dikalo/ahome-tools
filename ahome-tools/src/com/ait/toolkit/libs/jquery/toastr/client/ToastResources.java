package com.ait.toolkit.libs.jquery.toastr.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface ToastResources extends ClientBundle {

	@Source("lib.js")
	TextResource js();

	@Source("style.css")
	TextResource css();
}
