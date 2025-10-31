package com.github.qsl.project.common.constants;

/**
 * 项目常量
 *
 * @author DanielQSL
 */
public final class ProjectConstants {

    /**
     * 基础包名称
     */
    public static final String BASE_PACKAGE = "com.github.qsl.project";

    /**
     * 是否
     */
    public interface YesOrNo {
        Integer NO = 0;
        Integer YES = 1;
    }

    /**
     * 可用状态（Y可用 、N不可用）
     */
    public interface EnableStatus {
        String ENABLE = "Y";
        String DISABLE = "N";
    }

}
