package com.ybzn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybzn.common.utils.PageUtils;
import com.ybzn.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author hugolli
 * @email hugolli@gmail.com
 * @date 2023-03-21 21:13:58
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

