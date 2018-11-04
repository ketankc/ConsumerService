package com.angular.it.netgrid.woocommerce;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.UUID;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.UriBuilder;

import java.util.Base64;

@PreMatching
public class OAuth10aFilter implements ClientRequestFilter {
	private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
	private static final String HMAC_SHA1_SIGNATURE_METHOD = "HMAC-SHA1";
	
	final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();
    
	public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
	
	private static String generateNonce() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	private static String generateTimestamp() {
		long unixTime = System.currentTimeMillis() / 1000L;
    	return String.valueOf( unixTime );
	}
	
	private static String encodeQueryParamsInUri(URI uri) {
        Map<String, String> queryParms = new TreeMap<String, String>();
		String query = uri.getQuery();
        String[] pairs = query.split("&");
    	
        for (String pair : pairs) {
            int idx = pair.indexOf("=");
            queryParms.put(pair.substring(0, idx), pair.substring(idx + 1));
        }
        
        // Generate encoding string
        String output = "";
        Set<Entry<String, String> > querySet = queryParms.entrySet();
        Iterator<Entry<String, String>> setIterator = querySet.iterator();
        while(setIterator.hasNext()) {
        	if(output!="") output+="&";
            Entry<String, String> param = setIterator.next();
            output += param.getKey()+"="+param.getValue();
        }
        return output;
	}
	
	private final String consumerSecret;
	private final String consumerKey;
	
    private String getUrlWithoutParameters(URI uri) throws URISyntaxException {
	    return new URI(uri.getScheme(),
	                   uri.getAuthority(),
	                   uri.getPath(),
	                   null,
	                   null).toString();
	}
    
    public OAuth10aFilter(String consumerKey, String consumerSecret){
    	this.consumerKey = consumerKey;
    	this.consumerSecret = consumerSecret;
    }
	
    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {
    	String message_to_sign = "";
    	UriBuilder builder = UriBuilder.fromUri(requestContext.getUri() );
    	builder.queryParam("oauth_consumer_key", getConsumerKey());
    	builder.queryParam("oauth_timestamp", generateTimestamp());
    	builder.queryParam("oauth_nonce", generateNonce() );
    	builder.queryParam("oauth_signature_method",HMAC_SHA1_SIGNATURE_METHOD);
        	
    	URI uri_to_sign = builder.build();
    	String encodedParams = encodeQueryParamsInUri(uri_to_sign);
        
    	try {
			message_to_sign = requestContext.getMethod()+"&"
					+URLEncoder.encode(this.getUrlWithoutParameters(uri_to_sign),java.nio.charset.StandardCharsets.US_ASCII.toString())+"&"
					+URLEncoder.encode(encodedParams,java.nio.charset.StandardCharsets.US_ASCII.toString());
		} catch (URISyntaxException e1) {
			// this exception should never occour
		}
        
    	builder.queryParam("oauth_signature", calculateHmacSHA1Signature(message_to_sign) );
    	requestContext.setUri(builder.build());
    }

	public String getConsumerSecret() {
		return consumerSecret;
	}

	public String getConsumerKey() {
		return consumerKey;
	}
	    
	private String calculateHmacSHA1Signature(String message_to_sign) {
		String signature="";
        	SecretKeySpec signingKey = new SecretKeySpec((consumerSecret+"&").getBytes(), HMAC_SHA1_ALGORITHM);
        	Mac mac;
			try {
				mac = Mac.getInstance(HMAC_SHA1_ALGORITHM);
	        	mac.init(signingKey);
	        	byte[] rawHmac = mac.doFinal(message_to_sign.getBytes());
	        	signature = Base64.getEncoder().encodeToString(rawHmac);
			} catch (NoSuchAlgorithmException e) {
				//e.printStackTrace();
				// this exception should never occour
			} catch (InvalidKeyException e) {
				e.printStackTrace();
			}
        return signature;
	}

}