/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.merchants.constant;

/**
 * 优惠卷背景色
 */
public enum TemplateColor {
    RED(1,"红色"),
    GREEN(2,"绿色"),
    BLUE(3,"蓝色"),;

    private Integer code; //颜色码
    private String color; //颜色描述

    TemplateColor(Integer code,String color){
        this.code = code;
        this.color = color;
    }

    public Integer getCode() {
        return code;
    }

    public String getColor() {
        return color;
    }
}