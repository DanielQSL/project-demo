package com.github.qsl.project.admin.controller;

import com.github.xiaoymin.knife4j.annotations.Ignore;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 健康检测 Controller层
 *
 * @author DanielQSL
 */
@Ignore
@Controller
public class HealthCheckController {

    /**
     * 健康检查接口
     * <p>
     * ResponseEntity可以理解为 @ResponseBody + @ResponseStatus 的组合
     *
     * @return 响应
     */
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }

}
