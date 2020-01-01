package com.yang.service.impl;

import com.yang.entry.User;
import com.yang.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2019/12/25 10:25
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	@Override
	public User getUser(Integer userId) {
		System.out.println("getUser");
		User user = new User() {{
			setUserId(userId);
		}};
		return user;
	}
}
