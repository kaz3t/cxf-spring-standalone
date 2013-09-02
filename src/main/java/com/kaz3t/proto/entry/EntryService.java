package com.kaz3t.proto.entry;

import java.math.BigInteger;
import java.util.List;

public interface EntryService {

    public void create(Entry entry);
    public Entry get(BigInteger id);
    public void delete(BigInteger id);
    public void update(Entry entry);
    public List<Entry> all();
    
}
