package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Order;
import com.angular.it.netgrid.woocommerce.model.request.OrdersRequest;

public class OrderBulkService extends TemplateBulkService<Order, Integer, Object, OrdersRequest, Order[]> {

	public static final String WRITE_BASE_PATH = "orders/batch";
	public static final String READ_BASE_PATH = "orders";
	public static final String COUNT_BASE_PATH = "orders/count";
	
	public OrderBulkService(WebTarget target) {
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
	public Class<Order[]> getResponseClass() {
		return Order[].class;
	}

	@Override
	public OrdersRequest getWriteRequest(List<Order> items) {
		return new OrdersRequest(items);
	}

	@Override
	public List<Order> getResult(Order[] orders) {
		return Arrays.asList(orders);
	}

}
