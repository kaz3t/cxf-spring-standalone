package com.kaz3t.proto.entry;

import java.math.BigInteger;
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

@Path("/entries")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface EntryResource {

    @GET
    public List<Entry> all();
    
    @POST
    public void create(Entry entry);
    
    @GET
    @Path("/{id}")
    public Entry get(@PathParam("id") BigInteger id);
    
    @DELETE
    @Path("/{id}")
    public void delete(@PathParam("id") BigInteger id);

    @PUT
    @Path("/{id}")
    public void update(Entry entry);
    
}
