package com.yang.conf;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @Description: 利用FactoryBean生成Class的代理对象放到容器中
 * @Author: tona.sun
 * @Date: 2020/01/07 11:33
 */
public class MyBeanFactory implements FactoryBean<Object> {
	Class<Object> clazz;

	public MyBeanFactory(Class<Object> clazz) {
		this.clazz = clazz;
	}

	@Override
	public Object getObject() {
		/*
			生成的这个代理类是当前类的子类，而不是兄弟类所以不能用clazz.getInterfaces()
		 */
		Class<?>[] interfaces = new Class<?>[]{clazz};
		return Proxy.newProxyInstance(clazz.getClassLoader(), interfaces, new MyJdkInvocationHandler());
	}

	@Override
	public Class<Object> getObjectType() {
		return clazz;
	}
}
