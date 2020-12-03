package com.ybin.casserver.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Table;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/27 15:37
 * @description:
 */

@Data
@Table(name = "cas_user")
@EqualsAndHashCode(callSuper = false)
public class CasUser extends BaseEntity {

    private String username;
    private String password;
    private String name;
    private String id_card_num;

}
