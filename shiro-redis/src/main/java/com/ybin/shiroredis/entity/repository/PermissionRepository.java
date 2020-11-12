package com.ybin.shiroredis.entity.repository;

import com.ybin.shiroredis.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 10:25
 * @description:
 */

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    /**
     * 根据id查找Permission
     * @param id
     * @return
     */
    Permission findPermissionById(Long id);
}
