package com.kaz3t.proto.entry;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("entryResource")
public class EntryResourceImpl implements EntryResource {

    private EntryService entryService;
    
    @Autowired(required=true)
    public EntryResourceImpl(EntryService entryService) {
        this.entryService = entryService;
    }
    
    @Override
    public List<Entry> all() {
        return entryService.all();
    }
    
    @Override
    public void create(Entry entry) {
        entryService.create(entry);
    }
    
    @Override
    public Entry get(BigInteger id) {
        return entryService.get(id);
    }
    
    @Override
    public void delete(BigInteger id) {
        entryService.delete(id);
    }

    @Override
    public void update(BigInteger id, Entry entry) {
        entryService.update(id, entry);
    }
    
}
