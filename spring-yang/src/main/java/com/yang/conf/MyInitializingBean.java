package com.yang.conf;

import com.yang.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/01/08 15:44
 */
//@Component
public class MyInitializingBean extends InstantiationAwareBeanPostProcessorAdapter implements InitializingBean,
		BeanPostProcessor, BeanFactoryPostProcessor, BeanDefinitionRegistryPostProcessor, BeanNameAware, BeanFactoryAware, BeanClassLoaderAware, ApplicationContextAware {
	@Autowired
	private UserService userService;

	public MyInitializingBean() {
		System.out.println("MyInitializingBean userService:" + userService);
	}

	public void init() {
		System.out.println("MyInitializingBean init userService:" + userService);
	}

	public void destory() {
		System.out.println("MyInitializingBean destory userService:" + userService);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyInitializingBean afterPropertiesSet userService:" + userService);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyInitializingBean postProcessBeanFactory userService:" + userService);
	}

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("MyInitializingBean postProcessBeforeInstantiation userService:" + userService);
		return super.postProcessBeforeInstantiation(beanClass, beanName);
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("MyInitializingBean postProcessAfterInstantiation userService:" + userService);
		return super.postProcessAfterInstantiation(bean, beanName);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyInitializingBean postProcessBeforeInitialization userService:" + userService);
		return super.postProcessBeforeInitialization(bean, beanName);
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("MyInitializingBean postProcessAfterInstantiation userService:" + userService);
		return super.postProcessAfterInitialization(bean, beanName);
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("MyInitializingBean postProcessBeanDefinitionRegistry userService:" + userService);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("MyInitializingBean setBeanName userService:" + userService);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("MyInitializingBean setBeanFactory userService:" + userService);
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("MyInitializingBean setBeanClassLoader userService:" + userService);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("MyInitializingBean setApplicationContext userService:" + userService);
	}

}
