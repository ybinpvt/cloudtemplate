//package com.ybin.eurekaclienttwo.service.impl;
//
//import com.alibaba.fastjson.JSONObject;
//import com.ybin.eurekaclienttwo.service.HelloService;
//import org.springframework.stereotype.Service;
//
///**
// * @author ybin
// * @version 1.0
// * @date 2020/10/22 10:21
// * @description:
// */
//
//@Service
//public class HelloServiceImpl implements HelloService {
//    @Override
//    public JSONObject fallback() {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("code",-1);
//        jsonObject.put("message","feign调用失败");
//        return jsonObject;
//    }
//
//    @Override
//    public String index() {
//        return "fallback index();";
//    }
///*
//    @Override
//    public String hello1(String name) {
//        return "hello1," + name;
//    }
//
//    @Override
//    public String hello2(String name) {
//        return "hello2," + name;
//    }
//
//    @Override
//    public String postTest(String name) {
//        return "postTest," + name;
//    }*/
//}
