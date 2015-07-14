package com.jm.renderer.elements;

import java.util.List;

public class CheckBox extends SelectionInputBox {

	CheckBox(String id, List<SelectionElement> elements) throws EmptyIdException {
		super(id, elements);
	}

	@Override
	public String getType() {
		return String.format("input type=\"checkbox\" name=\"%s\"", id);
	}

	@Override
	public String render() {
		return super.render();
	}
}
