package com.ybzn.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybzn.common.utils.PageUtils;
import com.ybzn.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author hugolli
 * @email hugolli@gmail.com
 * @date 2023-03-21 21:36:00
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
