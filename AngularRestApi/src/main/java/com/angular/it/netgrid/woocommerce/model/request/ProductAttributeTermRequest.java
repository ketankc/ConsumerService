package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.ProductAttributeTerm;

@XmlRootElement
public class ProductAttributeTermRequest {

	private ProductAttributeTerm productAttributeTerm; 
	
	public ProductAttributeTermRequest() {}

	public ProductAttributeTermRequest(ProductAttributeTerm object) {
		this.productAttributeTerm = object;
	}

	@XmlElement(name="product_attribute_term")
	public ProductAttributeTerm getProductAttributeTerm() {
		return productAttributeTerm;
	}

	public void setProductAttributeTerm(ProductAttributeTerm productAttributeTerm) {
		this.productAttributeTerm = productAttributeTerm;
	}

}
