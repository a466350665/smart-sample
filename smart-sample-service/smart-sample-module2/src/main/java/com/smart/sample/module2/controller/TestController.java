package com.smart.sample.module2.controller;

import com.smart.core.entity.Result;
import com.smart.sample.module1.api.DemoApi;
import com.smart.sample.module1.api.dto.DemoDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = {"测试管理"})
@RestController
@RequestMapping("/module2/test")
public class TestController {

    @Autowired
    protected DemoApi demoApi;

    @ApiOperation(value = "跨模块调用列表")
    @GetMapping("/list")
    public Result<List<DemoDto>> list() {
        return demoApi.getApiList();
    }
}
