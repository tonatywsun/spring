package com.yang;

import com.yang.conf.YangAnnotationConfig;
import com.yang.entry.Config;
import com.yang.entry.Config2;
import com.yang.entry.User;
import com.yang.service.OrderService;
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
		/*BeanFactoryPostProcessor beanFactoryPostProcessor = new MyAddBeanFactoryPostProcessorBeanFactoryPostProcessor();
		applicationContext.addBeanFactoryPostProcessor(beanFactoryPostProcessor);
		BeanDefinitionRegistryPostProcessor beanDefinitionRegistryPostProcessor = new MyAddBeanFactoryPostProcessorBeanDefinitionRegistryPostProcessor();
		applicationContext.addBeanFactoryPostProcessor(beanDefinitionRegistryPostProcessor);
		applicationContext.scan("com.yang");*/
		/*
			执行完refresh只是把所有的BeanDefinition对象放到了beanDefinitionMap中
		 */
		applicationContext.refresh();
		/*UserService userService = (UserService) applicationContext.getBean("userService");
		UserService userService1 = (UserService) applicationContext.getBean("userService");
		System.out.println(userService.equals(userService1));

		TestSpringBeanService testSpringBeanService = applicationContext.getBean(TestSpringBeanService.class);
		testSpringBeanService.testResourceLoader(applicationContext);

		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		userMapper.selectById(1);*/

		OrderService orderService = applicationContext.getBean(OrderService.class);
		orderService.getOrder(1);

		User user = applicationContext.getBean(User.class);
		//Peopel peopel = applicationContext.getBean(Peopel.class);
		System.out.println(user);

		Config config = applicationContext.getBean(Config.class);
		Config2 config2 = applicationContext.getBean(Config2.class);
		System.out.println(config);
		System.out.println(config2);
	}
}
