package com.angular.it.netgrid.woocommerce.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlTransient;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product implements CrudObject<Integer> {
	
	public enum Type {
		SIMPLE("simple"), 
		GROUPED("grouped"), 
		EXTERNAL("external"), 
		VARIABLE("variable"),
		VARIATION("variation");
		
		private String jsonValue;

	    private Type(final String json) {
	        this.jsonValue = json;
	    }

	    @JsonValue
	    public String jsonValue() {
	        return this.jsonValue;
	    }
	}

	public enum BackorderType {
		NO("no"), 
		NOTIFY("notify"), 
		YES("yes");
		
		private String jsonValue;

	    private BackorderType(final String json) {
	        this.jsonValue = json;
	    }

	    @JsonValue
	    public String jsonValue() {
	        return this.jsonValue;
	    }
	}

	public enum CatalogVisibility {
		VISIBLE("visible"), 
		CATALOG("catalog"), 
		SEARCH("search"), 
		HIDDEN("hidden");
		
		private String jsonValue;

	    private CatalogVisibility(final String json) {
	        this.jsonValue = json;
	    }

	    @JsonValue
	    public String jsonValue() {
	        return this.jsonValue;
	    }
	}

	public enum Status {
		DRAFT("draft"),
		PUBLISH("publish"),
		TRASH("trash"),
		PRIVATE("private");
		
		private String jsonValue;

	    private Status(final String json) {
	        this.jsonValue = json;
	    }

	    @JsonValue
	    public String jsonValue() {
	        return this.jsonValue;
	    }
	}
	
	public enum TaxStatus {
		TAXABLE("taxable"), 
		SHIPPING("shipping"), 
		NONE("none");
		
		private String jsonValue;

	    private TaxStatus(final String json) {
	        this.jsonValue = json;
	    }

	    @JsonValue
	    public String jsonValue() {
	        return this.jsonValue;
	    }
	}
	public enum DownloadType {
		STANDARD("standard"), 
		APPLICATION("application"), 
		MUSIC("music");
		
		private String jsonValue;

	    private DownloadType(final String json) {
	        this.jsonValue = json;
	    }

	    @JsonValue
	    public String jsonValue() {
	        return this.jsonValue;
	    }
	}

	private String title;
	private Integer id;
	private String name;
	private String slug;
	private Date createdAt;
	private Date updatedAt;
	private Type type;
	private Status status;
	private Boolean downloadable;
	private Boolean virtual;
	private String permalink;
	private String sku;
	private String price;
	private String regularPrice;
	private String salePrice;
	private Date salePriceDatesFrom;
	private Date salePriceDatesTo;
	private String priceHtml;
	private Boolean taxable;
	private TaxStatus taxStatus;
	private String taxClass;
	private Boolean managingStock;
	private Integer stockQuantity;
	private Boolean inStock;
	private BackorderType backorders;
	private Boolean backordersAllowed;
	private Boolean backordered;
	private Boolean soldIndividually;
	private Boolean purchasable;
	private Boolean featured;
	private Boolean visible;
	private String catalogVisibility;
	private Boolean onSale;
	private BigDecimal weight;
	private Dimension dimensions;
	private Boolean shippingRequired;
	private Boolean shippingTaxable;
	private Boolean shippingClass;
	private Integer shippingClassId;
	private String description;
	private Boolean enableHtmlDescription;
	private String shortDescription;
	private String enabledHtmlShortDescription;
	private Boolean reviewsAllowed;
	private String averageRating;
	private Integer ratingCount;
	private List<Integer> relatedIds;
	private List<Integer> upsellIds;
	private List<Integer> crossSellIds;
	private Integer parentId;
	private List<ProductCategory> categories;
	private List<ProductTag> tags;
	private List<Image> images;
	private List<Attribute> attributes;
	private List<DefaultAttribute> defaultAttributes;
	private List<Download> downloads;
	private Integer downloadLimit;
	private Integer downloadExpiry;
	private DownloadType downloadType; 
	private String purchaseNote;
	private Integer totalSales;
	private List<Variation> variations;
	private Product parent;
	private String productUrl;
	private String buttonText;
	private String externalUrl;
	private List<String> groupedProducts;
	
	private Object _links;

	private Integer menuOrder;
	
	public Product() {}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@XmlElement(name="regular_price")
	public String getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(String regularPrice) {
		this.regularPrice = regularPrice;
	}

	@XmlElement(name="sale_price")
	public String getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(String salePrice) {
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

	@XmlElement(name="price_html")
	public String getPriceHtml() {
		return priceHtml;
	}

	public void setPriceHtml(String priceHtml) {
		this.priceHtml = priceHtml;
	}

	public Boolean isTaxable() {
		return taxable;
	}

	public void setTaxable(Boolean taxable) {
		this.taxable = taxable;
	}

	@XmlElement(name="tax_status")
	public TaxStatus getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(TaxStatus taxStatus) {
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

	@XmlElement(name="backorders_allowed")
	public Boolean isBackordersAllowed() {
		return backordersAllowed;
	}

	public void setBackordersAllowed(Boolean backordersAllowed) {
		this.backordersAllowed = backordersAllowed;
	}

	public Boolean isBackordered() {
		return backordered;
	}

	public void setBackordered(Boolean backordered) {
		this.backordered = backordered;
	}

	@XmlElement(name="sold_individually")
	public Boolean isSoldIndividually() {
		return soldIndividually;
	}

	public void setSoldIndividually(Boolean soldIndividually) {
		this.soldIndividually = soldIndividually;
	}

	public Boolean isFeatured() {
		return featured;
	}

	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}

	public Boolean isVisible() {
		return visible;
	}

	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	@XmlElement(name="catalog_visibility")
	public String getCatalogVisibility() {
		return catalogVisibility;
	}

	public void setCatalogVisibility(String catalogVisibility) {
		this.catalogVisibility = catalogVisibility;
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

	@XmlElement(name="shipping_required")
	public Boolean isShippingRequired() {
		return shippingRequired;
	}

	public void setShippingRequired(Boolean shippingRequired) {
		this.shippingRequired = shippingRequired;
	}

	@XmlElement(name="shipping_taxable")
	public Boolean isShippingTaxable() {
		return shippingTaxable;
	}

	public void setShippingTaxable(Boolean shippingTaxable) {
		this.shippingTaxable = shippingTaxable;
	}

	@XmlElement(name="shipping_class")
	public Boolean isShippingClass() {
		return shippingClass;
	}

	public void setShippingClass(Boolean shippingClass) {
		this.shippingClass = shippingClass;
	}

	@XmlElement(name="shipping_class_id")
	public Integer getShippingClassId() {
		return shippingClassId;
	}

	public void setShippingClassId(Integer shippingClassId) {
		this.shippingClassId = shippingClassId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@XmlElement(name="enable_html_description")
	public Boolean isEnableHtmlDescription() {
		return enableHtmlDescription;
	}

	public void setEnableHtmlDescription(Boolean enableHtmlDescription) {
		this.enableHtmlDescription = enableHtmlDescription;
	}

	@XmlElement(name="short_description")
	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	@XmlElement(name="enabled_html_short_description")
	public String getEnabledHtmlShortDescription() {
		return enabledHtmlShortDescription;
	}

	public void setEnabledHtmlShortDescription(String enabledHtmlShortDescription) {
		this.enabledHtmlShortDescription = enabledHtmlShortDescription;
	}

	@XmlElement(name="reviews_allowed")
	public Boolean isReviewsAllowed() {
		return reviewsAllowed;
	}

	public void setReviewsAllowed(Boolean reviewsAllowed) {
		this.reviewsAllowed = reviewsAllowed;
	}

	@XmlElement(name="average_rating")
	public String getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
	}

	@XmlElement(name="rating_count")
	public Integer getRatingCount() {
		return ratingCount;
	}

	public void setRatingCount(Integer ratingCount) {
		this.ratingCount = ratingCount;
	}

	@XmlElement(name="related_ids")
	public List<Integer> getRelatedIds() {
		return relatedIds;
	}

	public void setRelatedIds(List<Integer> relatedIds) {
		this.relatedIds = relatedIds;
	}

	@XmlElement(name="upsell_ids")
	public List<Integer> getUpsellIds() {
		return upsellIds;
	}

	public void setUpsellIds(List<Integer> upsellIds) {
		this.upsellIds = upsellIds;
	}

	@XmlElement(name="cross_sell_ids")
	public List<Integer> getCrossSellIds() {
		return crossSellIds;
	}

	public void setCrossSellIds(List<Integer> crossSellIds) {
		this.crossSellIds = crossSellIds;
	}

	@XmlElement(name="parent_id")
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public List<ProductCategory> getCategories() {
		return categories;
	}

	public void setCategories(List<ProductCategory> categories) {
		this.categories = categories;
	}

	public List<ProductTag> getTags() {
		return tags;
	}

	public void setTags(List<ProductTag> tags) {
		this.tags = tags;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public List<Attribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	@XmlElement(name="default_attributes")
	public List<DefaultAttribute> getDefaultAttributes() {
		return defaultAttributes;
	}

	public void setDefaultAttributes(List<DefaultAttribute> defaultAttributes) {
		this.defaultAttributes = defaultAttributes;
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

	@XmlElement(name="download_type")
	public DownloadType getDownloadType() {
		return downloadType;
	}

	public void setDownloadType(DownloadType downloadType) {
		this.downloadType = downloadType;
	}

	@XmlElement(name="purchase_note")
	public String getPurchaseNote() {
		return purchaseNote;
	}

	public void setPurchaseNote(String purchaseNote) {
		this.purchaseNote = purchaseNote;
	}

	@XmlElement(name="total_sales")
	public Integer getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(Integer totalSales) {
		this.totalSales = totalSales;
	}

	public List<Variation> getVariations() {
		return variations;
	}

	public void setVariations(List<Variation> variations) {
		this.variations = variations;
	}

//	@XmlTransient
//	public Product getParent() {
//		return parent;
//	}
//
//	public void setParent(Product parent) {
//		this.parent = parent;
//	}

	@XmlElement(name="product_url")
	public String getProductUrl() {
		return productUrl;
	}

	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}

	@XmlElement(name="button_text")
	public String getButtonText() {
		return buttonText;
	}

	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	@XmlElement(name="menu_order")
	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	@XmlTransient
	public Product getParent() {
		return parent;
	}

	public void setParent(Product parent) {
		this.parent = parent;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Boolean isPurchasable() {
		return purchasable;
	}

	public void setPurchasable(Boolean purchasable) {
		this.purchasable = purchasable;
	}

	@XmlElement(name="external_url")
	public String getExternalUrl() {
		return externalUrl;
	}

	public void setExternalUrl(String externalUrl) {
		this.externalUrl = externalUrl;
	}

	public BackorderType getBackorders() {
		return backorders;
	}

	public void setBackorders(BackorderType backorders) {
		this.backorders = backorders;
	}

	@XmlElement(name="grouped_products")
	public List<String> getGroupedProducts() {
		return groupedProducts;
	}

	public void setGroupedProducts(List<String> groupedProducts) {
		this.groupedProducts = groupedProducts;
	}

	@JsonIgnore
	public Object get_links() {
		return _links;
	}

	public void set_links(Object _links) {
		this._links = _links;
	}

}
