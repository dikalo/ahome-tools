package com.ait.toolkit.libs.jquery.slick.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;

public class SlickConfig extends JsObject {

	public SlickConfig() {
		jsObj = JsoHelper.createObject();
	}

	/**
	 * Enables tabbing and arrow key navigation
	 * 
	 * @param value
	 */
	public void setAccessibility(boolean value) {
		JsoHelper.setAttribute(jsObj, "accessibility", value);
	}

	/**
	 * Enables Autoplay
	 * 
	 * @param value
	 */
	public void setAutoPlay(boolean value) {
		JsoHelper.setAttribute(jsObj, "autoplay", value);
	}

	/**
	 * Autoplay Speed in milliseconds
	 * 
	 */
	public void setAutoPlaySpeed(int value) {
		JsoHelper.setAttribute(jsObj, "autoplaySpeed", value);
	}

	/**
	 * Prev/Next Arrows
	 */
	public void setArrows(boolean value) {
		JsoHelper.setAttribute(jsObj, "arrows", value);
	}

	/**
	 * Set the slider to be the navigation of other slider (Class or ID Name)
	 */
	public void setAsNavFor(String value) {
		JsoHelper.setAttribute(jsObj, "asNavFor", value);
	}

	/**
	 * Enables centered view with partial prev/next slides. Use with odd numbered slidesToShow counts.
	 */
	public void setCenterMode(boolean value) {
		JsoHelper.setAttribute(jsObj, "centerMode", value);
	}

	/**
	 * Show dot indicators
	 */
	public void setDots(boolean value) {
		JsoHelper.setAttribute(jsObj, "dots", value);
	}

	/**
	 * Enable mouse dragging
	 */
	public void setDraggable(boolean value) {
		JsoHelper.setAttribute(jsObj, "draggable", value);
	}

	/**
	 * Enable mouse fade
	 */
	public void setFade(boolean value) {
		JsoHelper.setAttribute(jsObj, "fade", value);
	}

	/**
	 * Enable focus on selected element (click)
	 */
	public void setFocusOnSelect(boolean value) {
		JsoHelper.setAttribute(jsObj, "focusOnSelect", value);
	}

	/**
	 * Side padding when in center mode (px or %)
	 */
	public void setCenterPadding(String value) {
		JsoHelper.setAttribute(jsObj, "centerPadding", value);
	}

	/**
	 * Add easing for jQuery animate. Use with easing libraries or default easing methods
	 */
	public void setEasing(String value) {
		JsoHelper.setAttribute(jsObj, "easing", value);
	}

	/**
	 * Set lazy loading technique. Accepts 'ondemand' or 'progressive'.
	 */
	public void setLazyLoad(String value) {
		JsoHelper.setAttribute(jsObj, "lazyLoad", value);
	}

	/**
	 * Infinite loop sliding
	 */
	public void setInfinite(boolean value) {
		JsoHelper.setAttribute(jsObj, "infinite", value);
	}

	/**
	 * Before slide callback
	 */
	public void onBeforeChange(Function callback) {
		_addHandler("onBeforeChange", callback);
	}

	/**
	 * After slide callback
	 */
	public void onAfterChange(Function callback) {
		_addHandler("onAfterChange", callback);
	}

	/**
	 * Callback that fires after first initialization
	 */
	public void onInit(Function callback) {
		_addHandler("onInit", callback);
	}

	/**
	 * Callback that fires after every re-initialization
	 */
	public void onReInit(Function callback) {
		_addHandler("onReInit", callback);
	}

	/**
	 * Pause Autoplay On Hover
	 */
	public void setPauseOnHover(boolean value) {
		JsoHelper.setAttribute(jsObj, "pauseOnHover", value);
	}

	/**
	 * Pause Autoplay when a dot is hovered
	 */
	public void setPauseOnDotsHover(boolean value) {
		JsoHelper.setAttribute(jsObj, "pauseDotsOnHover", value);
	}

	/**
	 * Object containing breakpoints and settings objects. <br/>
	 * Enables settings sets at given screen width.
	 * 
	 * @param values
	 */
	public void setResponsive(SlickResponsiveConfig... values) {
		JsoHelper.setAttribute(jsObj, "responsive", JsoHelper.convertToJavaScriptArray(values));
	}

	/**
	 * Element query to use as slide
	 */
	public void setSlide(String value) {
		JsoHelper.setAttribute(jsObj, "slide", value);
	}

	/**
	 * # of slides to show
	 */
	public void setSlideToShow(int value) {
		JsoHelper.setAttribute(jsObj, "slideToShow", value);
	}

	/**
	 * # of slides to show
	 */
	public void setSlideToScroll(int value) {
		JsoHelper.setAttribute(jsObj, "slideToScroll", value);
	}

	/**
	 * Slide/Fade animation speed
	 */
	public void setSpeed(int value) {
		JsoHelper.setAttribute(jsObj, "speed", value);
	}

	/**
	 * Enable swiping
	 */
	public void setSwipe(boolean value) {
		JsoHelper.setAttribute(jsObj, "swipe", value);
	}

	/**
	 * Enable slide motion with touch
	 */
	public void setTouchMove(boolean value) {
		JsoHelper.setAttribute(jsObj, "touchMove", value);
	}

	/**
	 * To advance slides, the user must swipe a length of (1/touchThreshold) * the width of the slider
	 */
	public void setTouchThreeShold(int value) {
		JsoHelper.setAttribute(jsObj, "touchThreshold", value);
	}

	/**
	 * Enable/Disable CSS Transitions
	 */
	public void setUseCss(boolean value) {
		JsoHelper.setAttribute(jsObj, "useCss", value);
	}

	/**
	 * Vertical slide mode
	 */
	public void setVertical(boolean value) {
		JsoHelper.setAttribute(jsObj, "vertical", value);
	}

	/**
	 * Change the slider's direction to become right-to-left
	 */
	public void setRtl(boolean value) {
		JsoHelper.setAttribute(jsObj, "rtl", value);
	}

	private native void _addHandler(String event, Function fn)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer[event] = function() {
			fn.@com.ait.toolkit.core.client.Function::execute()();
		}
	}-*/;

}
