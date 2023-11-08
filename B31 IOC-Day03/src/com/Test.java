package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("bean.xml");
		Student s = apc.getBean("s", Student.class);

		System.out.println(s.hashCode());// 1
		System.out.println(s.getAddress().hashCode());// 2

		System.out.println("-----------------------------------\n");

		Student s1 = apc.getBean("s", Student.class);
		System.out.println(s1.hashCode());// 1
		System.out.println(s1.getAddress().hashCode());// 3

	}
}
