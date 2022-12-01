package com.demo.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合 Mybatis-Plus
 *      1）、导入依赖
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *      2）、配置
 *          1、配置数据源：
 *              a. 导入数据库的驱动;
 *              b. 在 application.yml 配置数据源相关信息
 *          2、配置 Mybatis-Plus：
 *              a. 使用 MapperScan 
 *              b. 告诉 Mybatis-Plus ， sql 映射文件位置
 */

@MapperScan("com.demo.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
