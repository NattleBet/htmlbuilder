package com.jm.renderer.elements;

public class SelectionElement {
	private String hiddenValue;
	private String visibleValue;

	public SelectionElement(String hiddenValue, String visibleValue) {
		this.hiddenValue = hiddenValue;
		this.visibleValue = visibleValue;
	}

	public String getHiddenValue() {
		return hiddenValue;
	}

	public String getVisibleValue() {
		return visibleValue;
	}

}
