package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.Vendor;

public class MainApplication {
	
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(VendorConfig.class);
		Vendor v=(Vendor)ac.getBean(Vendor.class);
		
		System.out.println(v);
		
	}

}
