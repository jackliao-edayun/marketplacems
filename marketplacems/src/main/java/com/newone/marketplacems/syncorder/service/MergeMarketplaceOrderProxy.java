package com.newone.marketplacems.syncorder.service;

import java.util.List;

import com.newone.marketplacems.syncorder.model.BizOmniOrder;

public interface MergeMarketplaceOrderProxy {

	void merge(List<BizOmniOrder> orderList);
	
}
