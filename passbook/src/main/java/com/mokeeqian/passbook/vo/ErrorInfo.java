/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一错误信息
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorInfo<T> { //T是泛型

    public static final Integer ERROR = -1;//错误码

    private Integer code; //特定错误码

    private String message; //错误信息

    private String url; //请求 url

    private T data; //请求返回的数据
}
