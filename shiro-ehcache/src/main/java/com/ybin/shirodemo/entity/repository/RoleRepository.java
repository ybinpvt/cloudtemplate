package com.ybin.shirodemo.entity.repository;

import com.ybin.shirodemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 10:16
 * @description:
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    /**
     * 根据id查找role
     * @param id
     * @return
     */
    Role findRoleById(Long id);
}
