package com.kaz3t.proto.entry;

import java.util.Date;

public class Entry {

    private static long seqId = 0;
    
    private long id;
    private String name;
    private boolean flag;
    private Date datestamp;
    
    public Entry(String name, boolean flag, Date datestamp) {
        this.id = seqId++;
        this.name = name;
        this.flag = flag;
        this.datestamp = new Date(datestamp.getTime());
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

    public Date getDatestamp() {
        return new Date(datestamp.getTime());
    }

    public void setDatestamp(Date datestamp) {
        this.datestamp = new Date(datestamp.getTime());
    }
    
}
