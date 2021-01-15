package com.ybin.casserver.entity.repository;

import com.ybin.casserver.entity.CasUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ybin
 * @version 1.0
 * @date 2021/1/15 11:11
 * @description:
 */

public interface CasUserRepository extends JpaRepository<CasUser,Long> {
}
