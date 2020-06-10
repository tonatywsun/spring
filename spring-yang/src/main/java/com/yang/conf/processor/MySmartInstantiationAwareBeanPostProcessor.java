package com.yang.conf.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;

import java.lang.reflect.Constructor;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/06/10 14:36
 */
public class MySmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {
	//创建bean的时候如果这里返回了构造函数，则会使用这个构造函数去创建对象
	@Override
	public Constructor<?>[] determineCandidateConstructors(Class<?> beanClass, String beanName) throws BeansException {
		return null;
	}
}
