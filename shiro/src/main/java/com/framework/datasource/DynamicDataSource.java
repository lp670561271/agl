package com.framework.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源抽象实现类(获取数据源对应的key) 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2014
 * @author majun
 * @date 2014-9-28
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * majun				2014-09-28		新增
 */
public class DynamicDataSource extends AbstractRoutingDataSource 
{
	@Override
	protected Object determineCurrentLookupKey() 
	{
		return DynamicDataSourceHolder.getDataSourceKey();
	}
}
