package com.ybin.eurekaclienttwo.controller;

import com.alibaba.fastjson.JSONObject;
import com.ybin.eurekaclienttwo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/22 9:55
 * @description:
 */

@Controller
@RequestMapping("/eureka-client-two")
public class TestController {
    //@Qualifier("eureka-client")
    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public JSONObject testGet() {
        return helloService.fallback();
    }

    @GetMapping("/index")
    @ResponseBody
    public String index() {
        return helloService.index();
    }
/*
    @RequestMapping(value = "testAll", method = RequestMethod.GET)
    public String testAll() {
        return "index()->" + helloService.index() + "\n" +
                "hello1()->" + helloService.hello1("Hello1") + "\n" +
                "hello2()->" + helloService.hello2("Hello2") + "\n" +
                "postTest()->" + helloService.postTest("Post Test");
    }*/
}
