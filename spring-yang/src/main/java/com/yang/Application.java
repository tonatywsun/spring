package com.yang;

import com.yang.conf.YangAnnotationConfig;
import com.yang.conf.processor.MyAddBeanFactoryPostProcessorBeanDefinitionRegistryPostProcessor;
import com.yang.conf.processor.MyAddBeanFactoryPostProcessorBeanFactoryPostProcessor;
import com.yang.dao.mapper.UserMapper;
import com.yang.service.TestSpringBeanService;
import com.yang.service.UserService;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2019/12/24 20:59
 */
public class Application {
	//> Task :spring-yang:Application.main()
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(YangAnnotationConfig.class);
		BeanFactoryPostProcessor beanFactoryPostProcessor = new MyAddBeanFactoryPostProcessorBeanFactoryPostProcessor();
		applicationContext.addBeanFactoryPostProcessor(beanFactoryPostProcessor);
		BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor = new MyAddBeanFactoryPostProcessorBeanDefinitionRegistryPostProcessor();
		applicationContext.addBeanFactoryPostProcessor(beanDefinitionRegistryPostProcessor);
		applicationContext.scan("com.yang");
		/*
			执行完refresh只是把所有的BeanDefinition对象放到了beanDefinitionMap中
		 */
		applicationContext.refresh();
		UserService userService = (UserService) applicationContext.getBean("userService");
		UserService userService1 = (UserService) applicationContext.getBean("userService");
		System.out.println(userService.equals(userService1));

		TestSpringBeanService testSpringBeanService = applicationContext.getBean(TestSpringBeanService.class);
		testSpringBeanService.testResourceLoader(applicationContext);

		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		userMapper.selectById(1);
	}
}
