package com.smart.sample.module1.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.smart.orm.mybatisplus.entity.BaseEntity;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;

@TableName("t_demo")
public class Demo extends BaseEntity {

    @ApiModelProperty("编码")
    @NotBlank(message = "{602}")
    private String code;

    @ApiModelProperty("名称")
    @NotBlank
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}