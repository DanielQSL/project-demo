package com.qsl.project.base.enums;

import com.qsl.project.base.model.BaseCommonError;

/**
 * 全局错误码
 * 占用 [0, 9999]
 * 一般情况下，使用 HTTP 响应状态码 https://developer.mozilla.org/zh-CN/docs/Web/HTTP/Status
 * 虽然说，HTTP 响应状态码作为业务使用表达能力偏弱，但是使用在系统层面还是非常不错的
 * <p>
 * 业务异常错误码 参见 {@link ServiceErrorCodeEnum}
 *
 * @author DanielQSL
 */
public enum ResponseCodeEnum implements BaseCommonError {

    /**
     * 响应码
     */
    SUCCESS(0, "成功"),
    ERROR(999, "未知错误"),

    // ========== 服务端错误段 ==========

    INTERNAL_SERVER_ERROR(500, "系统异常"),

    // ========== 客户端错误段 ==========

    BAD_REQUEST(400, "请求参数不正确"),
    UNAUTHORIZED(401, "账号未登录"),
    FORBIDDEN(403, "没有该操作权限"),
    NOT_FOUND(404, "请求未找到"),
    METHOD_NOT_ALLOWED(405, "请求方法不正确"),

    // ========== 客户端错误段[1000~9999] ==========

    SYSTEM_TIMEOUT(1001, "系统执行超时"),
    SYSTEM_BIZ_TIMEOUT(1002, "系统业务处理超时"),
    SYSTEM_DISASTER_RECOVERY(1003, "系统容灾功能被触发"),
    SYSTEM_LIMIT(1004, "系统限流"),
    SYSTEM_DEGRADED(1005, "系统功能降级"),
    SYSTEM_RESOURCE_ERROR(1006, "系统资源异常"),
    SYSTEM_RESOURCE_EXHAUSTION(1007, "系统资源耗尽"),
    SYSTEM_DISK_EXHAUSTION(1008, "系统磁盘空间耗尽"),
    SYSTEM_MEM_EXHAUSTION(1009, "系统内存耗尽"),
    SYSTEM_HFILE_EXHAUSTION(1010, "文件句柄耗尽"),
    SYSTEM_CONNECTION_EXHAUSTION(1011, "系统连接池耗尽"),
    SYSTEM_THREAD_EXHAUSTION(1012, "系统线程池耗尽"),
    SYSTEM_RESOURCE_READ_ERROR(1013, "系统资源访问异常"),

    THIRD_PARTY_SERVICE_ERROR(2001, "调用第三方服务出错"),
    MIDDLEWARE_ERROR(2002, "中间件服务出错"),
    RPC_SERVICE_ERROR(2003, "RPC服务出错"),
    RPC_SERVICE_NOT_FOUND(2004, "RPC服务未找到"),
    RPC_SERVICE_NOT_REGISTER(2005, "RPC服务未注册"),
    INTERFACE_NOT_FOUND(2006, "接口不存在"),
    MSG_SERVICE_ERROR(2007, "消息服务出错"),
    MSG_SEND_ERROR(2008, "消息投递出错"),
    MSG_CONSUME_ERROR(2009, "消息消费出错"),
    MSG_SUBSCRIBE_ERROR(2010, "消息订阅出错"),

    CACHE_SERVICE_ERROR(2011, "缓存服务出错"),
    CACHE_KEY_TOO_LONG(2012, "key长度超过限制"),
    CACHE_VALUE_TOO_LONG(2013, "value长度超过限制"),
    CACHE_CAPACITY_FULL(2014, "存储容量已满"),
    DAT_FORMAT_NOT_SUPPORT(2015, "不支持的数据格式"),
    APOLLO_ERROR(2016, "配置服务出错"),

    THIRD_PARTY_SERVICE_TIMEOUT(2021, "第三方系统执行超时"),
    RPC_SERVICE_TIMEOUT(2022, "RPC执行超时"),

    MSG_SEND_TIMEOUT(2023, "消息投递超时"),
    CACHE_SERVICE_TIMEOUT(2024, "缓存服务超时"),
    APOLLO_TIMEOUT(2025, "配置服务超时"),
    DATABASE_TIMEOUT(2026, "数据库服务超时"),
    DATABASE_ERROR(2030, "数据库服务出错"),
    TABLE_NOT_FOUND(2031, "表不存在"),
    COLUMN_NOT_FOUND(2032, "列不存在"),
    DATABASE_DEADLOCK(2033, "数据库死锁"),
    PRIMARY_KEY_CONFLICT(2034, "主键冲突"),

    NOX_SERVICE_ERROR(2040, "通知服务出错"),

    USER_SESSION_EXPIRED(3001, "用户登录已过期"),
    REQUEST_PARAMS_ERROR(3002, "用户请求参数错误"),

    ;

    private final Integer code;

    private final String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getErrorCode() {
        return this.code;
    }

    @Override
    public String getErrorMsg() {
        return this.msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
