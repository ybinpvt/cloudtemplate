package com.ybin.shiroredis.service;

import com.ybin.shiroredis.entity.User;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/30 17:10
 * @description:
 */

public interface UserService {

    /**
     * 添加用户
     * @param user
     */
    void insert(User user);

    /**
     * 根据用户名删除用户信息
     * @param username
     */
    int delete(String username);

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    User findByUsername(String username);
}
