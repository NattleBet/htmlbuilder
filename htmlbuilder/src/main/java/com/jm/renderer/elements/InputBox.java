package com.jm.renderer.elements;

public class InputBox extends Element {

	public InputBox(String id) throws EmptyIdException {
		super(id);
	}

	@Override
	String getType() {
		return "input";
	}

}
