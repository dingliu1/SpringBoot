package com.atguiau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick!";
    }


    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","nice to meet you");
        return "success";
    }


}
