package com.yang.dao;

import com.yang.entry.User;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/01/03 18:16
 */
public interface UserDao {
	default String test() {
		return "UserDao test";
	}

	User getUser(Integer userId);
}
