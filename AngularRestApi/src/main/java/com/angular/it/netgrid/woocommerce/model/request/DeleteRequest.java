package com.angular.it.netgrid.woocommerce.model.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DeleteRequest {

	private Boolean force;
	
	public DeleteRequest() {}

	public Boolean isForce() {
		return force;
	}

	public void setForce(Boolean force) {
		this.force = force;
	}
	
}
