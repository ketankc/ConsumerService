package com.angular.it.netgrid.woocommerce.model.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.ProductTag;

@XmlRootElement
public class ProductTagResponse extends NetworkResponse {

	private ProductTag productTag;
	
	public ProductTagResponse() {}
	
	public ProductTagResponse(ProductTag productTag) {
		this.productTag = productTag;
	}

	@XmlElement(name="product_tag")
	public ProductTag getProductTag() {
		return productTag;
	}

	public void setProductTag(ProductTag productTag) {
		this.productTag = productTag;
	}
	
}
