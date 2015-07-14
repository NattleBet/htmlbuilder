package com.jm.renderer.elements.mock;

import com.jm.renderer.elements.ComboBox;
import com.jm.renderer.elements.EmptyIdException;
import com.jm.renderer.elements.HtmlBuilder;

public class ComboBoxMock {

	public static ComboBox mock() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createComboBox("combobox", SelectionElementMock.mock());
	}
}
