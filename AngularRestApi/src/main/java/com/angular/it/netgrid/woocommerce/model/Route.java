package com.angular.it.netgrid.woocommerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Route {
	
	public enum HttpMethod {
		GET,
		POST,
		PUT,
		DELETE,
		OPTIONS,
		HEAD;
	}

	@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
	public class RouteMeta {
		private String self;

		public RouteMeta() {}

		public String getSelf() {
			return self;
		}

		public void setSelf(String self) {
			this.self = self;
		}

	}

	private List<HttpMethod> supports;
	private RouteMeta meta;
	private Boolean acceptsData;

	public Route() {
		this.supports = new ArrayList<HttpMethod>();
	}

	public List<HttpMethod> getSupports() {
		return supports;
	}

	public void setSupports(List<HttpMethod> supports) {
		this.supports = supports;
	}

	public RouteMeta getMeta() {
		return meta;
	}

	public void setMeta(RouteMeta meta) {
		this.meta = meta;
	}

	@XmlElement(name="accepts_data")
	public Boolean isAcceptsData() {
		return acceptsData;
	}

	public void setAcceptsData(Boolean acceptsData) {
		this.acceptsData = acceptsData;
	}

}
