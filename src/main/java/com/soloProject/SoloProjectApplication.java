package com.soloProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.soloProject")
public class SoloProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoloProjectApplication.class, args);
	}

}
