package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductAttribute;
import com.angular.it.netgrid.woocommerce.model.ProductAttributeTerm;
import com.angular.it.netgrid.woocommerce.model.request.ProductAttributeTermRequest;

public class ProductAttributeTermCrudService extends TemplateCrudService<ProductAttributeTerm, Integer, ProductAttribute, ProductAttributeTermRequest, ProductAttributeTerm> {

	public static final String BASE_PATH = ProductAttributeCrudService.BASE_PATH_FORMAT + "/notes";
	public static final String BASE_PATH_FORMAT = ProductAttributeCrudService.BASE_PATH_FORMAT + "/notes/%d";
	
	public ProductAttributeTermCrudService(WebTarget target) {
		super(target);
	}

	@Override
	public String getCreatePath(ProductAttribute context) {
		return String.format(BASE_PATH, context.getId());
	}

	@Override
	public String getReadPath(Integer id, ProductAttribute context) {
		return String.format(BASE_PATH_FORMAT, context.getId(), id);
	}

	@Override
	public String getUpdatePath(Integer id, ProductAttribute context) {
		return String.format(BASE_PATH_FORMAT, context.getId(), id);
	}

	@Override
	public String getDeletePath(Integer id, ProductAttribute context) {
		return String.format(BASE_PATH_FORMAT, context.getId(), id);
	}

	@Override
	public Class<ProductAttributeTerm> getResponseClass() {
		return ProductAttributeTerm.class;
	}

	@Override
	public ProductAttributeTermRequest getRequest(ProductAttributeTerm object) {
		return new ProductAttributeTermRequest(object);
	}

	@Override
	public ProductAttributeTerm getResult(ProductAttributeTerm network) {
		return network;
	}

}
