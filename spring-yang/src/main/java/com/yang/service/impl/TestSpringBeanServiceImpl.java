package com.yang.service.impl;

import com.yang.service.TestSpringBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service("testSpringBeanService")
public class TestSpringBeanServiceImpl implements TestSpringBeanService {
	/*
		这里注入了一个ResourceLoader，但是我并没有放到容器中啊，那是哪里放进去的呢
		AbstractApplicationContext中的下代码
		beanFactory.registerResolvableDependency(ResourceLoader.class, this);
	 */
	@Autowired
	private ResourceLoader resourceLoader;

	@Override
	public void testResourceLoader(ApplicationContext applicationContext) {
		System.out.println(applicationContext);
	}
}
