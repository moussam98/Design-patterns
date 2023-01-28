package com.moussam.designpatterns.behavioral.strategy;

import java.util.logging.Logger;

public class PDFFormat implements IStrategy {

	private static final Logger LOGGER = Logger.getLogger(PDFFormat.class.getName());

	private static PDFFormat pdfFormat;

	private PDFFormat() {

	}

	public static PDFFormat getInstance() {

		if (pdfFormat == null) {
			pdfFormat = new PDFFormat();
		}

		return pdfFormat;
	}

	@Override
	public void save() {
		LOGGER.info("Save file in pdf format");
	}

}
