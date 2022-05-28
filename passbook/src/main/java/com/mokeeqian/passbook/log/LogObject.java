/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.log;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogObject {
    private String action; //日志动作类型，与 ActionName 中定义的常量对应

    private Long userId; //用户 id

    private Long timestamp; //当前时间戳

    private String remoteIp; //客户端 ip 地址,可以反作弊

    private Object info = null; //日志信息
}