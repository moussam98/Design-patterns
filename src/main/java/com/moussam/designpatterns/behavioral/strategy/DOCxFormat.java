package com.moussam.designpatterns.behavioral.strategy;

import java.util.logging.Logger;

public class DOCxFormat implements IStrategy {

	private static final Logger LOGGER = Logger.getLogger(DOCxFormat.class.getName());

	// Application du pattern singleton
	private static DOCxFormat docxFormat;

	private DOCxFormat() {

	}

	public static DOCxFormat getInstance() {
		if (docxFormat == null) {
			docxFormat = new DOCxFormat();
		}

		return docxFormat;
	}

	@Override
	public void save() {
		LOGGER.info("Save file in docx format");
	}

}
