package com.angular.it.netgrid.woocommerce.jersey.bulk;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.client.WebTarget;

import com.angular.it.netgrid.woocommerce.model.Product;
import com.angular.it.netgrid.woocommerce.model.ProductReview;

public class ProductReviewBulkService extends TemplateReadOnlyBulkService<ProductReview, Integer, Product, ProductReview[]> {

	public static final String READ_BASE_PATH = "products/%d/reviews";
	
	public ProductReviewBulkService(WebTarget target) {
		super(target);
	}

	@Override
	public String getReadPath(Product context) {
		return String.format(READ_BASE_PATH, context.getId());
	}

	@Override
	public Class<ProductReview[]> getResponseClass() {
		return ProductReview[].class;
	}

	@Override
	public List<ProductReview> getResult(ProductReview[] productReviews) {
		return Arrays.asList(productReviews);
	}

}
