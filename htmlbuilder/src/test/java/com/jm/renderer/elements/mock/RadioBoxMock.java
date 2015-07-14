package com.jm.renderer.elements.mock;

import com.jm.renderer.elements.EmptyIdException;
import com.jm.renderer.elements.HtmlBuilder;
import com.jm.renderer.elements.RadioBox;

public class RadioBoxMock {

	public static RadioBox mock() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createRadioBox("radiobox", SelectionElementMock.mock());
	}
}
