package com.jm.renderer.elements;

public class Link extends Element {
	private String url;

	Link(String id, String displayName, String url) throws EmptyIdException {
		super(id);
		this.displayValue = displayName;
		this.url = url;
	}

	Link(String id, Image image, String url) throws EmptyIdException {
		super(id);
		this.displayValue = image.render();
		this.url = url;
	}

	@Override
	String getType() {
		return "a";
	}

	@Override
	public String render() {
		addAttr("href", url);
		return super.render();
	}

}
