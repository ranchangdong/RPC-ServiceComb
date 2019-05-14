package com.lanshe.service.impl;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-14 20:44
 *
 * 服务启动类
 */

@SpringBootApplication
@EnableServiceComb
public class RpcProviderApplication {

    public static void main(String args[]) {
        SpringApplication.run(RpcProviderApplication.class,args);
    }

}
