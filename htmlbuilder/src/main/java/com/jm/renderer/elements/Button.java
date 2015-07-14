package com.jm.renderer.elements;

public class Button extends Element {

	Button(String id, String text) throws EmptyIdException {
		super(id);
		this.displayValue = text;
	}

	Button(String id, Image image) throws EmptyIdException {
		super(id);
		this.displayValue = image.render();
	}

	@Override
	String getType() {
		return "button";
	}

	@Override
	public String render() {
		return super.render();
	}

}
