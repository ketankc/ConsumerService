package com.angular.it.netgrid.woocommerce.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonFormat;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order implements CrudObject<Integer> {
	
	private Integer id;
	private Integer parentId;
	private String orderKey;
	private Integer orderNumber;
	private Boolean pricesIncludeTax;
	private String createdVia;
	private Date createdAt;
	private Date updatedAt;
	private Date completedAt;
	private Date paidAt;
	private String status;
	private String currency;
	private String cartHash;
	private Boolean setPaid;
	private BigDecimal total;
	private BigDecimal subtotal;
	private Integer totalLineItemsQuantity;
	private BigDecimal totalTax;
	private BigDecimal totalShipping;
	private BigDecimal cartTax;
	private BigDecimal shippingTax;
	private BigDecimal totalDiscount;
	private BigDecimal discountTax;
	private String transactionId;
	private String shippingMethods;
	private String paymentMethod;
	private String paymentMethodTitle;
	private PaymentDetails paymentDetails;
	private BillingAddress billingAddress;
	private ShippingAddress shippingAddress;
	private String note;
	private String version;
	private String customerIp;
	private String customerUserAgent;
	private Integer customerId;
	private String viewOrderUrl;
	private List<LineItem> lineItems;
	private List<ShippingLine> shippingLines;
	private List<TaxLine> taxLines;
	private List<FeeLine> feeLines;
	private List<CouponLine> couponLines;
	private List<RefundLine> refunds;
	private Customer customer;
	
	public Order() {}
	
	@XmlElement(name="id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@XmlElement(name="order_number")
	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
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

	@XmlElement(name="date_completed")
	public Date getCompletedAt() {
		return completedAt;
	}

	public void setCompletedAt(Date completedAt) {
		this.completedAt = completedAt;
	}
	
	@XmlElement(name="date_paid")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPaidAt() {
		return paidAt;
	}
	
	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	@XmlElement(name="total_line_items_quantity")
	public Integer getTotalLineItemsQuantity() {
		return totalLineItemsQuantity;
	}

	public void setTotalLineItemsQuantity(Integer totalLineItemsQuantity) {
		this.totalLineItemsQuantity = totalLineItemsQuantity;
	}

	@XmlElement(name="total_tax")
	public BigDecimal getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(BigDecimal totalTax) {
		this.totalTax = totalTax;
	}

	@XmlElement(name="shipping_total")
	public BigDecimal getTotalShipping() {
		return totalShipping;
	}

	public void setTotalShipping(BigDecimal totalShipping) {
		this.totalShipping = totalShipping;
	}

	@XmlElement(name="cart_tax")
	public BigDecimal getCartTax() {
		return cartTax;
	}

	public void setCartTax(BigDecimal cartTax) {
		this.cartTax = cartTax;
	}

	@XmlElement(name="shipping_tax")
	public BigDecimal getShippingTax() {
		return shippingTax;
	}

	public void setShippingTax(BigDecimal shippingTax) {
		this.shippingTax = shippingTax;
	}

	@XmlElement(name="discount_total")
	public BigDecimal getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(BigDecimal totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	@XmlElement(name="shipping_methods")
	public String getShippingMethods() {
		return shippingMethods;
	}

	public void setShippingMethods(String shippingMethods) {
		this.shippingMethods = shippingMethods;
	}

	@XmlElement(name="payment_details")
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
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

	@XmlElement(name="customer_note")
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@XmlElement(name="customer_ip_address")
	public String getCustomerIp() {
		return customerIp;
	}

	public void setCustomerIp(String customerIp) {
		this.customerIp = customerIp;
	}

	@XmlElement(name="customer_user_agent")
	public String getCustomerUserAgent() {
		return customerUserAgent;
	}

	public void setCustomerUserAgent(String customerUserAgent) {
		this.customerUserAgent = customerUserAgent;
	}

	@XmlElement(name="customer_id")
	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	@XmlElement(name="view_order_url")
	public String getViewOrderUrl() {
		return viewOrderUrl;
	}

	public void setViewOrderUrl(String viewOrderUrl) {
		this.viewOrderUrl = viewOrderUrl;
	}

	@XmlElement(name="line_items")
	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	@XmlElement(name="shipping_lines")
	public List<ShippingLine> getShippingLines() {
		return shippingLines;
	}

	public void setShippingLines(List<ShippingLine> shippingLines) {
		this.shippingLines = shippingLines;
	}

	@XmlElement(name="tax_lines")
	public List<TaxLine> getTaxLines() {
		return taxLines;
	}

	public void setTaxLines(List<TaxLine> taxLines) {
		this.taxLines = taxLines;
	}

	@XmlElement(name="fee_lines")
	public List<FeeLine> getFeeLines() {
		return feeLines;
	}

	public void setFeeLines(List<FeeLine> feeLines) {
		this.feeLines = feeLines;
	}

	@XmlElement(name="coupon_lines")
	public List<CouponLine> getCouponLines() {
		return couponLines;
	}

	public void setCouponLines(List<CouponLine> couponLines) {
		this.couponLines = couponLines;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@XmlElement(name="order_key")
	public String getOrderKey() {
		return orderKey;
	}

	public void setOrderKey(String orderKey) {
		this.orderKey = orderKey;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@XmlElement(name="prices_include_tax")
	public Boolean getPricesIncludeTax() {
		return pricesIncludeTax;
	}

	public void setPricesIncludeTax(Boolean pricesIncludeTax) {
		this.pricesIncludeTax = pricesIncludeTax;
	}

	@XmlElement(name="discount_tax")
	public BigDecimal getDiscountTax() {
		return discountTax;
	}

	public void setDiscountTax(BigDecimal discountTax) {
		this.discountTax = discountTax;
	}

	@XmlElement(name="payment_method")
	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@XmlElement(name="payment_method_title")
	public String getPaymentMethodTitle() {
		return paymentMethodTitle;
	}

	public void setPaymentMethodTitle(String paymentMethodTitle) {
		this.paymentMethodTitle = paymentMethodTitle;
	}

	@XmlElement(name="set_paid")
	public Boolean getSetPaid() {
		return setPaid;
	}

	public void setSetPaid(Boolean setPaid) {
		this.setPaid = setPaid;
	}

	@XmlElement(name="transaction_id")
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@XmlElement(name="created_via")
	public String getCreatedVia() {
		return createdVia;
	}

	public void setCreatedVia(String createdVia) {
		this.createdVia = createdVia;
	}

	@XmlElement(name="cart_hash")
	public String getCartHash() {
		return cartHash;
	}

	public void setCartHash(String cartHash) {
		this.cartHash = cartHash;
	}

	@XmlElement(name="parent_id")
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public List<RefundLine> getRefunds() {
		return refunds;
	}

	public void setRefunds(List<RefundLine> refunds) {
		this.refunds = refunds;
	}

}
