package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductAttribute;
import com.angular.it.netgrid.woocommerce.model.request.ProductAttributeRequest;

public class ProductAttributeCrudService extends TemplateCrudService<ProductAttribute, Integer, Object, ProductAttributeRequest, ProductAttribute> {

	public static final String BASE_PATH = "products/attributes";
	public static final String BASE_PATH_FORMAT = "products/attributes/%d";
	
	public ProductAttributeCrudService(WebTarget target) {
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
	public Class<ProductAttribute> getResponseClass() {
		return ProductAttribute.class;
	}

	@Override
	public ProductAttributeRequest getRequest(ProductAttribute object) {
		return new ProductAttributeRequest(object);
	}

	@Override
	public ProductAttribute getResult(ProductAttribute network) {
		return network;
	}

}
