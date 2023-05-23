package com.iti.config;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Program: halo
 * @Date: 2023/5/21 0:33
 * @Author: ShiCheng
 * @Version: 1.0
 * @Description: Apollo配置
 */
@Configuration
public class ApolloUtils {

    //默认namespace=application
    @ApolloConfig("dataSource")
    private Config dataSource;

    @Bean
    public Config getDataSourceConfig(){
        return dataSource;
    }

}
