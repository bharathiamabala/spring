package com.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.annotation.Customer;

public class MainApplication {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springAnnotation.xml");
		
		Customer c = (Customer)ac.getBean("custObj");
		System.out.println(c);
		
		((ConfigurableApplicationContext)ac).close();
	}

}
