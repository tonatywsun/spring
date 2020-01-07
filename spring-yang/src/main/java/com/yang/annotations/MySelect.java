package com.yang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 自定义一个select注解
 * @Author: tona.sun
 * @Date: 2020/01/07 13:05
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MySelect {
	String value() default "";
}
