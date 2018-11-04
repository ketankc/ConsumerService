package com.angular.it.netgrid.woocommerce;

public class ConfigurationImpl implements Configuration{

	@Override
	public String getTargetUrl() {
		return "https://automatictransmission.com.au";
	}

	@Override
	public String getBasePath() {
		return null;
	}

	@Override
	public String getConsumerKey() {
		return "ck_e76b6d6585e756fd20a0ea408e1b366fa4862d22";
	}

	@Override
	public String getConsumerSecret() {
		return "cs_a029462dba0b1fe142ded50fd61d0eb3278bd4c0";
	}

}
