package org.dev.training.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class HelloProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        exchange.getIn().setBody("Body desde el processor");
    }
}
