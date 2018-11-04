package com.angular.it.netgrid.woocommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.angular.it.netgrid.woocommerce.ConfigurationImpl;
import com.angular.it.netgrid.woocommerce.CrudService;
import com.angular.it.netgrid.woocommerce.jersey.CrudServiceManager;
import com.angular.it.netgrid.woocommerce.model.Order;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private CrudServiceManager crudServiceManager;
	
	@RequestMapping(value="/myOrder",method = RequestMethod.GET)
	public Order getOrder() {
		CrudService<Order, Integer, Object> crudService = crudServiceManager.createOrderService(new ConfigurationImpl());
		Order order = crudService.read(7571, null);
		System.out.println(order.getId());
		return order;
		
	}
}
