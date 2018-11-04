package com.angular.it.netgrid.woocommerce.model.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.ProductAttributeTerm;

@XmlRootElement
public class ProductAttributeTermResponse extends NetworkResponse {

	private ProductAttributeTerm productAttributeTerm; 
	
	public ProductAttributeTermResponse() {}

	@XmlElement(name="product_attribute_term")
	public ProductAttributeTerm getProductAttributeTerm() {
		return productAttributeTerm;
	}

	public void setProductAttributeTerm(ProductAttributeTerm productAttributeTerm) {
		this.productAttributeTerm = productAttributeTerm;
	}

}
