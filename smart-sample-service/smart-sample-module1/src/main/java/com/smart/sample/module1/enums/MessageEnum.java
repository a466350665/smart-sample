package com.smart.sample.module1.enums;

import com.smart.core.enums.Enumable;

public enum MessageEnum implements Enumable<Integer> {

    M601(601, "主键不能为空");

    private Integer code;
    private String desc;

    MessageEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}