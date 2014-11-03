package com.ait.toolkit.libs.jquery.noty.client;

import com.ait.toolkit.core.client.JQueryUtil;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.Util;
import com.ait.toolkit.libs.jquery.notify.client.NotifyConfig;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.shared.GWT;

public class Noty extends JsObject {

	Noty(JavaScriptObject peer) {
		jsObj = peer;
	}

	private static final NotyResources resources = GWT.create(NotyResources.class);

	static {
		JQueryUtil.inject();
		Util.injectJs(resources.js());
		Util.injectStyle(resources.buttonCss());
	}

	public static Noty alert(String message) {
		return _display(message, NotyType.ALERT, NotyPosition.TOP_RIGHT);
	}

	public static Noty alert(String message, NotyPosition position) {
		return _display(message, NotyType.ALERT, position);
	}

	public static Noty info(String message) {
		return _display(message, NotyType.INFORMATION, NotyPosition.TOP_RIGHT);
	}

	public static Noty info(String message, NotyPosition position) {
		return _display(message, NotyType.INFORMATION, position);
	}

	public static Noty error(String message) {
		return _display(message, NotyType.ERROR, NotyPosition.TOP_RIGHT);
	}

	public static Noty error(String message, NotyPosition position) {
		return _display(message, NotyType.ERROR, position);
	}

	public static Noty warn(String message) {
		return _display(message, NotyType.WARNING, NotyPosition.TOP_RIGHT);
	}

	public static Noty warn(String message, NotyPosition position) {
		return _display(message, NotyType.WARNING, position);
	}

	public static Noty notify(String message) {
		return _display(message, NotyType.NOTIFICATION, NotyPosition.TOP_RIGHT);
	}

	public static Noty notify(String message, NotyPosition position) {
		return _display(message, NotyType.NOTIFICATION, position);
	}

	public static Noty success(String message) {
		return _display(message, NotyType.SUCCESS, NotyPosition.TOP_RIGHT);
	}

	public static Noty success(String message, NotyPosition position) {
		return _display(message, NotyType.SUCCESS, position);
	}

	public static native Noty show(String containerIdOrClass, NotifyConfig config)/*-{
		var n = $wnd.$(containerIdOrClass).noty(config);
		return @com.ait.toolkit.libs.jquery.noty.client.Noty::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
	}-*/;

	public static native Noty show(NotyConfig config)/*-{
		var n = $wnd
				.noty(config.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return @com.ait.toolkit.libs.jquery.noty.client.Noty::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
	}-*/;

	public static native void setDefaults(NotifyConfig config)/*-{
		$wnd.$.noty.defaults = config.@com.ait.toolkit.core.client.JsObject::getJsObj()();
	}-*/;

	public static native void setMaxVisible(int value)/*-{
		$wnd.$.noty.defaults.maxVisible = value;
	}-*/;

	public static native void closeAll()/*-{
		$wnd.$.noty.closeAll();
	}-*/;

	public static native void clearQueue()/*-{
		$wnd.$.noty.clearQueue();
	}-*/;

	public native void close()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.close();
	}-*/;

	public native Noty setText(String text)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setText(text);
		return this;
	}-*/;

	public Noty setType(NotyType type) {
		return _setType(type.name().toLowerCase());
	}

	private native Noty _setType(String text)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setType(text);
		return this;
	}-*/;

	private static Noty _display(String msg, NotyType type, NotyPosition pos) {
		return _display(msg, type.name().toLowerCase(), pos.getValue());
	}

	public static native Noty _display(String msg, String t, String l)/*-{
		var n = $wnd.noty({
			text : msg,
			type : t,
			layout : l
		});
		return @com.ait.toolkit.libs.jquery.noty.client.Noty::new(Lcom/google/gwt/core/client/JavaScriptObject;)(n);
	}-*/;

}
