package com.angular.it.netgrid.woocommerce;

public interface CrudService<T extends CrudObject<ID>, ID, C> {
	public T create(T object, C context) throws IllegalArgumentException;
	public T read(ID key, C context) throws IllegalArgumentException;
	public T update(T object, C context) throws IllegalArgumentException;
	public T delete(T object, C context) throws IllegalArgumentException;
}