package com.ybin.shiroredis.controller;

import com.ybin.shiroredis.entity.User;
import com.ybin.shiroredis.service.RolePermissionService;
import com.ybin.shiroredis.service.RoleService;
import com.ybin.shiroredis.service.UserService;
import com.ybin.shiroredis.config.shiro.ShiroRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
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
    @Autowired
    RoleService roleService;
    @Autowired
    RolePermissionService rolePermissionService;

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
        userService.save(user);
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
        userService.delete("zhangsan");
        return "删除用户名为zhangsan用户成功";

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

    /**
     * 给admin用户添加 userInfo:del 权限
     * @param model
     * @return
     */
    @RequestMapping(value = "/addPermission",method = RequestMethod.GET)
    @ResponseBody
    public String addPermission(Model model) {
        //在sys_role_permission 表中  将 删除的权限 关联到admin用户所在的角色
        rolePermissionService.addRolePermission(1L,3L);
        //添加成功之后 清除缓存
        DefaultWebSecurityManager securityManager = (DefaultWebSecurityManager) SecurityUtils.getSecurityManager();
        ShiroRealm shiroRealm = (ShiroRealm) securityManager.getRealms().iterator().next();
        //清除权限 相关的缓存
        shiroRealm.clearAllCache();
        return "给admin用户添加 userInfo:del 权限成功";

    }

    /**
     * 删除admin用户 userInfo:del 权限
     * @param model
     * @return
     */
    @RequestMapping(value = "/delPermission",method = RequestMethod.GET)
    @ResponseBody
    public String delPermission(Model model) {

        //在sys_role_permission 表中  将 删除的权限 关联到admin用户所在的角色
        rolePermissionService.delRolePermission(1L,3L);
        //添加成功之后 清除缓存
        DefaultWebSecurityManager securityManager = (DefaultWebSecurityManager)SecurityUtils.getSecurityManager();
        ShiroRealm shiroRealm = (ShiroRealm) securityManager.getRealms().iterator().next();
        //清除权限 相关的缓存
        shiroRealm.clearAllCache();

        return "删除admin用户userInfo:del 权限成功";

    }
}
