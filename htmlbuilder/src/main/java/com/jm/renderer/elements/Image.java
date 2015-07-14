package com.jm.renderer.elements;

public class Image extends Element {
	private String imageFile;

	/*
	 * Should be under src/main/resources/images
	 */
	Image(String id, String imageFile) throws EmptyIdException {
		super(id);
		this.imageFile = imageFile;
	}

	@Override
	String getType() {
		return "img";
	}

	@Override
	public String render() {
		addAttr("src", imageFile);
		return super.render();
	}

}
