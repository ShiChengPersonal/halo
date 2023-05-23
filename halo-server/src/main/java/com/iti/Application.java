package com.iti;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Program: halo
 * @Date: 2023/5/21 19:04
 * @Author: ShiCheng
 * @Version: 1.0
 * @Description:
 */

@EnableApolloConfig
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
