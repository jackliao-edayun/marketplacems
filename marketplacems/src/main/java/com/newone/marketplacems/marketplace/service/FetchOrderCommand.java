package com.newone.marketplacems.marketplace.service;

import java.util.List;

import com.newone.marketplacems.marketplace.MarketPlaceConfig;
import com.newone.marketplacems.marketplace.MarketPlaceCredential;
import com.newone.marketplacems.marketplace.common.BizResponse;
import com.newone.marketplacems.marketplace.model.MarketPlaceOrder;

public interface FetchOrderCommand<T extends MarketPlaceOrder, C extends MarketPlaceConfig, R extends MarketPlaceCredential> {

	BizResponse<List<T>> execute(C marketPlaceConfig, R marketPlaceCredential);

}
