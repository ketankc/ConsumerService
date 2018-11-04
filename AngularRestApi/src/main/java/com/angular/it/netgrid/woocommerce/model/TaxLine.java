package com.angular.it.netgrid.woocommerce.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxLine implements CrudObject<Integer> {

	private Integer id;
	private Integer rateId;
	private String code;
	private String title;
	private BigDecimal taxTotal;
	private BigDecimal shippingTaxTotal;
	private Boolean compound;
	
	public TaxLine() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement(name="rate_id")
	public Integer getRateId() {
		return rateId;
	}

	public void setRateId(Integer rateId) {
		this.rateId = rateId;
	}

	@XmlElement(name="rate_code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@XmlElement(name="label")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean isCompound() {
		return compound;
	}

	public void setCompound(Boolean compound) {
		this.compound = compound;
	}

	@XmlElement(name="tax_total")
	public BigDecimal getTaxTotal() {
		return taxTotal;
	}

	public void setTax_total(BigDecimal taxTotal) {
		this.taxTotal = taxTotal;
	}

	@XmlElement(name="shipping_tax_total")
	public BigDecimal getShippingTaxTotal() {
		return shippingTaxTotal;
	}

	public void setShippingTaxTotal(BigDecimal shippingTaxTotal) {
		this.shippingTaxTotal = shippingTaxTotal;
	}	
}
