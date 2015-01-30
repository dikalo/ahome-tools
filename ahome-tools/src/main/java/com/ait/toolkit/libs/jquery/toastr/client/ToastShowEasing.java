package com.ait.toolkit.libs.jquery.toastr.client;

public enum ToastShowEasing {

	SWING("swing"), LINEAR("linear");

	private String value;

	private ToastShowEasing(String pos) {
		this.value = pos;
	}

	public String getValue() {
		return this.value;
	}
}
