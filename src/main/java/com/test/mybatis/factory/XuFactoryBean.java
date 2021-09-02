/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package com.test.mybatis.factory;

import com.test.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 * @author xuleyan
 * @version XuFactoryBean.java, v 0.1 2021-08-05 2:40 下午
 */
@Component
public class XuFactoryBean implements FactoryBean {

    private Class mapperInterface;

    public void setMapperInterface(Class mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object getObject() throws Exception {
        Object proxyInstance = Proxy.newProxyInstance(XuFactoryBean.class.getClassLoader(), new Class[]{mapperInterface}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (Object.class.equals(method.getDeclaringClass())) {
                    return method.invoke(this, args);
                } else {
                    System.out.println("执行代理逻辑");
                    return null;
                }
            }
        });
        return proxyInstance;
    }

    @Override
    public Class<?> getObjectType() {
        return UserMapper.class;
    }
}