/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.passbook.service;

import com.mokeeqian.passbook.vo.Response;
import com.mokeeqian.passbook.vo.User;

/**
 * 用户服务
 */
public interface IUserService {
    /**
     * 创建用户
     * @param user {@link User}
     * @return {@link User}
     * @throws Exception
     */
    Response createUser(User user) throws Exception;
}