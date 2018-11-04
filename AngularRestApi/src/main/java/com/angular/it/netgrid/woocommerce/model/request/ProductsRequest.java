package com.angular.it.netgrid.woocommerce.model.request;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.Product;

@XmlRootElement
public class ProductsRequest {

	public static final String FILTER_TYPE_KEY = "type";
	public static final String FILTER_CATEGORY_KEY = "category";
	public static final String FILTER_TAG_KEY = "tag";
	public static final String FILTER_SHIPPING_CLASS_KEY = "shipping_class";
	public static final String FILTER_SKU_KEY = "sku";
	
	private List<Product> products;
	
	public ProductsRequest() {}
	
	public ProductsRequest(List<Product> items) {
		this.products = items;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
