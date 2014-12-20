package com.ait.toolkit.libs.intro.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

public class IntroOptions extends JsObject {

	public IntroOptions() {
		jsObj = JsoHelper.createObject();
		JsoHelper.setAttribute(jsObj, "steps", JsoHelper.createJavaScriptArray());
	}

	public IntroOptions addSteps(IntroStep... steps) {
		for (IntroStep step : steps) {
			_addStep(step.getJsObj());
		}
		return this;
	}

	public IntroOptions addStep(IntroStep step) {
		_addStep(step.getJsObj());
		return this;
	}

	public IntroOptions setNextLabel(String value) {
		JsoHelper.setAttribute(jsObj, "nextLabel", value);
		return this;
	}

	public IntroOptions setPrevLabel(String value) {
		JsoHelper.setAttribute(jsObj, "prevLabel", value);
		return this;
	}

	public IntroOptions setSkipLabel(String value) {
		JsoHelper.setAttribute(jsObj, "skipLabel", value);
		return this;
	}

	public IntroOptions setDoneLabel(String value) {
		JsoHelper.setAttribute(jsObj, "doneLabel", value);
		return this;
	}

	public IntroOptions setToolTipPosition(TooltipPosition value) {
		JsoHelper.setAttribute(jsObj, "nextLabel", value.name().replace("_", "-").toLowerCase());
		return this;
	}

	public IntroOptions setTooltipClass(String value) {
		JsoHelper.setAttribute(jsObj, "tooltipClass", value);
		return this;
	}

	public IntroOptions setHighlightClass(String value) {
		JsoHelper.setAttribute(jsObj, "highlightClass", value);
		return this;
	}

	public IntroOptions setExitOnEsc(boolean value) {
		JsoHelper.setAttribute(jsObj, "exitOnOverlayClick", value);
		return this;
	}

	public IntroOptions setExitOnOverlayClick(boolean value) {
		JsoHelper.setAttribute(jsObj, "exitOnOverlayClick", value);
		return this;
	}

	public IntroOptions setShowSetNumbers(boolean value) {
		JsoHelper.setAttribute(jsObj, "showStepNumbers", value);
		return this;
	}

	public IntroOptions setKeyboardNavigation(boolean value) {
		JsoHelper.setAttribute(jsObj, "keyboardNavigation", value);
		return this;
	}

	public IntroOptions setShowButtons(boolean value) {
		JsoHelper.setAttribute(jsObj, "showButtons", value);
		return this;
	}

	public IntroOptions setShowBullets(boolean value) {
		JsoHelper.setAttribute(jsObj, "showBullets", value);
		return this;
	}

	public IntroOptions setShowProgress(boolean value) {
		JsoHelper.setAttribute(jsObj, "showProgress", value);
		return this;
	}

	public IntroOptions setScrollToElement(boolean value) {
		JsoHelper.setAttribute(jsObj, "scrollToElement", value);
		return this;
	}

	public IntroOptions setOverlayOpacitiy(int value) {
		JsoHelper.setAttribute(jsObj, "overlayOpacitiy", value);
		return this;
	}

	public IntroOptions setDisableInteraction(boolean value) {
		JsoHelper.setAttribute(jsObj, "disableInteraction", value);
		return this;
	}

	private native void _addStep(JavaScriptObject step)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.steps.push(step);
	}-*/;

}
