package com.kaz3t.proto.bye;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/bye")
@Produces(MediaType.APPLICATION_JSON)
public class ByeRestService {

    private ByeService byeService;
    
    @Autowired(required=true)
    public ByeRestService(ByeService byeService) {
        this.byeService = byeService;
    }
    
    @GET
    public String say() {
        return byeService.say();
    }
    
}
