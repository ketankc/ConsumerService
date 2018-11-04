package com.angular.it.netgrid.woocommerce.model.response;

public class CountResponse extends NetworkResponse {

	private Integer count;
	
	public CountResponse() {}
	
	public CountResponse(Integer count) {
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
