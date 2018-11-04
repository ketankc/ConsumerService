package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import com.angular.it.netgrid.woocommerce.CrudObject;
import com.angular.it.netgrid.woocommerce.CrudService;
import com.angular.it.netgrid.woocommerce.model.response.DeleteResponse;

public abstract class TemplateCrudService<T extends CrudObject<ID>, ID, C, R, S> implements CrudService<T, ID, C> {

	private final WebTarget target;
	
	protected TemplateCrudService(WebTarget target) {
		this.target = target;
	}
	
	@Override
	public T create(T object, C context) throws IllegalArgumentException {
		Builder builder = this.initBuilder(this.getCreatePath(context));
		S result = builder.post(this.getRequestEntity(object), this.getResponseClass());
		return this.getResult(result);
	}

	@Override
	public T read(ID key, C context) throws IllegalArgumentException {
		Builder builder = this.initBuilder(this.getReadPath(key, context));
		S result = builder.get(this.getResponseClass());
		return this.getResult(result);
	}

	@Override
	public T update(T object, C context) throws IllegalArgumentException {
		Builder builder = this.initBuilder(this.getUpdatePath(object.getId(), context));
		S result = builder.put(this.getRequestEntity(object), this.getResponseClass());
		return this.getResult(result);
	}

	@Override
	public T delete(T object, C context) throws IllegalArgumentException {
		Builder builder = this.initBuilder(this.getDeletePath(object.getId(), context));
		DeleteResponse result = builder.delete(DeleteResponse.class);
		return result == null ? null : object;
	}
	
	public Builder initBuilder(String path) {
		if(path == null || path.trim().equals("")) {
			return this.target.request(MediaType.APPLICATION_JSON_TYPE);
		} else {
			return this.target.path(path).request(MediaType.APPLICATION_JSON_TYPE);
		}
	}
	
	public Entity<R> getRequestEntity(T object) {
		R request = this.getRequest(object);
		return Entity.entity(request,MediaType.APPLICATION_JSON_TYPE);
	}
	
	public abstract String getCreatePath(C context);
	public abstract String getReadPath(ID id, C context);
	public abstract String getUpdatePath(ID id, C context);
	public abstract String getDeletePath(ID id, C context);
	
	public abstract Class<S> getResponseClass();

	public abstract R getRequest(T object);
	public abstract T getResult(S network);
}
