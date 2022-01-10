package com.qsl.project.base.exception;

/**
 * RPC异常
 *
 * @author DanielQSL
 */
public class RpcException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final Integer errCode;

    private final String errMsg;

    public RpcException(Integer code, String msg) {
        super(msg);
        this.errCode = code;
        this.errMsg = msg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

}
