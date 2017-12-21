package com.newone.marketplacems.syncorder.service.impl;

import java.util.List;

import com.newone.marketplacems.syncorder.model.BizOmniOrder;
import com.newone.marketplacems.syncorder.service.FetchMarketplaceOrderProxy;
import com.newone.marketplacems.syncorder.service.MergeMarketplaceOrderProxy;
import com.newone.marketplacems.syncorder.service.OmniOrderService;
import com.newone.marketplacems.syncorder.service.SyncMarketplaceOrderToOmniService;

public class SyncMarketplaceOrderToOmniServiceImpl implements SyncMarketplaceOrderToOmniService {

	private FetchMarketplaceOrderProxy fetchMarketplaceOrderProxy;
	private MergeMarketplaceOrderProxy mergeMarketplaceOrderProxy;
	private OmniOrderService omniOrderService;

	@Override
	public void syncMarketplaceOrderToOmni() {

		// do task dispatch
		// fetch all marketplace
		// fetch all marketplace's account

		List<BizOmniOrder> list = fetchMarketplaceOrderProxy.fetchMarketplaceOrder();
		
		mergeMarketplaceOrderProxy.merge(list);

		omniOrderService.save(list);

		// save last fetch order date
	}

}
