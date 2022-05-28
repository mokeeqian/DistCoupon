/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.vo;

import com.mokeeqian.passbook.constant.FeedbackType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.hbase.thirdparty.com.google.common.base.Enums;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {

    private Long userId; //用户 id

    private String type;//评论类型

    private String templateId; //PassTemplate RowKey, 如果是 app 类型的评论, 则没有

    private String comment; //评论内容

    // FIXME:
    public boolean validate() {

        FeedbackType feedbackType = Enums.getIfPresent(
                FeedbackType.class, this.type.toUpperCase()
        ).orNull();

        //反馈类型为 null 或者未评论都不能提交
        return !(null == feedbackType || null == comment);
    }
}