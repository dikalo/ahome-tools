package com.ait.toolkit.libs.moment.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class MomentConfig extends JsObject {

	protected MomentConfig(JavaScriptObject peer) {
		jsObj = peer;
	}

	public MomentConfig() {
		jsObj = JsoHelper.createObject();
	}

	public void setSeconds(int value) {
		JsoHelper.setAttribute(jsObj, "seconds", value);
	}

	public void setMinutes(int value) {
		JsoHelper.setAttribute(jsObj, "minutes", value);
	}

	public void setHours(int value) {
		JsoHelper.setAttribute(jsObj, "hours", value);
	}

	public void setDays(int value) {
		JsoHelper.setAttribute(jsObj, "days", value);
	}

	public void setWeeks(int value) {
		JsoHelper.setAttribute(jsObj, "weeks", value);
	}

	public void setMonths(int value) {
		JsoHelper.setAttribute(jsObj, "months", value);
	}

	public void setYears(int value) {
		JsoHelper.setAttribute(jsObj, "years", value);
	}
}
