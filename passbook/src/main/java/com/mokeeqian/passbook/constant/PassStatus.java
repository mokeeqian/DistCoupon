/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.constant;

/**
 * 优惠卷状态枚举
 */
public enum PassStatus {

    UNUSED(1,"未被使用的"),
    USED(2,"已经使用的"),
    ALL(3,"全部领取的");

    private Integer code;//状态码
    private String desc;//状态描述
    PassStatus(Integer code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
