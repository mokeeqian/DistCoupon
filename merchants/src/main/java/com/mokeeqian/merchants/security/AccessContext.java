/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.merchants.security;

/**
 * 用ThreadLocal 单独存储每一个线程携带的token信息
 */
public class AccessContext {
    private static final  ThreadLocal<String> token = new ThreadLocal<String>(); // token 是 String 类型

    public static String getToken(){
        return token.get();
    }

    public static void setToken(String tokenStr){
        token.set(tokenStr);
    }

    /**
     * 删除当前线程的 token 信息
     */
    public static void clearAccessKey(){
        token.remove();
    }
}
