package com.ethan.demomo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.ethan.demomo.mp.mapper"})
public class DemoMoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMoApplication.class, args);
    }

}
