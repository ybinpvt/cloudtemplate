package com.ybin.casserver.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/27 16:14
 * @description:
 */

@Data
public class BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createDateTime;
    private Date updateDateTime;
    private Long createBy;
    private Long updateBy;
    private Integer state = 1;
}
