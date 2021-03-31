package com.study.hompage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.*.*"})
public class BootHompageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootHompageApplication.class, args);
	}

}
