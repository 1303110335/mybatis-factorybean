/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package com.test.mybatis.config;

import com.test.mybatis.factory.LubanImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 *
 * @author xuleyan
 * @version AppConfig.java, v 0.1 2021-08-05 2:24 下午
 */
@Configuration
@Import(LubanImportBeanDefinitionRegistrar.class)
public class AppConfig {

}