package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.model.ProductTag;

@XmlRootElement
public class ProductTagRequest {

	private ProductTag productTag;
	
	public ProductTagRequest() {}
	
	public ProductTagRequest(ProductTag productTag) {
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
