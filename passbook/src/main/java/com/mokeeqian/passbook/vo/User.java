/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 属性与HBASE表结构一致
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id; //用户 id

    private BaseInfo baseInfo; //用户基本信息

    private OtherInfo otherInfo; //用户额外信息

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class BaseInfo{
        private String name;
        private Integer age;
        private String sex;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OtherInfo{
        private String phone;
        private String address;
    }
}
