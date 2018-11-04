package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Order;
import com.angular.it.netgrid.woocommerce.model.request.OrderRequest;

public class OrderCrudService extends TemplateCrudService<Order, Integer, Object, Order, Order>{

	public static final String BASE_PATH = "orders";
	public static final String BASE_PATH_FORMAT = "orders/%d";
	
	public OrderCrudService(WebTarget target) {
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
	public Class<Order> getResponseClass() {
		return Order.class;
	}

	@Override
	public Order getRequest(Order object) {
		return object;
	}

	@Override
	public Order getResult(Order network) {
		return network;
	}

}
