package com.ybin.shirodemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 9:35
 * @description:
 */

@Data
@Entity
@Table(name = "shiro_user")
public class User extends BaseEntity implements Serializable {
    @Column(columnDefinition="varchar(100) COMMENT '姓名'")
    private String username;
    @Column(columnDefinition="varchar(255) COMMENT '密码'")
    private String password;
    @Column(columnDefinition="varchar(100) COMMENT '真实姓名'")
    private String name;
    @Column(columnDefinition="varchar(20) COMMENT '身份证号'")
    private String id_card_num;
    @Column(columnDefinition="varchar(1) COMMENT '用户状态：0:正常状态,1：用户被锁定'")
    private String state;

    /**
     * 用户所拥有的所有角色
     */
    @Transient
    private Set<Role> roles = new HashSet<>();

    @Override
    public String toString() {
        return "User{" +
                "id=" + super.getId() +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", id_card_num='" + id_card_num + '\'' +
                ", state='" + state + '\'' +
                ", roles=" + roles +
                '}';
    }
}
