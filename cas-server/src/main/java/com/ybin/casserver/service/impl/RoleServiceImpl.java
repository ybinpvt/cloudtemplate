//package com.ybin.casserver.service.impl;
//
//import com.ybin.casserver.dao.RoleDao;
//import com.ybin.casserver.service.RoleService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Set;
//
///**
// * @author: wangsaichao
// * @date: 2018/7/19
// * @description:
// */
//@Service
//public class RoleServiceImpl implements RoleService {
//
//    @Autowired
//    private RoleDao roleDao;
//
//    @Override
//    public String findRolesByUserId(String uid) {
//        return roleDao.findRolesByUserId(uid);
//    }
//
//    @Override
//    public Set<String> findAllRoles() {
//        return roleDao.findAllRoles();
//    }
//}
