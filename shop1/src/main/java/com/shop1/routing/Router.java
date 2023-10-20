package com.shop1.routing;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Router extends RouteBuilder {
    @Override
    public void configure() throws Exception {
//        restConfiguration().component("servlet");

        from("activemq:order-queue")
                .log("${body}");
    }
}
