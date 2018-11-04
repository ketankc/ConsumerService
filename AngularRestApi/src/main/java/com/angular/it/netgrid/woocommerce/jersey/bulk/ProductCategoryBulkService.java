package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductCategory;

public class ProductCategoryBulkService extends TemplateReadOnlyBulkService<ProductCategory, Integer, Object, ProductCategory[]> {

	public static final String READ_BASE_PATH = "products/categories";
	
	public ProductCategoryBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getReadPath(Object context) {
		return READ_BASE_PATH;
	}

	@Override
	public Class<ProductCategory[]> getResponseClass() {
		return ProductCategory[].class;
	}

	@Override
	public List<ProductCategory> getResult(ProductCategory[] productCategories) {
		return Arrays.asList(productCategories);
	}

}
