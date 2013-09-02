package com.kaz3t.proto.bye;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bye")
@Produces(MediaType.APPLICATION_JSON)
public interface ByeResource {

    @GET
    public String say();
    
}
