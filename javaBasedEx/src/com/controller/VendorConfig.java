package com.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.Vendor;

@Configuration
public class VendorConfig {
	
	@Bean
	public Vendor getVendor() {
		return new Vendor("bharu","666");
	}
	
	@Bean 
	@Primary
	public Vendor tonyVendor() {
		return new Vendor("tomy","666");
	}
	

}
