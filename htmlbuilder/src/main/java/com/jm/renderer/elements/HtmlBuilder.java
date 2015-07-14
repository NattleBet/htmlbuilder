package com.jm.renderer.elements;

import java.util.List;

public class HtmlBuilder implements ElementBuilder {

	public InputBox createInputBox(String id) throws EmptyIdException {
		return new InputBox(id);
	}

	public ComboBox createComboBox(String id, List<SelectionElement> comboBoxValues) throws EmptyIdException {
		return new ComboBox(id, comboBoxValues);
	}

	public RadioBox createRadioBox(String id, List<SelectionElement> radioBoxValues) throws EmptyIdException {
		return new RadioBox(id, radioBoxValues);
	}

	public CheckBox createCheckBox(String id, List<SelectionElement> checkBoxValues) throws EmptyIdException {
		return new CheckBox(id, checkBoxValues);
	}

	public Table createTable(String id, List<String> header, List<List<Element>> table) throws EmptyIdException {
		return new Table(id, header, table);
	}

	public Image createImage(String id, String imageFile) throws EmptyIdException {
		return new Image(id, imageFile);
	}

	public Button createButton(String id, String buttonText) throws EmptyIdException {
		return new Button(id, buttonText);
	}

	public Button createButton(String id, Image image) throws EmptyIdException {
		return new Button(id, image);
	}

	public Link createLink(String id, String displayName, String url) throws EmptyIdException {
		return new Link(id, displayName, url);
	}

	public Link createLink(String id, Image image, String url) throws EmptyIdException {
		return new Link(id, image, url);
	}

}
