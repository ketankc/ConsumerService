package com.angular.it.netgrid.woocommerce.model.response;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Coupon;

@XmlRootElement
public class CouponResponse extends NetworkResponse {
	
	private Coupon coupon;
	
	public CouponResponse() {}
	
	public CouponResponse(Coupon coupon) {
		this.coupon = coupon;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
}
