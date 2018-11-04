package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Customer;
import com.angular.it.netgrid.woocommerce.model.request.CustomersRequest;

public class CustomerBulkService extends TemplateBulkService<Customer, Integer, Object, CustomersRequest, Customer[]> {

	public static final String WRITE_BASE_PATH = "customers/batch";
	public static final String READ_BASE_PATH = "customers";
	public static final String COUNT_BASE_PATH = "customers/count";
	
	public CustomerBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getWritePath(Object context) {
		return WRITE_BASE_PATH;
	}

	@Override
	public String getReadPath(Object context) {
		return READ_BASE_PATH;
	}

	@Override
	public String getCountPath(Object context) {
		return COUNT_BASE_PATH;
	}

	@Override
	public Class<Customer[]> getResponseClass() {
		return Customer[].class;
	}

	@Override
	public CustomersRequest getWriteRequest(List<Customer> items) {
		return new CustomersRequest(items);
	}

	@Override
	public List<Customer> getResult(Customer[] customers) {
		return Arrays.asList(customers);
	}

}
