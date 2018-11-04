package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Order;
import com.angular.it.netgrid.woocommerce.model.OrderRefund;
import com.angular.it.netgrid.woocommerce.model.request.OrderRefundRequest;

public class OrderRefundCrudService extends TemplateCrudService<OrderRefund, Integer, Order, OrderRefundRequest, OrderRefund> {
	
	public static final String BASE_PATH = OrderCrudService.BASE_PATH_FORMAT + "/refunds";
	public static final String BASE_PATH_FORMAT = OrderCrudService.BASE_PATH_FORMAT + "/refunds/%d";
	
	public OrderRefundCrudService(WebTarget target) {
		super(target);
	}

	@Override
	public String getCreatePath(Order context) {
		return String.format(BASE_PATH, context.getId());
	}

	@Override
	public String getReadPath(Integer id, Order context) {
		return String.format(BASE_PATH_FORMAT, context.getId(), id);
	}

	@Override
	public String getUpdatePath(Integer id, Order context) {
		return String.format(BASE_PATH_FORMAT, context.getId(), id);
	}

	@Override
	public String getDeletePath(Integer id, Order context) {
		return String.format(BASE_PATH_FORMAT, context.getId(), id);
	}

	@Override
	public Class<OrderRefund> getResponseClass() {
		return OrderRefund.class;
	}

	@Override
	public OrderRefundRequest getRequest(OrderRefund object) {
		return new OrderRefundRequest(object);
	}

	@Override
	public OrderRefund getResult(OrderRefund network) {
		return network;
	}

}
