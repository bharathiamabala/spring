package com.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.autowire.Student;

public class MaainApplication {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("springConfig.xml");
		
		Student s = (Student) ac.getBean("stuObj");
		System.out.println(s.getAddr());
		((ConfigurableApplicationContext)ac).close();
	}

}
