package com.ait.toolkit.libs.intro.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

public class IntroStep extends JsObject {

	public IntroStep() {
		jsObj = JsoHelper.createObject();
	}

	public IntroStep setIntro(String value) {
		JsoHelper.setAttribute(jsObj, "intro", value);
		return this;
	}

	public IntroStep setPosition(TooltipPosition value) {
		JsoHelper.setAttribute(jsObj, "position", value.name().replace("_", "-").toLowerCase());
		return this;
	}

	public IntroStep setElement(String value) {
		JsoHelper.setAttribute(jsObj, "element", "#" + value);
		return this;
	}

	public IntroStep setElement(Element value) {
		JsoHelper.setAttribute(jsObj, "element", value);
		return this;
	}

	public IntroStep setElement(Widget element) {
		return setElement(element.getElement());
	}
}
