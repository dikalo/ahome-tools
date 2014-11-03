package com.ait.toolkit.libs.jquery.notify.client;

import com.ait.toolkit.core.client.JQueryUtil;
import com.ait.toolkit.core.client.Util;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

public final class Notify {

	private static final NotifyResouces resources = GWT.create(NotifyResouces.class);

	static {
		JQueryUtil.inject();
		Util.injectJs(resources.js());
		Util.injectStyle(resources.css());
	}

	public static void display(NotifyConfig config) {
		_show(config.getJsObj());
	}

	public static void info(String message) {
		_show(NotifyType.INFO, message, NotifyPosition.RIGHT);
	}

	public static void info(String message, NotifyPosition postion) {
		_show(NotifyType.INFO, message, postion);
	}

	public static void error(String message) {
		_show(NotifyType.ERROR, message, NotifyPosition.RIGHT);
	}

	public static void error(String message, NotifyPosition postion) {
		_show(NotifyType.ERROR, message, postion);
	}

	public static void warn(String message) {
		_show(NotifyType.WARNING, message, NotifyPosition.RIGHT);
	}

	public static void warn(String message, NotifyPosition postion) {
		_show(NotifyType.WARNING, message, postion);
	}

	public static void success(String message) {
		_show(NotifyType.SUCCESS, message, NotifyPosition.RIGHT);
	}

	public static void success(String message, NotifyPosition postion) {
		_show(NotifyType.SUCCESS, message, postion);
	}

	private static void _show(NotifyType type, String message, NotifyPosition position) {
		_show(type.name().toLowerCase(), position.name().toLowerCase(), message);
	}

	private static native void _show(String t, String pos, String content)/*-{
		$wnd.notif({
			msg : content,
			type : t,
			position : pos
		});
	}-*/;

	private static native void _show(JavaScriptObject config)/*-{
		$wnd.notif(config);
	}-*/;

}
