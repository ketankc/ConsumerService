package com.angular.it.netgrid.woocommerce.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.angular.it.netgrid.woocommerce.model.Product.BackorderType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Variation implements CrudObject<Integer> {

	private Integer id;
	private Date createdAt;
	private Date updatedAt;
	private Boolean downloadable;
	private Boolean virtual;
	private String permalink;
	private String sku;
	private BigDecimal price;
	private BigDecimal regularPrice;
	private BigDecimal salePrice;
	private Date salePriceDatesFrom;
	private Date salePriceDatesTo;
	private Boolean taxable;
	private Product.TaxStatus taxStatus;
	private String taxClass;
	private Boolean managingStock;
	private Integer stockQuantity;
	private Boolean inStock;
	private BackorderType backorders;
	private Boolean backordersAllowed;
	private Boolean backordered;	
	private Boolean purchasable;
	private Boolean visible;
	private Boolean onSale;
	private BigDecimal weight;
	private Dimension dimensions;
	private String shippingClass;
	private Integer shippingClassId;
	private List<Image> image;
	private List<Attribute> attributes;
	private List<Download> downloads;
	private Integer downloadLimit;
	private Integer downloadExpiry;
	
	public Variation() {}

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

	@XmlElement(name="date_modified")
	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Boolean isDownloadable() {
		return downloadable;
	}

	public void setDownloadable(Boolean downloadable) {
		this.downloadable = downloadable;
	}

	public Boolean isVirtual() {
		return virtual;
	}

	public void setVirtual(Boolean virtual) {
		this.virtual = virtual;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@XmlElement(name="regular_price")
	public BigDecimal getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(BigDecimal regularPrice) {
		this.regularPrice = regularPrice;
	}

	@XmlElement(name="sale_price")
	public BigDecimal getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}

	@XmlElement(name="date_on_sale_from")
	public Date getSalePriceDatesFrom() {
		return salePriceDatesFrom;
	}

	public void setSalePriceDatesFrom(Date salePriceDatesFrom) {
		this.salePriceDatesFrom = salePriceDatesFrom;
	}

	@XmlElement(name="date_on_sale_to")
	public Date getSalePriceDatesTo() {
		return salePriceDatesTo;
	}

	public void setSalePriceDatesTo(Date salePriceDatesTo) {
		this.salePriceDatesTo = salePriceDatesTo;
	}

	public Boolean isTaxable() {
		return taxable;
	}

	public void setTaxable(Boolean taxable) {
		this.taxable = taxable;
	}

	@XmlElement(name="tax_status")
	public Product.TaxStatus getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(Product.TaxStatus taxStatus) {
		this.taxStatus = taxStatus;
	}

	@XmlElement(name="tax_class")
	public String getTaxClass() {
		return taxClass;
	}

	public void setTaxClass(String taxClass) {
		this.taxClass = taxClass;
	}

	@XmlElement(name="manage_stock")
	public Boolean isManagingStock() {
		return managingStock;
	}

	public void setManagingStock(Boolean managingStock) {
		this.managingStock = managingStock;
	}

	@XmlElement(name="stock_quantity")
	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	@XmlElement(name="in_stock")
	public Boolean isInStock() {
		return inStock;
	}

	public void setInStock(Boolean inStock) {
		this.inStock = inStock;
	}

	public Boolean isBackordered() {
		return backordered;
	}

	public void setBackordered(Boolean backordered) {
		this.backordered = backordered;
	}

	public Boolean isVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	@XmlElement(name="on_sale")
	public Boolean isOnSale() {
		return onSale;
	}

	public void setOnSale(Boolean onSale) {
		this.onSale = onSale;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public Dimension getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}

	@XmlElement(name="shipping_class")
	public String getShippingClass() {
		return shippingClass;
	}

	public void setShippingClass(String shippingClass) {
		this.shippingClass = shippingClass;
	}

	@XmlElement(name="shipping_class_id")
	public Integer getShippingClassId() {
		return shippingClassId;
	}

	public void setShippingClassId(Integer shippingClassId) {
		this.shippingClassId = shippingClassId;
	}

	public List<Image> getImage() {
		return image;
	}

	public void setImage(List<Image> image) {
		this.image = image;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public List<Download> getDownloads() {
		return downloads;
	}

	public void setDownloads(List<Download> downloads) {
		this.downloads = downloads;
	}

	@XmlElement(name="download_limit")
	public Integer getDownloadLimit() {
		return downloadLimit;
	}

	public void setDownloadLimit(Integer downloadLimit) {
		this.downloadLimit = downloadLimit;
	}

	@XmlElement(name="download_expiry")
	public Integer getDownloadExpiry() {
		return downloadExpiry;
	}

	public void setDownloadExpiry(Integer downloadExpiry) {
		this.downloadExpiry = downloadExpiry;
	}

	public Boolean isPurchasable() {
		return purchasable;
	}

	public void setPurchasable(Boolean purchasable) {
		this.purchasable = purchasable;
	}

	public BackorderType getBackorders() {
		return backorders;
	}

	public void setBackorders(BackorderType backorders) {
		this.backorders = backorders;
	}

	@XmlElement(name="backorders_allowed")
	public Boolean isBackordersAllowed() {
		return backordersAllowed;
	}

	public void setBackordersAllowed(Boolean backordersAllowed) {
		this.backordersAllowed = backordersAllowed;
	}
	
}
