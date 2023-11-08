package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Address ad() {
		Address a = new Address();
		a.setAid(1);
		a.setAddress("pcmc");
		
		return a;
	}
	
	
	
}
