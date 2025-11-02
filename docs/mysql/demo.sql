-- ------------------------------------------
-- DATABASE structure for db_demo
-- ------------------------------------------
DROP
DATABASE IF EXISTS `db_demo`;
CREATE
DATABASE  `db_demo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

USE
`db_demo`;

-- ------------------------------------------
-- Table structure for t_demo
-- ------------------------------------------

DROP TABLE IF EXISTS `t_demo`;
CREATE TABLE `t_demo`
(
    `id`          BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键id',
    `username`    VARCHAR(64)       DEFAULT NULL COMMENT '用户名字',
    `age`         TINYINT UNSIGNED NOT NULL DEFAULT 0 COMMENT '年龄',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_username` (`username`) COMMENT '用户名唯一索引',
    INDEX         `idx_age` (`age`)  COMMENT '年龄索引'
) ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '示例表';