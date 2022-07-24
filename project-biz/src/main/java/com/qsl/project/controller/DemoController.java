package com.qsl.project.controller;

import com.qsl.project.base.model.CommonResponse;
import com.qsl.project.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo Controller层
 *
 * @author DanielQSL
 */
@Api(tags = "demo api")
@RequestMapping("/demo")
@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @ApiOperation("测试方法1")
    @GetMapping("/test1")
    public CommonResponse<Boolean> test1() {
        return CommonResponse.success(Boolean.TRUE);
    }

}
