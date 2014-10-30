package com.ait.toolkit.libs.moment.client;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Moment.js also has duration objects. Where a moment is defined as single points in time, durations are defined as a length of time.
 * <p>
 * Durations do not have a defined beginning and end date. They are contextless.
 * <p>
 * A duration is conceptually more similar to '2 hours' than to 'between 2 and 4 pm today'. As such, they are not a good solution to converting between units that depend on
 * context.
 * <p>
 * For example, a year can be defined as 366 days, 365 days, 365.25 days, 12 months, or 52 weeks. Trying to convert years to days makes no sense without context. It is much better
 * to use moment#diff for calculating days or years between two moments than to use Durations.
 * 
 * @author Alain Ekambi
 * 
 * @See http://momentjs.com/docs/#/durations/
 * 
 */
public class Duration extends JsObject {

	protected Duration(JavaScriptObject peer) {
		jsObj = peer;
	}

	public native String humanize()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.humanize();
	}-*/;

	public native String humanize(boolean withSuffix)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.humanize(withSuffix);
	}-*/;

	/**
	 * To get the number of milliseconds in a duration.
	 * 
	 * @return , a number between 0 and 999.
	 */
	public native String milliSeconds()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.milliseconds();
	}-*/;

	/**
	 * If you want the length of the duration in milliseconds.
	 * 
	 * @return
	 */
	public native String asMilliSeconds()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.asMilliseconds();
	}-*/;

	/**
	 * To get the number of seconds in a duration.
	 * 
	 * @return , a number between 0 and 59.
	 */
	public native String seconds()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.seconds();
	}-*/;

	/**
	 * If you want the length of the duration in seconds.
	 * 
	 * @return
	 */
	public native String asSeconds()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.asSeconds();
	}-*/;

	/**
	 * To get the number of minutes in a duration.
	 * 
	 * @return , a number between 0 and 59.
	 */
	public native String minutes()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.minutes();
	}-*/;

	/**
	 * If you want the length of the duration in minutes.
	 * 
	 * @return
	 */
	public native String asMinutes()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.asMinutes();
	}-*/;

	/**
	 * To get the number of hours in a duration.
	 * 
	 * @return , a number between 0 and 23.
	 */
	public native String hours()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.hours();
	}-*/;

	/**
	 * If you want the length of the duration in hours.
	 * 
	 * @return
	 */
	public native String asHours()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.asHours();
	}-*/;

	/**
	 * To get the number of days in a duration.
	 * 
	 * @return , a number between 0 and 29.
	 */
	public native String days()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.days();
	}-*/;

	/**
	 * If you want the length of the duration in days.
	 * 
	 * @return
	 */
	public native String asDays()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.asDays();
	}-*/;

	/**
	 * To get the number of months in a duration.
	 * 
	 * @return , a number between 0 and 23.
	 */
	public native String months()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.months();
	}-*/;

	/**
	 * If you want the length of the duration in months.
	 * 
	 * @return
	 */
	public native String asMonths()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.asMonths();
	}-*/;

	public native String years()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.years();
	}-*/;

	public native String asYears()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.asYears();
	}-*/;

	public native Duration addSeconds(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value, "s");
		return this;
	}-*/;

	public native Duration addMilliSeconds(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value, "ms");
		return this;
	}-*/;

	public native Duration addMinutes(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value, "m");
		return this;
	}-*/;

	public native Duration addHours(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value, "h");
		return this;
	}-*/;

	public native Duration add(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value);
		return this;
	}-*/;

	public native Duration add(Duration value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native Duration add(MomentConfig value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native Duration addYears(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("y", value);
		return this;
	}-*/;

	public native Duration addMonths(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("M", value);
		return this;
	}-*/;

	public native Duration substractMilliSeconds(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract(value, "ms");
		return this;
	}-*/;

	public native Duration substractMinutes(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract(value, "m");
		return this;
	}-*/;

	public native Duration substractHours(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract(value, "h");
		return this;
	}-*/;

	public native Duration substract(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract(value);
		return this;
	}-*/;

	public native Duration substract(Duration value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.substract(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native Duration substract(MomentConfig value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.substract(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native Duration substractYears(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("y", value);
		return this;
	}-*/;

	public native Duration substractMonths(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("M", value);
		return this;
	}-*/;

}
