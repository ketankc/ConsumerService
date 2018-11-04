package com.angular.it.netgrid.woocommerce.model.request;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Customer;

@XmlRootElement
public class CustomersRequest {
	
	public static final String FILTER_ROLE_KEY = "role";
	public static final String FILTER_ROLE_CUSTOMER_VAL = "customer";
	public static final String FILTER_ROLE_SUBSCRIBER_VAL = "subscriber";
	
	private List<Customer> customers;

	public CustomersRequest(List<Customer> items) {
		this.customers = items;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

}
