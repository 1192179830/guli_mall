package com.ybzn.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 一、使用Nacos配置中心
 * 1、引入依赖
 * 2、创建一个bootstrap.properties
 * spring.application.name= gulimall-coupon
 * spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 * 3、需要给配置中心添加一个默认的数据集，可以通过查看控制台参数NacosPropertySourceBuilder发现
 * 4、给应用名字加配置
 * 5、动态刷新配置
 * @RefreshScope: 动态获取并配置刷新
 * @Value("${配置项})：即可获取值
 * 优先使用配置中心所配置的配置项
 *
 *  二、细节
 *  1）命名空间，配置隔离：
 *      默认：public(保留空间)
 *      1、开发，测试，预览，生成环境,利用命名空间来隔离
 *      2、每一个微服务之间相互隔离，每个微服务都可以创建自己的命名空间，只加载自己的命名空间
 *  2）配置集：所有配置的集合
 *  3）配置集ID：配置文件名字 dataID
 *  4) 配置分组
        默认所有的配置都集于：DEFAULT_GROUP
 *  3、同时配置多个配置集
 */

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
