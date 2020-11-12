package com.ybin.shiroredis.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/11/3 10:34
 * @description:
 */

@Data
@Entity
@Table(name = "shiro_user_role")
public class UserRole extends BaseEntity {
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "role_id")
    private Long roleId;
}
