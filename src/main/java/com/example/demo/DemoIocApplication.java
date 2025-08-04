package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class DemoIocApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoIocApplication.class, args);
	}

}
