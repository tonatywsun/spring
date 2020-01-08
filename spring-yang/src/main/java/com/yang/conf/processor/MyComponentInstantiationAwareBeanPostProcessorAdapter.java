package com.yang.conf.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/01/08 15:22
 */
@Component
public class MyComponentInstantiationAwareBeanPostProcessorAdapter extends InstantiationAwareBeanPostProcessorAdapter {
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInstantiationAwareBeanPostProcessorAdapter postProcessBeforeInstantiation:" + beanName);
		return null;
	}
}
