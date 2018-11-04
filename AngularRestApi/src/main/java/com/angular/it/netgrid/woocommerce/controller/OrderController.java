package com.angular.it.netgrid.woocommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.angular.it.netgrid.woocommerce.ConfigurationImpl;
import com.angular.it.netgrid.woocommerce.jersey.CrudServiceManager;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private CrudServiceManager crudServiceManager;
	
	@RequestMapping(value="/myOrder",method = RequestMethod.GET)
	public String getOrder() {
		crudServiceManager.createOrderService(new ConfigurationImpl());
		return "hi...";
	}
}
