package com.research;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
@PropertySource("research.properties")
@SpringBootApplication
public class ResearchCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResearchCenterApplication.class, args);
	}
}
