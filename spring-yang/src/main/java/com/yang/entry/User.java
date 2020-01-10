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
	private static final long serialVersionUID = 1L;
	private Integer userId;

	/*
		这里user和people中都有init方法都加了Bean这样放到beanDefinitionMap中是会被覆盖，因为放到map中的key是方法名init
	 */
	@Bean
	public Peopel init() {
		return new Peopel() {{
			setSex(1);
		}};
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
