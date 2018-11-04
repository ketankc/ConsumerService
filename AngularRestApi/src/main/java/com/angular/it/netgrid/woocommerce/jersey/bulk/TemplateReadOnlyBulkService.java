package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.List;
import java.util.Map;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.angular.it.netgrid.woocommerce.jersey.FilterQuery;

public abstract class TemplateReadOnlyBulkService<T extends CrudObject<ID>, ID, C, S> extends TemplateBulkService<T, ID, C, Object, S> {

	protected TemplateReadOnlyBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public final List<T> write(List<T> items, C context) {
		return null;
	}

	@Override
	public final Integer count(C context, FilterQuery filter, Map<String,String> queryParams) {
		return null;
	}

	@Override
	public final String getWritePath(C context) {
		return null;
	}

	@Override
	public final String getCountPath(C context) {
		return null;
	}

	@Override
	public final Object getWriteRequest(List<T> items) {
		return null;
	}

}
