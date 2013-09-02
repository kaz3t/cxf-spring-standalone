package com.kaz3t.proto.bye;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("byeResource")
public class ByeResourceImpl implements ByeResource {

    private ByeService byeService;
    
    @Autowired(required=true)
    public ByeResourceImpl(ByeService byeService) {
        this.byeService = byeService;
    }
    
    public String say() {
        return byeService.say();
    }
    
}
