package com.ybin.casclientspringtradition.controller;

import com.ybin.casclientspringtradition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/29 13:05
 * @description: 用户相关操作controller
 */

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("insert")
    public String insert(String username){
        userService.insert(username);
        return "result";
    }
}
