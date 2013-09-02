package com.kaz3t.proto.entry;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("entryResource")
public class EntryResourceImpl implements EntryResource {

    private EntryService entryService;
    
    @Autowired(required=true)
    public EntryResourceImpl(EntryService entryService) {
        this.entryService = entryService;
    }
    
    public List<Entry> all() {
        return entryService.all();
    }
    
    public void create(Entry entry) {
        entryService.create(entry);
    }
    
    public Entry get(BigInteger id) {
        return entryService.get(id);
    }
    
    public void delete(BigInteger id) {
        entryService.delete(id);
    }

    public void update(Entry entry) {
        entryService.update(entry);
    }
    
}
