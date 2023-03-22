package com.ybzn.gulimall.coupon.dao;

import com.ybzn.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author hugolli
 * @email hugolli@gmail.com
 * @date 2023-03-21 21:36:01
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
