package com.ybin.shirodemo.entity.repository;

import com.ybin.shirodemo.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 10:37
 * @description:
 */

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    /**
     * 根据userId获取roles
     * @param userId
     * @return
     */
    List<UserRole> findUserRolesByUserId(Long userId);
}
