package com.angular.it.netgrid.woocommerce.model.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.ProductCategory;

@XmlRootElement
public class ProductCategoryResponse extends NetworkResponse {

	private ProductCategory productCategory;
	
	public ProductCategoryResponse() {}

	@XmlElement(name="product_category")
	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}
	
	
}
