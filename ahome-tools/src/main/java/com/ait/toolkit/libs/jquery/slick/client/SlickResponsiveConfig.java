package com.ait.toolkit.libs.jquery.slick.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

public class SlickResponsiveConfig extends JsObject {

	public SlickResponsiveConfig() {
		jsObj = JsoHelper.createObject();
	}

	public void setBreakPoint(int value) {
		JsoHelper.setAttribute(jsObj, "breakPoint", value);
	}

	public void setSettings(SlickConfig value) {
		JsoHelper.setAttribute(jsObj, "settings", value.getJsObj());
	}

}
