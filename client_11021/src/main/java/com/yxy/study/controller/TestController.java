package com.yxy.study.controller;

import com.yxy.study.service.remote.SayHelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SayHelloRemote sayHelloRemote;

    @RequestMapping(value = "/getString")
    public String getString(){
        String result =  restTemplate.getForObject("http://EUREKA_SERVICE/getString/11",String.class);
        System.out.println("result = " + result);
        return result;
    }

    @RequestMapping(value = "/sayHello")
    public Object sayHello(){
       Map<String,Object> result = sayHelloRemote.sayhello();
        System.out.println("result = " + result);
       return result;
    }

}
