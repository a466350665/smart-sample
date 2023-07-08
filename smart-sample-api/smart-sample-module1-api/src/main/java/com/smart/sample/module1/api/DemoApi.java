package com.smart.sample.module1.api;

import com.smart.core.entity.Result;
import com.smart.sample.module1.api.constant.ContextIdConstant;
import com.smart.sample.module1.api.constant.PathConstant;
import com.smart.sample.module1.api.dto.DemoDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Api(tags = "客户端样例演示:Demo")
@FeignClient(name = "${com.smart.sample.module1.name:smart-sample}", contextId = ContextIdConstant.DEMO, path = PathConstant.DEMO)
public interface DemoApi {

    @ApiOperation(value = "列表")
    @GetMapping("/api/list")
    Result<List<DemoDto>> getApiList();
}