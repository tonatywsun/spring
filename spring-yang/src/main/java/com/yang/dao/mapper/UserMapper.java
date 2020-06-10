package com.yang.dao.mapper;

import com.yang.annotations.MySelect;
import com.yang.entry.User;

/**
 * @Description: 一个假的mapper
 * @Author: tona.sun
 * @Date: 2020/01/07 13:04
 */
public interface UserMapper {
	/**
	 * 随便写一个sql，用来测试获取
	 */
	@MySelect("select * from table where user_id = #{userId}")
	User selectById(Integer userId);
}
