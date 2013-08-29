package com.kaz3t.proto.entry;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class EntryServiceImpl implements EntryService {

    private Map<Long, Entry> entries = new HashMap<>();
    
    @Override
    public void create(String name, boolean flag, Date datestamp) {
        Entry entry = new Entry(name, flag, datestamp);
        entries.put(entry.getId(), entry);
    }

    @Override
    public void delete(long id) {
        entries.remove(id);
    }

    @Override
    public void update(Entry entry) {
        entries.put(entry.getId(), entry);
    }

    @Override
    public List<Entry> all() {
        return new ArrayList<>(entries.values());
    }

    @Override
    public Entry get(long id) {
        return entries.get(id);
    }

}
