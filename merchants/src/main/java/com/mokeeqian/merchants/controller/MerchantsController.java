/*
 * Copyright (c) 2022. mokeeqian. All rights reserved.
 */

package com.mokeeqian.merchants.controller;


import com.alibaba.fastjson.JSON;
import com.mokeeqian.merchants.service.IMerchantsServ;
import com.mokeeqian.merchants.vo.CreateMerchantsRequest;
import com.mokeeqian.merchants.vo.PassTemplate;
import com.mokeeqian.merchants.vo.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/merchants")
public class MerchantsController {
    private final IMerchantsServ merchantsServ; //商户服务接口

    @Autowired
    public MerchantsController(IMerchantsServ merchantsServ){
        this.merchantsServ = merchantsServ;
    }

    @ResponseBody
    @PostMapping("/create")
    public Response createMerchants(@RequestBody CreateMerchantsRequest request){
        log.info("CreateMerchants: {}", JSON.toJSONString(request));
        return merchantsServ.createMerchants(request);
    }

    @ResponseBody
    @GetMapping("/{id}")
    public Response buildMerchantsInfo(@PathVariable Integer id){
        log.info("BuildMerchantsInfo: {}", id);
        return merchantsServ.buildMerchantsInfoById(id);
    }

    @ResponseBody
    @PostMapping("/drop")
    public Response dropPassTemplate(@RequestBody PassTemplate passTemplate){
        log.info("DropPassTemplate: {}", passTemplate);
        return merchantsServ.dropPassTemplate(passTemplate);
    }
}

