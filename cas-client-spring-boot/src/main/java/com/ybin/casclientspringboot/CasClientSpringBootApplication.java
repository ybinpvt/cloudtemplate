package com.ybin.casclientspringboot;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCasClient        //开启cas
@SpringBootApplication
public class CasClientSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasClientSpringBootApplication.class, args);
    }

}
