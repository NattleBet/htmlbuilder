package com.jm.renderer.elements.mock;

import com.jm.renderer.elements.EmptyIdException;
import com.jm.renderer.elements.HtmlBuilder;
import com.jm.renderer.elements.Image;
import com.jm.renderer.elements.images.ImageConstants;

public class ImageMock {
	public static Image mock() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createImage("image", ImageConstants.MOCK_BUTTON_IMAGE);
	}
}
