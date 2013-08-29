package com.kaz3t.proto.entry;

import java.util.Date;
import java.util.List;

public interface EntryService {

    public void create(String name, boolean flag, Date datestamp);
    public Entry get(long id);
    public void delete(long id);
    public void update(Entry entry);
    public List<Entry> all();
    
}
