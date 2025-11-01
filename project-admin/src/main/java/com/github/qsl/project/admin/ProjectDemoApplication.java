package com.github.qsl.project.admin;

import com.github.qsl.project.common.constants.ProjectConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * 启动类
 *
 * @author Daniel QIAN
 */
@SpringBootApplication(scanBasePackages = {ProjectConstants.BASE_PACKAGE})
public class ProjectDemoApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProjectDemoApplication.class);
        Environment env = app.run(args).getEnvironment();

        LOGGER.info("\r----------------------------------------------------------\n" +
                        "Application '{}' is running!\n" +
                        "Profile(s):  {}\n" +
                        "API Documentation:   http://{}:{}{}/swagger-ui.html\n" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getActiveProfiles(),
                env.getProperty("server.address", "localhost"),
                env.getProperty("server.port"),
                env.getProperty("server.servlet.context-path", ""));
    }

}
