package com.angular.it.netgrid.woocommerce.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.fasterxml.jackson.annotation.JsonValue;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Coupon implements CrudObject<Integer> {

	public enum Type {
		FIXED_CART("fixed-cart"), 
		PERCENT("percent"), 
		FIXED_PRODUCT("fixed-product"),
		PERCENT_PRODUCT("percent-product");
		
		private String jsonValue;

	    private Type(final String json) {
	        this.jsonValue = json;
	    }

	    @JsonValue
	    public String jsonValue() {
	        return this.jsonValue;
	    }
	}
	
	private Integer id;
	private String code;
	private Type type;
	private Date createdAt;
	private Date updatedAt;
	private BigDecimal amount;
	private Boolean individualUse;
	private List<Integer> productIds;
	private List<Integer> excludeProductIds;
	private Integer usageLimit;
	private Integer usageLimitPerUser;
	private Integer limitUsageToXItems;
	private Integer usageCount;
	private Date expiryDate;
	private Boolean enableFreeShipping;
	private List<Integer> productCategoryIds;
	private List<Integer> excludeProductCategoryIds;
	private Boolean excludeSaleItems;
	private BigDecimal minimumAmount;
	private BigDecimal maximumAmount;
	private List<String> customerEmails;
	private List<String> usedBy;
	private String description;
	
	public Coupon() {
		this.productIds = new ArrayList<Integer>();
		this.excludeProductIds = new ArrayList<Integer>();
		this.productCategoryIds = new ArrayList<Integer>();
		this.excludeProductCategoryIds = new ArrayList<Integer>();
		this.customerEmails = new ArrayList<String>();
	}

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

	@XmlElement(name="discount_type")
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@XmlElement(name="date_created")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@XmlElement(name="date_modified")
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@XmlElement(name="individual_use")
	public Boolean isIndividualUse() {
		return individualUse;
	}

	public void setIndividualUse(Boolean individualUse) {
		this.individualUse = individualUse;
	}

	@XmlElement(name="product_ids")
	public List<Integer> getProductIds() {
		return productIds;
	}

	public void setProductIds(List<Integer> productIds) {
		this.productIds = productIds;
	}

	@XmlElement(name="exclude_product_ids")
	public List<Integer> getExcludeProductIds() {
		return excludeProductIds;
	}

	public void setExcludeProductIds(List<Integer> excludeProductIds) {
		this.excludeProductIds = excludeProductIds;
	}

	@XmlElement(name="usage_limit")
	public Integer getUsageLimit() {
		return usageLimit;
	}

	public void setUsageLimit(Integer usageLimit) {
		this.usageLimit = usageLimit;
	}

	@XmlElement(name="usage_limit_per_user")
	public Integer getUsageLimitPerUser() {
		return usageLimitPerUser;
	}

	public void setUsageLimitPerUser(Integer usageLimitPerUser) {
		this.usageLimitPerUser = usageLimitPerUser;
	}

	@XmlElement(name="limit_usage_to_x_items")
	public Integer getLimitUsageToXItems() {
		return limitUsageToXItems;
	}

	public void setLimitUsageToXItems(Integer limitUsageToXItems) {
		this.limitUsageToXItems = limitUsageToXItems;
	}

	@XmlElement(name="usage_count")
	public Integer getUsageCount() {
		return usageCount;
	}

	public void setUsageCount(Integer usageCount) {
		this.usageCount = usageCount;
	}

	@XmlElement(name="expiry_date")
	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@XmlElement(name="free_shipping")
	public Boolean isEnableFreeShipping() {
		return enableFreeShipping;
	}

	public void setEnableFreeShipping(Boolean enableFreeShipping) {
		this.enableFreeShipping = enableFreeShipping;
	}

	@XmlElement(name="product_categories")
	public List<Integer> getProductCategoryIds() {
		return productCategoryIds;
	}

	public void setProductCategoryIds(List<Integer> productCategoryIds) {
		this.productCategoryIds = productCategoryIds;
	}

	@XmlElement(name="exclude_product_categories")
	public List<Integer> getExcludeProductCategoryIds() {
		return excludeProductCategoryIds;
	}

	public void setExcludeProductCategoryIds(List<Integer> excludeProductCategoryIds) {
		this.excludeProductCategoryIds = excludeProductCategoryIds;
	}

	@XmlElement(name="exclude_sale_items")
	public Boolean isExcludeSaleItems() {
		return excludeSaleItems;
	}

	public void setExcludeSaleItems(Boolean excludeSaleItems) {
		this.excludeSaleItems = excludeSaleItems;
	}

	@XmlElement(name="minimum_amount")
	public BigDecimal getMinimumAmount() {
		return minimumAmount;
	}

	public void setMinimumAmount(BigDecimal minimumAmount) {
		this.minimumAmount = minimumAmount;
	}

	@XmlElement(name="maximum_amount")
	public BigDecimal getMaximumAmount() {
		return maximumAmount;
	}

	public void setMaximumAmount(BigDecimal maximumAmount) {
		this.maximumAmount = maximumAmount;
	}

	@XmlElement(name="email_restrictions")
	public List<String> getCustomerEmails() {
		return customerEmails;
	}

	public void setCustomerEmails(List<String> customerEmails) {
		this.customerEmails = customerEmails;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement(name="used_by")
	public List<String> getUsedBy() {
		return usedBy;
	}

	public void setUsedBy(List<String> usedBy) {
		this.usedBy = usedBy;
	}
	
}
