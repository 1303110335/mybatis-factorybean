/**
 * bianque.com
 * Copyright (C) 2013-2021 All Rights Reserved.
 */
package com.test.mybatis;

import com.test.mybatis.domain.A;
import com.test.mybatis.domain.B;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 理解factoryBean和BeanFactory
 * @author xuleyan
 * @version Application.java, v 0.1 2021-08-05 2:07 下午
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.test.mybatis");
//        // 拿到的是B
//        System.out.println(context.getBean("a"));
//        // 调用A报错
//        System.out.println(context.getBean(A.class));
//        // 拿到的是B
//        System.out.println(context.getBean(B.class));
//        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }

        // 不加&符号，拿到的是getObject之后的jdk代理对象
//        System.out.println("xuFactoryBean: " + context.getBean("xuFactoryBean"));
//        System.out.println("xuFactoryBean-class: " + context.getBean("xuFactoryBean").getClass());
//        // 加上&符号拿到的xuFactoryBean
//        System.out.println("&xuFactoryBean: " + context.getBean("&xuFactoryBean"));
//        System.out.println("&xuFactoryBean-class: " + context.getBean("&xuFactoryBean").getClass());
//

        System.out.println("lubanFactoryBean: " + context.getBean("lubanFactoryBean"));
        System.out.println("lubanFactoryBean-class: " + context.getBean("lubanFactoryBean").getClass());
        // 加上&符号拿到的lubanFactoryBean
        System.out.println("&lubanFactoryBean: " + context.getBean("&lubanFactoryBean"));
        System.out.println("&lubanFactoryBean-class: " + context.getBean("&lubanFactoryBean").getClass());



    }

}