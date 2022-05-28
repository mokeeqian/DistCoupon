/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.merchants.service;

import com.mokeeqian.merchants.vo.CreateMerchantsRequest;
import com.mokeeqian.merchants.vo.PassTemplate;
import com.mokeeqian.merchants.vo.Response;

/**
 * 商户服务接口
 */
public interface IMerchantsServ {
    /**
     * 创建商户服务
     * @param request {@link CreateMerchantsRequest} 创建商户应用的请求
     * @return {@link Response}
     */
    Response createMerchants(CreateMerchantsRequest request);

    /**
     * 根据 id 构造商户信息
     * @param id 商户 id
     * @return {@link Response}
     */
    Response buildMerchantsInfoById(Integer id);

    /**
     * 投放优惠券
     * @param template {@link PassTemplate} 优惠券对象
     * @return {@link Response}
     */
    Response dropPassTemplate(PassTemplate template);
}
