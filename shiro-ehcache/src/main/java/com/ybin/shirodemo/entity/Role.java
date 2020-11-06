package com.ybin.shirodemo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 9:58
 * @description:
 */

@Data
@Entity
@Table(name = "shiro_role")
public class Role extends BaseEntity {

    @Column(columnDefinition="varchar(100) COMMENT '角色标识程序中判断使用,如\"admin\"'")
    private String role;
    @Column(columnDefinition="varchar(100) COMMENT '角色描述,UI界面显示使用'")
    private String description;
    @Column(columnDefinition="varchar(100) COMMENT '是否可用0可用  1不可用'")
    private String available;

    @Transient
    private Set<User> users = new HashSet<>();
    @Transient
    private Set<Permission> permissions = new HashSet<>();

    @Override
    public String toString() {
        return "Role{" +
                "id=" + super.getId() +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                ", available='" + available + '\'' +
                ", users=" + users +
                ", permissions=" + permissions +
                '}';
    }
}
