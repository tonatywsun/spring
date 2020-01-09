package com.yang.service.impl;

import com.yang.entry.User;
import com.yang.service.OrderService;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/01/09 18:43
 */
public class OrderServiceImpl implements OrderService {
	@Override
	public User getOrder(Integer orderId) {
		System.out.println("OrderServiceImpl getOrder");
		return new User();
	}
}
