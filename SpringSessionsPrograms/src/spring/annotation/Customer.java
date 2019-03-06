package spring.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Customer {

	@Value("eerrr")
	private String custNo;
	@Value("e5000")
	private String custId;

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custId=" + custId + "]";
	}
	
	

}
