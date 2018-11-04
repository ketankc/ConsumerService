package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.OrderNote;

@XmlRootElement
public class OrderNoteRequest {

	private OrderNote orderNote;
	
	public OrderNoteRequest() {}
	
	public OrderNoteRequest(OrderNote orderNote) {
		this.orderNote = orderNote;
	}

	@XmlElement(name="order_note")
	public OrderNote getOrderNote() {
		return orderNote;
	}

	public void setOrderNote(OrderNote orderNote) {
		this.orderNote = orderNote;
	}
	
}
