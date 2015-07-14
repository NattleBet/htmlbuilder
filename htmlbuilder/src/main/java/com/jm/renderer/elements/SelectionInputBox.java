package com.jm.renderer.elements;

import java.util.List;

import com.jm.util.IOConstants;

public abstract class SelectionInputBox extends SelectionBox {

	SelectionInputBox(String id, List<SelectionElement> elements) throws EmptyIdException {
		super(id, elements);
	}

	@Override
	public String render() {
		StringBuilder elementBuilder = new StringBuilder();
		String hiddenString = "";
		if (hidden)
			hiddenString = " style=\"display: none\"";
		elementBuilder.append("<div").append(hiddenString).append(">").append(IOConstants.CRLF);
		for (SelectionElement element : elements) {
			displayValue = element.getVisibleValue();
			addAttr("value", element.getHiddenValue());
			elementBuilder.append(super.render());
		}
		elementBuilder.append("</div>").append(IOConstants.CRLF);
		return elementBuilder.toString();
	}

}
