package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Order;
import com.angular.it.netgrid.woocommerce.model.Product;

public class ProductOrderBulkService extends TemplateReadOnlyBulkService<Order, Integer, Product, Order[]> {

	public static final String READ_BASE_PATH = "products/%d/orders";
	
	public ProductOrderBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getReadPath(Product context) {
		return String.format(READ_BASE_PATH, context.getId());
	}

	@Override
	public Class<Order[]> getResponseClass() {
		return Order[].class;
	}

	@Override
	public List<Order> getResult(Order[] orders) {
		return Arrays.asList(orders);
	}

}
