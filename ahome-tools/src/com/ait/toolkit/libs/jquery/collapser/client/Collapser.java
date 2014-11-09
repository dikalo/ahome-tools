package com.ait.toolkit.libs.jquery.collapser.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A small and useful jQuery plugin for collapsing/truncating an element text by words, characters and lines
 */
public final class Collapser extends JsObject {

	private String target;
	private CollapserConfig config;
	private boolean wasApplied = false;

	private Collapser() {

	}

	public static Collapser createById(String targetId) {
		Collapser collapser = new Collapser();
		collapser.target = "#" + targetId;
		collapser.config = new CollapserConfig();
		return collapser;
	}

	public static Collapser createByClassName(String targetClassName) {
		Collapser collapser = new Collapser();
		collapser.target = "." + targetClassName;
		collapser.config = new CollapserConfig();
		return collapser;
	}

	public Collapser setMode(CollapserMode mode) {
		return _setMode(mode.name().toLowerCase());
	}

	private Collapser _setMode(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "mode", value);
		return this;
	}

	/**
	 * This element to be selected for toggling in “block” mode is specified here.<br/>
	 * Other modes dont use this value.<br/>
	 * If the value is a string, then accepted values are next/prev/siblings. <br/>
	 * This selects the element which is next/prev/sibling to the current one. <br/>
	 */
	public Collapser setTarget(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "target", value);
		return this;
	}

	/**
	 * The speed of transition of the height transtion during the element collapse.
	 * <p>
	 * Accepted values are time in milliseonds and strings: slow/medium/fast
	 */
	public Collapser setSpeed(CollapserSpeed speed) {
		return _setSpeed(speed.name().toLowerCase());
	}

	public Collapser setSpeed(int value) {
		JsoHelper.setAttribute(config.getJsObj(), "speed", value);
		return this;
	}

	public Collapser setTruncate(int value) {
		JsoHelper.setAttribute(config.getJsObj(), "truncate", value);
		return this;
	}

	/**
	 * The text displayed next to the hidden element to indicate the presence of more content.
	 * <p>
	 * Accepts both text and HTML string.
	 */
	public Collapser setEllipsis(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "ellipsis", value);
		return this;
	}

	/**
	 * The type of effect when toggling elements in “block” mode of operation.
	 * <p>
	 * Accepted values are “fade” for fadeIn/fadeOut transitions and “slide” for slideUp/slideDown transitions
	 */
	public Collapser setEffect(CollapserEffect effect) {
		return _setEffect(effect.name().toLowerCase());
	}

	public Collapser setControlButton(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "controlBtn", value);
		return this;
	}

	/**
	 * The text/HTML to be present in the control button when the element is in collapsed state.
	 */
	public Collapser setShowText(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "showText", value);
		return this;
	}

	/**
	 * The class name of the element when the element is in collapsed state.
	 */
	public Collapser setShowClass(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "showClass", value);
		return this;
	}

	/**
	 * The class name of the element when the element is in collapsed state.
	 */
	public Collapser setHideClass(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "hideClass", value);
		return this;
	}

	public Collapser setAtStart(CollapserStartState state) {
		JsoHelper.setAttribute(config.getJsObj(), "atStart", state.name().toLowerCase());
		return this;
	}

	/**
	 * This property removes the “hide” button once the content is expanded. Accepts boolean value.
	 */
	public Collapser setLockHide(boolean value) {
		JsoHelper.setAttribute(config.getJsObj(), "lockHide", value);
		return this;
	}

	/**
	 * This property updates the remaining characters/words/lines count when the browser window is resized. Accepts boolean value.
	 */
	public Collapser setDynamic(boolean value) {
		JsoHelper.setAttribute(config.getJsObj(), "dynamic", value);
		return this;
	}

	/**
	 * his property changes the text of the element during the collapse and expand state. It is used only in “block” mode of operation and is not used by other modes.
	 */
	public Collapser setChangeText(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "changeText", value);
		return this;
	}

	/**
	 * The text/HTML to be present in the control button when the element is in expanded state.
	 */
	public Collapser setHideText(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "hideText", value);
		return this;
	}

	public Collapser onBeforeShow(CollapserCallBack callBack) {
		return _addHandler("beforeShow", callBack);
	}

	public Collapser onAtferShow(CollapserCallBack callBack) {
		return _addHandler("afterShow", callBack);
	}

	public Collapser onBeforeHide(CollapserCallBack callBack) {
		return _addHandler("beforeHide", callBack);
	}

	public Collapser onAtferHide(CollapserCallBack callBack) {
		return _addHandler("afterHide", callBack);
	}

	private Collapser _addHandler(String event, CollapserCallBack callBack) {
		JsoHelper.setAttribute(config.getJsObj(), event, _createCallback(event, callBack));
		return this;
	}

	public Collapser apply() {
		return _apply(config.getJsObj());
	}

	private Collapser _setSpeed(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "speed", value);
		return this;
	}

	private Collapser _setEffect(String value) {
		JsoHelper.setAttribute(config.getJsObj(), "effect", value);
		return this;
	}

	private native Collapser _apply(JavaScriptObject config)/*-{
		var target = this.@com.ait.toolkit.libs.jquery.collapser.client.Collapser::target;
		var o = $wnd.jQuery(target).collapser(config);
		this.@com.ait.toolkit.core.client.JsObject::jsObj = o;
		return this;
	}-*/;

	private native JavaScriptObject _createCallback(String event, CollapserCallBack cb)/*-{
		return function(el) {
			cb.@com.ait.toolkit.libs.jquery.collapser.client.CollapserCallBack::onEvent(Lcom/google/gwt/dom/client/Element;)(el);
		};
	}-*/;

}
