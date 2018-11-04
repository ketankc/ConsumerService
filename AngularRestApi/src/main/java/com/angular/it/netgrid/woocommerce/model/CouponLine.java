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
public class CouponLine implements CrudObject<Integer> {

	private Integer id;
	private String code;
	private BigDecimal amount;
	private BigDecimal dicountTax;
	
	public CouponLine() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@XmlElement(name="discount")
	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@XmlElement(name="discount_tax")
	public BigDecimal getDicountTax() {
		return dicountTax;
	}

	public void setDicountTax(BigDecimal dicountTax) {
		this.dicountTax = dicountTax;
	}
	
	
}
