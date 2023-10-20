package com.user1.routing;

import com.user1.entity.UserOne;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

import java.util.StringTokenizer;

@Component
public class Router extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet");

        rest("/placeOrder")
                .get()
                .to("direct:place");

        from("direct:place")
                .setHeader(Exchange.HTTP_METHOD, simple("POST"))
                .to("http://localhost:8091/user1?bridgeEndpoint=true")
                .to("activemq:order-queue")
                .log("You Ordered: ${body}")

                .unmarshal().json(JsonLibrary.Jackson, UserOne.class)
                .process(exchange -> {
                    UserOne input = (UserOne) exchange.getIn().getBody();
                    int id = input.getId();
                    String name = input.getName();
                    String item = input.getItem();

                    System.out.println("UserOne id: "+id);
                    System.out.println("UserOne Name: "+name);
                    System.out.println("UserOne Item: "+item);
                })
                .setBody().constant("Order Placed Successfully!")
                .log("${body}");
    }
}
