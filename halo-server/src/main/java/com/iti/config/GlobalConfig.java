package com.iti.config;

import component.exception.aspect.GlobalAspectHandler;
import component.exception.handler.GlobalExceptionHandler;
import component.exception.interceptor.LogInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Program: halo
 * @Date: 2023/5/22 21:53
 * @Author: ShiCheng
 * @Version: 1.0
 * @Description: 注入自定义配置，后续需改变注入方式
 */
@Configuration
public class GlobalConfig implements WebMvcConfigurer {

    @Bean
    public GlobalAspectHandler getGlobalAspectHandler(){
        return new GlobalAspectHandler();
    }

    @Bean
    public GlobalExceptionHandler getGlobalExceptionHandler(){
        return new GlobalExceptionHandler();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new LogInterceptor());
    }
}
