package com.jm.renderer.elements;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;

import com.jm.renderer.elements.mock.TableMock;

public class TableTest extends AbstractElementTester {
	private Table table;

	@Before
	public void setUp() throws EmptyIdException, FileNotFoundException, UnsupportedEncodingException, IOException {
		table = TableMock.mock();
		write(table.render());
	}

	@Test
	public void render_show_expectedVisibleAndEdiable() {

	}

	@Test
	public void render_hide_expectedNotVisible() {
		table.hide();
	}

	@Test
	public void renderer_setReadOnly_expectedNotEditable() {
		table.setReadOnly();
	}
}
