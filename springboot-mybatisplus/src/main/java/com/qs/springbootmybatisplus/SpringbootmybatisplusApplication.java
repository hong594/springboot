package com.qs.springbootmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qs.springbootmybatisplus.dao")
public class SpringbootmybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmybatisplusApplication.class, args);
    }

}
