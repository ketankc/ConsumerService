package com.angular.it.netgrid.woocommerce.model.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.ProductAttribute;

@XmlRootElement
public class ProductAttributeResponse extends NetworkResponse {

	private ProductAttribute productAttribute;
	
	public ProductAttributeResponse() {}
	
	public ProductAttributeResponse(ProductAttribute productAttribute) {
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
