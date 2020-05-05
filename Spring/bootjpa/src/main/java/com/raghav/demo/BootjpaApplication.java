package com.raghav.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.raghav.demo.controller.AlienController;

@SpringBootApplication
@ComponentScan(basePackageClasses=AlienController.class)
public class BootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootjpaApplication.class, args);
	}

}
