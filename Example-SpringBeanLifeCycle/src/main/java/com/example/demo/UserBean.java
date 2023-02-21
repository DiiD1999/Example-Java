package com.example.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.applet.AppletContext;

/**
 * @author DiiD
 */
@Component
public class UserBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;
    private int age;

    public UserBean() {
        System.out.println("UserBean 实例化");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("UserBean 注解方式调用 @postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("UserBean 注解方式调用 @preDestroy");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("UserBean 获取到BeanFactory的容器");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("UserBean 获取到BeanName的容器");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("UserBean 获取到setApplicationContext的容器");
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("UserBean 初始化前（属性注入之后）调用 afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("UserBean 销毁前实现接口调用 destroy");
    }
}

/**
 * 实例化阶段 可通过接口实现自定义功能
 */
@Component
class BeanInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if("userBean".equals(beanName)){
            System.out.println("UserBean 实例化之前调用 postProcessBeforeInstantiation");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessBeforeInstantiation(beanClass, beanName);
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if("userBean".equals(beanName)){
            System.out.println("UserBean 实例化之后调用 postProcessAfterInstantiation");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessAfterInstantiation(bean, beanName);
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        if(beanName.equals("userBean")){
            System.out.println("UserBean 实例化注入属性调用 postProcessProperties");
        }
        return InstantiationAwareBeanPostProcessor.super.postProcessProperties(pvs, bean, beanName);
    }
}

/**
 * 初始化阶段 可通过接口实现自定义功能
 */
@Component
class BeanPostProcessorApp implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userBean".equals(beanName)) {
            System.out.println("UserBean 初始化之前调用 postProcessBeforeInitialization");
        }
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("userBean".equals(beanName)) {
            System.out.println("UserBean 初始化之后调用 postProcessAfterInitialization");
        }
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}