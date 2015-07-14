package com.jm.renderer.elements;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.jm.renderer.elements.parser.StyleElementParser;
import com.jm.util.EmptyChecker;
import com.jm.util.IOConstants;

public abstract class Element {
	String id;
	String displayValue;
	private Map<String, String> attributes;
	boolean hidden;
	boolean readOnly;

	// Use the ElementBuilder to get an instance
	Element(String id) throws EmptyIdException {
		this.id = id;
		if (EmptyChecker.isEmpty(id))
			throw new EmptyIdException();
		this.displayValue = "";
		this.attributes = new HashMap<String, String>();
	}

	protected void addValue(String value) {
		this.displayValue = value;
	}

	public void hide() {
		hidden = true;
	}

	public void setReadOnly() {
		readOnly = true;
	}

	abstract String getType();

	public String render() {
		StringBuilder print = new StringBuilder();
		print.append("<div>").append(IOConstants.CRLF);
		print.append("  <").append(getType());
		print.append(" id=\"").append(id).append("\" ");
		if (hidden)
			addAttr("style", "display:none");
		if (readOnly) {
			addAttr("disabled", "disabled");
			addAttr("readonly", "readonly");
		}
		for (Entry<String, String> entry : attributes.entrySet())
			print.append(entry.getKey()).append("=\"").append(entry.getValue()).append("\" ");
		print.append(">");
		print.append(displayValue);
		print.append("  </").append(getType()).append(">").append(IOConstants.CRLF);
		print.append("</div>").append(IOConstants.CRLF);
		return print.toString();
	}

	public void addAttr(String key, String value) {
		boolean isStyleAttr = "style".equalsIgnoreCase(key);
		if (isStyleAttr)
			handleStyleAttribute(key, value);
		else
			handleOtherAttribute(key, value);
	}

	private void handleStyleAttribute(String key, String addToStyle) {
		String oldStyle = attributes.get(key);
		String value = addToStyle;
		if (!EmptyChecker.isEmpty(oldStyle)) {
			StringBuilder newStyleString = new StringBuilder();
			boolean firstLine = true;
			for (Entry<String, String> newStyle : mergeStyle(oldStyle, addToStyle).entrySet()) {
				if (!firstLine)
					newStyleString.append(StyleElementParser.MULTI_STYLE_SEPARATOR);
				newStyleString.append(newStyle.getKey()).append(StyleElementParser.ELEMENT_STYLE_SEPARATOR)
						.append(newStyle.getValue());
				firstLine = false;
			}
			value = newStyleString.toString();
		}
		attributes.put(key, value);
	}

	// oldStyle="display:block; color:red"
	// addToStyle="display:none"
	// newStyle="display:none; color:red"
	private Map<String, String> mergeStyle(String oldStyle, String addToStyle) {
		Map<String, String> newStyles = StyleElementParser.parse(oldStyle);
		for (Entry<String, String> addToStyleElement : StyleElementParser.parse(addToStyle).entrySet())
			newStyles.put(addToStyleElement.getKey(), addToStyleElement.getValue());
		return newStyles;
	}

	private void handleOtherAttribute(String key, String value) {
		attributes.put(key, value);
	}
}
