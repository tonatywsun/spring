package com.yang;

import com.yang.conf.YangAnnotationConfig;
import com.yang.conf.processor.MyAddBeanFactoryPostProcessorBeanFactoryPostProcessor;
import com.yang.service.UserService;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
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
		applicationContext.refresh();
		UserService userService = (UserService) applicationContext.getBean("userService");
		UserService userService1 = (UserService) applicationContext.getBean("userService");
		System.out.println(userService.equals(userService1));
	}
}
