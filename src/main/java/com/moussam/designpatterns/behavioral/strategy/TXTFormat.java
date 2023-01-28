package com.moussam.designpatterns.behavioral.strategy;

import java.util.logging.Logger;

public class TXTFormat implements IStrategy {

	private static TXTFormat txtFormat;
	private static final Logger LOGGER = Logger.getLogger(TXTFormat.class.getName()); 

	private TXTFormat() {

	}

	public static TXTFormat getInstance() {

		if (txtFormat == null) {
			txtFormat = new TXTFormat();
		}
		
		return txtFormat;
	}

	@Override
	public void save() {
		LOGGER.info("Save file in txt format");
	}

}
