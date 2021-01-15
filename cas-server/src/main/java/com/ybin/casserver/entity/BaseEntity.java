package com.ybin.casserver.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author ybin
 * @version 1.0
 * @date 2021/1/5 8:51
 * @description:
 */

@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @CreatedDate
    @Column(name = "createDateTime",updatable = false)
    private LocalDateTime createDateTime;

    @Column(name = "updateDateTime")
    @LastModifiedDate
    private LocalDateTime updateDateTime;

    @CreatedBy
    @Column(name = "createBy")
    private String createBy;

    @LastModifiedBy
    @Column(name = "updateBy")
    private String updateBy;
    private int state;
}
