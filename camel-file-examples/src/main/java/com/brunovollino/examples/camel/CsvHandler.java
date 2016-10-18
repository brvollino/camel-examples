package com.brunovollino.examples.camel;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CsvHandler {

	public void handleCsvData(List<String> csvLine)  {
		System.out.println("Line: " + csvLine);
	}
}
