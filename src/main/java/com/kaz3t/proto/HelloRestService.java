package com.kaz3t.proto;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloRestService {

    @GET
    public String say() {
        return "Hello";
    }
    
}
