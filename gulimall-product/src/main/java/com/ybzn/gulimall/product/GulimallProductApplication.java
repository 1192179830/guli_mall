package com.ybzn.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合Mybatis plus
 *  1）导入依赖
 *  2）配置Mybatis plus
 *      1、配置数据源
 *          1）导入数据库驱动
 *          2) 配置数据源，整合Mybatis
 *      2、配置Mybatis-plus
 *
 */
@MapperScan("com.ybzn.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
