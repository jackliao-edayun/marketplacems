package com.newone.marketplacems.marketplace.service;

import com.newone.marketplacems.marketplace.MarketPlaceConfig;
import com.newone.marketplacems.marketplace.MarketPlaceCredential;
import com.newone.marketplacems.marketplace.common.BizResponse;

public interface UploadShipmentinfoCommand<C extends MarketPlaceConfig, R extends MarketPlaceCredential> {

	BizResponse<Boolean> execute(C marketPlaceConfig, R marketPlaceCredential);

}
