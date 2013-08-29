package com.kaz3t.proto.entry;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/entries")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EntryRestService {

    private EntryService entryService;
    
    @Autowired(required=true)
    public EntryRestService(EntryService entryService) {
        this.entryService = entryService;
    }
    
    @GET
    public List<Entry> all() {
        return entryService.all();
    }
    
    @POST
    public void create(String name, boolean flag, Date datestamp) {
        
    }
    
}
