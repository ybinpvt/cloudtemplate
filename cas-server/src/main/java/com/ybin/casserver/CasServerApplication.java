package com.ybin.casserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author ybin
 * @version 1.0
 * @date 2020/10/27 15:43
 * @description:
 */

@EnableCaching      //开启缓存
@EnableJpaAuditing  //开启jpa审计功能@CreateDate、@CreatedBy、@LastModifiedDate、@LastModifiedBy
@EnableScheduling
@SpringBootApplication
public class CasServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasServerApplication.class, args);
    }

}
