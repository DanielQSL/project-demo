package com.qsl.projectdemo.web;

import com.qsl.projectdemo.common.constants.ProjectConstant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动类
 *
 * @author DanielQSL
 */
@SpringBootApplication(scanBasePackages = ProjectConstant.BASE_PACKAGE, exclude = {DataSourceAutoConfiguration.class})
public class ProjectDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectDemoApplication.class, args);
    }

}
