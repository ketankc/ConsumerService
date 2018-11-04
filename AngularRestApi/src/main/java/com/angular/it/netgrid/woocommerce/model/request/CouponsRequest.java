package com.angular.it.netgrid.woocommerce.model.request;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Coupon;

@XmlRootElement
public class CouponsRequest {

	private List<Coupon> coupons;
	
	public CouponsRequest() {
		this.coupons = new ArrayList<Coupon>();
	}
	
	public CouponsRequest(List<Coupon> coupons) {
		this.coupons = coupons;
	}
	
	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

}
