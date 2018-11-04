package com.angular.it.netgrid.woocommerce.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Link {

	private String href;
	
	public Link(){}
	
	
	public String getHref() {
		return href;
	}


	public void setHref(String href) {
		this.href = href;
	}

}
