package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.ProductAttribute;

@XmlRootElement
public class ProductAttributeRequest {

	private ProductAttribute productAttribute;
	
	public ProductAttributeRequest() {}
	
	public ProductAttributeRequest(ProductAttribute productAttribute) {
		this.productAttribute = productAttribute;
	}

	@XmlElement(name="product_attribute")
	public ProductAttribute getProductAttribute() {
		return productAttribute;
	}

	public void setProductAttribute(ProductAttribute productAttribute) {
		this.productAttribute = productAttribute;
	}
	
}
