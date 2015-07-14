package com.jm.renderer.elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import com.jm.renderer.elements.mock.CheckBoxMock;

public class CheckBoxTest extends AbstractElementTester {
	private CheckBox checkBox;

	@Before
	public void setUp() throws EmptyIdException, FileNotFoundException, UnsupportedEncodingException, IOException {
		checkBox = CheckBoxMock.mock();
		write(checkBox.render());
	}

	@Test
	public void render_show_expectedVisibleAndEdiable() {

	}

	@Test
	public void render_hide_expectedNotVisible() {
		checkBox.hide();
	}

	@Test
	public void renderer_setReadOnly_expectedNotEditable() {
		checkBox.setReadOnly();
	}
}
