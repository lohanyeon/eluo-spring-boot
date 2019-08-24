package com.eluo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


/**
 * type safe of properties
 * @author ELUO
 *
 */
@Getter
@Setter
@Component
@ConfigurationProperties("eluo.lohan")
public class EluoLohanProperties {
	
	private String name;
	private int age;
	private String fullName;

}
