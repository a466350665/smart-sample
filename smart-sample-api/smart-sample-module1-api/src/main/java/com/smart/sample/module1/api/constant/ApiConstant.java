package com.smart.sample.module1.api.constant;

public class ApiConstant {

    // 服务名，支持消费方通过配置文件动态变更名称，以防生产方升级修改服务名称
    public static final String NAME = "${feign.smart-sample-module1.name:smart-sample-module1}";

    // 服务可指定路径，方便开发环境调试指定地址，生产环境走注册中心不需要做配置
    public static final String URL = "${feign.smart-sample-module1.url:}";

    // 统一API前缀
    public static final String PREFIX = "/api";
}