package com.demo.gulimall.order.dao;

import com.demo.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xuchu
 * @email weircloud@163.com
 * @date 2022-12-01 17:02:33
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
