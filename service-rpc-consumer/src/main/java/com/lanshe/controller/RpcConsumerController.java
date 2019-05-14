package com.lanshe.controller;

import com.lanshe.service.RpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-14 21:21
 *
 * 对外发布的控制类
 */
@RestController
public class RpcConsumerController {

    @Autowired
    private RpcService rpcService;

    @RequestMapping("/rpc")
    public void rpcInvoke(){
         System.out.println(rpcService.sayRpc(" RPC 方式的ServiceComb"));
    }

}
