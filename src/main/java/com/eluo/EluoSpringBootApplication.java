package com.eluo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EluoSpringBootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EluoSpringBootApplication.class, args);
		SpringApplication springApplication = new SpringApplication(EluoSpringBootApplication.class);
		springApplication.run(args);

		System.out.println("issue re 01");

		System.out.println("Occured issue02");
		System.out.println("dev!!!");
		System.out.println("dev01!!!");

	}

}
