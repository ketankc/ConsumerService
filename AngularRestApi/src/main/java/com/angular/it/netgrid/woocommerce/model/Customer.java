package com.angular.it.netgrid.woocommerce.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer implements CrudObject<Integer> {

	private Integer id;
	private Date createdAt;
	private Date updatedAt;
	private String email;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private ItemMeta lastOrder;
	private Date lastOrderDate;
	private Integer ordersCount;
	private BigDecimal totalSpent;
	private String avatarUrl;
	private BillingAddress billingAddress;
	private ShippingAddress shippingAddress;
	private Map<String, List<Link>> links;
	
	public Customer() {}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement(name="first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@XmlElement(name="last_name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@XmlElement(name="last_order_date")
	public Date getLastOrderDate() {
		return lastOrderDate;
	}

	public void setLastOrderDate(Date lastOrderDate) {
		this.lastOrderDate = lastOrderDate;
	}

	@XmlElement(name="orders_count")
	public Integer getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(Integer ordersCount) {
		this.ordersCount = ordersCount;
	}

	@XmlElement(name="total_spent")
	public BigDecimal getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(BigDecimal totalSpent) {
		this.totalSpent = totalSpent;
	}

	@XmlElement(name="avatar_url")
	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	@XmlElement(name="billing")
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}


	@XmlElement(name="shipping")
	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@XmlElement(name="date_modified")
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	@XmlElement(name="last_order")
	public ItemMeta getLastOrder() {
		return lastOrder;
	}

	public void setLastOrder(ItemMeta lastOrder) {
		this.lastOrder = lastOrder;
	}

	@XmlElement(name="_links")
	public Map<String, List<Link>> getLinks() {
		return links;
	}

	public void setLinks(Map<String, List<Link>> links) {
		this.links = links;
	}
	
	
	
}
