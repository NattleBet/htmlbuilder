package com.jm.renderer.elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import com.jm.renderer.elements.mock.InputFieldMock;

public class InputBoxTest extends AbstractElementTester {
	private InputBox inputField;

	@Before
	public void setUp() throws EmptyIdException, FileNotFoundException, UnsupportedEncodingException, IOException {
		inputField = InputFieldMock.mock();
		write(inputField.render());
	}

	@Test
	public void render_show_expectedVisibleAndEdiable() {

	}

	@Test
	public void render_hide_expectedNotVisible() {
		inputField.hide();
	}

	@Test
	public void renderer_setReadOnly_expectedNotEditable() {
		inputField.setReadOnly();
	}
}
