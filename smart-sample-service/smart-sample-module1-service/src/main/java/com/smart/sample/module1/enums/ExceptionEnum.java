package com.smart.sample.module1.enums;

import com.smart.core.enums.Enumable;

public enum ExceptionEnum implements Enumable<Integer> {

    E601(601, "主键不能为空");

    private Integer code;
    private String desc;

    ExceptionEnum(Integer code, String desc) {
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