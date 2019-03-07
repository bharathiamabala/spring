package com.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Employee;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("employeeConfig.xml");

		Employee emp = (Employee) ac.getBean("empObj");
		Employee emp1 = (Employee) ac.getBean("empObj");
		Employee emp2 = (Employee) ac.getBean("empObj");

		System.out.println(emp);
		System.out.println(emp1 == emp2);
		((ConfigurableApplicationContext) ac).close();
	}
}
