package com.kaz3t.proto.entry;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
    public void create(Entry entry) {
        entryService.create(entry);
    }
    
    @GET
    @Path("/{id}")
    public Entry get(@PathParam("id") long id) {
        return entryService.get(id);
    }
    
    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") long id) {
        entryService.delete(id);
    }

    @PUT
    @Path("/{id}")
    public void update(Entry entry) {
        entryService.update(entry);
    }
    
}
