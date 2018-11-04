package com.angular.it.netgrid.woocommerce.model;


import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchOperation<T> {
	private List<T> create;
	private List<T> update;
	private List<T> delete;
	
	public BatchOperation() {
	}

	public BatchOperation(List<T> objectsToCreate, List<T> objectsToUpdate,  List<T> objectsToDelete) {
		this.update = objectsToUpdate;
		this.create = objectsToCreate;
		this.delete = objectsToDelete;
	}

	public List<T> getCreate() {
		return create;
	}

	public void setCreate(List<T> create) {
		this.create = create;
	}

	public List<T> getUpdate() {
		return update;
	}

	public void setUpdate(List<T> update) {
		this.update = update;
	}

	public List<T> getDelete() {
		return delete;
	}

	public void setDelete(List<T> delete) {
		this.delete = delete;
	}
}
