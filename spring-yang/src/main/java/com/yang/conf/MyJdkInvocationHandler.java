package com.yang.conf;

import com.yang.annotations.MySelect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * JDK动态代理
 * 被代理类必须实现接口
 *
 * @author tona.sun
 * @date 2019/8/17 17:11
 */
public class MyJdkInvocationHandler implements InvocationHandler {
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) {
		System.out.println("proxy invoke");
		/*
			获取到sql，当然还需要拼接和执行这里不做了
		 */
		MySelect annotation = method.getAnnotation(MySelect.class);
		System.out.println(annotation.value());
		/*
			返回执行sql的值
		 */
		return null;
	}
}
