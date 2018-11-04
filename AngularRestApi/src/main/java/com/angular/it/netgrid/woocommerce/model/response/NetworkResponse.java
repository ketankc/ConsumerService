package com.angular.it.netgrid.woocommerce.model.response;

import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

import com.angular.it.netgrid.woocommerce.model.Error;

public abstract class NetworkResponse {

	private List<Error> errors;
	private String message;

	public NetworkResponse() {}
	
	public List<Error> getErrors() {
		return this.errors;
	}

	public void setErrors(List<Error> errors) {
		this.errors = errors;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@XmlTransient
	public Boolean ok() {
		return this.errors == null || this.errors.size() < 1;
	}
}
