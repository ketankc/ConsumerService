package com.angular.it.netgrid.woocommerce.model.request;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Order;

@XmlRootElement
public class OrdersRequest {
	
	public static final String FILTER_STATUS_KEY = "status";
	public static final String FILTER_STATUS_PENDING_VAL = "pending";
	public static final String FILTER_STATUS_ON_HOLD_VAL = "on-hold";
	public static final String FILTER_STATUS_COMPLETED_VAL = "completed";
	public static final String FILTER_STATUS_REFUNDED_VAL = "refunded";
	public static final String FILTER_STATUS_FAILED_VAL = "failed";
	public static final String FILTER_STATUS_PROCESSING_VAL = "processing";
	public static final String FILTER_STATUS_CANCELLED_VAL ="cancelled";
	
	public static final String FILTER_EXPAND_KEY = "expand";
	public static final String FILTER_EXPAND_COUPONS_VAL = "coupons";
	public static final String FILTER_EXPAND_PRODUCTS_VAL = "products";
	public static final String FILTER_EXPAND_TAXES_VAL = "taxes";
	
	private List<Order> orders;
	
	public OrdersRequest() {}
	
	public OrdersRequest(List<Order> items) {
		this.orders = items;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
}
