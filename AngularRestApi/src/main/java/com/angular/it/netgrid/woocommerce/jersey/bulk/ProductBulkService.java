package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Product;
import com.angular.it.netgrid.woocommerce.model.request.ProductsRequest;

public class ProductBulkService extends TemplateBulkService<Product, Integer, Object, ProductsRequest, Product[]> {

	public static final String WRITE_BASE_PATH = "products/batch";
	public static final String READ_BASE_PATH = "products";
	public static final String COUNT_BASE_PATH = "products/count";
	
	public ProductBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getWritePath(Object context) {
		return WRITE_BASE_PATH;
	}

	@Override
	public String getReadPath(Object context) {
		return READ_BASE_PATH;
	}

	@Override
	public String getCountPath(Object context) {
		return COUNT_BASE_PATH;
	}

	@Override
	public Class<Product[]> getResponseClass() {
		return Product[].class;
	}

	@Override
	public ProductsRequest getWriteRequest(List<Product> items) {
		return new ProductsRequest(items);
	}

	@Override
	public List<Product> getResult(Product[] products) {
		return Arrays.asList(products);
	}

}
