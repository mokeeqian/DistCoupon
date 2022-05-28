/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 用户领取的优惠卷
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pass {

    private Long userId; //用户 id

    private String rowKey; //pass 在 HBase 中的 RowKey

    private String templateId; //PassTemplate 在 HBase 中的 RowKey

    private String token; // 优惠券 token, 有可能是 null, 则填充 -1

    private Date assignedDate; //领取日期

    private Date conDate; //消费日期, 不为空代表已经被消费了
}
