package com.angular.it.netgrid.woocommerce.model;

import java.math.BigDecimal;
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
public class LineItem implements CrudObject<Integer> {

	private Integer id;
	private BigDecimal subtotal;
	private BigDecimal subtotalTax;
	private BigDecimal total;
	private BigDecimal totalTax;
	private BigDecimal price;
	private Integer quantity;
	private String taxClass;
	private String name;
	private Integer productId;
	private Integer variationId;
	private String sku;
	private List<ProductMetaItem> meta;
	private List<TaxesMeta> taxes;
	private Map<String,String> variations;
	
	public LineItem() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	@XmlElement(name="subtotal_tax")
	public BigDecimal getSubtotalTax() {
		return subtotalTax;
	}

	public void setSubtotalTax(BigDecimal subtotalTax) {
		this.subtotalTax = subtotalTax;
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

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name="tax_class")
	public String getTaxClass() {
		return taxClass;
	}

	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name="product_id")
	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public List<ProductMetaItem> getMeta() {
		return meta;
	}

	public void setMeta(List<ProductMetaItem> meta) {
		this.meta = meta;
	}

	public Map<String, String> getVariations() {
		return variations;
	}

	public void setVariations(Map<String, String> variations) {
		this.variations = variations;
	}
	
	@XmlElement(name="variation_id")
	public Integer getVariationId() {
		return variationId;
	}

	public void setVariationId(Integer variationId) {
		this.variationId = variationId;
	}

	public List<TaxesMeta> getTaxes() {
		return taxes;
	}

	public void setTaxes(List<TaxesMeta> taxes) {
		this.taxes = taxes;
	}
}
