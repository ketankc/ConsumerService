package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductShippingClass;
import com.angular.it.netgrid.woocommerce.model.request.ProductShippingClassRequest;

public class ProductShippingClassCrudService extends TemplateCrudService<ProductShippingClass, Integer, Object, ProductShippingClassRequest, ProductShippingClass> {

	public static final String BASE_PATH = "products/shipping_classes";
	public static final String BASE_PATH_FORMAT = "products/shipping_classes/%d";	
	
	public ProductShippingClassCrudService(WebTarget target) {
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
	public Class<ProductShippingClass> getResponseClass() {
		return ProductShippingClass.class;
	}

	@Override
	public ProductShippingClassRequest getRequest(ProductShippingClass object) {
		return new ProductShippingClassRequest(object);
	}

	@Override
	public ProductShippingClass getResult(ProductShippingClass network) {
		return network;
	}

}
