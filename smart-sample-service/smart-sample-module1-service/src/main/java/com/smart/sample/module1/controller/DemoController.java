package com.smart.sample.module1.controller;

import com.smart.core.entity.Page;
import com.smart.core.entity.Result;
import com.smart.exception.ApplicationException;
import com.smart.sample.module1.api.DemoApi;
import com.smart.sample.module1.api.constant.PathConstant;
import com.smart.sample.module1.api.dto.DemoDto;
import com.smart.sample.module1.entity.Demo;
import com.smart.sample.module1.enums.MessageEnum;
import com.smart.sample.module1.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Api(tags = {"基础增删查改样例演示"})
@RequestMapping(PathConstant.DEMO)
@RestController
public class DemoController implements DemoApi {

    @Autowired
    protected DemoService demoService;

    /**
     * @param page
     * @param limit
     * @return
     */
    @ApiOperation(value = "分页")
    @GetMapping("/page")
    public Result<Page<Demo>> page(
            @RequestParam(required = false, defaultValue = "1") Integer page,
            @RequestParam(required = false, defaultValue = "10") Integer limit) {
        return Result.createSuccess(demoService.findPage(page, limit));
    }

    @ApiOperation(value = "列表")
    @GetMapping("/list")
    public Result<List<Demo>> list() {
        return Result.createSuccess(demoService.list());
    }

    @ApiOperation(value = "新增")
    @PostMapping
    public Result add(@RequestBody @Validated Demo entity) {
        demoService.save(entity);
        return Result.success();
    }

    @ApiOperation(value = "修改")
    @PutMapping
    public Result update(@RequestBody @Validated Demo entity) {
        if (entity.getId() == null) {
            throw new ApplicationException(MessageEnum.M601);
        }
        demoService.updateById(entity);
        return Result.success();
    }

    @ApiOperation(value = "删除")
    @DeleteMapping({"/{id}"})
    public Result deleteById(@PathVariable("id") Long id) {
        demoService.removeById(id);
        return Result.success();
    }

    @ApiOperation(value = "列表", hidden = true)
    @Override
    public Result<List<DemoDto>> getApiList() {
        return Result.createSuccess(demoService.list().stream().map(t -> {
            DemoDto dto = new DemoDto();
            BeanUtils.copyProperties(t, dto);
            return dto;
        }).collect(Collectors.toList()));
    }
}