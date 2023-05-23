package com.iti.controller;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import component.exception.aspect.GlobalAspect;
import component.exception.entity.BizException;
import component.exception.entity.Response;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: halo
 * @Date: 2023/5/21 20:14
 * @Author: ShiCheng
 * @Version: 1.0
 * @Description:
 */

@RestController
public class TestController {

    @ApolloConfig
    private Config config;

    @GlobalAspect
    @GetMapping("/test/{value}")
    public Response test(@PathVariable("value") String value){

        if (StringUtils.equals(value,"1"))
            throw new BizException("错误");

        return Response.success(config.getProperty("test", "not found"));
    }
}
