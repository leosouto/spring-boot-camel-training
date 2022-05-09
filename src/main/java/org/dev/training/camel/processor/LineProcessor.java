package org.dev.training.camel.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.dev.training.camel.services.Utils;

public class LineProcessor implements Processor {
    @Override
    public void process(Exchange exchange) throws Exception {
        String name = Utils.getName(exchange.getIn().getBody());
        if(Utils.startsWithVowel(name)){
            exchange.getIn().setBody(name);
        }else{
            exchange.getIn().setBody("");
        }
    }
}
