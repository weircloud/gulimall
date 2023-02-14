package com.demo.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用nacos配置中心统一管理配置
 * 1、引入依赖
 * 2、创建bootstrap.properties
 * 3、需要给配置中心默认添加一个数据集（Data Id） gulimall-coupon.properties 默认规则：应用名.properties
 * 4、给应用名.properties 添加任何配置
 * 5、动态获取配置 
 *      @RefreshScope : 动态获取并刷新配置
 *      @Value("${配置项的名}") : 获取到配置
 *      如果 nacos 配置中心和当前应用的配置文件中都配置了相同的项，优先使用 nacos 配置中心的配置
 *      
 * 1）、命名空间:配置隔离;
 *     默认:public(保留空间);默认新增的所有配置都在public空间。
 *     1、开发,测试,生产:利用命名空间来做环境隔离。
 *        在 bootstrap.properties 配置上，需要使用哪个命名空间下的配置
 *        spring.cloud.nacos.config.namespace=命名空间的ID
 *     2、每一个微服务之间互相隔离配置：每一个微服务都创建自己的命名空间，只加载自己的命名空间下的所有配置
 * 2）、配置集：所有的配置的集合
 * 3）、配置集ID：类似于配置文件名
 *     Data Id：类似文件名
 * 4）、配置分组：
 *     默认所有的配置集都属于：DEFAULT_GROUP;
 *     spring.cloud.nacos.config.group
 *     
 * 每个微服务创建自己的命名空间，使用配置分组区分环境
 * 
 * 同时加载多个配置集
 *  1）、微服务任何配置信息，任何配置文件都可以放在配置中心中
 *      spring.cloud.nacos.config.ext-config[1].data-id=Data Id
 *      spring.cloud.nacos.config.ext-config[1].group=Group
 *      spring.cloud.nacos.config.ext-config[1].refresh=true  //默认为 false 开启自动刷新配置
 *  2）、需要在 bootstrap.properties 说明加载配置中心中哪些配置文件
 *  3）、@Value、@ConfigurationProperties...以前Spring Boot任何方式从配置文件中获取值都能使用。
 *      配置中心有的优先使用配置中心的，
 *   
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
