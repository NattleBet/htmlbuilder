package com.jm.renderer.elements.mock;

import com.jm.renderer.elements.EmptyIdException;
import com.jm.renderer.elements.HtmlBuilder;
import com.jm.renderer.elements.Link;
import com.jm.renderer.elements.images.ImageConstants;

public class LinkMock {
	public static Link mock() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createLink("link", "google", "http://www.google.de");
	}

	public static Link mockWithImage() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createLink("link", builder.createImage("image", ImageConstants.MOCK_LINK_IMAGE),
				"http://www.google.de");
	}
}
