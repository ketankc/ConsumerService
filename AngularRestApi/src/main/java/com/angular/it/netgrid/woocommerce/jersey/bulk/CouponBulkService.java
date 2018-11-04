package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Coupon;
import com.angular.it.netgrid.woocommerce.model.request.CouponsRequest;

public class CouponBulkService extends TemplateBulkService<Coupon, Integer, Object, CouponsRequest, Coupon[]> {

	public static final String WRITE_BASE_PATH = "coupons/batch";
	public static final String READ_BASE_PATH = "coupons";
	public static final String COUNT_BASE_PATH = "coupons/count";

	public CouponBulkService(WebTarget target) {
		super(target);
	}
	
	@Override
	public String getWritePath(Object context) {
		return WRITE_BASE_PATH;
	}

	@Override
	public String getReadPath(Object context) {
		return READ_BASE_PATH;
	}

	@Override
	public String getCountPath(Object context) {
		return COUNT_BASE_PATH;
	}

	@Override
	public Class<Coupon[]> getResponseClass() {
		return Coupon[].class;
	}

	@Override
	public CouponsRequest getWriteRequest(List<Coupon> items) {
		return new CouponsRequest(items);
	}

	@Override
	public List<Coupon> getResult(Coupon[] coupons) {
		return Arrays.asList(coupons);
	}

}
