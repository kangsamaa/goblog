package com.meblo.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MebloApplication {

	public static void main(String[] args) {
		SpringApplication.run(MebloApplication.class, args);
	}

}
