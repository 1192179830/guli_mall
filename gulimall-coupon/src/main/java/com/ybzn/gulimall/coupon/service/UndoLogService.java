package com.ybzn.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ybzn.common.utils.PageUtils;
import com.ybzn.gulimall.coupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author hugolli
 * @email hugolli@gmail.com
 * @date 2023-03-21 21:35:59
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

