package com.smart.sample.module1.service.impl;

import com.smart.orm.mybatisplus.service.impl.BaseServiceImpl;
import com.smart.sample.module1.entity.Demo;
import com.smart.sample.module1.mapper.DemoMapper;
import com.smart.sample.module1.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl extends BaseServiceImpl<DemoMapper, Demo> implements DemoService {
}