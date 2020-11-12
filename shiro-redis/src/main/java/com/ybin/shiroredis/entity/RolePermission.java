package com.ybin.shiroredis.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 10:38
 * @description:
 */

@Data
@Entity
@Table(name = "shiro_role_permission")
public class RolePermission extends BaseEntity {
    @Column(name = "role_id")
    private Long roleId;
    @Column(name = "permission_id")
    private Long permissionId;
}
