package com.qsl.project.base.exception;

import com.qsl.project.base.model.BaseCommonError;

/**
 * 基础自定义业务异常
 *
 * @author DanielQSL
 */
public class BaseBizException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 默认错误码
     */
    private static final int DEFAULT_ERROR_CODE = -1;

    private Integer errorCode;

    private String errorMsg;

    public BaseBizException(Integer errorCode, String errorMsg) {
        super(errorMsg);
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public BaseBizException(String errorMsg) {
        this(DEFAULT_ERROR_CODE, errorMsg);
    }

    public BaseBizException(BaseCommonError baseCommonError) {
        this(baseCommonError.getErrorCode(), baseCommonError.getErrorMsg());
    }

    public BaseBizException(BaseCommonError baseCommonError, String errorMsg) {
        this(baseCommonError.getErrorCode(), errorMsg);
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

}