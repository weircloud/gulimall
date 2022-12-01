package com.demo.gulimall.member.dao;

import com.demo.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xuchu
 * @email weircloud@163.com
 * @date 2022-12-01 17:11:56
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
