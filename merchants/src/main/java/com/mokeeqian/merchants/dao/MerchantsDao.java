/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.merchants.dao;

import com.mokeeqian.merchants.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MerchantsDao extends JpaRepository<Merchants,Integer> {
    // JpaRepository<Merchants,Integer> 中
    // Merchants表示的是 merchants表
    // Integer表示该表的主键类型

    /**
     * 根据 id 获取商户对象
     * @param id 商户 id
     * @return {@link Merchants}
     * 如果没找到，返回empty
     */
    Optional<Merchants> findById(Integer id);


    /**
     * 根据商户名获取商户对象
     * @param name 商户名
     * @return {@link Merchants}
     */
    Merchants findByName(String name);
}
