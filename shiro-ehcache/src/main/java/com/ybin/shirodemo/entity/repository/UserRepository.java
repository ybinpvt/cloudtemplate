package com.ybin.shirodemo.entity.repository;

import com.ybin.shirodemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 9:43
 * @description:
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    User findUserByUsername(String username);

    /**
     * 根据用户名删除用户
     * @param username
     * @return
     */
    int deleteUserByUsername(String username);
}
