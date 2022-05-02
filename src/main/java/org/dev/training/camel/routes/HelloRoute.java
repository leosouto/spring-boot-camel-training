package org.dev.training.camel.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:hello?period={{helloPeriod}}")
                .log("Hello from Java DSL!");
    }
}
