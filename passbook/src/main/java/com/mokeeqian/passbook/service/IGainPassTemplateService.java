/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.service;

import com.mokeeqian.passbook.vo.GainPassTemplateRequest;
import com.mokeeqian.passbook.vo.Response;

/**
 * <h1>用户获取优惠券功能实现</h1>
 */
public interface IGainPassTemplateService {
    /**
     * 用户领取优惠券
     * @param request {@link GainPassTemplateRequest}
     * @return {@link Response}
     * @throws Exception
     */
    Response gainPassTemplate(GainPassTemplateRequest request) throws Exception;
}
