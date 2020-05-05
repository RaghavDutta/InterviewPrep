package com.raghav.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.raghav.controller.HomeController;

@SpringBootApplication
@ComponentScan(basePackageClasses=HomeController.class)
public class MyWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
	}

}
