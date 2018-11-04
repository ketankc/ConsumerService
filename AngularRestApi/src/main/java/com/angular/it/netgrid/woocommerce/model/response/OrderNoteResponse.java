package com.angular.it.netgrid.woocommerce.model.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.OrderNote;

@XmlRootElement
public class OrderNoteResponse extends NetworkResponse {

	private OrderNote orderNote;
	
	public OrderNoteResponse() {}
	
	public OrderNoteResponse(OrderNote orderNote) {
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
