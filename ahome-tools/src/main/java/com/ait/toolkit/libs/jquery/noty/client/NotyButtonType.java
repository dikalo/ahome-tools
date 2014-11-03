package com.ait.toolkit.libs.jquery.noty.client;

public enum NotyButtonType {

	DEFAULT("btn btn-default"), PRIMARY("btn btn-primary"), SUCCESS("btn btn-success"), INFO("btn btn-info"), WARNING("btn btn-warning"), DANGER("btn btn-danger");

	private String value;

	private NotyButtonType(String pos) {
		this.value = pos;
	}

	public String getValue() {
		return this.value;
	}
}
