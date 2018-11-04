package com.angularit.netgrid.woocommerce.jersey.crud;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.ProductTag;
import com.angular.it.netgrid.woocommerce.model.request.ProductTagRequest;

public class ProductTagCrudService extends TemplateCrudService<ProductTag, Integer, Object, ProductTagRequest, ProductTag> {
	
	public static final String BASE_PATH = "products/tags";
	public static final String BASE_PATH_FORMAT = "products/tags/%d";
	
	public ProductTagCrudService(WebTarget target) {
		super(target);
	}

	@Override
	public String getCreatePath(Object context) {
		return BASE_PATH;
	}

	@Override
	public String getReadPath(Integer id, Object context) {
		return String.format(BASE_PATH_FORMAT, id);
	}

	@Override
	public String getUpdatePath(Integer id, Object context) {
		return String.format(BASE_PATH_FORMAT, id);
	}

	@Override
	public String getDeletePath(Integer id, Object context) {
		return String.format(BASE_PATH_FORMAT, id);
	}

	@Override
	public Class<ProductTag> getResponseClass() {
		return ProductTag.class;
	}

	@Override
	public ProductTagRequest getRequest(ProductTag object) {
		return new ProductTagRequest(object);
	}

	@Override
	public ProductTag getResult(ProductTag network) {
		return network;
	}

}
