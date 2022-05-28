/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.vo;

import com.mokeeqian.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassTemplateInfo{

    private PassTemplate passTemplate; //优惠券模板

    private Merchants merchants; //对应的商户信息
}