package com.yang.conf;

import com.yang.entry.Config;
import com.yang.entry.Config2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Description: 这里加了Configuration 实体类Config构造函数就会执行一次，不加就会执行两次
 * @Author: tona.sun
 * @Date: 2020/01/10 18:14
 */
@Configuration
@Component
public class ConfigurationTest {
	@Bean
	public Config config() {
		return new Config();
	}

	@Bean
	public Config2 config2() {
		System.out.println("come config2");
		Config config = config();
		System.out.println("config2:" + config);
		return new Config2();
	}
}
