package com.yang.conf;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description: 自定义扫描mapper的ImportBeanDefinitionRegistrar，这个类可以动态注册对象到spring中
 * 这个方法中可以操作BeanDefinition
 * @Author: tona.sun
 * @Date: 2020/01/07 11:04
 */
public class MyMapperScannerRegistrar implements ImportBeanDefinitionRegistrar, ResourceLoaderAware {
	private ResourceLoader resourceLoader;

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.out.println(resourceLoader);
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition();
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		//TODO 这里beanDefinition的BeanClass类型是MyBeanFactory，但是会放进去getObject
		beanDefinition.setBeanClass(MyBeanFactory.class);
		beanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
		beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.yang.dao.mapper.UserMapper");
		registry.registerBeanDefinition("userMapper", beanDefinition);
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
}
