package com.qsl.project.base.exception;

import com.qsl.project.base.model.BaseCommonError;

/**
 * 自定义业务异常
 *
 * @author DanielQSL
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private Integer code;

    public BusinessException() {
        super();
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.setCode(code);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(BaseCommonError commonError) {
        this(commonError.getErrorCode(), commonError.getErrorMsg());
    }

    public BusinessException(BaseCommonError commonError, String errorMsg) {
        this(commonError.getErrorCode(), errorMsg);
    }

    public int getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}