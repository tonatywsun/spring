package com.yang.controller;

import com.yang.entry.User;
import com.yang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/01/06 12:01
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/getUser")
	public User getUser(@RequestParam(name = "userId") Integer userId) {
		return userService.getUser(userId);
	}
}
