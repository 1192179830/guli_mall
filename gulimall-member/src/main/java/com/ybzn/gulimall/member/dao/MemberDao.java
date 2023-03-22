package com.ybzn.gulimall.member.dao;

import com.ybzn.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author hugolli
 * @email hugolli@gmail.com
 * @date 2023-03-21 21:42:51
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
