package com.qsl.projectdemo.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Demo 实体对象
 *
 * @author DanielQSL
 */
@Data
public class DemoDO {

    private Integer id;

    private String username;

    private Integer age;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
