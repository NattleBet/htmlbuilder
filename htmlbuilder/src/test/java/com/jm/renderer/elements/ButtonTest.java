package com.jm.renderer.elements;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import com.jm.renderer.elements.mock.ButtonMock;

public class ButtonTest extends AbstractElementTester {
	private Button button;

	@Before
	public void setUp() throws EmptyIdException, FileNotFoundException, UnsupportedEncodingException, IOException {
		button = ButtonMock.mock();
		write(button.render());
	}

	@Test
	public void render_show_expectedVisible() throws EmptyIdException {
		// 2. validate with selenium
		assertTrue(false);
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
