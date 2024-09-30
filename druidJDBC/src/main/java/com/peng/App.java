package com.peng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/9/30 21:33
 * $description
 */
@SpringBootApplication()
@MapperScan(basePackages="com.peng.demo.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}