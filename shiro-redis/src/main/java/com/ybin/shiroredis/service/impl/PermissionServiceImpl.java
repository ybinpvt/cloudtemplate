package com.ybin.shiroredis.service.impl;

import com.ybin.shiroredis.entity.Permission;
import com.ybin.shiroredis.entity.Role;
import com.ybin.shiroredis.entity.RolePermission;
import com.ybin.shiroredis.entity.repository.PermissionRepository;
import com.ybin.shiroredis.entity.repository.RolePermissionRepository;
import com.ybin.shiroredis.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 11:05
 * @description:
 */

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    RolePermissionRepository rolePermissionRepository;
    @Autowired
    PermissionRepository permissionRepository;

    @Override
    public Set<Permission> findPermissionsByRoleId(Long roleId) {
        List<RolePermission> rolePermissions = rolePermissionRepository.findRolePermissionsByRoleId(roleId);
        Set<Permission> permissionSet = new HashSet<Permission>();
        if (null!=rolePermissions && rolePermissions.size()>0) {
            rolePermissions.forEach(rolePermission -> {
                Permission permission = permissionRepository.findPermissionById(rolePermission.getPermissionId());
                permissionSet.add(permission);
            });
        }
        return permissionSet;
    }

    @Override
    public Set<Permission> findPermissionsByRoles(Set<Role> roles) {
        Set<Permission> permissionSet = new HashSet<Permission>();
        if (null==roles || roles.isEmpty()) return permissionSet;
        for (Role role:roles) {
            Set<Permission> set = findPermissionsByRoleId(role.getId());
            for (Permission permission:set) {
                permissionSet.add(permission);
            }
        }
        return permissionSet;
    }
}
