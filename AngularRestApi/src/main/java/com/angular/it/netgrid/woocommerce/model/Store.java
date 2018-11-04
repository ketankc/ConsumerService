package com.angular.it.netgrid.woocommerce.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Store {

	@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)	
	public class StoreMeta {
		private String timezone;
		private String currency;
		private String currencyFormat;
		private String currencyPosition;
		private String thousandSeparator;
		private String decimalSeparator;
		private Integer priceNumDecimals;
		private Boolean taxIncluded;
		private String weightUnit;
		private String dimensionUnit;
		private Boolean sslEnabled;
		private Boolean permalinksEnabled;
		private Boolean generatePassword;
		private Map<String,String> links;
		
		public StoreMeta() {
			this.links = new HashMap<String, String>();
		}

		public String getTimezone() {
			return timezone;
		}

		public void setTimezone(String timezone) {
			this.timezone = timezone;
		}

		public String getCurrency() {
			return currency;
		}

		public void setCurrency(String currency) {
			this.currency = currency;
		}

		@XmlElement(name="currency_format")
		public String getCurrencyFormat() {
			return currencyFormat;
		}

		public void setCurrencyFormat(String currencyFormat) {
			this.currencyFormat = currencyFormat;
		}

		@XmlElement(name="currency_position")
		public String getCurrencyPosition() {
			return currencyPosition;
		}

		public void setCurrencyPosition(String currencyPosition) {
			this.currencyPosition = currencyPosition;
		}

		@XmlElement(name="thousand_separator")
		public String getThousandSeparator() {
			return thousandSeparator;
		}

		public void setThousandSeparator(String thousandSeparator) {
			this.thousandSeparator = thousandSeparator;
		}

		@XmlElement(name="decimal_separator")
		public String getDecimalSeparator() {
			return decimalSeparator;
		}

		public void setDecimalSeparator(String decimalSeparator) {
			this.decimalSeparator = decimalSeparator;
		}

		@XmlElement(name="price_num_decimals")
		public Integer getPriceNumDecimals() {
			return priceNumDecimals;
		}

		public void setPriceNumDecimals(Integer priceNumDecimals) {
			this.priceNumDecimals = priceNumDecimals;
		}

		@XmlElement(name="tax_included")
		public Boolean isTaxIncluded() {
			return taxIncluded;
		}

		public void setTaxIncluded(Boolean taxIncluded) {
			this.taxIncluded = taxIncluded;
		}

		@XmlElement(name="weight_unit")
		public String getWeightUnit() {
			return weightUnit;
		}

		public void setWeightUnit(String weightUnit) {
			this.weightUnit = weightUnit;
		}
		
		@XmlElement(name="dimension_unit")
		public String getDimensionUnit() {
			return dimensionUnit;
		}

		public void setDimensionUnit(String dimensionUnit) {
			this.dimensionUnit = dimensionUnit;
		}
		
		@XmlElement(name="ssl_enabled")
		public Boolean isSslEnabled() {
			return sslEnabled;
		}

		public void setSslEnabled(Boolean sslEnabled) {
			this.sslEnabled = sslEnabled;
		}
		
		@XmlElement(name="permalinks_enabled")
		public Boolean isPermalinksEnabled() {
			return permalinksEnabled;
		}

		public void setPermalinksEnabled(Boolean permalinksEnabled) {
			this.permalinksEnabled = permalinksEnabled;
		}

		@XmlElement(name="generated_password")
		public Boolean isGeneratePassword() {
			return generatePassword;
		}

		public void setGeneratePassword(Boolean generatePassword) {
			this.generatePassword = generatePassword;
		}

		public Map<String, String> getLinks() {
			return links;
		}

		public void setLinks(Map<String, String> links) {
			this.links = links;
		}
	}

	private String name;
	private String description;
	private String URL;
	private String wcVersion;
	private String version;
	private Map<String,Route> routes;
	private StoreMeta meta;
	
	public Store () {
		this.routes = new HashMap<String, Route>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	@XmlElement(name="wc_version")
	public String getWcVersion() {
		return wcVersion;
	}

	public void setWcVersion(String wcVersion) {
		this.wcVersion = wcVersion;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Map<String, Route> getRoutes() {
		return routes;
	}

	public void setRoutes(Map<String, Route> routes) {
		this.routes = routes;
	}

	public StoreMeta getMeta() {
		return meta;
	}

	public void setMeta(StoreMeta meta) {
		this.meta = meta;
	}
	
}
