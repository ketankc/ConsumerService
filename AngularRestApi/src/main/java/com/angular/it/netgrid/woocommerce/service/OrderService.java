package com.angular.it.netgrid.woocommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angular.it.netgrid.woocommerce.ConfigurationImpl;
import com.angular.it.netgrid.woocommerce.jersey.CrudServiceManager;

@Service
public class OrderService {

	@Autowired
	private CrudServiceManager crudServiceManager;
	
	public void getOrders() {
		crudServiceManager.createOrderService(new ConfigurationImpl());
	}
}
