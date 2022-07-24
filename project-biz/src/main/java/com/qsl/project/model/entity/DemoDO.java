package com.qsl.project.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * Demo 实体对象
 *
 * @author DanielQSL
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_demo")
public class DemoDO extends BaseEntity {

    /**
     * 用户名
     */
    private String username;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

}
