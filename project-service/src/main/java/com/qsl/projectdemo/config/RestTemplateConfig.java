package com.qsl.projectdemo.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/**
 * RestTemplate配置类
 *
 * @author DanielQSL
 */
@Configuration
public class RestTemplateConfig {

    /**
     * 基于Apache httpclient配置RestTemplate
     *
     * @return RestTemplate
     */
    @Primary
    @Bean
    public RestTemplate restTemplate() {
        RequestConfig requestConfig = RequestConfig.custom()
                // 设置客户端和服务端建立连接的超时时间
                .setConnectTimeout(5_000)
                // 设置客户端从服务端读取数据的超时时间
                .setSocketTimeout(5_000)
                // 设置从连接池获取连接的超时时间，不宜过长
                .setConnectionRequestTimeout(200)
                .build();

        // Httpclient连接池，长连接保持30秒
        PoolingHttpClientConnectionManager poolingConnectionManager = new PoolingHttpClientConnectionManager(30, TimeUnit.SECONDS);
        // 连接池最大连接数
        poolingConnectionManager.setMaxTotal(1_000);
        // 设置同路由的并发数
        poolingConnectionManager.setDefaultMaxPerRoute(100);
        // 可用空闲连接过期时间
        poolingConnectionManager.setValidateAfterInactivity(10_000);

        HttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(requestConfig)
                .setConnectionManager(poolingConnectionManager)
                .build();

        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);

        RestTemplate restTemplate = new RestTemplate(requestFactory);
        // 添加内容转换器
        restTemplate.getMessageConverters().add(new StringHttpMessageConverter(StandardCharsets.UTF_8));
        restTemplate.getMessageConverters().add(new FormHttpMessageConverter());
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        restTemplate.getMessageConverters().add(new FastJsonHttpMessageConverter());
        return restTemplate;
    }

}
