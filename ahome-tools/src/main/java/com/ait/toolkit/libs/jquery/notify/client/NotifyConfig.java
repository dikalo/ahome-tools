package com.ait.toolkit.libs.jquery.notify.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

public class NotifyConfig extends JsObject {

	public NotifyConfig() {
		jsObj = JsoHelper.createObject();
	}

	public void setType(NotifyType value) {
		setType(value.name().toLowerCase());
	}

	public void setType(String value) {
		JsoHelper.setAttribute(jsObj, "type", value);
	}

	public void setPosition(String value) {
		JsoHelper.setAttribute(jsObj, "position", value);
	}

	public void setPosition(NotifyPosition value) {
		setType(value.name().toLowerCase());
	}

	public void setMessage(String value) {
		JsoHelper.setAttribute(jsObj, "msg", value);
	}

	public void setHeight(String value) {
		JsoHelper.setAttribute(jsObj, "height", value);
	}

	public void setHeight(int value) {
		JsoHelper.setAttribute(jsObj, "height", value);
	}

	public void setautoHide(int value) {
		JsoHelper.setAttribute(jsObj, "autoHide", value);
	}

	public void setOpacity(int value) {
		JsoHelper.setAttribute(jsObj, "opacity", value);
	}

	public void setMultiline(int value) {
		JsoHelper.setAttribute(jsObj, "multiline", value);
	}

	public void setFade(int value) {
		JsoHelper.setAttribute(jsObj, "fade", value);
	}

	public void setBackgroundColor(String value) {
		JsoHelper.setAttribute(jsObj, "backgroundColor", value);
	}

	public void setTimeOut(int value) {
		JsoHelper.setAttribute(jsObj, "timeout", value);
	}

	public void setColor(String value) {
		JsoHelper.setAttribute(jsObj, "color", value);
	}

	public void setWidth(String value) {
		JsoHelper.setAttribute(jsObj, "width", value);
	}

	public void setWidth(int value) {
		JsoHelper.setAttribute(jsObj, "width", value);
	}

}
