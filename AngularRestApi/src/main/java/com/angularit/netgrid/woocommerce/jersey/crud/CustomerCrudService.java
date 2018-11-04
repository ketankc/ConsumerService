package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Customer;
import com.angular.it.netgrid.woocommerce.model.request.CustomerRequest;

public class CustomerCrudService extends TemplateCrudService<Customer, Integer, Object, CustomerRequest, Customer> {

	public static final String BASE_PATH = "customers";
	public static final String BASE_PATH_FORMAT = "customers/%d";
	
	public CustomerCrudService(WebTarget target) {
		super(target);
	}

	@Override
	public String getCreatePath(Object context) {
		return BASE_PATH;
	}

	@Override
	public String getReadPath(Integer id, Object context) {
		return String.format(BASE_PATH_FORMAT, id);
	}

	@Override
	public String getUpdatePath(Integer id, Object context) {
		return String.format(BASE_PATH_FORMAT, id);
	}

	@Override
	public String getDeletePath(Integer id, Object context) {
		return String.format(BASE_PATH_FORMAT, id);
	}

	@Override
	public Class<Customer> getResponseClass() {
		return Customer.class;
	}

	@Override
	public CustomerRequest getRequest(Customer object) {
		return new CustomerRequest(object);
	}

	@Override
	public Customer getResult(Customer network) {
		return network;
	}

}
