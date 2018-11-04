package com.angular.it.netgrid.woocommerce.model;

import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonValue;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductCategory implements CrudObject<Integer> {

	public enum Display {
		DEFAULT("default"),
		PRODUCTS("products"),
		SUBCATEGORIES("subcategories"),
		BOTH("both");
		
		private String jsonValue;

	    private Display(final String json) {
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
	private Integer parent;
	private String description;
	private Display display;
	private String image;
	private Integer count;
	
	public ProductCategory() {}

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

	public Integer getParent() {
		return parent;
	}

	public void setParent(Integer parent) {
		this.parent = parent;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
		
}
