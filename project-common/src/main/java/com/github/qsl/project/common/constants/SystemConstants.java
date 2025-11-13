package com.github.qsl.project.common.constants;

/**
 * 系统级常量
 *
 * @author Daniel QIAN
 */
public interface SystemConstants {

    /**
     * 默认时区
     */
    String DEFAULT_TIME_ZONE = "Asia/Shanghai";

    /**
     * 默认日期时间格式
     */
    String DEFAULT_DATE_TIME_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 默认日期格式
     */
    String DEFAULT_DATE_FORMAT_PATTERN = "yyyy-MM-dd";

    /**
     * 默认时间格式
     */
    String DEFAULT_TIME_FORMAT_PATTERN = "HH:mm:ss";

    /**
     * 编码格式设置
     */
    String JSON_TYPE_UTF8_CHARSET = "application/json;charset=UTF-8";

    /**
     * 允许匿名访问的静态资源路径列表
     */
    String[] STATIC_WITHE_PATH_LIST = new String[]{
            "/",
            "/static/**",
            "/js/**",
            "/css/**",
            "/fonts/**",
            "/img/**",
            "/index.html",
            "/favicon.ico",
            "/webjars/**",
            "/swagger-ui.html",
            "/swagger-resources/**",
            "/v3/api-docs"
    };

    /**
     * 允许匿名访问的静态资源存放位置列表
     */
    String[] STATIC_WITHE_LOCATION_LIST = new String[]{
            "classpath:/static/",
            "classpath:/public/",
            "classpath:/META-INF/resources/"
    };

}