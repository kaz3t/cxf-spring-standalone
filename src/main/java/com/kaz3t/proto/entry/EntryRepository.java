package com.kaz3t.proto.entry;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class EntryRepository {

    @Autowired(required=true)
    private MongoTemplate mongoTemplate;
    
    public Entry findOne(BigInteger id) {
        Query query = new Query(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query, Entry.class);
    }
    
    public List<Entry> findAll() {
        return mongoTemplate.findAll(Entry.class);
    }
    
    public Entry save(Entry entry) {
        mongoTemplate.save(entry);
        return entry;
    }
    
    public void remove(BigInteger id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, Entry.class);
    }
    
}
