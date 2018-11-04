package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.ProductCategory;

@XmlRootElement
public class ProductCategoryRequest {

	private ProductCategory productCategory;
	
	public ProductCategoryRequest() {}
	
	public ProductCategoryRequest(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	@XmlElement(name="product_category")
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	
	
}
