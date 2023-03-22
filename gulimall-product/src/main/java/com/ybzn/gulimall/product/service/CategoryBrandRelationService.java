package com.ybzn.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybzn.common.utils.PageUtils;
import com.ybzn.gulimall.product.entity.CategoryBrandRelationEntity;

import java.util.Map;

/**
 * 品牌分类关联
 *
 * @author hugolli
 * @email hugolli@gmail.com
 * @date 2023-03-21 21:13:59
 */
public interface CategoryBrandRelationService extends IService<CategoryBrandRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
