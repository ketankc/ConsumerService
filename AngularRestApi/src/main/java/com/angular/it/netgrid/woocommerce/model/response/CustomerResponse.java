package com.angular.it.netgrid.woocommerce.model.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Customer;

@XmlRootElement
public class CustomerResponse extends NetworkResponse {

	private Customer customer;
	
	public CustomerResponse() {}
	
	public CustomerResponse(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
