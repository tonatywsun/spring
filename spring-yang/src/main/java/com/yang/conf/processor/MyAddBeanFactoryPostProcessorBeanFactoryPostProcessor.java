package com.yang.conf.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
/**
 * BeanFactoryPostProcessor是spring的扩展点之一，扩展点就是实现此接口（继承此类），实现指定方法，spring源码中会
 * 遍历子类（实现类）循环调用指定方法，从而实现了我们可以对spring进行扩展
 * @Author: tona.sun
 * @Date: 2019/12/26 11:14
 */
public class MyAddBeanFactoryPostProcessorBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyAddBeanFactoryPostProcessorBeanFactoryPostProcessor postProcessBeanFactory");
		/*
			这里可以拿到BeanDefinition进而进行修改，由于此处的设置，使userService变成原型
		 */
		BeanDefinition userService = beanFactory.getBeanDefinition("userService");
		userService.setScope("prototype");
	}
}
