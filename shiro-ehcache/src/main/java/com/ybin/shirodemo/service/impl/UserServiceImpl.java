package com.ybin.shirodemo.service.impl;

import com.ybin.shirodemo.entity.User;
import com.ybin.shirodemo.entity.repository.UserRepository;
import com.ybin.shirodemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 10:49
 * @description:
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void insert(User user) {
        userRepository.save(user);
    }

    @Override
    public int delete(String username) {
        return userRepository.deleteUserByUsername(username);
    }

    @Override
    public User findByUsername(String username) {
        User user = userRepository.findUserByUsername(username);
        return user;
    }
}
