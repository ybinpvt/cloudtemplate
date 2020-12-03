package com.ybin.casserver.service.impl;

import com.ybin.casserver.model.CasUser;
import com.ybin.casserver.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wangsaichao
 * @date: 2018/7/19
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<CasUser> findByUsername(String userName) {
        List users = new ArrayList<CasUser>();
        CasUser casUser = new CasUser();
        casUser.setId(24L);
        casUser.setUsername("admin");
        casUser.setPassword("21232f297a57a5a743894a0e4a801fc3");
        casUser.setName("admin");
        casUser.setState(0);
        users.add(casUser);
        return users;
    }
}
