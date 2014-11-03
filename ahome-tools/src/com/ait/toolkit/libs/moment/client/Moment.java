package com.ait.toolkit.libs.moment.client;

import java.util.Date;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.core.shared.GWT;

public final class Moment extends JsObject {

	public static final String M = "M"; // Month Number (1-12)
	public static final String MM = "MM"; // Month Number (1-12)
	public static final String MMM = "MMM"; // Month Name (In locale currently set by moment.locale())
	public static final String MMMM = "MMMM"; // Month Name (In locale currently set by moment.locale())
	public static final String Q = "Q"; // Quarter (1 - 4) -- sets the month to the first month in that quarter
	public static final String D = "D"; // Day of month
	public static final String DD = "DD"; // Day of month
	public static final String Do = "Do"; // Ordinal day of month (from 2.6.0)
	public static final String DDD = "DDD"; // Day of year
	public static final String DDDD = "DDDD"; // Day of year
	public static final String d = "d"; // Day of week (NOTE: these formats only make sense when combined with "ww")
	public static final String dd = "dd"; // Day of week (NOTE: these formats only make sense when combined with "ww")
	public static final String ddd = "ddd"; // Day of week (NOTE: these formats only make sense when combined with "ww")
	public static final String dddd = "dddd"; // Day of week (NOTE: these formats only make sense when combined with "ww")
	public static final String e = "e"; // Day of week(locale) (NOTE: these formats only make sense when combined with "ww")
	public static final String E = "E"; // Day of week(locale) (NOTE: these formats only make sense when combined with "WW")
	public static final String w = "w"; // Week of the year (NOTE: combine this format with "gg" or "gggg" instead of "YY" or "YYYY")
	public static final String ww = "ww"; // Week of the year (NOTE: combine this format with "gg" or "gggg" instead of "YY" or "YYYY")
	public static final String W = "W"; // Week of the year (ISO) (NOTE: combine this format with "GG" or "GGGG" instead of "YY" or "YYYY")
	public static final String WW = "WW"; // Week of the year (ISO) (NOTE: combine this format with "GG" or "GGGG" instead of "YY" or "YYYY")
	public static final String YY = "YY"; // 2 digit year
	public static final String YYYY = "YYYY"; // 4 digit year
	public static final String gg = "gg"; // 2 digit week year (if greater than 68 will return 1900's, otherwise 2000's)
	public static final String gggg = "gggg"; // 4 digit week year
	public static final String GG = "gggg"; // 2 digit week year (ISO) (if greater than 68 will return 1900's, otherwise 2000's)
	public static final String GGGG = "GGGG"; // 2 digit week year (ISO) (if greater than 68 will return 1900's, otherwise 2000's)
	public static final String a = "a"; // AM/PM
	public static final String A = "A"; // AM/PM
	public static final String H = "H"; // 24 hour time
	public static final String HH = "HH"; // 24 hour time
	public static final String h = "h"; // 12 hour time (use in conjunction with a or A)
	public static final String hh = "hh"; // 12 hour time (use in conjunction with a or A)
	public static final String m = "m"; // Minutes
	public static final String mm = "mm"; // Minutes
	public static final String s = "s"; // Seconds
	public static final String ss = "ss"; // Seconds
	public static final String S = "S"; // Deciseconds (1/10th of a second)
	public static final String SS = "SS"; // Centiseconds (1/100th of a second)
	public static final String SSS = "SSS"; // Milliseconds (1/1000th of a second)
	public static final String Z = "Z"; // Timezone offset as +07:00 or +0700
	public static final String ZZ = "ZZ"; // Timezone offset as +07:00 or +0700
	public static final String X = "X"; // Unix timestamp
	public static final String LT = "LT"; // Locale dependent date and time representation
	public static final String L = "L"; // Locale dependent date and time representation
	public static final String LL = "LL"; // Locale dependent date and time representation
	public static final String LLL = "LLL"; // Locale dependent date and time representation
	public static final String LLLL = "LLLL"; // Locale dependent date and time representation
	public static final String I = "I";
	public static final String II = "II";
	public static final String III = "III";
	public static final String IIII = "IIII";

	private static final MomentResources resources = GWT.create(MomentResources.class);

	static {
		if (!isLoaded()) {
			load();
		}
	}

	private static void load() {
		ScriptInjector.fromString(resources.js().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
	}

	private Moment(JavaScriptObject peer) {
		jsObj = peer;
	}

	public static Moment get() {
		return new Moment(createPeer());
	}

	public static Moment get(JsDate time) {
		return new Moment(fromJsDate(time));
	}

	public static Moment get(Date time) {
		return new Moment(fromJsDate(time));
	}

	public static Moment get(int time) {
		return new Moment(createPeer(time));
	}

	public static Moment unix(int time) {
		return new Moment(_unix(time));
	}

	public static Moment utc() {
		return new Moment(_utc());
	}

	public static Moment utc(int time) {
		return new Moment(_utc(time));
	}

	public static Moment utc(JsArrayNumber times) {
		return new Moment(_utc(times));
	}

	public static Moment utc(String time) {
		return new Moment(_utc(time));
	}

	public static Moment utc(String time, String format) {
		return new Moment(_utc(time, format));
	}

	public static Moment utc(String time, String format, String locale) {
		return new Moment(_utc(time, format, locale));
	}

	public static Moment utc(Moment time) {
		return new Moment(_utc(time.getJsObj()));
	}

	public static Moment utc(JsDate time) {
		return new Moment(_utc(time));
	}

	public static Moment get(String moment) {
		return new Moment(createPeer(moment));
	}

	public static Moment get(String moment, String format) {
		return new Moment(createPeer(moment, format));
	}

	public static Moment get(String moment, String format, String locale) {
		return new Moment(createPeer(moment, format, locale));
	}

	public static Moment get(String moment, String format, boolean strict) {
		return new Moment(createPeer(moment, format, strict));
	}

	public static Moment get(String moment, String format, String locale, boolean strict) {
		return new Moment(createPeer(moment, format, locale, strict));
	}

	public static Moment parseZone(String zone) {
		return new Moment(_parseZone(zone));
	}

	public static Moment max(Moment... moments) {
		JsArray<JavaScriptObject> vals = JsArray.createArray().cast();
		for (Moment m : moments) {
			vals.push(m.getJsObj());
		}
		return new Moment(_max(vals));
	}

	public static Moment min(Moment... moments) {
		JsArray<JavaScriptObject> vals = JsArray.createArray().cast();
		for (Moment m : moments) {
			vals.push(m.getJsObj());
		}
		return new Moment(_min(vals));
	}

	public native boolean isValid()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isValid();
	}-*/;

	public native int isInValidAt()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.invalidAt();
	}-*/;

	public native String format(String format)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.format(format);
	}-*/;

	public native Moment setSecond(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.second(value);
		return this;
	}-*/;

	public native Moment addDays(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("d", value);
		return this;
	}-*/;

	public native Moment addYears(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("y", value);
		return this;
	}-*/;

	public native Moment addYears(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("y", value);
		return this;
	}-*/;

	public native Moment addMonths(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("M", value);
		return this;
	}-*/;

	public native Moment addMonths(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("M", value);
		return this;
	}-*/;

	public native Moment addWeeks(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("w", value);
		return this;
	}-*/;

	public native Moment addWeeks(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("w", value);
		return this;
	}-*/;

	public native Moment addHours(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("h", value);
		return this;
	}-*/;

	public native Moment addHours(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("h", value);
		return this;
	}-*/;

	public native Moment addMinutes(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("m", value);
		return this;
	}-*/;

	public native Moment addMinutes(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("m", value);
		return this;
	}-*/;

	public Moment startOfYear() {
		return startOf("year");
	}

	public Moment startOfMonth() {
		return startOf("month");
	}

	public Moment startOfQuarter() {
		return startOf("quarter");
	}

	public Moment startOfWeek() {
		return startOf("week");
	}

	public Moment startOfIsoWeek() {
		return startOf("isoWeek");
	}

	public Moment startOfDay() {
		return startOf("day");
	}

	public Moment startOfHour() {
		return startOf("hour");
	}

	public Moment startOfMinute() {
		return startOf("minute");
	}

	public Moment startOfSecond() {
		return startOf("second");
	}

	public native Moment startOf(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.startOf(value);
		return @com.ait.toolkit.libs.moment.client.Moment::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native Moment add(MomentConfig value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native Moment add(Duration value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native Moment addSeconds(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("s", value);
		return this;
	}-*/;

	public native Moment addSeconds(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("s", value);
		return this;
	}-*/;

	public native Moment addMilliSeconds(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("ms", value);
		return this;
	}-*/;

	public native Moment addMilliSeconds(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.add("ms", value);
		return this;
	}-*/;

	public native int getSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.second();
	}-*/;

	public native Moment setMilliSecond(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.millisecond(value);
		return this;
	}-*/;

	public native int getMilliSecond()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.millisecond();
	}-*/;

	public native Moment setMinute(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.minute(value);
		return this;
	}-*/;

	public native int getMinute()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.minute();
	}-*/;

	public native Moment setHour(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.hour(value);
		return this;
	}-*/;

	public native int getHour()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.hour();
	}-*/;

	public native Moment setDateOfMonth(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.date(value);
		return this;
	}-*/;

	public native int getDateOfMonth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.date();
	}-*/;

	public native Moment setDayOfWeek(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.day(value);
		return this;
	}-*/;

	public native Moment setDayOfWeek(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.day(value);
		return this;
	}-*/;

	public native int getDayOfWeek()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.day();
	}-*/;

	public native Moment setLocalAwareDayOfWeek(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.weekday(value);
		return this;
	}-*/;

	public native int getLocaleAwareDayOfWeek()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.weekday();
	}-*/;

	public native Moment setIsoDayOfWeek(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.isoWeekday(value);
		return this;
	}-*/;

	public native int getIsoDayOfWeek()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isoWeekday();
	}-*/;

	public native Moment setDayOYear(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.dayOfYear(value);
		return this;
	}-*/;

	public native int getDayOfYear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.dayOfYear();
	}-*/;

	public native Moment setWeekOYear(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.week(value);
		return this;
	}-*/;

	public native int getWeekOfYear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.week();
	}-*/;

	public native Moment setIsoWeekOYear(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.isoweek(value);
		return this;
	}-*/;

	public native int getIsoWeekOfYear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isoweek();
	}-*/;

	public native Moment setMonth(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.month(value);
		return this;
	}-*/;

	public native Moment setMonth(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.month(value);
		return this;
	}-*/;

	public native int getMonth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.month();
	}-*/;

	public native Moment setQuarter(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.quarter(value);
		return this;
	}-*/;

	public native int getQuarter()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.quarter();
	}-*/;

	public native Moment setYear(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.year(value);
		return this;
	}-*/;

	public native int getYear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.year();
	}-*/;

	public native Moment setWeekOfYear(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.weekYear(value);
		return this;
	}-*/;

	public native int getWeekYear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.weekYear();
	}-*/;

	public native Moment setIsoWeekOfYear(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.isoWeekYear(value);
		return this;
	}-*/;

	public native int getIsoWeekYear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isoWeekYear();
	}-*/;

	public native int getWeeksInYear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.weeksInYear();
	}-*/;

	public native int getUnit(String unit)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.get(unit);
	}-*/;

	public native Moment setUnit(String unit, int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.set(unit, value);
		return this;
	}-*/;

	public native Moment duplicate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.clone();
		return @com.ait.toolkit.libs.moment.client.Moment::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native Moment substractDays(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("d", value);
		return this;
	}-*/;

	public native Moment substractYears(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("y", value);
		return this;
	}-*/;

	public native Moment substractYears(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("y", value);
		return this;
	}-*/;

	public native Moment substractMonths(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("M", value);
		return this;
	}-*/;

	public native Moment substractMonths(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("M", value);
		return this;
	}-*/;

	public native Moment substractWeeks(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("w", value);
		return this;
	}-*/;

	public native Moment substractWeeks(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("w", value);
		return this;
	}-*/;

	public native Moment substractHours(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("h", value);
		return this;
	}-*/;

	public native Moment substractHours(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("h", value);
		return this;
	}-*/;

	public native Moment substractMinutes(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("m", value);
		return this;
	}-*/;

	public native Moment substractMinutes(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("m", value);
		return this;
	}-*/;

	public native Moment substract(MomentConfig value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.substract(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native Moment substract(Duration value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.substract(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native Moment substractSeconds(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("s", value);
		return this;
	}-*/;

	public native Moment substractSeconds(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("s", value);
		return this;
	}-*/;

	public native Moment substractMilliSeconds(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("ms", value);
		return this;
	}-*/;

	public native Moment substractMilliSeconds(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.substract("ms", value);
		return this;
	}-*/;

	public Moment endOfYear() {
		return endOf("year");
	}

	public Moment endOfMonth() {
		return endOf("month");
	}

	public Moment endOfQuarter() {
		return endOf("quarter");
	}

	public Moment endOfWeek() {
		return endOf("week");
	}

	public Moment endOfIsoWeek() {
		return endOf("isoWeek");
	}

	public Moment endOfDay() {
		return endOf("day");
	}

	public Moment endOfHour() {
		return endOf("hour");
	}

	public Moment endOfMinute() {
		return endOf("minute");
	}

	public Moment endOfSecond() {
		return endOf("second");
	}

	public native Moment endOf(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var o = peer.endOf(value);
		return @com.ait.toolkit.libs.moment.client.Moment::new(Lcom/google/gwt/core/client/JavaScriptObject;)(o);
	}-*/;

	public native int zone()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.zone();
	}-*/;

	public native int zone(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.zone(value);
	}-*/;

	public native int zone(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.zone(value);
	}-*/;

	public native String fromNow()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.fromNow();
	}-*/;

	public native String from(Moment moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.from(moment.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native String from(Moment moment, boolean suppressSuffix)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.from(
				moment.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				suppressSuffix);
	}-*/;

	public native String from(String moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.from(moment);
	}-*/;

	public native String from(String moment, boolean suppressSuffix)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.from(moment, suppressSuffix);
	}-*/;

	public native String from(int moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.from(moment);
	}-*/;

	public native String from(int moment, boolean suppressSuffix)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.from(moment, suppressSuffix);
	}-*/;

	public native String from(JsDate moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.from(moment);
	}-*/;

	public native String from(JsDate moment, boolean suppressSuffix)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.from(moment, suppressSuffix);
	}-*/;

	public native String fromNow(boolean supressSuffix)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.fromNow(supressSuffix);
	}-*/;

	public native String calendar(String referenceTime)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.calendar(referenceTime);
	}-*/;

	public native String calendar()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.calendar();
	}-*/;

	public native String diff(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.diff(value);
	}-*/;

	public native String diff(String value, boolean isFloating)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.diff(value, isFloating);
	}-*/;

	public native String diff(int value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.diff(value);
	}-*/;

	public native String diff(int value, boolean isFloating)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.diff(value, isFloating);
	}-*/;

	public native String diff(JsDate value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.diff(value);
	}-*/;

	public native int valueOff()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.valueOff();
	}-*/;

	public native String diff(JsDate value, boolean isFloating)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.diff(value, isFloating);
	}-*/;

	public native String diff(Moment value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.diff(value.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native String diff(Moment value, boolean isFloating)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.diff(
				value.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				isFloating);
	}-*/;

	public native int unix()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.unix();
	}-*/;

	public native int daysInMonth()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.daysInMonth();
	}-*/;

	public native JsDate toDate()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.toDate();
	}-*/;

	public native String toJson()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.toJSON();
	}-*/;

	public native boolean isBefore(Moment moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer
				.isBefore(moment.@com.ait.toolkit.core.client.JsObject::getJsObj()());
	}-*/;

	public native boolean isBefore(Moment moment, String unit)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isBefore(
				moment.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
				unit);
	}-*/;

	public native boolean isBefore(String moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isBefore(moment);
	}-*/;

	public native boolean isBefore(String moment, String unit)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isBefore(moment, unit);
	}-*/;

	public native boolean isBefore(int moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isBefore(moment);
	}-*/;

	public native boolean isBefore(int moment, String unit)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isBefore(moment, unit);
	}-*/;

	public native boolean isBefore(JsDate moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isBefore(moment);
	}-*/;

	public native String toISOString()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.toISOString();
	}-*/;

	public native boolean isSame(String moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isSame(moment);
	}-*/;

	public native boolean isSame(String moment, String unit)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isSame(moment, unit);
	}-*/;

	public native boolean isSame(int moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isSame(moment);
	}-*/;

	public native boolean isSame(int moment, String unit)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isSame(moment, unit);
	}-*/;

	public native boolean isSame(JsDate moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isSame(moment);
	}-*/;

	public native boolean isAfter(String moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isAfter(moment);
	}-*/;

	public native boolean isAfter(String moment, String unit)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isAfter(moment, unit);
	}-*/;

	public native boolean isAfter(int moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isAfter(moment);
	}-*/;

	public native boolean isAfter(int moment, String unit)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isAfter(moment, unit);
	}-*/;

	public native boolean isAfter(JsDate moment)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isAfter(moment);
	}-*/;

	public native boolean isLeapYear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isLeapYear();
	}-*/;

	public native boolean isDST()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isDST();
	}-*/;

	public native boolean isDSTShifted()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.isDSTShifted();
	}-*/;

	public native Moment locale(String value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.locale(value);
		return this;
	}-*/;

	public native Moment locale(boolean reset)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.locale(reset);
		return this;
	}-*/;

	public static native void setLocale(String locale)/*-{
		$wnd.moment.locale(locale);
	}-*/;

	public static void setLocale(String... locales) {
		JsArrayString values = JsArray.createArray().cast();
		for (String s : locales) {
			values.push(s);
		}
		setLocale(values);
	}

	public static native void setLocale(JsArrayString locale)/*-{
		$wnd.moment.locale(locale);
	}-*/;

	private native static JavaScriptObject _utc()/*-{
		return $wnd.moment.utc();
	}-*/;

	private native static JavaScriptObject _utc(int time)/*-{
		return $wnd.moment.utc(time);
	}-*/;

	private native static JavaScriptObject _utc(JsArrayNumber time)/*-{
		return $wnd.moment.utc(time);
	}-*/;

	private native static JavaScriptObject _utc(String time)/*-{
		return $wnd.moment.utc(time);
	}-*/;

	private native static JavaScriptObject _utc(String time, String format)/*-{
		return $wnd.moment.utc(time, format);
	}-*/;

	private native static JavaScriptObject _utc(String time, JsArrayString formats)/*-{
		return $wnd.moment.utc(time, formats);
	}-*/;

	private native static JavaScriptObject _utc(String time, String format, String locale)/*-{
		return $wnd.moment.utc(time, format, locale);
	}-*/;

	private native static JavaScriptObject _utc(JavaScriptObject peer)/*-{
		return $wnd.moment.utc(peer);
	}-*/;

	private native static JavaScriptObject fromJsDate(Date time)/*-{
		return $wnd.moment(time);
	}-*/;

	private native static JavaScriptObject fromJsDate(JsDate time)/*-{
		return $wnd.moment(time);
	}-*/;

	private native static JavaScriptObject _unix(double time)/*-{
		return $wnd.moment.unix(time);
	}-*/;

	private native static JavaScriptObject createPeer(double time)/*-{
		return $wnd.moment(time);
	}-*/;

	private native static JavaScriptObject createPeer()/*-{
		return $wnd.moment();
	}-*/;

	private native static JavaScriptObject _parseZone(String zone)/*-{
		return $wnd.moment.parseZone(zone);
	}-*/;

	private native static JavaScriptObject createPeer(String moment)/*-{
		return $wnd.moment(moment);
	}-*/;

	private native static JavaScriptObject createPeer(String moment, String format)/*-{
		return $wnd.moment(moment, format);
	}-*/;

	private native static JavaScriptObject createPeer(String moment, String format, String locale)/*-{
		return $wnd.moment(moment, format, locale);
	}-*/;

	private native static JavaScriptObject createPeer(String moment, String format, boolean strict)/*-{
		return $wnd.moment(moment, format, strict);
	}-*/;

	private native static JavaScriptObject createPeer(String moment, String format, String locale, boolean strict)/*-{
		return $wnd.moment(moment, format, locale, strict);
	}-*/;

	private native static JavaScriptObject _max(JavaScriptObject... vals)/*-{
		return $wnd.moment.max.apply(vals);
	}-*/;

	private native static JavaScriptObject _min(JavaScriptObject... vals)/*-{
		return $wnd.moment.min.apply(vals);
	}-*/;

	private static native boolean isLoaded()/*-{
		if (typeof $wnd.moment === "undefined" || $wnd.moment === null) {
			return false;
		}
		return true;
	}-*/;

}
