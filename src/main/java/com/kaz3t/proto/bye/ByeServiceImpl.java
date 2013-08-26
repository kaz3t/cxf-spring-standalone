package com.kaz3t.proto.bye;

import org.springframework.stereotype.Service;

@Service
public class ByeServiceImpl implements ByeService {

    @Override
    public String say() {
        return "Bye";
    }

}
