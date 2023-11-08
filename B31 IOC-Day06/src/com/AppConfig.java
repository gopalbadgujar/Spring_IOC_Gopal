package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	public Car carBean() {

		Car c = new Car();
		c.setCid(11);
		c.setCname("ABCC");

		return c;
	}
	

	@Bean(name = "car")
	public Car carBean1() {

		Car c = new Car();
		c.setCid(12);
		c.setCname("BBCC");

		return c;
	}
	
	@Bean(name = "t")
	@Scope(value ="prototype" )  // two values by default singleton & Manually prototype
	public Tata tataBean() {
		Tata t = new Tata();
		t.setId(1);
		t.setName("Harrier");
		t.setCar(carBean());
		
		return t;
	}

}
