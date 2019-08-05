package com.funtl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages="com.funtl")
public class OAuth2ServerApplication {

	public static void main(String[] args) {
        SpringApplication.run(OAuth2ServerApplication.class, args);
    }
}
