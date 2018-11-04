package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Order;
import com.angular.it.netgrid.woocommerce.model.OrderNote;
import com.angular.it.netgrid.woocommerce.model.request.OrderNoteRequest;

public class OrderNoteCrudService extends TemplateCrudService<OrderNote, Integer, Order, OrderNoteRequest, OrderNote> {
	
	public static final String BASE_PATH = OrderCrudService.BASE_PATH_FORMAT + "/notes";
	public static final String BASE_PATH_FORMAT = OrderCrudService.BASE_PATH_FORMAT + "/notes/%d";
	
	public OrderNoteCrudService(WebTarget target) {
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
	public Class<OrderNote> getResponseClass() {
		return OrderNote.class;
	}

	@Override
	public OrderNoteRequest getRequest(OrderNote object) {
		return new OrderNoteRequest(object);
	}

	@Override
	public OrderNote getResult(OrderNote response) {
		return response;
	}

}
