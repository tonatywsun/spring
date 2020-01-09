package com.yang.conf;

import com.yang.annotations.MyMapperScan;

/**
 * @Description: 只是扫描了mapper（假的），没有其他作用
 * @Author: tona.sun
 * @Date: 2020/01/07 11:28
 */
//@Configuration
@MyMapperScan("com.yang.dao.mapper")
public class MyBatisConfig {
}
