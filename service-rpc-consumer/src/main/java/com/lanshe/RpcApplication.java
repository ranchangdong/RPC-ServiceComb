package com.lanshe;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-14 21:24
 */
@SpringBootApplication
@EnableServiceComb
public class RpcApplication {

    public static void main(String args[]) {
        SpringApplication.run(RpcApplication.class,args);
    }
}
