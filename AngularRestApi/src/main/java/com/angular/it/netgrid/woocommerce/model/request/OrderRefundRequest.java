package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.OrderRefund;

@XmlRootElement
public class OrderRefundRequest {

	private OrderRefund orderRefund;
	
	public OrderRefundRequest() {}
	
	public OrderRefundRequest(OrderRefund orderRefund) {
		this.orderRefund = orderRefund;
	}

	@XmlElement(name="order_refund")
	public OrderRefund getOrderRefund() {
		return orderRefund;
	}

	public void setOrderRefund(OrderRefund orderRefund) {
		this.orderRefund = orderRefund;
	}
	
}
