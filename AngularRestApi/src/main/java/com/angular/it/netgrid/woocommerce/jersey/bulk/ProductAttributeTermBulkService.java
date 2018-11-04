package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductAttribute;
import com.angular.it.netgrid.woocommerce.model.ProductAttributeTerm;

public class ProductAttributeTermBulkService extends TemplateReadOnlyBulkService<ProductAttributeTerm, Integer, ProductAttribute, ProductAttributeTerm[]> {

	public static final String READ_BASE_PATH = "products/attributes/%d/terms";
	
	public ProductAttributeTermBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getReadPath(ProductAttribute context) {
		return String.format(READ_BASE_PATH, context.getId());
	}

	@Override
	public Class<ProductAttributeTerm[]> getResponseClass() {
		return ProductAttributeTerm[].class;
	}

	@Override
	public List<ProductAttributeTerm> getResult(ProductAttributeTerm[] productAttributeTerms) {
		return Arrays.asList(productAttributeTerms);
	}

}
