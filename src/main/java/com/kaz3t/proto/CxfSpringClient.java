package com.kaz3t.proto;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.WebClient;

import com.kaz3t.proto.hello.HelloRestService;

public class CxfSpringClient {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /*
         * HelloRestService helloRestService = JAXRSClientFactory.create(
         * "http://localhost:7777", HelloRestService.class);
         * System.out.print(helloRestService.say());
         */
        WebClient helloClient = WebClient.create("http://localhost:7777")
                .path("hello").accept(MediaType.APPLICATION_JSON);
        WebClient byeClient = WebClient.create("http://localhost:7777")
                .path("bye").accept(MediaType.APPLICATION_JSON);
        System.out.println(helloClient.accept(MediaType.APPLICATION_JSON).get(
                String.class));
        System.out.println(byeClient.get(String.class));
    }

}
