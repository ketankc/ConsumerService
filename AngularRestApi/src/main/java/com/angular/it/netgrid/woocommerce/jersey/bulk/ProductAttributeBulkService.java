package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductAttribute;

public class ProductAttributeBulkService extends TemplateReadOnlyBulkService<ProductAttribute, Integer, Object, ProductAttribute[]> {

	public static final String READ_BASE_PATH = "products/attributes";
	
	public ProductAttributeBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getReadPath(Object context) {
		return READ_BASE_PATH;
	}

	@Override
	public Class<ProductAttribute[]> getResponseClass() {
		return ProductAttribute[].class;
	}

	@Override
	public List<ProductAttribute> getResult(ProductAttribute[] productAttributes) {
		return Arrays.asList(productAttributes);
	}

}
