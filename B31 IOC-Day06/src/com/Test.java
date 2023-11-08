package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new AnnotationConfigApplicationContext(AppConfig.class);

		Car c = apc.getBean("carBean", Car.class);
		System.out.println(c);

//		System.out.println(apc.getBean("t").hashCode());
		System.out.println(apc.getBean("t").hashCode());

		System.out.println(apc.getBean("t"));

	}
}
