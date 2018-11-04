package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductShippingClass;

public class ProductShippingClassBulkService extends TemplateReadOnlyBulkService<ProductShippingClass, Integer, Object, ProductShippingClass[]>{

	public static final String READ_BASE_PATH = "products/shipping_classes";
	
	public ProductShippingClassBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getReadPath(Object context) {
		return READ_BASE_PATH;
	}

	@Override
	public Class<ProductShippingClass[]> getResponseClass() {
		return ProductShippingClass[].class;
	}

	@Override
	public List<ProductShippingClass> getResult(ProductShippingClass[] productShippingClasses) {
		return Arrays.asList(productShippingClasses);
	}

}
