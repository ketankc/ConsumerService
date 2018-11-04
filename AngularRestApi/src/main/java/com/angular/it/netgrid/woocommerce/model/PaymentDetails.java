package com.angular.it.netgrid.woocommerce.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaymentDetails implements CrudObject<String> {

	private String methodId;
	private String methodTitle;
	private Boolean paid;
	private String transactionId;
	
	public PaymentDetails() {}

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

	public Boolean isPaid() {
		return paid;
	}

	public void setPaid(Boolean paid) {
		this.paid = paid;
	}

	@XmlElement(name="transaction_id")
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	@XmlTransient
	public String getId() {
		return this.getMethodId();
	}
	
	
}
