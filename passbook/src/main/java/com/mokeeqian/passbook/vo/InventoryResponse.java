/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <h1>库存响应信息</h1>
 * 可领取的优惠券
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InventoryResponse {
    //用户 id，标识不同的用户可以看到不同的优惠券信息
    private Long userId;

    //优惠券模板信息
    private List<PassTemplateInfo> passTemplateInfos;
}
