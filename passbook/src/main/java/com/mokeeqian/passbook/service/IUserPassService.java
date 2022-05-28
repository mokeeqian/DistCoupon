/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.service;

import com.mokeeqian.passbook.vo.Pass;
import com.mokeeqian.passbook.vo.Response;

/**
 * 获取用户个人优惠卷信息
 */
public interface IUserPassService {

    /**
     * 获取用户未使用的优惠卷信息
     * @param userId 用户 id
     * @return {@link Response}
     * @throws Exception
     */
    Response getUserPassInfo(Long userId) throws Exception;

    /**
     * 获取用户已消费的优惠券信息，即 “已使用优惠券”功能实现
     * @param userId 用户 id
     * @return {@link Response}
     * @throws Exception
     */
    Response getUserUsedPassInfo(Long userId) throws Exception;

    /**
     * 获取用户所有的优惠券（已经领取的所有的）
     * @param userId 用户 id
     * @return {@link Response}
     * @throws Exception
     */
    Response getUserAllPassInfo(Long userId) throws Exception;

    /**
     * 用户核销使用掉优惠券
     * @param pass {@link Pass}
     * @return {@link Response}
     */
    Response userUsePass(Pass pass);
}
