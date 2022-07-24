package com.qsl.project;

import com.qsl.project.common.constants.ProjectConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author DanielQSL
 */
@SpringBootApplication(scanBasePackages = {ProjectConstants.BASE_PACKAGE})
public class ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

}
