package com.eluo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
	
	@Value("${eluo.lohan.name}")
	private String name;
	
	@Autowired
	EluoLohanProperties eluoLohanProperties;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("==========================");
		System.out.println("name : " + name);
		System.out.println("==========================");
		System.out.println("==========================");
		System.out.println(eluoLohanProperties.getName());
		System.out.println(eluoLohanProperties.getAge());
		System.out.println(eluoLohanProperties.getFullName());
		System.out.println(eluoLohanProperties.toString());
		System.out.println("==========================");
	}

}
