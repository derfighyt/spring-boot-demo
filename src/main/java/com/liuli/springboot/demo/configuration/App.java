package com.liuli.springboot.demo.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Spring Boot 启动类
 *
 * @author li.liu
 */
@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = "com.liuli")// 开启配置属性支持
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
