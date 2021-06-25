package com.cjw.springbootshardjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cjw.springbootshardjdbc.mapper")
public class SpringbootShardjdbcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootShardjdbcApplication.class, args);
    }

}
