package com.ait.toolkit.libs.jquery.noty.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class NotyConfig extends JsObject {

	public NotyConfig() {
		jsObj = JsoHelper.createObject();
	}

	NotyConfig(JavaScriptObject peer) {
		jsObj = peer;
	}

	public void setText(String value) {
		JsoHelper.setAttribute(jsObj, "text", value);
	}

	public void setTheme(String value) {
		JsoHelper.setAttribute(jsObj, "theme", value);
	}

	public void setForce(boolean value) {
		JsoHelper.setAttribute(jsObj, "force", value);
	}

	public void setKiller(boolean value) {
		JsoHelper.setAttribute(jsObj, "killer", value);
	}

	public void setCloseWith(String... values) {
		JsArrayString v = JsArrayString.createArray().cast();
		for (String s : values) {
			v.push(s);
		}
		setCloseWidth(v);
	}

	private void setCloseWidth(JsArrayString value) {
		JsoHelper.setAttribute(jsObj, "closeWith", value);
	}

	public void setDissmissQeue(boolean value) {
		JsoHelper.setAttribute(jsObj, "dismissQueue", value);
	}

	public void setTimeOut(int value) {
		JsoHelper.setAttribute(jsObj, "timeout", value);
	}

	public void setPosition(NotyPosition position) {
		setLayout(position.getValue());
	}

	public void setSticky(boolean value) {
		JsoHelper.setAttribute(jsObj, "timeout", value);
	}

	public void setTemplate(String value) {
		JsoHelper.setAttribute(jsObj, "template", value);
	}

	public void setModal(boolean value) {
		JsoHelper.setAttribute(jsObj, "modal", value);
	}

	public void setButtons(boolean value) {
		JsoHelper.setAttribute(jsObj, "buttons", value);
	}

	public void setButtons(NotyButton... buttons) {
		JsoHelper.setAttribute(jsObj, "buttons", JsoHelper.convertToJavaScriptArray(buttons));
	}

	public void setType(NotyType type) {
		setType(type.name().toLowerCase());
	}

	public void addOnShowHandler(Function callback) {
		addCallback("onShow", callback);
	}

	public void addOnAfterShowHandler(Function callback) {
		addCallback("onAfterShow", callback);
	}

	public void addOnCloseHandler(Function callback) {
		addCallback("onClose", callback);
	}

	public void addOnAfterCloseHandler(Function callback) {
		addCallback("onAfterClose", callback);
	}

	private void setType(String value) {
		JsoHelper.setAttribute(jsObj, "type", value);
	}

	private void setLayout(String value) {
		JsoHelper.setAttribute(jsObj, "layout", value);
	}

	private native void addCallback(String event, Function fn)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.callback[event] = function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

	private native void setButtons(JavaScriptObject btns)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.buttons = btns;
	}-*/;

}
