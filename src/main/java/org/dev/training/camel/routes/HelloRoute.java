package org.dev.training.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.dev.training.camel.processor.HelloProcessor;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:hello?period={{helloPeriod}}")
                .id("hello-java")
                .process(new HelloProcessor())
                .log("${body}");
    }
}
