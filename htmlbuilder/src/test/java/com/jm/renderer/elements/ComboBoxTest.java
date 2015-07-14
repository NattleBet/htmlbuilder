package com.jm.renderer.elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import com.jm.renderer.elements.mock.ComboBoxMock;

public class ComboBoxTest extends AbstractElementTester {
	private ComboBox comboBox;

	@Before
	public void setUp() throws EmptyIdException, FileNotFoundException, UnsupportedEncodingException, IOException {
		comboBox = ComboBoxMock.mock();
		write(comboBox.render());
	}

	@Test
	public void render_show_expectedVisibleAndEdiable() {

	}

	@Test
	public void render_hide_expectedNotVisible() {
		comboBox.hide();
	}

	@Test
	public void renderer_setReadOnly_expectedNotEditable() {
		comboBox.setReadOnly();
	}
}
