package com.jm.renderer.elements.mock;

import com.jm.renderer.elements.EmptyIdException;
import com.jm.renderer.elements.HtmlBuilder;
import com.jm.renderer.elements.InputBox;

public class InputFieldMock {

	public static InputBox mock() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createInputBox("input");
	}
}
