package com.ybin.shiroredis.entity.repository;

import com.ybin.shiroredis.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 10:40
 * @description:
 */

@Repository
public interface RolePermissionRepository extends JpaRepository<RolePermission, Long> {
    /**
     * 根据roleId查找RolePermission
     * @param roleId
     * @return
     */
    List<RolePermission> findRolePermissionsByRoleId(Long roleId);

    /**
     * 根据角色权限组合删除
     * @param roleId
     * @param permissionId
     * @return
     */
    int deleteRolePermissionsByRoleIdAndPermissionId(Long roleId, Long permissionId);
}
