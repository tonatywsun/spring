package com.yang.entry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/01/06 11:43
 */
@Configuration
public class Peopel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer sex;
	/*
		这里user和people中都有init方法都加了Bean这样放到beanDefinitionMap中是会被覆盖，因为放到map中的key是方法名init
	 */
	@Bean
	public User init() {
		return new User() {{
			setSex(1);
		}};
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
}
