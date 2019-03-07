package spring.coupling.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.annotation.Customer;

public class AnnotationMainApplication {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("springConfig.xml");
		
		Customer c = (Customer)ac.getBean("custObj");
		System.out.println(c);
		

	}

}
