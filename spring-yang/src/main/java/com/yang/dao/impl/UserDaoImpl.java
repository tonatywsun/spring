package com.yang.dao.impl;

import com.yang.dao.UserDao;
import com.yang.entry.User;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/01/03 18:16
 */
public class UserDaoImpl implements UserDao {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public User getUser(Integer userId) {
		return null;
	}
}
