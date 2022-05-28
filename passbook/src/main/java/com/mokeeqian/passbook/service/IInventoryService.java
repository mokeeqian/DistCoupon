/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.service;

import com.mokeeqian.passbook.vo.Response;

/**
 * <h1>获取优惠券库存信息</h1>
 * 只返回用户没有领取的，即优惠券库存功能实现接口定义
 */
public interface IInventoryService {
    /**
     * 获取库存信息
     * @param userId 用户 id
     * @return {@link Response}
     * @throws Exception
     */
    Response getInventoryInfo(Long userId) throws Exception;
}
