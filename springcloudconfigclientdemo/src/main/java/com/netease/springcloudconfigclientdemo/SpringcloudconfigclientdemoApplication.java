package com.netease.springcloudconfigclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 通过bootstrap.properties实现在配置中心获取额外配置来代替本地配置
 */
@SpringBootApplication
public class SpringcloudconfigclientdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudconfigclientdemoApplication.class, args);
    }

}
