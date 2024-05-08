package com.jov.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:messages.properties")
public class SpringbootApiRestfulCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApiRestfulCrudApplication.class, args);
	}

}
