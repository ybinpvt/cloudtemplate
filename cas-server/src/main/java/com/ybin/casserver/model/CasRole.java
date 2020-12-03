package com.ybin.casserver.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/27 17:11
 * @description:
 */

@Data
@Table(name = "cas_role")
@EqualsAndHashCode(callSuper = false)
public class CasRole extends BaseEntity {
    @Transient
    private List<CasUser> users;
}
