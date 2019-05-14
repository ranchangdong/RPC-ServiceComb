package com.lanshe.service.impl;

import com.lanshe.service.RpcService;
import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-14 20:54
 *  RPC  服务消费者
 */

@Component
public class RpcConsumerServiceImpl implements RpcService {

    //从注册中心找 找那个应用程序下面的那个微服务

    //microserviceName: 代表那个应用程序编号:下面的那个应用名
    //schemaId : 它的值来自于服务提供者中用@RpcSchema(schemaId = "helloRpc")
    @RpcReference(microserviceName = "start.servicecomb.io:prodiver-rpc",schemaId = "helloRpc")
    private RpcService rpcService; //从注册中心推送过来

    @Override
    public String sayRpc(String name) {
        return rpcService.sayRpc(name);
    }
}
