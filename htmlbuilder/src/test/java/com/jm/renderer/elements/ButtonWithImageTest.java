package com.jm.renderer.elements;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.jm.renderer.elements.mock.ButtonMock;

public class ButtonWithImageTest extends AbstractElementTester {
	private Button button;

	@Before
	public void setUp() throws EmptyIdException, IOException {
		button = ButtonMock.mockWithImage();
		write(button.render());
	}

	@Test
	public void render_show_expectedVisible() throws EmptyIdException {

	}

	@Test
	public void render_hide_expectedNotVisible() throws EmptyIdException {
		button.hide();
	}

	@Test
	public void render_setReadOnly_expectedNotClickable() throws EmptyIdException {
		button.setReadOnly();
	}
}
