/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.merchants.service.Impl;


import com.alibaba.fastjson.JSON;
import com.mokeeqian.merchants.constant.Constants;
import com.mokeeqian.merchants.constant.ErrorCode;
import com.mokeeqian.merchants.dao.MerchantsDao;
import com.mokeeqian.merchants.entity.Merchants;
import com.mokeeqian.merchants.service.IMerchantsServ;
import com.mokeeqian.merchants.vo.CreateMerchantsRequest;
import com.mokeeqian.merchants.vo.CreateMerchantsResponse;
import com.mokeeqian.merchants.vo.PassTemplate;
import com.mokeeqian.merchants.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * 商户服务接口实现
 */
@Slf4j
@Service
public class MerchantsServImpl implements IMerchantsServ {
    private final MerchantsDao merchantsDao; // 数据库接口

    private final KafkaTemplate<String, String> kafkaTemplate; // kafka 客户端

    @Autowired
    public MerchantsServImpl(MerchantsDao merchantsDao,
                             KafkaTemplate<String, String> kafkaTemplate) {
        this.merchantsDao = merchantsDao;
        this.kafkaTemplate =  kafkaTemplate;
    }

    @Override
    @Transactional //涉及到数据库的操作
    public Response createMerchants(CreateMerchantsRequest request) {
        Response response = new Response();

        //创建商户的响应对象
        CreateMerchantsResponse merchantsResponse = new CreateMerchantsResponse();

        //验证请求的有效性
        ErrorCode errorCode = request.validate(merchantsDao);
        if(errorCode != ErrorCode.SUCCESS){ // 请求失败
            merchantsResponse.setId(-1); //设置为 -1，表示创建失败
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        }else{
            // id 就是存入表格 merchants 的 id
            merchantsResponse.setId(merchantsDao.save(request.toMerchants()).getId());
        }
        response.setData(merchantsResponse);
        return response;
    }

    @Override
    public Response buildMerchantsInfoById(Integer id) {
        Response response = new Response();

        Optional<Merchants> merchants = merchantsDao.findById(id);
        if(null == merchants){
            response.setErrorCode(ErrorCode.MERCHANTS_NOT_EXIST.getCode());
            response.setErrorMsg(ErrorCode.MERCHANTS_NOT_EXIST.getDesc());
        }
        response.setData(merchants);

        return response;
    }

    @Override
    public Response dropPassTemplate(PassTemplate template) {
        Response response = new Response();

        //先判断商户是否可以投放优惠券，商户不存在自然不能存优惠券
        ErrorCode errorCode = template.validate(merchantsDao);
        if(errorCode != ErrorCode.SUCCESS){
            response.setErrorCode(errorCode.getCode());
            response.setErrorMsg(errorCode.getDesc());
        }else{
            //将 tmplate 对象转换为 JSON 字符串
            String passTemplate = JSON.toJSONString(template);
            // 发送kafka消息
            kafkaTemplate.send(
                    Constants.TEMPLATE_TOPIC,
                    Constants.TEMPLATE_TOPIC,
                    passTemplate
            );
            log.info("Drop Template{}",passTemplate);
        }

        return response;
    }
}



