package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductTag;

public class ProductTagBulkService extends TemplateReadOnlyBulkService<ProductTag, Integer, Object, ProductTag[]> {

	public static final String READ_BASE_PATH = "products/tags";
	
	public ProductTagBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getReadPath(Object context) {
		return READ_BASE_PATH;
	}

	@Override
	public Class<ProductTag[]> getResponseClass() {
		return ProductTag[].class;
	}

	@Override
	public List<ProductTag> getResult(ProductTag[] productTags) {
		return Arrays.asList(productTags);
	}

}
