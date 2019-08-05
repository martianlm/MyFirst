package com.martian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.martian")
public class OAuth2AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuth2AdminApplication.class, args);
	}
}
