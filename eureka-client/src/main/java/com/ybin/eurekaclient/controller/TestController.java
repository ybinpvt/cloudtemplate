package com.ybin.eurekaclient.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/22 9:55
 * @description:
 */

@Controller
@RequestMapping("/eureka-client")
public class TestController {

    @GetMapping("/getTest")
    @ResponseBody
    public JSONObject testGet() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",0);
        jsonObject.put("message","ok");
        return jsonObject;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "eureka-client: index();";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam(name = "name") String name) {
        return "eureka-client: hello1, " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String hello2(@RequestHeader("name") String name) {
        return "eureka-client: hello2, " + name;
    }

    @RequestMapping(value = "postTest", method = RequestMethod.POST)
    public String postTest(@RequestBody String name) {
        return "eureka-client: postTest, " + name;
    }
}
