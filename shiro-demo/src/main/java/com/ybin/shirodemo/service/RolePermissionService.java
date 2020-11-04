package com.ybin.shirodemo.service;

import com.ybin.shirodemo.entity.RolePermission;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/4 13:53
 * @description:
 */

public interface RolePermissionService {
    /**
     * 增加角色权限映射
     * @param roleId
     * @param permissionId
     * @return
     */
    RolePermission addRolePermission(Long roleId, Long permissionId);

    /**
     * 删除角色权限映射
     * @param roleId
     * @param permissionId
     * @return
     */
    int delRolePermission(Long roleId, Long permissionId);
}
