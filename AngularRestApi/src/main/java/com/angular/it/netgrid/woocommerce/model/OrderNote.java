package com.angular.it.netgrid.woocommerce.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderNote implements CrudObject<Integer> {

	private Integer id;
	private Date createdAt;
	private String note;
	private Boolean customerNote;
	
	public OrderNote() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement(name="date_created")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@XmlElement(name="customer_note")
	public Boolean isCustomerNote() {
		return customerNote;
	}

	public void setCustomerNote(Boolean customerNote) {
		this.customerNote = customerNote;
	}
	
	
}
