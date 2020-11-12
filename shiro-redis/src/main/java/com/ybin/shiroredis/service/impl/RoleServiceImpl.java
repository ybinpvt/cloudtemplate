package com.ybin.shiroredis.service.impl;

import com.ybin.shiroredis.entity.Role;
import com.ybin.shiroredis.entity.UserRole;
import com.ybin.shiroredis.entity.repository.RoleRepository;
import com.ybin.shiroredis.entity.repository.UserRoleRepository;
import com.ybin.shiroredis.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 10:54
 * @description:
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    UserRoleRepository userRoleRepository;
    @Autowired
    RoleRepository roleRepository;
    Logger logger = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Override
    public Set<Role> findRolesByUserId(Long userId) {
        List<UserRole> userRoles = userRoleRepository.findUserRolesByUserId(userId);
        Set<Role> roleSet = new HashSet<Role>();
        if (null!=userRoles) {
            for (UserRole userRole:userRoles) {
                Role role = roleRepository.findRoleById(userRole.getRoleId());
                //logger.info(role.toString());
                if (null!=role) roleSet.add(role);
            }
        }
        return roleSet;
    }
}
