package com.ybin.shirodemo.controller;

import com.ybin.shirodemo.entity.User;
import com.ybin.shirodemo.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/30 17:15
 * @description:
 */

@Controller
@RequestMapping("userInfo")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 创建固定写死的用户
     * @param model
     * @return
     */
    @RequiresPermissions("userInfo:add")
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    @ResponseBody
    public String login(Model model) {

        User user = new User();
        user.setName("ybin");
        user.setId_card_num("222");
        user.setUsername("ybin");
        userService.insert(user);
        return "创建用户成功";

    }

    /**
     * 删除固定写死的用户
     * @param model
     * @return
     */
    @RequiresPermissions("userInfo:del")
    @RequestMapping(value = "/del",method = RequestMethod.GET)
    @ResponseBody
    public String del(Model model) {
        userService.delete("wangsaichao");
        return "删除用户名为wangsaichao用户成功";

    }

    /**
     * 用户列表页
     * @param model
     * @return
     */
    @RequiresPermissions("userInfo:add")
    @RequestMapping(value = "/view",method = RequestMethod.GET)
    @ResponseBody
    public String view(Model model) {
        return "这是用户列表页";
    }
}
