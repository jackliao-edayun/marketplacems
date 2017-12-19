package com.newone.marketplacems.marketplace.service;

import java.util.List;

import com.newone.marketplacems.marketplace.MarketPlaceConfig;
import com.newone.marketplacems.marketplace.MarketPlaceCredential;
import com.newone.marketplacems.marketplace.common.BizResponse;
import com.newone.marketplacems.marketplace.model.MarketPlaceOrder;

public interface MarketPlaceService<T extends MarketPlaceOrder, C extends MarketPlaceConfig, R extends MarketPlaceCredential> {

	BizResponse<List<T>> fetchOrder(C marketPlaceConfig, R marketPlaceCredential);

	BizResponse<Boolean> uploadShipmentinfo(C marketPlaceConfig, R marketPlaceCredential);
}