package com.ybzn.gulimall.product.dao;

import com.ybzn.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author hugolli
 * @email hugolli@gmail.com
 * @date 2023-03-21 21:13:59
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
