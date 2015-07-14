package com.jm.renderer.elements;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.Before;

import com.jm.renderer.writer.HtmlWriter;
import com.jm.util.EmptyChecker;
import com.jm.util.IOConstants;

import static org.junit.Assert.*;

public abstract class AbstractElementTester {
	public static final String HTML_START = "<html><body>";
	public static final String HTML_END = "</body></html>";
	protected final File htmlFile;

	@Before
	public void initBrowser() {
		// Browser browser = new Browser();
		// browser.open();
	}

	@After
	public void tearDown() {
		if (!EmptyChecker.isEmpty(htmlFile) && htmlFile.exists())
			assertTrue(htmlFile.delete());
	}

	public AbstractElementTester() {
		htmlFile = new File(System.getProperty("java.io.tmpdir"), "test.html");
		if (htmlFile.exists())
			assertTrue(htmlFile.delete());
	}

	protected void write(String htmlElement) throws FileNotFoundException, UnsupportedEncodingException, IOException {
		HtmlWriter writer = new HtmlWriter(htmlFile);
		StringBuilder html = new StringBuilder();
		html.append(printHeader());
		html.append(htmlElement);
		html.append(printFooter());
		writer.write(html.toString());
	}

	private String printHeader() {
		return HTML_START + IOConstants.CRLF;
	}

	private String printFooter() {
		return IOConstants.CRLF + HTML_END;
	}
}
