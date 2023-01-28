package com.moussam.designpatterns.behavioral;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import com.moussam.designpatterns.behavioral.strategy.FileBackup;
import com.moussam.designpatterns.behavioral.strategy.PDFFormat;
import com.moussam.designpatterns.behavioral.strategy.TXTFormat;

class TestStrategyPattern {
	
	private TXTFormat txtFormat = mock(TXTFormat.class); 
	private PDFFormat pdfFormat = mock(PDFFormat.class); 

	@Test
	void test() {
		FileBackup file = new FileBackup(); 
		file.setContent("Hello world");
		
		file.setStrategy(txtFormat);
		file.process();
		verify(txtFormat, times(1)).save();
		
		file.setStrategy(pdfFormat);
		file.process();
		verify(pdfFormat, times(1)).save();
		
	}

}
