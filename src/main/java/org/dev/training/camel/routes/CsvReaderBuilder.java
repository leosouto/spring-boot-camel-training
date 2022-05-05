package org.dev.training.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CsvReaderBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("{{fileUri}}")
                .id("csv-reader")
                .split(body().tokenize("\n"))
                .to("direct:log-line");

        from("direct:log-line")
                .id("csv-logger")
                .log("${body}");
    }
}
