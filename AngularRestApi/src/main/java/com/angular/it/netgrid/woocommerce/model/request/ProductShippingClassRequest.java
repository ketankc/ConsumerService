package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.ProductShippingClass;

@XmlRootElement
public class ProductShippingClassRequest {

	private ProductShippingClass productShippingClass;
	
	public ProductShippingClassRequest() {}
	
	public ProductShippingClassRequest(ProductShippingClass productShippingClass) {
		this.productShippingClass = productShippingClass;
	}

	@XmlElement(name="product_shipping_class")
	public ProductShippingClass getProductShippingClass() {
		return productShippingClass;
	}

	public void setProductShippingClass(ProductShippingClass productShippingClass) {
		this.productShippingClass = productShippingClass;
	}
	
}
