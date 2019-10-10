package com.yxy.study.service;

import com.yxy.study.service.remote.SayHelloRemote;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class SayHelloImpl implements SayHelloRemote{

    @Override
    public Map<String, Object> sayhello() {
        Map<String,Object> result = new HashMap<>();
        result.put("yixy",1);
        result.put("abc",2);
        result.put("rrrr",5);
        return result;
    }
}
