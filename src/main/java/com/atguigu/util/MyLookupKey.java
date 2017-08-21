package com.atguigu.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyLookupKey extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		return MySwitchKey.getKey();
	}

}
