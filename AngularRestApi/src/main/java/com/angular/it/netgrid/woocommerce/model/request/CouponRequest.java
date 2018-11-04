package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Coupon;

@XmlRootElement
public class CouponRequest {
	
	private Coupon coupon;
	
	public CouponRequest() {}
	
	public CouponRequest(Coupon coupon) {
		this.coupon = coupon;
	}

	public Coupon getCoupon() {
		return coupon;
	}

	public void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
}
