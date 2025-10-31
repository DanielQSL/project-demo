package com.github.qsl.project.admin.controller;

import com.github.qsl.project.admin.service.DemoService;
import com.github.qsl.project.base.model.CommonResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo Controller层
 *
 * @author DanielQSL
 */
@Tag(name = "Demo接口")
@RequestMapping("/demo")
@RestController
public class DemoController {

    @Resource
    private DemoService demoService;

    @Operation(summary = "测试接口1")
    @GetMapping("/test1")
    public CommonResponse<Boolean> test1() {
        return CommonResponse.success(Boolean.TRUE);
    }

}
