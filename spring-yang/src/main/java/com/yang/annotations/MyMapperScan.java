package com.yang.annotations;

import com.yang.conf.MyMapperScannerRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 自定义的mapperscanner主要用到的就是Import和MyMapperScannerRegistrar
 * @Author: tona.sun
 * @Date: 2020/01/07 11:07
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MyMapperScannerRegistrar.class)
public @interface MyMapperScan {
	String[] value() default {};
}
