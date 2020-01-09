package com.yang.conf;

import com.yang.service.impl.OrderServiceImpl;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Description: TODO
 * @Author: tona.sun
 * @Date: 2020/01/09 18:16
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{OrderServiceImpl.class.getName()};
	}
}
