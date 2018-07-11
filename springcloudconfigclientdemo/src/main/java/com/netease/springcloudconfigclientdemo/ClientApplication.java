package com.netease.springcloudconfigclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 通过bootstrap.properties实现在配置中心获取额外配置来代替本地配置
 * 而不是在application配置文件中，bootstrap配置文件会比application更加早的加载。
 */
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}
