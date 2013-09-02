package com.kaz3t.proto.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("helloResource")
public class HelloResourceImpl implements HelloResource {

    private HelloService helloService;

    @Autowired(required=true)
    public HelloResourceImpl(HelloService helloService) {
        this.helloService = helloService;
    }
    
    public String say() {
        return helloService.say();
    }
    
}
