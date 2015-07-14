package com.jm.renderer.elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import com.jm.renderer.elements.mock.ImageMock;

public class ImageTest extends AbstractElementTester {
	private Image image;

	@Before
	public void setUp() throws EmptyIdException, FileNotFoundException, UnsupportedEncodingException, IOException {
		image = ImageMock.mock();
		write(image.render());
	}

	@Test
	public void render_show_expectedVisible() {

	}

	@Test
	public void render_hide_expectedNotVisible() {
		image.hide();
	}
}
