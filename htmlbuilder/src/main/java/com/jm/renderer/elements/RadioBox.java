package com.jm.renderer.elements;

import java.util.List;

public class RadioBox extends SelectionInputBox {
	RadioBox(String id, List<SelectionElement> elements) throws EmptyIdException {
		super(id, elements);
	}

	@Override
	String getType() {
		return String.format("input type=\"radio\" name=\"%s\"", id);
	}

	@Override
	public String render() {
		return super.render();
	}

}
