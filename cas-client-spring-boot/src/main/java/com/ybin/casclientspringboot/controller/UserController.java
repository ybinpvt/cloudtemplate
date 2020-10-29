package com.ybin.casclientspringboot.controller;

import com.ybin.casclientspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/29 17:09
 * @description:
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
