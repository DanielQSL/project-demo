package com.github.qsl.project.admin.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.github.qsl.project.common.constants.SystemConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * WebMVC配置
 *
 * @author DanielQSL
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedHeaders("*")
                .allowCredentials(true)
                .allowedMethods("*")
                .maxAge(3600);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 静态资源映射
        registry.addResourceHandler(SystemConstants.STATIC_WITHE_PATH_LIST)
                .addResourceLocations(SystemConstants.STATIC_WITHE_LOCATION_LIST)
                .setCachePeriod(0);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }

    /**
     * 自定义消息转化器
     */
    @Bean
    public MappingJackson2HttpMessageConverter jackson2HttpMessageConverter() {
        ObjectMapper objectMapper = new ObjectMapper();
        // 指定时区
        objectMapper.setTimeZone(TimeZone.getTimeZone(SystemConstants.DEFAULT_TIME_ZONE));
        // 设置日期格式化
        objectMapper.setDateFormat(new SimpleDateFormat(SystemConstants.DEFAULT_DATE_TIME_FORMAT_PATTERN));
        // Java8 日期处理
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(SystemConstants.DEFAULT_DATE_TIME_FORMAT_PATTERN)));
        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern(SystemConstants.DEFAULT_DATE_TIME_FORMAT_PATTERN)));
        objectMapper.registerModule(javaTimeModule);
        // 指定要序列化的域，field,get和set,以及修饰符范围，ANY是都有包括private和public
        objectMapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        // 对象的所有字段全部列入。NON_NULL：不返回 null 值字段
        objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        // 在遇到未知属性的时候不抛出异常。忽略在json字符串中存在，但是在java对象中不存在对应属性的情况。
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // 允许序列化空的POJO类(否则会抛出异常)
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        return new MappingJackson2HttpMessageConverter(objectMapper);
    }

}
