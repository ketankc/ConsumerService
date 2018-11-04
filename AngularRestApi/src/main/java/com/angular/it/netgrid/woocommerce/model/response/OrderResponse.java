package com.angular.it.netgrid.woocommerce.model.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Order;

@XmlRootElement
public class OrderResponse extends NetworkResponse {
	
	private Order order;
	
	public OrderResponse() {}
	
	public OrderResponse(Order order) {
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
}
