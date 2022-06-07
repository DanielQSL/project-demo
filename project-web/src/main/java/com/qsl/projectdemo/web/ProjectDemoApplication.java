package com.qsl.projectdemo.web;

import com.qsl.projectdemo.common.constants.ProjectConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author DanielQSL
 */
@SpringBootApplication(scanBasePackages = {ProjectConstants.BASE_PACKAGE})
public class ProjectDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectDemoApplication.class, args);
    }

}
