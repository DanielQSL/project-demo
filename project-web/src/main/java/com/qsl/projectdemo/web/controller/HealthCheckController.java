package com.qsl.projectdemo.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 健康检测 Controller层
 *
 * @author DanielQSL
 */
@ApiIgnore
@Controller
public class HealthCheckController {

    /**
     * 健康检查接口
     * <p>
     * ResponseEntity可以理解为 @ResponseBody + @ResponseStatus 的组合
     *
     * @return 响应
     */
    @RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }

}
