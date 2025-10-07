package com.qsl.project;

import com.qsl.project.common.constants.ProjectConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

/**
 * 启动类
 *
 * @author DanielQSL
 */
@SpringBootApplication(scanBasePackages = {ProjectConstants.BASE_PACKAGE})
public class ProjectApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ProjectApplication.class);
        Environment env = app.run(args).getEnvironment();

        LOGGER.info("\r----------------------------------------------------------\n" +
                        "Application '{}' is running!\n" +
                        "Profile(s):  {}\n" +
                        "API Documentation:   http://{}:{}{}/doc.html\n" +
                        "----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getActiveProfiles(),
                env.getProperty("server.address", "localhost"),
                env.getProperty("server.port"),
                env.getProperty("server.servlet.context-path", ""));
    }

}
