package com.ybin.shirodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching      //开启缓存
@EnableJpaAuditing  //开启jpa审计功能@CreateDate、@CreatedBy、@LastModifiedDate、@LastModifiedBy
@EnableScheduling
@SpringBootApplication
public class ShiroDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroDemoApplication.class, args);
    }

}
