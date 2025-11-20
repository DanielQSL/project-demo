package com.github.qsl.project.base.enums;

/**
 * 环境类型枚举
 *
 * @author Daniel QIAN
 */
public enum EnvType {

    /**
     * 开发环境
     */
    DEV("dev"),

    /**
     * 测试环境
     */
    QA("qa"),

    /**
     * 预发布环境
     */
    PL("pl1"),

    /**
     * 线上环境
     */
    ONLINE("online"),
    ;

    private final String desc;

    EnvType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
