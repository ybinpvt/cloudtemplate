package com.ybin.casclientspringboot.service;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/29 16:41
 * @description:
 */

public interface UserService {
    /**
     * 创建用户
     * @param username
     * @return
     */
    void insert(String username);
}
