/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.merchants.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Response
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private Integer errorCode = 0; //错误码，正确返回 0

    private String errorMsg = ""; //错误信息，正确返回空字符串

    private Object data; // 返回值对象

    /**
     * 正确的响应构造函数
     * @param data 返回值对象
     */
    public Response(Object data){
        this.data = data;
    }
}
