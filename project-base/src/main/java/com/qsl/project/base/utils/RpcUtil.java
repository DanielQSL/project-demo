package com.qsl.project.base.utils;

import com.qsl.project.base.exception.RpcException;
import com.qsl.project.base.model.RpcResponse;

/**
 * RPC响应工具类
 *
 * @author DanielQSL
 */
public class RpcUtil {

    private final static Integer SUCCESS_CODE = 0;
    private final static String SUCCESS_MESSAGE = "success";

    private final static Integer FAILED_CODE = -1;
    private final static String FAILED_MESSAGE = "failed";
    private final static Integer RETURN_NULL_CODE = 1001;

    public static <T, E> RpcResponse<T, E> ok(T data) {
        RpcResponse<T, E> rpcResponse = new RpcResponse<>();
        rpcResponse.setCode(SUCCESS_CODE);
        rpcResponse.setMsg(SUCCESS_MESSAGE);
        rpcResponse.setData(data);
        return rpcResponse;
    }

    public static <T, E> RpcResponse<T, E> error(Integer returnCode, String returnMsg, T data) {
        RpcResponse<T, E> rpcResponse = new RpcResponse<>();
        rpcResponse.setCode(returnCode);
        rpcResponse.setMsg(returnMsg);
        rpcResponse.setData(data);
        return rpcResponse;
    }

    public static <T, E> RpcResponse<T, E> error(RpcException e, T data) {
        return error(e.getErrCode(), e.getErrMsg(), data);
    }

    public static <T> boolean isSuccess(RpcResponse<T, ?> rpcResponse) {
        return rpcResponse != null && SUCCESS_CODE.equals(rpcResponse.getCode());
    }

    public static <T> boolean isSuccess(RpcResponse<T, ?> rpcResponse, Integer successCode) {
        return rpcResponse != null && rpcResponse.getCode().equals(successCode);
    }

    public static <T> boolean isSuccessNotNull(RpcResponse<T, ?> rpcResponse) {
        return isSuccess(rpcResponse) && rpcResponse.getData() != null;
    }

    public static <T> boolean isSuccessNotNull(RpcResponse<T, ?> rpcResponse, Integer successCode) {
        return isSuccess(rpcResponse, successCode) && rpcResponse.getData() != null;
    }

    public static <T> T unpack(RpcResponse<T, ?> rpcResponse) {
        if (!SUCCESS_CODE.equals(rpcResponse.getCode())) {
            throw new RpcException(rpcResponse.getCode(), rpcResponse.getMsg());
        }
        return rpcResponse.getData();
    }

    public static <T> T unpackNotNull(RpcResponse<T, ?> rpcResponse) {
        if (!SUCCESS_CODE.equals(rpcResponse.getCode())) {
            throw new RpcException(rpcResponse.getCode(), rpcResponse.getMsg());
        }
        if (null == rpcResponse.getData()) {
            throw new RpcException(RETURN_NULL_CODE, "RPC return entity is null");
        }
        return rpcResponse.getData();
    }

    public static <T, E> RpcResponse<T, E> buildErrorResponse(Throwable e) {
        if (e instanceof RpcException) {
            return error((RpcException) e, null);
        } else {
            return error(FAILED_CODE, FAILED_MESSAGE, null);
        }
    }

}
