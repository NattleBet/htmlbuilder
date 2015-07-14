package com.jm.renderer.writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HtmlWriter {
	private PrintWriter writer;

	public HtmlWriter(File file) throws FileNotFoundException, UnsupportedEncodingException, IOException {
		this(file, "UTF-8");
	}

	public HtmlWriter(File file, String encoding) throws FileNotFoundException, UnsupportedEncodingException, IOException {
		writer = new PrintWriter(file.getCanonicalPath(), encoding);
	}

	public void write(String text) {
		writer.println(text);
		writer.close();
	}
}
