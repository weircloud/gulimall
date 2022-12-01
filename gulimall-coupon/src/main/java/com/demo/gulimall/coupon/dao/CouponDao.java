package com.demo.gulimall.coupon.dao;

import com.demo.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xuchu
 * @email weircloud@163.com
 * @date 2022-12-01 17:10:52
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
