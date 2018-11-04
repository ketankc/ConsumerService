package com.angular.it.netgrid.woocommerce.jersey;

import com.angular.it.netgrid.woocommerce.BulkService;
import com.angular.it.netgrid.woocommerce.Configuration;
import com.angular.it.netgrid.woocommerce.jersey.bulk.CouponBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.CustomerBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.OrderBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.OrderNoteBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.OrderRefundBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.ProductAttributeBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.ProductAttributeTermBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.ProductBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.ProductCategoryBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.ProductOrderBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.ProductReviewBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.ProductShippingClassBulkService;
import com.angular.it.netgrid.woocommerce.jersey.bulk.ProductTagBulkService;
import com.angular.it.netgrid.woocommerce.model.Coupon;
import com.angular.it.netgrid.woocommerce.model.Customer;
import com.angular.it.netgrid.woocommerce.model.Order;
import com.angular.it.netgrid.woocommerce.model.OrderNote;
import com.angular.it.netgrid.woocommerce.model.OrderRefund;
import com.angular.it.netgrid.woocommerce.model.Product;
import com.angular.it.netgrid.woocommerce.model.ProductAttribute;
import com.angular.it.netgrid.woocommerce.model.ProductAttributeTerm;
import com.angular.it.netgrid.woocommerce.model.ProductCategory;
import com.angular.it.netgrid.woocommerce.model.ProductReview;
import com.angular.it.netgrid.woocommerce.model.ProductShippingClass;
import com.angular.it.netgrid.woocommerce.model.ProductTag;

public class BulkServiceManager {

	public static BulkService<Coupon, Integer, Object> createCouponBulkService(Configuration config) {
		return new CouponBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<Customer, Integer, Object> createCustomerBulkService(Configuration config) {
		return new CustomerBulkService(CrudServiceManager.getWebTarget(config));
	}
		
	public static BulkService<Order, Integer, Object> createOrderBulkService(Configuration config) {
		return new OrderBulkService(CrudServiceManager.getWebTarget(config));		
	}
	
	public static BulkService<OrderNote, Integer, Order> createOrderNoteBulkService(Configuration config) {
		return new OrderNoteBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<OrderRefund, Integer, Order> createOrderRefundsBulkService(Configuration config) {
		return new OrderRefundBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<ProductAttribute, Integer, Object> createProductAttributeBulkService(Configuration config) {
		return new ProductAttributeBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<ProductAttributeTerm, Integer, ProductAttribute> createProductAttributeTermBulkService(Configuration config) {
		return new ProductAttributeTermBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<Product, Integer, Object> createProductBulkService(Configuration config) {
		return new ProductBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<ProductCategory, Integer, Object> createProductCategoryBulkService(Configuration config) {
		return new ProductCategoryBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<Order, Integer, Product> createProductOrderBulkService(Configuration config) {
		return new ProductOrderBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<ProductReview, Integer, Product> createProductReviewBulkService(Configuration config) {
		return new ProductReviewBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<ProductShippingClass, Integer, Object> createProductShippingClassBulkService(Configuration config) {
		return new ProductShippingClassBulkService(CrudServiceManager.getWebTarget(config));
	}
	
	public static BulkService<ProductTag, Integer, Object> createProductTagBulkService(Configuration config) {
		return new ProductTagBulkService(CrudServiceManager.getWebTarget(config));
	}
}
