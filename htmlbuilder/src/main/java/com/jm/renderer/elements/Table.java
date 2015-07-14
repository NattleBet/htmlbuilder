package com.jm.renderer.elements;

import java.util.List;

import com.jm.util.IOConstants;

public class Table extends Element {
	private List<String> header;
	private List<List<Element>> table;

	Table(String id, List<String> header, List<List<Element>> table) throws EmptyIdException {
		super(id);
		this.header = header;
		this.table = table;
	}

	private String renderTableContent() {
		StringBuilder tableContent = new StringBuilder();
		for (String th : header)
			tableContent.append("<th>").append(th).append("</th>").append(IOConstants.CRLF);
		for (List<Element> row : table) {
			tableContent.append("  <tr>").append(IOConstants.CRLF);
			for (Element item : row) {
				tableContent.append("    <td>").append(IOConstants.CRLF);
				tableContent.append("    ").append(item.render()).append(IOConstants.CRLF);
				tableContent.append("    </td>").append(IOConstants.CRLF);
			}
			tableContent.append("  </tr>").append(IOConstants.CRLF);
		}
		return tableContent.toString();
	}

	@Override
	String getType() {
		return "table";
	}

	@Override
	public String render() {
		displayValue = renderTableContent();
		return super.render();
	}
}
