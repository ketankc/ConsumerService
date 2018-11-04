package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Order;
import com.angular.it.netgrid.woocommerce.model.OrderNote;

public class OrderNoteBulkService extends TemplateReadOnlyBulkService<OrderNote, Integer, Order, OrderNote[]> {

	public static final String READ_BASE_PATH = "orders/%d/notes";
	
	public OrderNoteBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getReadPath(Order context) {
		return String.format(READ_BASE_PATH, context.getId());
	}

	@Override
	public Class<OrderNote[]> getResponseClass() {
		return OrderNote[].class;
	}

	@Override
	public List<OrderNote> getResult(OrderNote[] orderNotes) {
		return Arrays.asList(orderNotes);
	}

}
