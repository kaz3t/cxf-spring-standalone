package com.kaz3t.proto.entry;

import java.math.BigInteger;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="entries")
public class Entry {
    
    @Id
    private BigInteger id;
    private String name;
    private boolean flag;
    private Date datestamp;
  
    @JsonCreator
    public Entry(@JsonProperty("name") String name, @JsonProperty("flag") boolean flag) {
        this.name = name;
        this.flag = flag;
        //this.datestamp = new Date(System.currentTimeMillis());
    }

    public BigInteger getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
/*
    public Date getDatestamp() {
        return new Date(datestamp.getTime());
    }

    public void setDatestamp(Date datestamp) {
        this.datestamp = new Date(datestamp.getTime());
    }
  */  
}
