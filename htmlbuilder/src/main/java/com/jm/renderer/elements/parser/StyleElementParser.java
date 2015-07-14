package com.jm.renderer.elements.parser;

import java.util.HashMap;
import java.util.Map;

public class StyleElementParser {
	public final static String MULTI_STYLE_SEPARATOR = ";";
	public final static String ELEMENT_STYLE_SEPARATOR = ":";

	public static Map<String, String> parse(String styleLine) {
		Map<String, String> styleAttributes = new HashMap<String, String>();
		for (String stylePair : styleLine.split(MULTI_STYLE_SEPARATOR)) {
			String[] pair = stylePair.split(ELEMENT_STYLE_SEPARATOR);
			styleAttributes.put(pair[0], pair[1]);
		}
		return styleAttributes;
	}
}
