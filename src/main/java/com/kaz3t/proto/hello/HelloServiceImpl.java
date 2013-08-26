package com.kaz3t.proto.hello;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String say() {
        return "Hello";
    }

}
