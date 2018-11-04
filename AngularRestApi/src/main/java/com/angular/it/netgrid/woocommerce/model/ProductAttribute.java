package com.angular.it.netgrid.woocommerce.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonValue;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductAttribute implements CrudObject<Integer> {

	public enum Type {
		SELECT("select"),
		TEXT("text");
		
		private String jsonValue;

	    private Type(final String json) {
	        this.jsonValue = json;
	    }

	    @JsonValue
	    public String jsonValue() {
	        return this.jsonValue;
	    }
	}
	
	public enum OrderBy {
		MENU_ORDER("menu_order"), 
		NAME("name"), 
		NAME_NUM("name_num"), 
		ID("id");
		
		private String jsonValue;

	    private OrderBy(final String json) {
	        this.jsonValue = json;
	    }

	    @JsonValue
	    public String jsonValue() {
	        return this.jsonValue;
	    }
	}
	
	private Integer id;
	private String name;
	private String slug;
	private Type type;
	private OrderBy orderBy;
	private Boolean hasArchives;
	
	public ProductAttribute() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@XmlElement(name="order_by")
	public OrderBy getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(OrderBy orderBy) {
		this.orderBy = orderBy;
	}

	@XmlElement(name="has_archives")
	public Boolean isHasArchives() {
		return hasArchives;
	}

	public void setHasArchives(Boolean hasArchives) {
		this.hasArchives = hasArchives;
	}
	
	
}
