package com.ybin.casserver.service;

import com.ybin.casserver.model.CasUser;

import java.util.List;

/**
 * @author: wangsaichao
 * @date: 2018/7/19
 * @description:
 */

public interface UserService {
    List<CasUser> findByUsername(String username);
}
