package com.angular.it.netgrid.woocommerce.jersey;

import java.util.HashMap;
import java.util.Map;

public class FilterQuery extends HashMap<String, Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8302701607092500173L;
	
	public static final String FILTER_QUERY_FORMAT = "%s[%s]";
	
	public FilterQuery put(String key, FilterQuery value) {
		return (FilterQuery)this.put(key, (Object)value);
	}
	
	@Override
	public Object put(String key, Object value) {
		if(value instanceof String || value instanceof FilterQuery) {
			return super.put(key, value);
		}
		
		return new IllegalArgumentException("invalid filter value type");
	}
	
	public String getAsString(String key) {
		return (String)this.get(key);
	}
	
	public FilterQuery getAsFilter(String key) {
		return (FilterQuery)this.get(key);
	}
	
	public Boolean isString(String key) {
		Object value = this.get(key);
		if(value == null) return false;
		
		return value instanceof String;
	}
	
	public Boolean isFilter(String key) {
		Object value = this.get(key);
		if(value == null) return false;
		
		return value instanceof FilterQuery;
	}
	
	public Map<String, String> toFlatMap() {
		Map<String, String> retval = new HashMap<String, String>();
		if(this.size() < 1) {
			return retval;
		}
		
		this.toFlatMap("filter", retval);
		
		return retval;
	}
	
	public void toFlatMap(String prefix, Map<String, String> output) {
		for(String key : this.keySet()) {
			String arrayKey = String.format( FILTER_QUERY_FORMAT, prefix, key );
			if(this.isString(key)) {
				output.put(arrayKey, (String) this.get(key));
			} else {
				this.getAsFilter(key).toFlatMap(arrayKey, output);
			}
		}
	}
}
