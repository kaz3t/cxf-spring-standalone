package com.kaz3t.proto.entry;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryServiceImpl implements EntryService {

    @Autowired(required=true)
    private EntryRepository entryRepository;
    
    @Override
    public void create(Entry entry) {
        entryRepository.save(entry);
    }

    @Override
    public void delete(BigInteger id) {
        entryRepository.remove(id);
    }

    @Override
    public void update(BigInteger id, Entry entry) {
        Entry savedEntry = entryRepository.findOne(id);
        savedEntry.setName(entry.getName());
        savedEntry.setFlag(entry.isFlag());
        entryRepository.save(savedEntry);
    }

    @Override
    public List<Entry> all() {
        return entryRepository.findAll();
    }

    @Override
    public Entry get(BigInteger id) {
        return entryRepository.findOne(id);
    }

}
