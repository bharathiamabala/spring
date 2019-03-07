package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Vendor {

	private String venName;
	private String venId;
	
	public String getVenName() {
		return venName;
	}

	public void setVenName(String venName) {
		this.venName = venName;
	}

	public String getVenId() {
		return venId;
	}

	public void setVenId(String venId) {
		this.venId = venId;
	}

	public Vendor(String venName, String venId) {
		super();
		this.venName = venName;
		this.venId = venId;
	}

	@Override
	public String toString() {
		return "Vendor [venName=" + venName + ", venId=" + venId + "]";
	}
	

}
