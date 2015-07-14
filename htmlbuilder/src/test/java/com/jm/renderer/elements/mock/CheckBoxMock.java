package com.jm.renderer.elements.mock;

import com.jm.renderer.elements.CheckBox;
import com.jm.renderer.elements.EmptyIdException;
import com.jm.renderer.elements.HtmlBuilder;

public class CheckBoxMock {

	public static CheckBox mock() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createCheckBox("checkbox", SelectionElementMock.mock());
	}
}
