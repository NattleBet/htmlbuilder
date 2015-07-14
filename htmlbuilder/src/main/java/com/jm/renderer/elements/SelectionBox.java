package com.jm.renderer.elements;

import java.util.List;

public abstract class SelectionBox extends Element {
	protected List<SelectionElement> elements;

	SelectionBox(String id, List<SelectionElement> elements) throws EmptyIdException {
		super(id);
		this.elements = elements;
	}
}
