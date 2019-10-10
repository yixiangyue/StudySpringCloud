package com.yxy.study.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/getString/{param}")
    public Object getString(@PathVariable("param") String param){
        return "TestController " + param;
    }
}
