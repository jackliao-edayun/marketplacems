package com.newone.marketplacems.marketplace;

import java.util.Date;

public abstract class MarketPlaceCredential {

	private Date lastOrderSynched;

	public Date getLastOrderSynched() {
		return lastOrderSynched;
	}

	public void setLastOrderSynched(Date lastOrderSynched) {
		this.lastOrderSynched = lastOrderSynched;
	}
}
