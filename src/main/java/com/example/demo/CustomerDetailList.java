package com.example.demo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class CustomerDetailList {
	
	private CustomerDetail customerDetail;
	
	

	public CustomerDetailList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDetailList(CustomerDetail customerDetail) {
		super();
		this.customerDetail = customerDetail;
	}
	
	public CustomerDetail getCustomerDetail() {
		return customerDetail;
	}

	public void setCustomerDetail(CustomerDetail customerDetail) {
		this.customerDetail = customerDetail;
	}
	

}
