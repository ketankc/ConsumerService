package com.angular.it.netgrid.woocommerce.jersey;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;
import org.springframework.stereotype.Service;

import com.angular.it.netgrid.woocommerce.Configuration;
import com.angular.it.netgrid.woocommerce.CrudService;
import com.angular.it.netgrid.woocommerce.OAuth10aFilter;
import com.angular.it.netgrid.woocommerce.model.Coupon;
import com.angular.it.netgrid.woocommerce.model.Customer;
import com.angular.it.netgrid.woocommerce.model.Order;
import com.angular.it.netgrid.woocommerce.model.OrderNote;
import com.angular.it.netgrid.woocommerce.model.OrderRefund;
import com.angular.it.netgrid.woocommerce.model.Product;
import com.angular.it.netgrid.woocommerce.model.ProductAttribute;
import com.angular.it.netgrid.woocommerce.model.ProductAttributeTerm;
import com.angular.it.netgrid.woocommerce.model.ProductCategory;
import com.angular.it.netgrid.woocommerce.model.ProductShippingClass;
import com.angular.it.netgrid.woocommerce.model.ProductTag;
import com.angularit.netgrid.woocommerce.jersey.crud.CouponCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.CustomerCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.OrderCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.OrderNoteCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.OrderRefundCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.ProductAttributeCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.ProductAttributeTermCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.ProductCategoryCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.ProductCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.ProductShippingClassCrudService;
import com.angularit.netgrid.woocommerce.jersey.crud.ProductTagCrudService;

@Service
public class CrudServiceManager {
	
	public static final String VERSION = "v3";
	public static final String URL_FORMAT_WITH_PATH = "%s/%s/wp-json/wc/%s";
	public static final String URL_FORMAT_WITHOUT_PATH = "%s/wp-json/wc/%s";

	
	private static final Map<Configuration, WebTarget> targets = new HashMap<Configuration, WebTarget>();
	
	public static CrudService<Customer, Integer, Object> createCustomerService(Configuration config) {
		return new CustomerCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<Coupon, Integer, Object> createCouponService(Configuration config) {
		return new CouponCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<OrderNote, Integer, Order> createOrderNoteService(Configuration config) {
		return new OrderNoteCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<OrderRefund, Integer, Order> createOrderRefundService(Configuration config) {
		return new OrderRefundCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<Order, Integer, Object> createOrderService(Configuration config) {
		return new OrderCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<ProductAttribute, Integer, Object> createProductAttribute(Configuration config) {
		return new ProductAttributeCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<ProductAttributeTerm, Integer, ProductAttribute> createProductAttributeTermService(Configuration config) {
		return new ProductAttributeTermCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<Product, Integer, Object> createProductService(Configuration config) {
		return new ProductCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<ProductCategory, Integer, Object> createProductCategoryService(Configuration config) {
		return new ProductCategoryCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<ProductShippingClass, Integer, Object> createProductShippingClassService(Configuration config) {
		return new ProductShippingClassCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	public static CrudService<ProductTag, Integer, Object> createProductTagService(Configuration config) {
		return new ProductTagCrudService(CrudServiceManager.getWebTarget(config));
	}
	
	protected static WebTarget getWebTarget(Configuration config) {
		WebTarget retval = targets.get(config);
		if(retval == null) {
			String targetPath = "";
			ClientBuilder cb = ClientBuilder.newBuilder();
            SSLContext sslContext;
			try {
				sslContext = SSLContext.getDefault();
				cb.sslContext(sslContext);
			} catch (NoSuchAlgorithmException e) {
				// error 
			}
			Client client = cb.build();
			String basepath = config.getBasePath();
			if(basepath == null || basepath.trim().equals("")) {
				targetPath = String.format( URL_FORMAT_WITHOUT_PATH,config.getTargetUrl(), VERSION );
			} else {
				targetPath = String.format( URL_FORMAT_WITH_PATH,config.getTargetUrl(), basepath, VERSION );
			}
			URL targetUrl;
			try {
				targetUrl = new URL(config.getTargetUrl());
				if(targetUrl.getProtocol().toLowerCase().equals("https") ) {
					//Simple auth
					HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(config.getConsumerKey(), config.getConsumerSecret());
					client.register(feature);
				}
				else if(targetUrl.getProtocol().toLowerCase().equals("http")) {
					//Oauth 1.0a
					// https://woothemes.github.io/woocommerce-rest-api-docs/#authentication-over-http
					client.register(new OAuth10aFilter(config.getConsumerKey(), config.getConsumerSecret()));
				}
				Logger logger = Logger.getLogger(CrudServiceManager.class.getName());
				//client.register(new LoggingFilter(logger, true) );
				retval = client.target(targetPath);
				targets.put(config, retval);
			} catch (MalformedURLException e) {
				//
			}
		}
		
		return retval;
	}
}
