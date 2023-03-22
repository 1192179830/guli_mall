package com.ybzn.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybzn.common.utils.PageUtils;
import com.ybzn.gulimall.ware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author hugolli
 * @email hugolli@gmail.com
 * @date 2023-03-21 21:53:36
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

