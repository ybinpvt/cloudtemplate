package com.ybin.shirodemo.service;

import com.ybin.shirodemo.entity.Permission;
import com.ybin.shirodemo.entity.Role;

import java.util.Set;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 11:04
 * @description:
 */

public interface PermissionService {
    /**
     * 根据角色id查找权限
     * @param roleId
     * @return
     */
    Set<Permission> findPermissionsByRoleId(Long roleId);

    /**
     * 根据角色查找权限
     * @param roles
     * @return
     */
    Set<Permission> findPermissionsByRoles(Set<Role> roles);
}
