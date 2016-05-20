package com.framework.datasource;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 数据源注解 
 * @Copyright 北京瑞友科技股份有限公司上海分公司-2014
 * @author majun
 * @date 2014-9-28
 * =================Modify Record=================
 * @Modifier			@date			@Content
 * majun				2014-09-28		新增
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface DataSource 
{
	/** 数据源名称 */
	DataSourceEnum value();
}
