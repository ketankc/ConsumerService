package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Order;

@XmlRootElement
public class OrderRequest {
	
	private Order order;
	private String expand;
	
	public OrderRequest() {}
	
	public OrderRequest(Order order) {
		this.order = order;
	}
	
	public OrderRequest(String expand) {
		this.expand = expand;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}
	
}
