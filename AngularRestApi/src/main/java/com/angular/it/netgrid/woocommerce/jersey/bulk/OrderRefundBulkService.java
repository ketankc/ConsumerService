package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Order;
import com.angular.it.netgrid.woocommerce.model.OrderRefund;

public class OrderRefundBulkService extends TemplateReadOnlyBulkService<OrderRefund, Integer, Order, OrderRefund[]> {

	public static final String READ_BASE_PATH = "orders/%d/refunds";
	
	public OrderRefundBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getReadPath(Order context) {
		return String.format(READ_BASE_PATH, context.getId());
	}

	@Override
	public Class<OrderRefund[]> getResponseClass() {
		return OrderRefund[].class;
	}

	@Override
	public List<OrderRefund> getResult(OrderRefund[] orderRefunds) {
		return Arrays.asList(orderRefunds);
	}

}
