package com.ait.toolkit.libs.jquery.noty.client;

public enum NotyPosition {

	TOP("top"), TOP_CENTER("topCenter"), TOP_RIGHT("topRight"), TOP_LEFT("topLeft"), BOTTOM("bottom"), BOTTOM_CENTER("bottomCenter"), BOTTOM_LEFT("bottomLeft"), BOTTOM_RIGHT(
			"bottomRight"), CENTER("center"), CENTER_LEFT("centerLeft"), CENTER_RIGHT("centerRight");

	private String value;

	private NotyPosition(String pos) {
		this.value = pos;
	}

	public String getValue() {
		return this.value;
	}
}
