package com.yang.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2019/12/24 21:01
 */
@Configuration
@ImportResource("classpath:application.xml")
@ComponentScan(basePackages = {"com.yang"})
public class YangAnnotationConfig {
}
