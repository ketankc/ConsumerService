package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;

import com.angular.it.netgrid.woocommerce.BulkService;
import com.angular.it.netgrid.woocommerce.CrudObject;
import com.angular.it.netgrid.woocommerce.jersey.FilterQuery;
import com.angular.it.netgrid.woocommerce.model.BatchOperation;
import com.angular.it.netgrid.woocommerce.model.response.CountResponse;

public abstract class TemplateBulkService<T extends CrudObject<ID>, ID, C, R, S> implements BulkService<T, ID, C> {
	
	public static final String FILTER_QUERY_FORMAT = "filter[%s]";
	
	private final WebTarget target;
	
	protected TemplateBulkService(WebTarget target) {
		this.target = target;
	}
	
	private List<T> getUpdatedRows(BatchOperation<T> ba) {
		List<T> result = new ArrayList<T>();
		List<T> create, update, delete;
		create = ba.getCreate();
		update = ba.getUpdate();
		delete = ba.getDelete();
		if(create != null) result.addAll(create);
		if(update != null) result.addAll(update);
		if(delete != null) result.addAll(delete);
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> write(List<T> items, C context) {
		Builder builder = this.initBuilder(this.getWritePath(context), null, null);
		Entity<BatchOperation<T> > request = Entity.entity(new BatchOperation<T>(null,items,null),MediaType.APPLICATION_JSON_TYPE);
		BatchOperation<T> result = builder.post( request, new BatchOperation<T>().getClass() );
		return getUpdatedRows(result);
	}
	
	@Override
	public List<T> read(C context) {
		return this.read(context, null, null);
	}

	@Override
	public List<T> read(C context, FilterQuery filter, Map<String,String> queryParams) {
		Builder builder = this.initBuilder(this.getReadPath(context), filter, queryParams);
		S result = builder.get(this.getResponseClass());
		return this.getResult(result);
	}

	@Override
	public Integer count(C context, FilterQuery filter, Map<String,String> queryParams) {
		Builder builder = this.initBuilder(this.getReadPath(context), filter, queryParams);
		CountResponse result = builder.get(CountResponse.class);
		return result.getCount();
	}
	
	public Builder initBuilder(String path, FilterQuery filter, Map<String,String> queryParams) {
		WebTarget target = this.target;
		if(path != null && !path.trim().equals("")) {
			target = target.path(path);
		}
		
		if(filter != null) {
			Map<String,String> flat = filter.toFlatMap();
			for(String param : flat.keySet()) {
				target = target.queryParam(param, flat.get(param));
			}
		}
		
		// handle queryParams
		if(queryParams != null) {
			for(String param : queryParams.keySet()) {
				target = target.queryParam(param, queryParams.get(param));
			}
		}
		
		return target.request(MediaType.APPLICATION_JSON_TYPE);
	}
	
	public Entity<R> getRequestEntity(List<T> object) {
		R request = this.getWriteRequest(object);
		return Entity.entity(request,MediaType.APPLICATION_JSON_TYPE);
	}
	
	public abstract String getWritePath(C context);
	public abstract String getReadPath(C context);
	public abstract String getCountPath(C context);
	
	public abstract Class<S> getResponseClass();

	public abstract R getWriteRequest(List<T> items);
	public abstract List<T> getResult(S network);

}
