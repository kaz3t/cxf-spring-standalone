package com.kaz3t.proto.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloRestService {

    private HelloService helloService;

    @Autowired(required=true)
    public HelloRestService(HelloService helloService) {
        this.helloService = helloService;
    }
    
    @GET
    public String say() {
        return helloService.say();
    }
    
}
