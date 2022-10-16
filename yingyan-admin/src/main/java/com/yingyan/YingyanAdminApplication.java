package com.yingyan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.anji.captcha", "com.yingyan"})
@SpringBootApplication
public class YingyanAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(YingyanAdminApplication.class, args);
	}

}
