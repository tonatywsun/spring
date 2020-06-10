package com.yang.conf.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/06/09 15:57
 */
//@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		//这里可以拿到beanClass直接去创建对象放到容器中，spring就不会去创建了
		MyInstantiationAwareBeanPostProcessor myInstantiationAwareBeanPostProcessor = new MyInstantiationAwareBeanPostProcessor();
		myInstantiationAwareBeanPostProcessor.setName("yangyang");
		return myInstantiationAwareBeanPostProcessor;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		//这里可以拿到postProcessBeforeInstantiation返回的bean进行一些后置处理之后放到容器中
		MyInstantiationAwareBeanPostProcessor myInstantiationAwareBeanPostProcessor = new MyInstantiationAwareBeanPostProcessor();
		myInstantiationAwareBeanPostProcessor.setName("yangyang");
		return myInstantiationAwareBeanPostProcessor;
	}
}
