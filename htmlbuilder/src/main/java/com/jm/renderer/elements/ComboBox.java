package com.jm.renderer.elements;

import java.util.List;

import com.jm.util.IOConstants;

public class ComboBox extends SelectionBox {

	ComboBox(String id, List<SelectionElement> elements) throws EmptyIdException {
		super(id, elements);
	}

	@Override
	String getType() {
		return "select";
	}

	@Override
	public String render() {
		displayValue = getSelectionValue();
		return super.render();
	}

	private String getSelectionValue() {
		StringBuilder elementBuilder = new StringBuilder();
		elementBuilder.append(IOConstants.CRLF);
		for (SelectionElement element : elements) {
			elementBuilder.append("  <option value=\"").append(element.getHiddenValue()).append("\">");
			elementBuilder.append(element.getVisibleValue());
			elementBuilder.append("</option>");
			elementBuilder.append(IOConstants.CRLF);
		}
		return elementBuilder.toString();
	}

}
