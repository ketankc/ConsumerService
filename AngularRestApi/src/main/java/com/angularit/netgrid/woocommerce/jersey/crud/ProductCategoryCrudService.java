package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductCategory;
import com.angular.it.netgrid.woocommerce.model.request.ProductCategoryRequest;

public class ProductCategoryCrudService extends TemplateCrudService<ProductCategory, Integer, Object, ProductCategoryRequest, ProductCategory> {

	public static final String BASE_PATH = "products/categories";
	public static final String BASE_PATH_FORMAT = "products/categories/%d";
	
	public ProductCategoryCrudService(WebTarget target) {
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
	public Class<ProductCategory> getResponseClass() {
		return ProductCategory.class;
	}

	@Override
	public ProductCategoryRequest getRequest(ProductCategory object) {
		return new ProductCategoryRequest(object);
	}

	@Override
	public ProductCategory getResult(ProductCategory network) {
		return network;
	}

}
