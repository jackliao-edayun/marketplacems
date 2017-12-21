package com.newone.marketplacems.syncorder.service.impl;

import java.util.List;

import com.newone.marketplacems.marketplace.MarketPlaceConfig;
import com.newone.marketplacems.marketplace.MarketPlaceCredential;
import com.newone.marketplacems.marketplace.service.MarketPlaceService;
import com.newone.marketplacems.syncorder.model.BizOmniOrder;
import com.newone.marketplacems.syncorder.service.ConvertMarketplaceOrderAdapterProxy;
import com.newone.marketplacems.syncorder.service.FetchMarketplaceOrderProxy;

public class FetchMarketplaceOrderProxyImpl implements FetchMarketplaceOrderProxy {

	private ConvertMarketplaceOrderAdapterProxy convertMarketplaceOrderAdapterProxy;
	private MarketPlaceService marketPlaceService;
	
	@Override
	public List<BizOmniOrder> fetchMarketplaceOrder() {

		// check marketplace fetch order interval
		// check marketplace's account fetch order interval
		// call fetch order service
		MarketPlaceConfig marketPlaceConfig = null;
		MarketPlaceCredential marketPlaceCredential = null;
		marketPlaceService.fetchOrder(marketPlaceConfig, marketPlaceCredential);
		// convert marketplace order to omni order
		
		return null;
	}

}
