package com.jm.renderer.elements.mock;

import java.util.ArrayList;
import java.util.List;

import com.jm.renderer.elements.SelectionElement;

public class SelectionElementMock {
	public static List<SelectionElement> mock() {
		List<SelectionElement> selectionBoxValues = new ArrayList<SelectionElement>();
		selectionBoxValues.add(new SelectionElement("", ""));
		selectionBoxValues.add(new SelectionElement("1", "Eins"));
		selectionBoxValues.add(new SelectionElement("2", "Zwei"));
		selectionBoxValues.add(new SelectionElement("3", "Drei"));
		return selectionBoxValues;
	}
}
