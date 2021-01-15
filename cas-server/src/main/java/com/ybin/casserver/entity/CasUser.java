package com.ybin.casserver.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author ybin
 * @version 1.0
 * @date 2021/1/5 8:55
 * @description:
 */

@Data
@Entity
@Table(name = "cas_User")
public class CasUser extends BaseEntity {
    @Column(length = 15,name = "account")
    private String account;

    @Column(length = 15,name = "name")
    private String name;

    @Column(length = 15,name = "telephone")
    private String telephone;

    @Column(name = "gneder")
    private Integer gneder;

    @Column(name = "birthday")
    private LocalDateTime birthday;

    @Column(length = 15,name = "password")
    private String password;

}
