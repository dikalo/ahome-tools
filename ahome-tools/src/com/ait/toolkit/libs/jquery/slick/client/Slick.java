package com.ait.toolkit.libs.jquery.slick.client;

import com.ait.toolkit.core.client.JQueryUtil;
import com.ait.toolkit.core.client.Util;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class Slick extends ComplexPanel {

	Element root;
	private JavaScriptObject slickPeer;
	private SlickConfig config;
	private String className = "ahomeSlick_" + Util.randomString();
	private static final SlickResources resources = GWT.create(SlickResources.class);

	static {
		JQueryUtil.inject();
		Util.injectJs(resources.js());
		Util.injectStyle(resources.css());
	}

	public Slick() {
		root = Document.get().createDivElement();
		root.setClassName(className);
		setElement(root);
		config = new SlickConfig();
	}

	public Slick(SlickConfig config) {
		this();
		this.config = config;
	}

	@Override
	protected void onAttach() {
		final String id = root.getClassName();
		super.onAttach();
		Scheduler.get().scheduleDeferred(new ScheduledCommand() {
			@Override
			public void execute() {
				slickPeer = layout(id, config.getJsObj());
			}
		});
	}

	@SuppressWarnings("deprecation")
	@Override
	public void add(Widget w) {
		SlickItem item = new SlickItem(w);
		add(item, getElement());
	}

	/**
	 * Returns the current slide index
	 */
	public native int currentSlide()/*-{
		var peer = this.@com.ait.toolkit.libs.jquery.slick.client.Slick::slickPeer;
		if (peer) {
			return peer.slickCurrentSlide();
		}
		return 0;
	}-*/;

	/**
	 * Navigates to a slide by index
	 */
	public native void goTo(int index)/*-{
		var peer = this.@com.ait.toolkit.libs.jquery.slick.client.Slick::slickPeer;
		if (peer) {
			peer.sclickGoTo(index);
		}
	}-*/;

	/**
	 * Navigates to the next slide
	 */
	public native void next()/*-{
		var peer = this.@com.ait.toolkit.libs.jquery.slick.client.Slick::slickPeer;
		if (peer) {
			peer.sclickNext();
		}
	}-*/;

	/**
	 * Navigates to the previous slide
	 */
	public native void prev()/*-{
		var peer = this.@com.ait.toolkit.libs.jquery.slick.client.Slick::slickPeer;
		if (peer) {
			peer.sclickPrev();
		}
	}-*/;

	/**
	 * Pauses autoplay
	 */
	public native void pause()/*-{
		var peer = this.@com.ait.toolkit.libs.jquery.slick.client.Slick::slickPeer;
		if (peer) {
			peer.sclickPause();
		}
	}-*/;

	/**
	 * Starts autoplay
	 */
	public native void play()/*-{
		var peer = this.@com.ait.toolkit.libs.jquery.slick.client.Slick::slickPeer;
		if (peer) {
			peer.sclickPlay();
		}
	}-*/;

	/**
	 * Deconstructs slick
	 */
	public native void unslick()/*-{
		var peer = this.@com.ait.toolkit.libs.jquery.slick.client.Slick::slickPeer;
		if (peer) {
			peer.unslick();
		}
	}-*/;

	private native JavaScriptObject layout(String id, JavaScriptObject config)/*-{
		var elementId = '.' + id;
		var obj;
		if (!config) {
			obj = $wnd.$(elementId).slick();
		} else {
			obj = $wnd.$(elementId).slick(config);
		}
		return obj;
	}-*/;

}
