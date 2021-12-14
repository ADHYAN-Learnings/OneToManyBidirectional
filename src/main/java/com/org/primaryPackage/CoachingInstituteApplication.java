package com.org.primaryPackage;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@ComponentScan("com.org")
@EntityScan("com.org")
@EnableJpaRepositories("com.org")
@SpringBootApplication
public class CoachingInstituteApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoachingInstituteApplication.class, args);
	}

}
