package com.angular.it.netgrid.woocommerce.model;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShippingLine implements CrudObject<Integer> {

	private Integer id;
	private String methodId;
	private String methodTitle;
	private BigDecimal total;
	private BigDecimal totalTax;
	private List<FeeLineTax> taxes;

	
	public ShippingLine() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement(name="method_id")
	public String getMethodId() {
		return methodId;
	}

	public void setMethodId(String methodId) {
		this.methodId = methodId;
	}

	@XmlElement(name="method_title")
	public String getMethodTitle() {
		return methodTitle;
	}

	public void setMethodTitle(String methodTitle) {
		this.methodTitle = methodTitle;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@XmlElement(name="total_tax")
	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	public List<FeeLineTax> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<FeeLineTax> taxes) {
		this.taxes = taxes;
	}
	
	
}
