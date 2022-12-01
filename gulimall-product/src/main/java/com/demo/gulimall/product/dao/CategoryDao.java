package com.demo.gulimall.product.dao;

import com.demo.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xuchu
 * @email weircloud@163.com
 * @date 2022-11-30 23:13:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
