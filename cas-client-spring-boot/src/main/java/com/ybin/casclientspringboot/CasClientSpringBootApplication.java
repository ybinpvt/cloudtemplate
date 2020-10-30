package com.ybin.casclientspringboot;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动的时候不能使用main方法启动
 * 使用java -jar 或者 在命令窗口执行 mvn clean spring-boot:run; 否则将找不到jsp。
 */
@EnableCasClient        //开启cas
@SpringBootApplication
public class CasClientSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasClientSpringBootApplication.class, args);
    }

}
