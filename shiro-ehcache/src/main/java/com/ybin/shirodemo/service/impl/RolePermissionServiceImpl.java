package com.ybin.shirodemo.service.impl;

import com.ybin.shirodemo.entity.RolePermission;
import com.ybin.shirodemo.entity.repository.RolePermissionRepository;
import com.ybin.shirodemo.service.RolePermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/4 13:54
 * @description:
 */

@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    RolePermissionRepository rolePermissionRepository;

    @Override
    public RolePermission addRolePermission(Long roleId, Long permissionId) {
        RolePermission rolePermission = new RolePermission();
        rolePermission.setRoleId(roleId);
        rolePermission.setPermissionId(permissionId);
        rolePermissionRepository.save(rolePermission);
        return rolePermission;
    }

    @Override
    public int delRolePermission(Long roleId, Long permissionId) {
        return rolePermissionRepository.deleteRolePermissionsByRoleIdAndPermissionId(roleId, permissionId);
    }
}
