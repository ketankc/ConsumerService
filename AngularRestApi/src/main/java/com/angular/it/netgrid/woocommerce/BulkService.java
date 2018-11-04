package com.angular.it.netgrid.woocommerce;

import java.util.List;
import java.util.Map;

import com.angular.it.netgrid.woocommerce.jersey.FilterQuery;

public interface BulkService<T extends CrudObject<ID>, ID, C> {
	public List<T> write(List<T> items, C context);
	public List<T> read(C context);
	public List<T> read(C context, FilterQuery filter, Map<String,String> queryParams);
	public Integer count(C context, FilterQuery filter, Map<String,String> queryParams);
}
