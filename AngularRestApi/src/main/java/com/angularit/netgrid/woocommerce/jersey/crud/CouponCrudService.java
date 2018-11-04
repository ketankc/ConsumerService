package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Coupon;
import com.angular.it.netgrid.woocommerce.model.request.CouponRequest;

public class CouponCrudService extends TemplateCrudService<Coupon, Integer, Object, CouponRequest, Coupon> {

	public static final String BASE_PATH = "coupons";
	public static final String BASE_PATH_FORMAT = "coupons/%d";

	public CouponCrudService(WebTarget target) {
		super(target);
	}

	@Override
	public String getCreatePath(Object context) {
		return BASE_PATH;
	}

	@Override
	public String getReadPath(Integer id, Object context) {
		return String.format(BASE_PATH_FORMAT, id);
	}

	@Override
	public String getUpdatePath(Integer id, Object context) {
		return String.format(BASE_PATH_FORMAT, id);
	}

	@Override
	public String getDeletePath(Integer id, Object context) {
		return String.format(BASE_PATH_FORMAT, id);
	}

	@Override
	public Class<Coupon> getResponseClass() {
		return Coupon.class;
	}

	@Override
	public CouponRequest getRequest(Coupon object) {
		return new CouponRequest(object);
	}

	@Override
	public Coupon getResult(Coupon network) {
		return network;
	}

}
