package com.yang.conf.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @Description: 注入到spring容器中我自己的BeanPostProcessor
 * BeanPostProcessor是spring的扩展点之一，扩展点就是实现此接口（继承此类），实现指定方法，spring源码中会
 * 遍历子类（实现类）循环调用指定方法，从而实现了我们可以对spring进行扩展
 * @Author: tona.sun
 * @Date: 2019/12/26 11:14
 */
//@Component
public class MyComponentBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyComponentBeanPostProcessor postProcessBeforeInitialization:" + beanName);
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyComponentBeanPostProcessor postProcessAfterInitialization:" + beanName);
		return bean;
	}
}
