package com.newone.marketplacems.marketplace.service.impl;

import java.util.List;

import com.newone.marketplacems.marketplace.MarketPlaceConfig;
import com.newone.marketplacems.marketplace.MarketPlaceCredential;
import com.newone.marketplacems.marketplace.common.BizResponse;
import com.newone.marketplacems.marketplace.model.MarketPlaceOrder;
import com.newone.marketplacems.marketplace.service.FetchOrderCommand;
import com.newone.marketplacems.marketplace.service.MarketPlaceService;
import com.newone.marketplacems.marketplace.service.UploadShipmentinfoCommand;

public class AbstractMarketPlaceServiceImpl<T extends MarketPlaceOrder, C extends MarketPlaceConfig, R extends MarketPlaceCredential>
		implements MarketPlaceService<T, C, R> {

	private FetchOrderCommand<T, C, R> fetchOrderCommand;
	private UploadShipmentinfoCommand<C, R> uploadShipmentinfoCommand;

	@Override
	public BizResponse<List<T>> fetchOrder(C marketPlaceConfig, R marketPlaceCredential) {
		return fetchOrderCommand.execute(marketPlaceConfig, marketPlaceCredential);
	}

	@Override
	public BizResponse<Boolean> uploadShipmentinfo(C marketPlaceConfig, R marketPlaceCredential) {
		return uploadShipmentinfoCommand.execute(marketPlaceConfig, marketPlaceCredential);
	}

	protected void setFetchOrderCommand(FetchOrderCommand<T, C, R> fetchOrderCommand) {
		this.fetchOrderCommand = fetchOrderCommand;
	}

	protected void setUploadShipmentinfoCommand(UploadShipmentinfoCommand<C, R> uploadShipmentinfoCommand) {
		this.uploadShipmentinfoCommand = uploadShipmentinfoCommand;
	}
}
