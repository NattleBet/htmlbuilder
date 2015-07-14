package com.jm.renderer.elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import com.jm.renderer.elements.mock.RadioBoxMock;

public class RadioBoxTest extends AbstractElementTester {
	private RadioBox radioBox;

	@Before
	public void setUp() throws EmptyIdException, FileNotFoundException, UnsupportedEncodingException, IOException {
		radioBox = RadioBoxMock.mock();
		write(radioBox.render());
	}

	@Test
	public void render_show_expectedVisibleAndEdiable() {

	}

	@Test
	public void render_hide_expectedNotVisible() {
		radioBox.hide();
	}

	@Test
	public void renderer_setReadOnly_expectedNotEditable() {
		radioBox.setReadOnly();
	}
}
