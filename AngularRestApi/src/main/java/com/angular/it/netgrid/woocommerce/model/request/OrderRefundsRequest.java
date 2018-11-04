package com.angular.it.netgrid.woocommerce.model.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.OrderRefund;

@XmlRootElement
public class OrderRefundsRequest {

	private List<OrderRefund> orderRefunds;
	
	public OrderRefundsRequest() {
		this.orderRefunds = new ArrayList<OrderRefund>();
	}
	
	public OrderRefundsRequest(List<OrderRefund> items) {
		this.orderRefunds = items;
	}

	@XmlElement(name="order_refunds")
	public List<OrderRefund> getOrderRefunds() {
		return orderRefunds;
	}

	public void setOrderRefunds(List<OrderRefund> orderRefunds) {
		this.orderRefunds = orderRefunds;
	}
	
}
