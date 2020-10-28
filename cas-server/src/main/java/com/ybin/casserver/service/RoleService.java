package com.ybin.casserver.service;

import java.util.Set;

public interface RoleService {

    String findRolesByUserId(String uid);

    Set<String> findAllRoles();
}
