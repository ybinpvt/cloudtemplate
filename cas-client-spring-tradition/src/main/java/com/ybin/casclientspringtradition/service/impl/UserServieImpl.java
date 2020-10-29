package com.ybin.casclientspringtradition.service.impl;

import com.ybin.casclientspringtradition.dao.UserMapper;
import com.ybin.casclientspringtradition.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/29 13:06
 * @description:
 */

@Service
public class UserServieImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void insert(String username) {
        userMapper.insert(username,"123456");
    }
}
