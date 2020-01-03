package com.yang.entry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2019/12/25 10:26
 */
@Configuration
public class User {
	private Integer userId;

	@Bean
	public User init() {
		return new User() {{
			setUserId(1);
		}};
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
