package com.peng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: spengju
 * @Slogan: Day day no bug.
 * @Date: 2024/9/30 21:45
 * $description
 */
@SpringBootApplication()
@MapperScan("com.peng.sharding.mapper")
public class ShardingJDBCApplication{

    public static void main(String[] args) {
        SpringApplication.run(ShardingJDBCApplication.class,args);
    }

}