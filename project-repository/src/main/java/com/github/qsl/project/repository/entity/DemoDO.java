package com.github.qsl.project.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * Demo 实体对象
 *
 * @author Daniel QIAN
 */
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("t_demo")
public class DemoDO extends BaseDO {

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
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

}
