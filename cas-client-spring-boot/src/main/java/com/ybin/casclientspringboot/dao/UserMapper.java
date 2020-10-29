package com.ybin.casclientspringboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/29 17:01
 * @description:
 */

@Mapper
public interface UserMapper {
    /**
     * 创建用户
     * @param username
     * @param password
     * @return
     */
    void insert(@Param("username") String username, @Param("password") String password);
}
