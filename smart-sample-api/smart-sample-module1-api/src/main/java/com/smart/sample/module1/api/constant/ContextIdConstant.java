package com.smart.sample.module1.api.constant;

/**
 * 统一设置管理ContextId，避免同一FeignClient服务下多个接口导致的Bean名称重复问题
 */
public class ContextIdConstant {
    public static final String DEMO = "demoApi";
}