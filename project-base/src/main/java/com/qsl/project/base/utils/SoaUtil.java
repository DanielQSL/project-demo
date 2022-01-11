package com.qsl.project.base.utils;

import com.qsl.project.base.enums.ResponseCodeEnum;
import com.qsl.project.base.exception.RpcException;
import com.qsl.project.base.model.SoaResponse;

/**
 * RPC响应工具类
 *
 * @author DanielQSL
 */
public class SoaUtil {

    private final static Integer SUCCESS_CODE = ResponseCodeEnum.SUCCESS.getErrorCode();
    private final static String SUCCESS_MESSAGE = ResponseCodeEnum.SUCCESS.getErrorMsg();

    private final static Integer ERROR_CODE = ResponseCodeEnum.ERROR.getErrorCode();
    private final static String ERROR_MESSAGE = ResponseCodeEnum.ERROR.getErrorMsg();

    public static <T, E> SoaResponse<T, E> ok(T data) {
        SoaResponse<T, E> soaResponse = new SoaResponse<>();
        soaResponse.setCode(SUCCESS_CODE);
        soaResponse.setMsg(SUCCESS_MESSAGE);
        soaResponse.setData(data);
        return soaResponse;
    }

    public static <T, E> SoaResponse<T, E> error(Integer returnCode, String returnMsg, T data) {
        SoaResponse<T, E> soaResponse = new SoaResponse<>();
        soaResponse.setCode(returnCode);
        soaResponse.setMsg(returnMsg);
        soaResponse.setData(data);
        return soaResponse;
    }

    public static <T, E> SoaResponse<T, E> error(RpcException e, T data) {
        return error(e.getErrCode(), e.getErrMsg(), data);
    }

    public static <T> boolean isSuccess(SoaResponse<T, ?> soaResponse) {
        return soaResponse != null && SUCCESS_CODE.equals(soaResponse.getCode());
    }

    public static <T> boolean isSuccess(SoaResponse<T, ?> soaResponse, Integer successCode) {
        return soaResponse != null && soaResponse.getCode().equals(successCode);
    }

    public static <T> boolean isSuccessNotNull(SoaResponse<T, ?> soaResponse) {
        return isSuccess(soaResponse) && soaResponse.getData() != null;
    }

    public static <T> boolean isSuccessNotNull(SoaResponse<T, ?> soaResponse, Integer successCode) {
        return isSuccess(soaResponse, successCode) && soaResponse.getData() != null;
    }

    public static <T> T unpack(SoaResponse<T, ?> soaResponse) {
        if (!SUCCESS_CODE.equals(soaResponse.getCode())) {
            throw new RpcException(soaResponse.getCode(), soaResponse.getMsg());
        }
        return soaResponse.getData();
    }

    public static <T> T unpackNotNull(SoaResponse<T, ?> soaResponse) {
        if (!SUCCESS_CODE.equals(soaResponse.getCode())) {
            throw new RpcException(soaResponse.getCode(), soaResponse.getMsg());
        }
        if (null == soaResponse.getData()) {
            throw new RpcException(ResponseCodeEnum.RPC_RETURN_NULL.getErrorCode(), ResponseCodeEnum.RPC_RETURN_NULL.getErrorMsg());
        }
        return soaResponse.getData();
    }

    public static <T, E> SoaResponse<T, E> buildErrorResponse(Throwable e) {
        if (e instanceof RpcException) {
            return error((RpcException) e, null);
        } else {
            return error(ERROR_CODE, ERROR_MESSAGE, null);
        }
    }

}
