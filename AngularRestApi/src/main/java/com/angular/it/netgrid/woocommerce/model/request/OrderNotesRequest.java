package com.angular.it.netgrid.woocommerce.model.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.OrderNote;

@XmlRootElement
public class OrderNotesRequest {

	private List<OrderNote> orderNotes;
	
	public OrderNotesRequest() {
		this.orderNotes = new ArrayList<OrderNote>();
	}
	
	public OrderNotesRequest(List<OrderNote> items) {
		this.orderNotes = items;
	}

	@XmlElement(name="order_notes")
	public List<OrderNote> getOrderNotes() {
		return orderNotes;
	}

	public void setOrderNotes(List<OrderNote> orderNotes) {
		this.orderNotes = orderNotes;
	}
	
}
