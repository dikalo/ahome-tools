package com.ait.toolkit.libs.jquery.toastr.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JQueryUtil;
import com.ait.toolkit.core.client.Util;
import com.google.gwt.core.shared.GWT;

public final class Toast {

	private static final ToastResources resources = GWT.create(ToastResources.class);

	static {
		JQueryUtil.inject();
		Util.injectJs(resources.js());
		Util.injectStyle(resources.css());
	}

	public static native void setTapToDismiss(boolean value)/*-{
		$wnd.toastr.options.tapToDismiss = value;
	}-*/;

	public static native void setCloseButton(boolean value)/*-{
		$wnd.toastr.options.closeButton = value;
	}-*/;

	public static native void setTimeOut(int value)/*-{
		$wnd.toastr.options.timeOut = value;
	}-*/;

	public static native void setHideDuration(int value)/*-{
		$wnd.toastr.options.hideDuration = value;
	}-*/;

	public static native void setExtendedTimeOut(int value)/*-{
		$wnd.toastr.options.extendedTimeOut = value;
	}-*/;

	public static native void setOnHidden(Function fn)/*-{
		$wnd.toastr.options.onHidden = function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

	public static native void setOnShow(Function fn)/*-{
		$wnd.toastr.options.onShow = function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

	public static native void setOnClick(Function fn)/*-{
		$wnd.toastr.options.onClick = function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		};
	}-*/;

	public static native void warn(String text)/*-{
		$wnd.toastr.warning(text);
	}-*/;

	public static native void warn(String title, String text)/*-{
		$wnd.toastr.warning(title, text);
	}-*/;

	public static native void info(String text)/*-{
		$wnd.toastr.info(text);
	}-*/;

	public static native void info(String title, String text)/*-{
		$wnd.toastr.info(title, text);
	}-*/;

	public static native void error(String text)/*-{
		$wnd.toastr.error(text);
	}-*/;

	public static native void error(String title, String text)/*-{
		$wnd.toastr.error(title, text);
	}-*/;

	public static native void success(String text)/*-{
		$wnd.toastr.success(text);
	}-*/;

	public static native void success(String title, String text)/*-{
		$wnd.toastr.success(title, text);
	}-*/;

	public static void setPosition(ToastPosition position) {
		_setPositionClass(position.getValue());
	}

	public static void setHideMethod(ToastShowMethod method) {
		_setHideMethod(method.getValue());
	}

	public static void setShowMethod(ToastShowMethod method) {
		_setShowMethod(method.getValue());
	}

	public static void setShowEasing(ToastShowEasing method) {
		_setShowEasing(method.getValue());
	}

	public static void setHideEasing(ToastShowEasing method) {
		_setHideEasing(method.getValue());
	}

	private static native void _setShowMethod(String value)/*-{
		$wnd.toastr.options.showMethod = value;
	}-*/;

	private static native void _setHideMethod(String value)/*-{
		$wnd.toastr.options.hideMethod = value;
	}-*/;

	private static native void _setPositionClass(String value)/*-{
		$wnd.toastr.options.positionClass = value;
	}-*/;

	private static native void _setShowEasing(String value)/*-{
		$wnd.toastr.options.showEasing = value;
	}-*/;

	private static native void _setHideEasing(String value)/*-{
		$wnd.toastr.options.hideEasing = value;
	}-*/;

}
