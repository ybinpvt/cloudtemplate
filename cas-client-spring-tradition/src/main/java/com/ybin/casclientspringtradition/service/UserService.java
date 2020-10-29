package com.ybin.casclientspringtradition.service;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/29 13:06
 * @description: 用户操作service层
 */

public interface UserService {
    /**
     * 创建用户
     * @param username
     * @return
     */
    void insert(String username);
}
