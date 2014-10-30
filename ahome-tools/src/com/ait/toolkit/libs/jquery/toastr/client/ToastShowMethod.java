package com.ait.toolkit.libs.jquery.toastr.client;

public enum ToastShowMethod {

	FADE_IN("fadeIn"), SLIDE_DOW("slideDown");

	private String value;

	private ToastShowMethod(String pos) {
		this.value = pos;
	}

	public String getValue() {
		return this.value;
	}
}
