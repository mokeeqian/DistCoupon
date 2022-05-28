/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.vo;

import com.mokeeqian.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h1>用户领取的优惠券信息</h1>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassInfo {

    private Pass pass; //优惠券

    private PassTemplate passTemplate; //优惠券模板

    private Merchants merchants; //优惠券对应的商户
}
