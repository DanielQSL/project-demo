-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`
(
    `id`          BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增主键id',
    `username`    VARCHAR(64)       DEFAULT NULL COMMENT '用户名字',
    `age`         TINYINT  NOT NULL DEFAULT 0 COMMENT '性别:0-未知,1-男,2-女',
    `address`     VARCHAR(256)      DEFAULT NULL COMMENT '地址',
    `version`     INT UNSIGNED     NOT NULL DEFAULT '0' COMMENT '版本号',
    `deleted`     TINYINT  NOT NULL DEFAULT '0' COMMENT '删除标识:0-未删除,1-已删除',
    `create_user` VARCHAR(128)      DEFAULT NULL COMMENT '创建人',
    `update_user` VARCHAR(128)      DEFAULT NULL COMMENT '修改人',
    `create_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`),
    UNIQUE KEY `uk_username` (`username`) COMMENT '用户名唯一索引',
    INDEX           `idx_address` (`address`)  COMMENT '地址索引',
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';