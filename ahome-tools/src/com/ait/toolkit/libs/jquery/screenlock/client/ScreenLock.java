package com.ait.toolkit.libs.jquery.screenlock.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JQueryUtil;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.core.shared.GWT;

public final class ScreenLock {

	private static final ScreenLockResource resoucres = GWT.create(ScreenLockResource.class);

	static {
		JQueryUtil.inject();
		ScriptInjector.fromString(resoucres.js().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	private static native void showNative(String content, boolean protectScreen)/*-{
		$wnd.$.screensaver({
			events : 'mousemove mousedown keydown touch touchstart',
			height : '100%',
			html : content,
			width : '100%',
			passwordProtected : protectScreen
		}).show();
	}-*/;

	public static void show(String markup) {
		show(markup, false);
	}

	public static void show(String markup, boolean hideOnHover) {
		showNative(markup, hideOnHover);

	}

	public static native void addScreenUnlockHandler(Function callback)/*-{
		var events = "mousemove mousedown keydown touch touchstart";
		$wnd.$("#screensaver, #screensaver object").bind(events, function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	public static native void remove()/*-{
		$wnd.$.screensaver.destroy();
	}-*/;

}
