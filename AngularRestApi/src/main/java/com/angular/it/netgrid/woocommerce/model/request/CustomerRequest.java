package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Customer;

@XmlRootElement
public class CustomerRequest {

	private Customer customer;
	
	public CustomerRequest() {}
	
	public CustomerRequest(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
