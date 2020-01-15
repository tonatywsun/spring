package com.yang.conf;

import com.yang.entry.Config;
import com.yang.entry.Config2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description: 这里加了Configuration 实体类Config构造函数就会执行一次，不加就会执行两次
 * @Author: tona.sun
 * @Date: 2020/01/10 18:14
 */
@Configuration
@Component
public class ConfigurationTest {
	Config config = null;

	/*
		先执行config2被拦截 urrentlyInvoked =config2 method=config2 返回true
		cglibMethodProxy.invokeSuper(enhancedConfigInstance, beanMethodArgs);调用当前config2方法
		然后执行到config被拦截urrentlyInvoked =config2 method=config 返回false
		resolveBeanReference(beanMethod, beanMethodArgs, beanFactory, beanName);->beanFactory.getBean(beanName)
		beanFactory中get不到，然后执行config方法被拦截urrentlyInvoked =config method=config 返回true
		cglibMethodProxy.invokeSuper(enhancedConfigInstance, beanMethodArgs);调用当前config方法返回new Config();
		beanFactory.getBean(beanName)得到config()方法返回的new Config();继续执行
	 */

	@Bean
	public Config2 config2() {
		System.out.println("come config2");
		Config config2 = config();
		System.out.println(config == config2);
		System.out.println("in config2 congif:" + config2);
		return new Config2();
	}
	@Bean
	public Config config() {
		if (config == null) {
			return config = new Config();
		} else {
			return new Config();
		}
	}
}
