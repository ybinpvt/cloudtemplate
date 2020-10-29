package com.ybin.casclientspringtradition.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/29 13:06
 * @description: 用户操作 dao层
 */

public interface UserMapper {
    /**
     * 创建用户
     * @param username
     * @param password
     * @return
     */
    void insert(@Param("username") String username, @Param("password") String password);
}
