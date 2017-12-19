package com.newone.marketplacems.marketplace.service.impl;

import com.newone.marketplacems.marketplace.MarketPlaceConfig;
import com.newone.marketplacems.marketplace.MarketPlaceCredential;
import com.newone.marketplacems.marketplace.common.BizResponse;
import com.newone.marketplacems.marketplace.service.UploadShipmentinfoCommand;

public abstract class AbstractUploadShipmentinfoCommandHandler<C extends MarketPlaceConfig, R extends MarketPlaceCredential>
		implements UploadShipmentinfoCommand<C, R> {


	public BizResponse<Boolean> execute(C marketPlaceConfig, R marketPlaceCredential) {
		
		
		
		
		
		return null;
	}
}