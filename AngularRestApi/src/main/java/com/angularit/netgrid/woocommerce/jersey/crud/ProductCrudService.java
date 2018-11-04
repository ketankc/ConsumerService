package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Product;

public class ProductCrudService extends TemplateCrudService<Product, Integer, Object, Product, Product> {

	public static final String BASE_PATH = "products";
	public static final String BASE_PATH_FORMAT = "products/%d";
	
	public ProductCrudService(WebTarget target) {
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
	public Class<Product> getResponseClass() {
		return Product.class;
	}

	@Override
	public Product getRequest(Product object) {
		return object;
	}

	@Override
	public Product getResult(Product network) {
		return network;
	}

}
