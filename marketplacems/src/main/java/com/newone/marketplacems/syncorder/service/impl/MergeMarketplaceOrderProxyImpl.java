package com.newone.marketplacems.syncorder.service.impl;

import java.util.List;

import com.newone.marketplacems.marketplace.service.MergeMarketplaceOrderService;
import com.newone.marketplacems.syncorder.model.BizOmniOrder;
import com.newone.marketplacems.syncorder.service.MergeMarketplaceOrderProxy;

public class MergeMarketplaceOrderProxyImpl implements MergeMarketplaceOrderProxy {
	
	private MergeMarketplaceOrderService mergeMarketplaceOrderService;
	
	@Override
	public void merge(List<BizOmniOrder> orderList) {
		// check order is existed in omni
		// call marketplace order adapter 
		
	}

}
