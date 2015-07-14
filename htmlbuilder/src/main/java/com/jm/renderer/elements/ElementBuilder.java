package com.jm.renderer.elements;

import java.util.List;

public interface ElementBuilder {

	public InputBox createInputBox(String id) throws EmptyIdException;

	public ComboBox createComboBox(String id, List<SelectionElement> comboBoxValues) throws EmptyIdException;

	public RadioBox createRadioBox(String id, List<SelectionElement> radioBoxValues) throws EmptyIdException;

	public CheckBox createCheckBox(String id, List<SelectionElement> checkBoxValues) throws EmptyIdException;

	public Table createTable(String id, List<String> header, List<List<Element>> table) throws EmptyIdException;

	public Image createImage(String id, String imageFile) throws EmptyIdException;

	public Button createButton(String id, String buttonText) throws EmptyIdException;

	public Button createButton(String id, Image image) throws EmptyIdException;

	public Link createLink(String id, String displayName, String url) throws EmptyIdException;

	public Link createLink(String id, Image image, String url) throws EmptyIdException;
}
