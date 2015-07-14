package com.jm.renderer.elements.mock;

import java.util.ArrayList;
import java.util.List;

import com.jm.renderer.elements.Element;
import com.jm.renderer.elements.EmptyIdException;
import com.jm.renderer.elements.HtmlBuilder;
import com.jm.renderer.elements.Table;

public class TableMock {

	public static Table mock() throws EmptyIdException {
		HtmlBuilder builder = new HtmlBuilder();
		return builder.createTable("table", headerMock(), tableElementsMock());
	}

	public static List<String> headerMock() {
		List<String> header = new ArrayList<String>() {
			{
				add("Column1");
				add("Column2");
				add("Column3");
			}
		};
		return header;
	}

	public static List<List<Element>> tableElementsMock() throws EmptyIdException {
		List<List<Element>> tableElements = new ArrayList<List<Element>>();
		tableElements.add(createInputRow());
		tableElements.add(createComboBoxRow());
		tableElements.add(createCheckBoxRow());
		tableElements.add(createRadioBoxRow());
		return tableElements;
	}

	private static List<Element> createInputRow() throws EmptyIdException {
		final HtmlBuilder builder = new HtmlBuilder();
		List<Element> row = new ArrayList<Element>() {
			{
				add(builder.createInputBox("input1"));
				add(builder.createInputBox("input2"));
				add(builder.createInputBox("input3"));
			}
		};
		return row;
	}

	private static List<Element> createComboBoxRow() throws EmptyIdException {
		final HtmlBuilder builder = new HtmlBuilder();
		List<Element> row = new ArrayList<Element>() {
			{
				add(builder.createComboBox("combobox1", SelectionElementMock.mock()));
				add(builder.createComboBox("combobox2", SelectionElementMock.mock()));
				add(builder.createComboBox("combobox3", SelectionElementMock.mock()));
			}
		};
		return row;
	}

	private static List<Element> createCheckBoxRow() throws EmptyIdException {
		final HtmlBuilder builder = new HtmlBuilder();
		List<Element> row = new ArrayList<Element>() {
			{
				add(builder.createCheckBox("checkbox1", SelectionElementMock.mock()));
				add(builder.createCheckBox("checkbox2", SelectionElementMock.mock()));
				add(builder.createCheckBox("checkbox3", SelectionElementMock.mock()));
			}
		};
		return row;
	}

	private static List<Element> createRadioBoxRow() throws EmptyIdException {
		final HtmlBuilder builder = new HtmlBuilder();
		List<Element> row = new ArrayList<Element>() {
			{
				add(builder.createRadioBox("radiobox1", SelectionElementMock.mock()));
				add(builder.createRadioBox("radiobox2", SelectionElementMock.mock()));
				add(builder.createRadioBox("radiobox3", SelectionElementMock.mock()));
			}
		};
		return row;
	}
}
