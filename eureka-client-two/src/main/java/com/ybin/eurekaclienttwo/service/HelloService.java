package com.ybin.eurekaclienttwo.service;

import com.alibaba.fastjson.JSONObject;
import com.ybin.eurekaclienttwo.service.impl.HelloServiceImpl;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/22 10:18
 * @description: 使用feign调用服务eureka-client的接口
 */

@FeignClient(name = "eureka-client", fallback = HelloServiceImpl.class)
public interface HelloService {
    @RequestMapping(value = "/eureka-client/getTest", method = RequestMethod.GET)
    JSONObject fallback();


    //feign独有的注解方式
    //@RequestLine("GET /eureka-client/index")
    @RequestMapping(value = "/eureka-client/index", method = RequestMethod.GET)
    String index();
/*
    @GetMapping(value = "/eureka-client/hello1")
    String hello1(@RequestParam("name") String name);

    @RequestMapping(value = "/eureka-client/hello2", method = RequestMethod.GET)
    String hello2(@RequestHeader("name") String name);

    @RequestMapping(value = "/eureka-client/postTest", method=RequestMethod.POST)
    String postTest(@RequestBody String name);
*/


}
