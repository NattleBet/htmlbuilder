package com.jm.renderer.elements.mock;

import com.jm.renderer.elements.Button;
import com.jm.renderer.elements.EmptyIdException;
import com.jm.renderer.elements.HtmlBuilder;

public class ButtonMock {
	public static Button mock() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createButton("button", "This is a button");
	}

	public static Button mockWithImage() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createButton("button", ImageMock.mock());
	}
}
