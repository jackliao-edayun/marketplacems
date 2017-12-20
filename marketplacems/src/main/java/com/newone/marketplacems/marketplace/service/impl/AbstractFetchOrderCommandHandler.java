package com.newone.marketplacems.marketplace.service.impl;

import java.util.List;

import com.newone.marketplacems.marketplace.MarketPlaceConfig;
import com.newone.marketplacems.marketplace.MarketPlaceCredential;
import com.newone.marketplacems.marketplace.common.BizResponse;
import com.newone.marketplacems.marketplace.model.MarketPlaceOrder;
import com.newone.marketplacems.marketplace.service.FetchOrderCommand;

public abstract class AbstractFetchOrderCommandHandler<T extends MarketPlaceOrder, C extends MarketPlaceConfig, R extends MarketPlaceCredential>
		implements FetchOrderCommand<T, C, R> {


	public BizResponse<List<T>> execute(C marketPlaceConfig, R marketPlaceCredential) {
		
		marketPlaceCredential.getLastOrderSynched();
		
		
		
		
		return null;
	}
}