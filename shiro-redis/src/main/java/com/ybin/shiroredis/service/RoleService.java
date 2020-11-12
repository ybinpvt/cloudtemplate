package com.ybin.shiroredis.service;

import com.ybin.shiroredis.entity.Role;

import java.util.Set;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 10:52
 * @description:
 */

public interface RoleService {
    /**
     * 根据用户id获取roles
     * @return
     */
    Set<Role> findRolesByUserId(Long userId);
}
