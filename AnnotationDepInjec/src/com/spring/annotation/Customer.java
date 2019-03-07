package com.spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:com/properties/customer.properties")
public class Customer {

	@Value("${spring.appliation.custName}")
	private String custName;
	
	@Value("${spring.appliation.custId}")
	private String custId;

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custId=" + custId + "]";
	}
	
	

}
