package com.yang.entry;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/06/09 17:57
 */
public class Bean {
	//加不加static执行次数不一样
	@org.springframework.context.annotation.Bean
	public /*static*/ Config getConfig(){
		return new Config();
	}

	@org.springframework.context.annotation.Bean
	public Config2 getConfig2(){
		getConfig();
		return new Config2();
	}
}
