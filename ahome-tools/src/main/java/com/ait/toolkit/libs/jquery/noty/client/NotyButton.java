package com.ait.toolkit.libs.jquery.noty.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

public class NotyButton extends JsObject {

	public NotyButton() {
		jsObj = JsoHelper.createObject();
		setType(NotyButtonType.DEFAULT);
	}

	public NotyButton(String text) {
		this();
		setText(text);
	}

	public NotyButton(String text, NotyButtonType type) {
		this();
		setText(text);
		setType(type);
	}

	public NotyButton(String text, NotyButtonClickHandler clickHandler) {
		this(text);
		addClickHandker(clickHandler);
	}

	public NotyButton(String text, NotyButtonType type, NotyButtonClickHandler clickHandler) {
		this(text, type);
		addClickHandker(clickHandler);
	}

	public void setType(NotyButtonType type) {
		JsoHelper.setAttribute(jsObj, "addClass", type.getValue());
	}

	public void setText(String value) {
		JsoHelper.setAttribute(jsObj, "text", value);
	}

	public native void addClickHandker(NotyButtonClickHandler handler)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.onClick = function(n) {
			var noty = @com.ait.toolkit.libs.jquery.noty.client.Noty::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
			handler.@com.ait.toolkit.libs.jquery.noty.client.NotyButtonClickHandler::onClick(Lcom/ait/toolkit/libs/jquery/noty/client/Noty;)(noty);
		};
	}-*/;

}
