package com.ait.toolkit.libs.intro.client;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.Util;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

public final class Intro extends JsObject {

	private static final Intro INSTANCE = new Intro();
	private static boolean isInjected = false;

	private static void inject() {
		if (!isLoaded()) {
			Util.injectStyle(IntroResources.INSTANCE.css());
			Util.injectJs(IntroResources.INSTANCE.lib());
			isInjected = true;
		}
	}

	public static void addRtlSupport() {
		if (isInjected) {
			Util.injectJs(IntroResources.INSTANCE.libRtl());
		}
	}

	public static void addRoyalTheme() {
		if (isInjected) {
			Util.injectStyle(IntroResources.INSTANCE.royalTheme());
		}
	}

	public static void addNazaninTheme() {
		if (isInjected) {
			Util.injectStyle(IntroResources.INSTANCE.nazaninTheme());
		}
	}

	public static void addNassimTheme() {
		if (isInjected) {
			Util.injectStyle(IntroResources.INSTANCE.nassimTheme());
		}
	}

	public static void addDarkTheme() {
		if (isInjected) {
			Util.injectStyle(IntroResources.INSTANCE.darkTheme());
		}
	}

	public static Intro get() {
		return INSTANCE;
	}

	private Intro() {
		jsObj = getPeer();
	}

	/**
	 * The tooltip text of step
	 */
	public Intro setIntro(Element element, String value) {
		element.setAttribute("data-intro", value);
		return this;
	}

	/**
	 * Optionally define a CSS class for tooltip
	 */
	public Intro setTooltipClass(Element element, String value) {
		element.setAttribute("data-tooltipClass", value);
		return this;
	}

	/**
	 * Optionally define a CSS class for tooltip
	 */
	public Intro setHighlightClass(Element element, String value) {
		element.setAttribute("data-highlightClass", value);
		return this;
	}

	/**
	 * Optionally define a CSS class for tooltip
	 */
	public Intro setTooltipPosition(Element element, TooltipPosition value) {
		element.setAttribute("data-position", value.name().toLowerCase());
		return this;
	}

	/**
	 * Optionally define the number (priority) of step
	 */
	public Intro setStep(Element element, Integer value) {
		element.setAttribute("data-step", value.toString());
		return this;
	}

	public native Intro setOptions(IntroOptions options)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setOptions(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native void start()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.start();
	}-*/;

	private native JavaScriptObject getPeer()/*-{
		return $wnd.introJs();
	}-*/;

	private static native boolean isLoaded()/*-{
		if ($wnd.introJs == null || $wnd.introJs == 'undefined') {
			return false;
		}
		return true;
	}-*/;

}
