package com.github.qsl.project.admin.controller;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检测 Controller层
 *
 * @author Daniel QIAN
 */
@Hidden
@RestController
public class HealthCheckController {

    /**
     * 健康检查接口
     * <p>
     * ResponseEntity可以理解为 @ResponseBody + @ResponseStatus 的组合
     *
     * @return 响应
     */
    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("OK");
    }

}
