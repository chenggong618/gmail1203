package com.guli.gmail.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.guli.gmail.user.mapper")
public class GmailUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmailUserServiceApplication.class, args);
    }

}
