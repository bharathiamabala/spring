package com.controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.Vendor;

@Configuration
public class VendorConfig {
	
	@Bean
	public Vendor getVendor() {
		return new Vendor("bharu","666");
	}
	

}
