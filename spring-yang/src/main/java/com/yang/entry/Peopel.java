package com.yang.entry;

import java.io.Serializable;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/01/06 11:43
 */
public class Peopel implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer sex;

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
}
