package com.ybin.casserver.controller;

import com.ybin.casserver.entity.CasUser;
import com.ybin.casserver.entity.repository.CasUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ybin
 * @version 1.0
 * @date 2021/1/15 11:13
 * @description:
 */

@RestController
@RequestMapping("/user")
public class CasUserController {

    @Autowired
    CasUserRepository casUserRepository;

    @GetMapping("/save")
    public String save(@RequestParam(value = "account")String account,
                       @RequestParam(value = "name") String name,
                       @RequestParam(value = "password") String password
                       ) {
        CasUser casUser = new CasUser();
        casUser.setAccount(account);
        casUser.setName(name);
        casUser.setPassword(password);
        casUserRepository.save(casUser);
        return "ok";
    }
}
