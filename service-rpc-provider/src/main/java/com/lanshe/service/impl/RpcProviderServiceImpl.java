package com.lanshe.service.impl;

import com.lanshe.service.RpcService;
import org.apache.servicecomb.provider.pojo.RpcSchema;

/**
 * @Description
 * @auther 冉长冬
 * @create 2019-05-14 20:41
 *
 * RPC方式--服务提供者
 *
 *
 * schemaId = "hello"  代表服务编号
 *
 */

@RpcSchema(schemaId = "helloRpc")
public class RpcProviderServiceImpl implements RpcService {

    @Override
    public String sayRpc(String name) {
        return "Hello word "+name;
    }
}
