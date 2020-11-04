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
 * @date 2020/11/3 10:17
 * @description:
 */

@Data
@Entity
@Table(name = "shiro_permission")
public class Permission extends BaseEntity {
    /**
     * 父编号,本权限可能是该父编号权限的子权限
     */
    @Column(columnDefinition="bigint COMMENT '父编号,本权限可能是该父编号权限的子权限'")
    private Long parent_id;
    @Column(columnDefinition = "varchar(20) COMMENT '父编号列表'")
    private String parent_ids;
    @Column(columnDefinition = "varchar(255) COMMENT '权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view'")
    private String permission;
    @Column(columnDefinition = "varchar(20) COMMENT '资源类型，[menu|button]'")
    private String resource_type;
    @Column(columnDefinition = "varchar(255) COMMENT '资源路径 如：/userinfo/list'")
    private String url;
    @Column(columnDefinition = "varchar(50) COMMENT '权限名称'")
    private String name;
    @Column(columnDefinition = "varchar(1) COMMENT '是否可用0可用  1不可用'")
    private String available;

    @Transient
    private Set<Role> roles = new HashSet<>();

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + super.getId() +
                ", parent_id=" + parent_id +
                ", parent_ids='" + parent_ids + '\'' +
                ", permission='" + permission + '\'' +
                ", resource_type='" + resource_type + '\'' +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", available='" + available + '\'' +
                ", roles=" + roles +
                '}';
    }
}
