package com.jm.renderer.elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import com.jm.renderer.elements.mock.LinkMock;

public class LinkTest extends AbstractElementTester {
	private Link link;

	@Before
	public void setUp() throws EmptyIdException, FileNotFoundException, UnsupportedEncodingException, IOException {
		link = LinkMock.mock();
		write(link.render());
	}

	@Test
	public void render_show_expectedVisible() {

	}

	@Test
	public void render_hide_expectedNotVisible() {
		link.hide();
	}
}
