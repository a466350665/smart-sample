package com.smart.sample.module1.api;

import com.smart.core.entity.Result;
import com.smart.sample.module1.api.constant.ApiConstant;
import com.smart.sample.module1.api.constant.ContextIdConstant;
import com.smart.sample.module1.api.constant.PathConstant;
import com.smart.sample.module1.api.dto.DemoDto;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = ApiConstant.NAME, url = ApiConstant.URL, contextId = ContextIdConstant.DEMO, path = PathConstant.DEMO)
public interface DemoApi {

    @GetMapping(ApiConstant.PREFIX + "/list")
    Result<List<DemoDto>> getApiList();
}