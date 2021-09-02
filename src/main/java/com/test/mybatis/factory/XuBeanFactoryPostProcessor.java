/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package com.test.mybatis.factory;

import com.test.mybatis.domain.B;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author xuleyan
 * @version XuBeanFactoryPostProcessor.java, v 0.1 2021-08-05 2:34 下午
 */
@Component
public class XuBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("a");
        beanDefinition.setBeanClassName(B.class.getName());
    }
}