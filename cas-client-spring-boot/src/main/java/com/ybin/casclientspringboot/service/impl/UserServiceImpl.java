package com.ybin.casclientspringboot.service.impl;

import com.ybin.casclientspringboot.dao.UserMapper;
import com.ybin.casclientspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/29 17:08
 * @description:
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(String username) {
        userMapper.insert(username,"123456");
    }
}
