package com.brunovollino.examples.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("{{route.from}}")
		.unmarshal().csv().split().body()
		.bean(CsvHandler.class, "handleCsvData");
	}

}
