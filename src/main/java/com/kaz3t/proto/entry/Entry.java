package com.kaz3t.proto.entry;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonProperty;

public class Entry {

    private static long seqId = 0;
    
    private long id;
    private String name;
    private boolean flag;
    private Date datestamp;
    
    private Entry() {
        System.out.println("def");
    }
  
    @JsonCreator
    public Entry(@JsonProperty("name") String name, @JsonProperty("flag") boolean flag) {
        System.out.println("non def");
        this.id = seqId++;
        this.name = name;
        this.flag = flag;
        //this.datestamp = new Date(System.currentTimeMillis());
    }

    public long getId() {
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
