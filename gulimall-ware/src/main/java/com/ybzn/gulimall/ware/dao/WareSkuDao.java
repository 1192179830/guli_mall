package com.ybzn.gulimall.ware.dao;

import com.ybzn.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author hugolli
 * @email hugolli@gmail.com
 * @date 2023-03-21 21:53:36
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
