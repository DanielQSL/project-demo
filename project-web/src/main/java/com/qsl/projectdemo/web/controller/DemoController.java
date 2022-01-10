package com.qsl.projectdemo.web.controller;

import com.qsl.project.base.model.CommonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Demo Controller层
 *
 * @author DanielQSL
 */
@RequestMapping("/demo")
@RestController
public class DemoController {

    @GetMapping("/test1")
    public CommonResponse<Boolean> test1() {
        return CommonResponse.success(Boolean.TRUE);
    }

}
